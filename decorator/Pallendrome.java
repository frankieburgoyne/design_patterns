/**
 * Pallendrome class that extends the PasswordDecorator class.
 * This class is used to add the Pallendrome (reverse) of the original password to the new password.
 *
 * @param passwordBeginning - the password that is getting "adjusted".
 * @author frankieburgoyne
 */
public class Pallendrome extends PasswordDecorator {
    public Pallendrome(Password passwordBeginning) {
        super(passwordBeginning);
    }

    /**
     * getPassword method returns the new, modified password (pallendrome added).
     *
     * @return oldPass + reversed - the new password with the pallendrome added.
     */
    @Override
    public String getPassword() {
        String oldPass = passwordBeginning.getPassword(); // assign the original password as a String to oldPass
        String reversed = new StringBuilder(oldPass).reverse().toString(); // reverse the original password and assign it to reversed
        return oldPass + reversed;
    }
}

