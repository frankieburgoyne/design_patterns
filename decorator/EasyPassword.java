import java.util.Random;

/**
 * EasyPassword class is a subclass of Password.
 * Replaces spaces in the password with "-" and adds a random number (1-100) at the end of the password. 
 *
 * @param phrase - the password that is getting "adjusted".
 * @author frankieburgoyne
 */
public class EasyPassword extends Password {
    public EasyPassword(String phrase) {
        this.password = phrase;
    }

    /**
     * The getPassword method returns the new, modified password.
     *
     * @return easyPassword - the new password
     */
    @Override
    public String getPassword() {
        String easyPassword = password.replace(" ", "-"); //replaces space with hyphen
        
        Random rand = new Random();
        int RandomNum = rand.nextInt(100); //generates a random number between 1-100
        return easyPassword + RandomNum; // returns the hyphenated password with the random number attached.
    }
}
