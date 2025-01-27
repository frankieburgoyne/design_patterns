import java.util.ArrayList;

/**
 * The StudentGovPoll implements the Subject interface and represents a student government poll
 * 
 * @author frankieburgoyne
 */
public class StudentGovPoll implements Subject {
    private ArrayList<Observer> observers;
    private ArrayList<Candidate> candidates;
    private String school;

    /**
     * Constructor for the StudentGovPoll class
     *
     * @param school the name of the school 
     */
    public StudentGovPoll(String school) {
        this.observers = new ArrayList<>();
        this.candidates = new ArrayList<>();
        this.school = school;
    }

    /**
     * Registers an observer to be notified of updates in the poll.
     *
     * @param observer the Observer that is being registered
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes an observer from the list of observers.
     *
     * @param observer the Observer being removed
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notifies all registered observers with the current list of candidates.
     */
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(candidates);
        }
    }

    /**
     * Adds a candidate to the poll
     *
     * @param firstName the first name of the candidate
     * @param lastName  the last name of the candidate
     */
    public void addCandidate(String firstName, String lastName) {
        candidates.add(new Candidate(firstName, lastName));
    }

    /**
     * Records votes for candidates based on their placement 
     *
     * @param firstPlace  the candidate receiving the first place vote s
     * @param secondPlace the candidate receiving the second place vote 
     * @param thirdPlace  the candidate receiving the third place vote
     */
    public void enterVotes(int firstPlace, int secondPlace, int thirdPlace) {
        candidates.get(firstPlace - 1).addFirstPlaceVote();
        candidates.get(secondPlace - 1).addSecondPlaceVote();
        candidates.get(thirdPlace - 1).addThirdPlaceVote();
        notifyObserver();
    }

    /**
     * Returns the name of the school 
     *
     * @return the name of the school
     */
    public String getSchool() {
        return school;
    }
}
