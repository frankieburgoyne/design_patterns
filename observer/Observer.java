import java.util.ArrayList;

/**
 * An interface for an observer
 *
 * @author frankieburgoyne
 */

public interface Observer {

    /**
     *
     * update the observer
     *
     * @param candidates
     * @return
     */
    void update(ArrayList<Candidate> candidates);
}
