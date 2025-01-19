import java.util.ArrayList;

/**
 * Apartment List class to store Apartments and their properties
 * 
 * @author frankieburgoyne
 * 
 */
public class AppartmentList{
    private ArrayList<Appartment> appartments;
    private SortBehavior sortBehavior;

    /**
     * Creates an empty Appartmentlist filled with appartments
     * sort behavior is set to bubblesort as default for the program
     */
    public AppartmentList(){
        appartments = new ArrayList<>();
        sortBehavior = new BubbleSort();
    }

    /**
     * 
     * Method to add apartments to the Appartmentlist
     * 
     * @param address address of the appartment
     * @param numBedrooms number of bedrooms found in the appartment
     * @param numBathrooms number of bathrooms found in the appartment
     * @param price price of the given appartment
     */
    public void add(String address, int numBedrooms, int numBathrooms, double price){
        appartments.add(new Appartment(address, numBedrooms, numBathrooms, price));
    }

    /**
     * Method used to set the sorting behavior of the program when accessing the list of apartments
     * 
     * @param sortBehavior Bubble sort / Quick sort
     */
    public void setSortBehavior(SortBehavior sortBehavior){
        this.sortBehavior = sortBehavior;
    }

    /**
     * Returns the sorted list of apartments
     * 
     * @return sorted list of appartments
     */
    public ArrayList<Appartment> getSortedList(){
        return sortBehavior.sort(new ArrayList<>(appartments));
    }

    /**
     * Returns the unsorted list of apartments
     * 
     * @return unsorted list of appartments
     */
    public ArrayList<Appartment> getUnsortedList(){
        return new ArrayList<>(appartments);
    }
}
