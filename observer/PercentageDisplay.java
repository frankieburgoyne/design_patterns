import java.util.ArrayList;

/**
 * Implements the Observer class and displays the percentage of votes for each candidate.
 * 
 * @author frankieburgoyne
 */
public class PercentageDisplay implements Observer {
    private Subject poll;
    private ArrayList<Candidate> candidates;

    /**
     * Constructor for the PercentageDisplay class.
     *
     * @param poll the Subject to observe for updates
     */
    public PercentageDisplay(Subject poll) {
        this.poll = poll;
        poll.registerObserver(this);
    }

    /**
     * Update method to be called when the Subject has new data.
     *
     * @param candidates the updated list of candidates
     */
    public void update(ArrayList<Candidate> candidates) {
        this.candidates = candidates;
        display();
    }

    /**
     * Displays the current percentage of votes for each candidate.
     * 
     */
    private void display() {
        System.out.println("\nCurrent Percent of Votes:");
        for (Candidate candidate : candidates) {
            double percentage = (Candidate.totalNumVotes > 0) ?
                    (candidate.getWeightedVotes() / (double) (Candidate.totalNumVotes * 3)) * 100 : 0;
            System.out.printf("%s %.2f%%\n", candidate.getFullName(), percentage);
        }
    }
}
