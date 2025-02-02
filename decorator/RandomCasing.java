import java.util.Random;

/**
 * RandomCasing class extends the PasswordDecorator class.
 * It is used to add random casing to the passoword, 50% of the time.
 *
 * @param passwordBeginning - the password that is getting "adjusted".
 * @author frankieburgoyne
 */
public class RandomCasing extends PasswordDecorator {
    public RandomCasing(Password passwordBeginning) {
        super(passwordBeginning);
    }

    /**
    * The getPassword method returns the new, modified password with random casing added.
    *
    * @return sb.toString() - the new password with random casing added.
    */
    @Override
    public String getPassword() {
        String oldPass = passwordBeginning.getPassword(); // assign the original password as a String to oldPass
        StringBuilder sb = new StringBuilder(); // using StringBuilder to easily append characters
        Random rand = new Random(); 
    
        for (int i = 0; i < oldPass.length(); i++) { // loops through each character in the password to add random casing
            char c = oldPass.charAt(i);

            if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') { // check if the character is a letter.
                if (rand.nextInt(2) == 0) { // 50% chance
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(Character.toLowerCase(c));
                }
            } else {
                sb.append(c); // if the character is not a letter, it is added as is.
            }
        }
    
        return sb.toString();
    }
}


