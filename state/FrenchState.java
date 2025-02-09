/**
 * FrenchState class inherits from the State class
 * "Plays" the French version of the songs
 *
 * @author frankieburgoyne
 */
public class FrenchState extends State {
    /**
     * File name for the French version of Twinkle Twinkle Little Star
     */
    private static final String TWINKLE_FILE_NAME = "songs/twinkle-french.txt";
    /**
     * File name for the French version of If You're Happy and You Know It
     */
    private static final String HAPPY_FILE_NAME = "songs/happy-french.txt";

    /**
     * Constructor for the FrenchState class
     * @param box MusicBox object
     */
    public FrenchState(MusicBox box) {
        super(box, TWINKLE_FILE_NAME, HAPPY_FILE_NAME);
    }

    /**
     * Plays the French version of Twinkle Twinkle Little Star
     */
    @Override
    public void pressStarButton() {
        musicBox.playSong("Brille, brille, petite étoile", starLyrics);
    }

    /**
     * Plays the French version of If You're Happy and You Know It
     */
    @Override
    public void pressHappyButton() {
        musicBox.playSong("Si tu as d' la joie au coeur", happyLyrics);
    }

    /**
     * Sets the MusicBox to English output
     */
    @Override
    public void pressEnglishButton() {
        musicBox.setState(musicBox.getEnglishState());
        System.out.println("Now in English Mode.");
    }

    /**
     * Sets the MusicBox to French output
     */
    @Override
    public void pressFrenchButton() {
        System.out.println(" Already Set to French Mode.");
    }

    /**
     * Sets the MusicBox to Spanish output
     */
    @Override
    public void pressSpanishButton() {
        musicBox.setState(musicBox.getSpanishState());
        System.out.println("Now in Spanish Mode.");
    }
}

