/**
 * Subject interface that defines the methods required for a class to be a subject in the observer
 * 
 * @author frankieburgoyne
 */
public interface Subject {
    
    /**
     * Registers an observer to receive updates from the subject.
     *
     * @param observer the Observer being registered
     */
    void registerObserver(Observer observer);
    
    /**
     * Removes an observer from the list of registered observers.
     *
     * @param observer the Observer being removed
     */
    void removeObserver(Observer observer);
    
    /**
     * Notifies all registered observers of a change in the subject
     */
    void notifyObserver();
}

