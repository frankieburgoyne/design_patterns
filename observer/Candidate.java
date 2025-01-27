/**
 * A candidate class with all the necessary attributes and methodw
 * 
 * @author frankieburgoyne
 */
public class Candidate {
    private String firstName;
    private String lastName;
    private int numFirstPlaceVotes;
    private int numSecondPlaceVotes;
    private int numThirdPlaceVotes;
    public static int totalNumVotes;

    /**
     * Constructs a Candidate with the specified first and last name.
     *
     * @param firstName represents the candidates first name
     * @param lastName  represents the candidate's last name
     */
    public Candidate(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Method to see if the candidate's name matches
     *
     * @param firstName represents the candidates first name 
     * @param lastName  represents the candidates last name 
     * @return true if names match, otherwise false
     */
    public boolean equals(String firstName, String lastName) {
        return this.firstName.equals(firstName) && this.lastName.equals(lastName);
    }

    /**
     * Increments the total number of votes
     */
    public void addVote() {
        totalNumVotes++;
    }

    /**
     * Increments the number of first place votes 
     */
    public void addFirstPlaceVote() {
        numFirstPlaceVotes++;
    }

    /**
     * Increments the number of second place votes 
     */
    public void addSecondPlaceVote() {
        numSecondPlaceVotes++;
    }

    /**
     * Increments the number of third place votes 
     */
    public void addThirdPlaceVote() {
        numThirdPlaceVotes++;
    }
    
    /**
     * Calculates the weighted votes
     *
     * @return the weighted vote percentage
     */
    public double getWeightedVotes() {
        int totalVotes = numFirstPlaceVotes + numSecondPlaceVotes + numThirdPlaceVotes;
        return totalVotes > 0 ? ((3.0 * numFirstPlaceVotes) + (2.0 * numSecondPlaceVotes) + numThirdPlaceVotes) * 100 / totalVotes : 0.0;
    }

    /**
     * Returns the full name of the candidate.
     *
     * @return a string of the full name
     */
    public String getFullName() {
        return firstName + " " + lastName;
    }

    /**
     * Returns the number of first place votes
     *
     * @return the number of first place votes
     */
    public int getNumFirstPlaceVotes() {
        return numFirstPlaceVotes;
    }

    /**
     * Returns the number of second place votes
     *
     * @return the number of second place votes
     */
    public int getNumSecondPlaceVotes() {
        return numSecondPlaceVotes;
    }

    /**
     * Returns the number of third place votes
     *
     * @return the number of third place votes
     */
    public int getNumThirdPlaceVotes() {
        return numThirdPlaceVotes;
    }
}
