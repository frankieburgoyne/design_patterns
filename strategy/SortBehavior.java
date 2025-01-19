import java.util.ArrayList;

/**
 * 
 * Interface that defines a general sorting behavior for the program
 * When this interface is implemented, it will sort the list of appartments
 * based off of the chosen sorting algorithm (bubblesort or quicksort)
 * 
 * @author frankieburgoyne
 */
public interface SortBehavior {
    
    /**
     * 
     * Sort method to sort the list of appartments
     * 
     * @param appartments
     * @return
     */
    ArrayList<Appartment> sort(ArrayList<Appartment> appartments);

}
