import java.util.Random;

/**
 * SpecialChars class that extends the PasswordDecorator class.
 * This class is used to add special characters to the password (30% chance).
 *
 * @param passwordBeginning - the password that is getting "adjusted".
 * @author frankieburgoyne
 */
public class SpecialChars extends PasswordDecorator {
    public SpecialChars(Password passwordBeginning) {
        super(passwordBeginning);
    }

    /**
     * The getPassword method returns the new, modified password (special characters added).
     *
     * @return sb.toString() - the new password with special characters added.
     */
    @Override
    public String getPassword() {
        String oldPass = passwordBeginning.getPassword(); // assign the original password as a String to oldPass
        StringBuilder sb = new StringBuilder(); // using StringBuilder to easily appened adjusted characters to the password.
        Random rand = new Random(); // random number generator used to determine if a special character will be added (will be implemented as 30% chance)

        for (int i = 0; i < oldPass.length(); i++) { // iterates through the original password
            char c = oldPass.charAt(i);
            sb.append(c); // adds the character to the "new" password holder

            if (Character.isLetter(c) && rand.nextInt(10) < 3) {  // if the character is a letter and the random number is less than 3 (30% chance)
                char specialChar;
                int choice = rand.nextInt(7); // random number is generated to determine which will be added (7 possible options)
                
                if (choice == 0) specialChar = '*';
                else if (choice == 1) specialChar = '!';
                else if (choice == 2) specialChar = '%';
                else if (choice == 3) specialChar = '+';
                else if (choice == 4) specialChar = '.';
                else if (choice == 5) specialChar = '{';
                else specialChar = '}';

                sb.append(specialChar); // adds the special character to the "new" password holder
            }
        }
        return sb.toString();
    }
}

