import java.util.ArrayList;

/**
 * Bubble sort algorithm to sort the list of apartments from highest to lowest based on thier price
 * 
 * @author frankieburgoyne
 */
public class BubbleSort implements SortBehavior{
    
    /**
     * Sorts the list of appartments from highest to lowest based on their price
     * 
     * @param appartments 
     * @return the sorted list of appartments
     */
    @Override
    public ArrayList<Appartment> sort(ArrayList<Appartment> appartments){
        int size = appartments.size() - 1;
            for (int i = 0; i < size; i++){
                for (int j = 0; j < size - i; j++){ // compares value of current index with the value adjacent to it
                    if (appartments.get(j).compareTo(appartments.get(j+1)) > 0){
                        Appartment temp = appartments.get(j); // temp holds value of appartment at j
                        appartments.set(j, appartments.get(j + 1)); // sets value at j to the value at j+1
                        appartments.set(j + 1, temp); // temp value is changed

                    }
                }
            }
            return appartments;
    }
}
