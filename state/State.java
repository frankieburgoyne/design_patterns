import java.util.ArrayList;

/**
 * Abstract State class the defines the methods that the states will implement
 * 
 * @author frankieburgoyne
 */
public abstract class State {
    /**
     * The music box that the state will be changing
     */
    protected MusicBox musicBox;
    /**
     * The lyrics for the star button stored in an array List
     */
    protected ArrayList<String> starLyrics;
    /**
     * The lyrics for the happy button stored in an array List
     */
    protected ArrayList<String> happyLyrics;

    /**
     * Constructor for the state class that loads the song lyrics from the file
     * @param box the music box that the state will be changing
     * @param twinkleFileName the file name for the twinkle lyrics
     * @param happyFileName the file name for the happy lyrics
     */
    public State(MusicBox box, String twinkleFileName, String happyFileName) {
        this.musicBox = box;
        this.starLyrics = FileReader.getLyrics(twinkleFileName); // reads lyrics from the file
        this.happyLyrics = FileReader.getLyrics(happyFileName); // reads lyrics from the file
    }

    /**
     * method that plays the song for the star button (twinkle twinkle little star)
     */
    public abstract void pressStarButton();
    /**
     * method that plays the song for the happy button (happy birthday)
     */
    public abstract void pressHappyButton();
    /**
     * method that switches the language to english
     */
    public abstract void pressEnglishButton();
    /**
     * method that switches the language to french
     */
    public abstract void pressFrenchButton();
    /**
     * method that switches the language to spanish
     */
    public abstract void pressSpanishButton();
}
