import java.time.LocalTime;
import java.time.Duration;

/**
 * Class that represents a flight with a flight number, origin airport, destination airport, start time, end time, and number of transfers
 * @author frankieburgoyne
 */
public class Flight {
    private String flightNum;
    private Airport from;
    private Airport to;
    private LocalTime startTime;
    private LocalTime endTime;
    private int numTransfers;

    /**
     * Constructor for Flight
     * @param flightNum the flight number
     * @param from the origin airport
     * @param to the destination airport
     * @param startTime the start time
     * @param endTime the end time
     * @param numTransfers the number of transfers
     */
    public Flight(String flightNum, Airport from, Airport to, LocalTime startTime, LocalTime endTime, int numTransfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.startTime = startTime;
        this.endTime = endTime;
        this.numTransfers = numTransfers;
    }

    /**
     * Getter for the origin airport
     * @return the origin airport
     */
    public Airport getFrom() {
        return from;
    }

    /**
     * Getter for the destination airport
     * @return the destination airport
     */
    public Airport getTo() {
        return to;
    }
    
    /**
     * Checks if the origin and destination airports are the same.
     *
     * @param from The origin airport.
     * @param to   The destination airport.
     * @return True if the airports are the same, false otherwise.
     */
    public boolean sameLoc(Airport from, Airport to) {
        return from.equals(to);
    }

    /**
     * Getter for the start time
     * @return the start time
     */
    public String toString() {
        Duration duration = Duration.between(startTime, endTime);
        long hours = duration.toHours();
        long minutes = duration.toMinutes() % 60;
        String flightInfo = flightNum + ": " + from + " to " + to + " " + startTime + " - " + endTime + " (" + hours + "h " + minutes + "m) ";
        if (numTransfers == 0) {
            flightInfo += "Direct Flight";
        } else if (numTransfers == 1) {
            flightInfo += "1 Stopover";
        } else {
            flightInfo += numTransfers + " Transfers";
        }

        return flightInfo;
    }
}
