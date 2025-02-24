import java.util.ArrayList;
import java.util.Iterator;

/**
 * Class that represents an iterator for a list of flights that go from a given airport to a given airport
 * @author frankieburgoyne
 */
public class FlightIterator implements Iterator<Flight> {
    private ArrayList<Flight> flights;
    private int position = 0;
    private Airport from;
    private Airport to;

    /**
     * Constructor for FlightIterator
     * @param flights the list of flights
     * @param from the origin airport
     * @param to the destination airport
     */
    public FlightIterator(ArrayList<Flight> flights, Airport from, Airport to) {
        this.flights = flights;
        this.from = from;
        this.to = to;
        for(Flight flight : flights) {
            if (flight.getFrom().equals(from) && flight.getTo().equals(to)) {
                return;
            }
        }
    }
    
    /**
     * Checks if there is another flight that goes from the origin airport to the destination airport
     * @return true if there is another flight that goes from the origin airport to the destination airport, false otherwise
     */
    public boolean hasNext() {
        while (position < flights.size()) {
            Flight flight = flights.get(position);
            if (flight.getFrom().equals(from) && flight.getTo().equals(to)) {
                return true;
            } else {
                position++;
            }
        }
        return false;
    }

    /**
     * Gets the next flight that goes from the origin airport to the destination airport
     * @return the next flight that goes from the origin airport to the destination airport
     */
    public Flight next() {
        Flight flight = flights.get(position);
        position++;
        return flight;
    }
}