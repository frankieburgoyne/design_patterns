import java.util.ArrayList;

/**
 * MusicBox class is the parent class that contains the state objects and the state transitions.
 * Switches between the states based on the button "pressed"
 * 
 * @author frankieburgoyne
 */
public class MusicBox {
    /**
     * English state of the MusicBox
     */
    private State englishState;
    /**
     * French state of the MusicBox
     */
    private State frenchState;
    /**
     * Spanish state of the MusicBox
     */
    private State spanishState;
    /**
     * Current state set of the MusicBox
     */
    private State state;

    /**
     * Constructor for the MusicBox class
     */
    public MusicBox(){
        englishState = new EnglishState(this);
        frenchState = new FrenchState(this);
        spanishState = new SpanishState(this);
        state = englishState; // setting English as the default state for the program
    }

    /**
     * Method to press the star button and switch the state
     */
    public void pressStarButton() {
        state.pressStarButton();
    }

    /**
     * Method to press the happy button and switch the state
     */
    public void pressHappyButton() {
        state.pressHappyButton();
    }

    /**
     * Method to press the English button
     */
    public void pressEnglishButton() {
        state.pressEnglishButton();
    }

    /**
     * Method to press the French button
     */
    public void pressFrenchButton() {
        state.pressFrenchButton();
    }

    /**
     * Method to press the Spanish button
     */
    public void pressSpanishButton() {
        state.pressSpanishButton();
    }

    /**
     * Method to set the state of the MusicBox
     * @param state the state to be set
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Method to get the current state of the MusicBox
     * @return englishState the current state of the MusicBox
     */
    public State getEnglishState() {
        return englishState;
    }

    /**
     * Method to get the French state of the MusicBox
     * @return frenchState the French state of the MusicBox
     */
    public State getFrenchState() {
        return frenchState;
    }

    /**
     * Method to get the Spanish state of the MusicBox
     * @return spanishState the Spanish state of the MusicBox
     */
    public State getSpanishState() {
        return spanishState;
    }

    /**
     * Method to play the song with the lyrics displayed
     * @param songName the name of the song
     * @param lyrics the lyrics of the song
     */
    public void playSong(String songName, ArrayList<String> lyrics) {
        System.out.println("Now playing the song: " + songName);
        for(int i = 0; i < lyrics.size(); i++){
            System.out.println(lyrics.get(i));
        }
    }
}

    
