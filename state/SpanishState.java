/**
 * SpanishState class inherits from the State class
 * "Plays" the Spanish version of the songs
 */
public class SpanishState extends State {
    /**
     * File name for the Spanish version of Twinkle Twinkle Little Star
     */
    private static final String TWINKLE_FILE_NAME = "songs/twinkle-spanish.txt";
    /**
     * File name for the Spanish version of If You're Happy and You Know It
     */
    private static final String HAPPY_FILE_NAME = "songs/happy-spanish.txt";

    /**
     * Constructor for the SpanishState class
     * @param box MusicBox object
     */
    public SpanishState(MusicBox box) {
        super(box, TWINKLE_FILE_NAME, HAPPY_FILE_NAME);
    }

    /**
     * Plays the Spanish version of Twinkle Twinkle Little Star
     */
    @Override
    public void pressStarButton() {
        musicBox.playSong("Estrellita, ¿dónde estás?", starLyrics);
    }

    /**
     * Plays the Spanish version of If You're Happy and You Know It
     */
    @Override
    public void pressHappyButton() {
        musicBox.playSong("Si usted esta feliz", happyLyrics);
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
        musicBox.setState(musicBox.getFrenchState());
        System.out.println("Now in French Mode. ");
    }
    
    /**
     * Sets the MusicBox to Spanish output
     */
    @Override
    public void pressSpanishButton() {
        System.out.println("Already in Spanish Mode.");
    }
}

