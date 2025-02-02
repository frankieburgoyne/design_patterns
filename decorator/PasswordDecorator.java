/**
 * Abstract decorator class that extends the parent Password class.
 * This class is used to extend the functionality of the Password class.
 *
 * @passwordBeginning: Taking password object as a paramater to extend the functionality of the Password class.
 * @author frankieburgoyne
 */
public abstract class PasswordDecorator extends Password {
    protected Password passwordBeginning;

    /**
     * Constructor for the PasswordDecorator class.
     * @param passwordBeginning - Password object that is being extended.
     */
    public PasswordDecorator(Password passwordBeginning) {
        this.passwordBeginning = passwordBeginning;
    }

    /**
     * Abstract method used to get the password.
     *
     * @return String - The password
     */
    public abstract String getPassword();
}
