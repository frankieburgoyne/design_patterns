import java.util.ArrayList;

/**
 * Quicksort sorting algorithm to sort the appartments from lowest price to highest price
 * 
 * @author frankieburgoyne
 */
public class QuickSort implements SortBehavior {

    /**
     * Sorts the list of appartments using quicksort from lowest to highest price
     * 
     * @param appartments list of appartments
     * @return the list of appartments sorted from lowest to highest price
     */
    @Override
    public ArrayList<Appartment> sort(ArrayList<Appartment> appartments) {
        quickSort(appartments, 0, appartments.size() - 1);
        return appartments;
    }
    
    /**
     * 
     * Sorts the list of appartments using the quicksort algorithm
     * The pivot is set to the last element in the array list
     * As the algorithm parses thorugh the list, it will move prices lower than the pivot to the left, and vise versa
     * Each iteration will make the partion smaller until it has reached the correct order for the appartments 
     * 
     * @param appartments appartments given in the list
     * @param lowIndex the starting index of the current partition
     * @param highIndex the ending index of the current partion
     */
    private void quickSort(ArrayList<Appartment> appartments, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) return; // sorting is finalized for partition / base case
    
        Appartment pivot = appartments.get(highIndex); // pivot will be the last element in the list

        int leftPointer = lowIndex;
        int rightPointer = highIndex - 1;
    
        while (leftPointer <= rightPointer) {
            while (leftPointer <= rightPointer && appartments.get(leftPointer).compareTo(pivot) > 0) { // searches for value less than or equal to pivot
                leftPointer++;
            }
            while (leftPointer <= rightPointer && appartments.get(rightPointer).compareTo(pivot) < 0) { // searches for value greater than or equal to pivot
                rightPointer--;
            }
            if (leftPointer <= rightPointer) { // swap pointer values so the values are sorted, then increment left and decrement right
                Appartment temp = appartments.get(leftPointer);
                appartments.set(leftPointer, appartments.get(rightPointer));
                appartments.set(rightPointer, temp);
                leftPointer++;
                rightPointer--;
            }
        }
        
        // assigns pivot its correct position in list
        Appartment temp = appartments.get(leftPointer);
        appartments.set(leftPointer, appartments.get(highIndex));
        appartments.set(highIndex, temp);
    
        // recursive calls to sort the partioned arrays around pivot
        quickSort(appartments, lowIndex, leftPointer - 1);
        quickSort(appartments, leftPointer + 1, highIndex);
    }
    

}


    

