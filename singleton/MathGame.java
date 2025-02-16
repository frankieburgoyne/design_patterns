import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
/**
 * MathGame is a singleton class that generates a list of questions for the user to answer.
 * The number of questions is determined by the constant NUM_QUESTIONS.
 *
 * @author frankieburgoyne
 */
public class MathGame {
    public static final int NUM_QUESTIONS = 5;
    private static MathGame mathGame;
    private ArrayList<Question> questions;

    /**
     * Constructor for MathGame that generates a list of questions for the user to answer
     */
    private MathGame() {
        questions = new ArrayList<>();
        Random rand = new Random();
        Operand[] operands = Operand.values();

        for (int i = 0; i < NUM_QUESTIONS; i++) {
            int num1 = rand.nextInt(100); // Generates a random number between 0 and 100
            int num2 = rand.nextInt(100); // Generates a random number between 0 and 100

            int randomIndex = rand.nextInt(operands.length);

            Operand operand = operands[randomIndex];

            Question question = new Question(num1, num2, operand);
            questions.add(question);
        }
    }

    /**
     * Returns the instance of MathGame if it exists, otherwise it creates a new instance.
     * @return The instance of MathGame
     */
    public static MathGame getInstance() {
        if (mathGame == null) {
            mathGame = new MathGame();
        }
        return mathGame;
    }

    /**
     * Returns an iterator for the list of questions.
     *
     * @return An iterator for the list of questions.
     */
    public Iterator<Question> getIterator() {
        return questions.iterator();
    }
}
