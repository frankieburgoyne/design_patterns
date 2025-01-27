import java.util.ArrayList;

/**
 * A class to show the current tallies of votes for each candidate.
 * 
 * @author frankieburgoyneS
 */
public class TallyDisplay implements Observer {
    private Subject poll;
    private ArrayList<Candidate> candidates;

    /**
     * Constructor for the TallyDisplay class
     *
     * @param poll the Subject to observe for updates
     */
    public TallyDisplay(Subject poll) {
        this.poll = poll;
        poll.registerObserver(this);
    }

    /**
     * Updates the display with the current list of candidates when notified by the Subject.
     *
     * @param candidates the updated list of candidates
     */
    public void update(ArrayList<Candidate> candidates) {
        this.candidates = candidates;
        display();
    }

    /**
     * Displays the current tallies of votes for each candidate.
     * 
     */
    private void display() {
        System.out.println("Current Tallies:");
        for (Candidate candidate : candidates) {
            System.out.printf("%s: First(%d), Second(%d), Third(%d)\n",
                    candidate.getFullName(),
                    candidate.getNumFirstPlaceVotes(),
                    candidate.getNumSecondPlaceVotes(),
                    candidate.getNumThirdPlaceVotes());
        }
    }
}

