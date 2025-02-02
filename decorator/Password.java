/**
 * Abstract class Password that defines the password attribute and getPassword method.
 * Used to create the Password objects.
 * 
 * @password the password of the user
 * @author frankieburgoyne
 */
public abstract class Password {
    protected String password;

    /**
     * 
     * Method to get the password of the user.
     * 
     * @return the password of the user
     */
    public String getPassword() {
        return password;
    }
}
