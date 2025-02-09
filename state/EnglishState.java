/**
 * EnglishState inherits from State
 * "Plays" music from the MusicBox in English
 *
 * @author frankieburgoyne
 */
public class EnglishState extends State {
    /**
     * The filename for Twinkle Twinkle Little Star
     */
    private static final String TWINKLE_FILE_NAME = "songs/twinkle-english.txt";
    /**
     * The filename for If You're Happy and You Know It
     */
    private static final String HAPPY_FILE_NAME = "songs/happy-english.txt";

    /**
     * EnglishState is the constructor for the EnglishState class
     * @param box the MusicBox that the state is in
     */
    public EnglishState(MusicBox box) {
        super(box, TWINKLE_FILE_NAME, HAPPY_FILE_NAME);
    }

    /**
     * pressStarButton plays Twinkle Twinkle Little Star
     */
    @Override
    public void pressStarButton() {
        musicBox.playSong("Twinkle Twinkle Little Star", starLyrics);
    }

    /**
     * pressHappyButton plays If You're Happy and You Know It
     */
    @Override
    public void pressHappyButton() {
        musicBox.playSong("If You're Happy and You Know It", happyLyrics);
    }

    /**
     * pressEnglishButton sets the MusicBox to English output
     */
    @Override
    public void pressEnglishButton() {
        System.out.println("Already Set to English Mode.");
    }

    /**
     * pressFrenchButton sets the MusicBox to French output
     */
    @Override
    public void pressFrenchButton() {
        musicBox.setState(musicBox.getFrenchState());
        System.out.println("Now in French Mode.");
    }
    
    /**
     * pressSpanishButton sets the MusicBox to Spanish output
     */
    @Override
    public void pressSpanishButton() {
        musicBox.setState(musicBox.getSpanishState());
        System.out.println("Now in Spanish Mode.");
    }
}

