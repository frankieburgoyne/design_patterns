/**
 * Symbols class extends the PasswordDecorator class.
 * It is used to add the various symbols to the password.
 *
 * @param passwordBeginning - the password that is getting "adjusted".
 * @author frankieburgoyne
 */
public class Symbols extends PasswordDecorator {
    public Symbols(Password passwordBeginning){
        super(passwordBeginning);
    }

    /**
     * The getPassword method returns the new, modified password (symbols added).
     *
     * @return passwordBeginning.getPassword() - the new password with symbols added. 
     */
    @Override
    public String getPassword() {
        return passwordBeginning.getPassword() // replaces necessary characters with corresponding symbols, returns the resulting changed password. 
            .replace("a", "@")
            .replace("b", "8")
            .replace("e","3")
            .replace("g", "9")
            .replace("i", "!")
            .replace("o", "0")
            .replace("s", "$")
            .replace("t", "7");
    }
}
