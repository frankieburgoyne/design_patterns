import java.util.ArrayList;
import java.util.Iterator;
/**
 * Class that represents an airline with a title and a list of flights
 * @author frankieburgoyne
 */
public class Airline {
    private String title;
    private ArrayList<Flight> flights;

    /**
     * Constructor for Airline
     * @param title the title of the airline
     */
    public Airline(String title) {
        this.title = title;
        this.flights = FlightLoader.getFlights();
    }
    
    /**
     * Getter for the title of the airline
     * @return the title of the airline
     */
    public String getTitle() {
        return title;
    }

    /**
     * Creates an iterator for the flights that go from the given airport to the given airport
     * 
     * @param fromCode the code of the airport to start from
     * @param toCode the code of the airport to go to
     * @return an iterator for the flights that go from the given airport to the given airport
     */
    public Iterator<Flight> createIterator(String fromCode, String toCode) {
        Airport from = Airport.valueOf(fromCode.toUpperCase());
        Airport to = Airport.valueOf(toCode.toUpperCase());
        return new FlightIterator(flights, from, to);
    }
}