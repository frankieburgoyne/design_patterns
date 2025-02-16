/**
 * This class represents a question in the MathGame.
 *
 * @author frankieburgoyne
 */
public class Question {
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_BLACK = "\u001B[30m";

    private int num1;
    private int num2;
    private int answer;
    private int userAnswer;
    private Operand operand;

    /**
     * Constructor for MathGame that generates a list of questions.
     * The questions are generated randomly using the Random class.
     *
     * @param num1      The first number in the question
     * @param num2      The second number in the question
     * @param operand   The operand in the question
     */
    public Question(int num1, int num2, Operand operand) {
        this.num1 = num1;
        this.num2 = num2;
        this.operand = operand;

        if (operand == Operand.PLUS) { // logic to calculate the correct answer
            this.answer = num1 + num2;
        } else if (operand == Operand.MINUS) {
            this.answer = num1 - num2;
        } else if (operand == Operand.MULTIPLY) {
            this.answer = num1 * num2;
        }
    }
    
    /**
     * Returns the question as a string.
     *
     * @return The question in string format
     */
    public String getQuestion() {
        return num1 + " " + operand.label + " " + num2 + " = ";
    }

    /**
     * Returns the answer to the question.
     *
     * @param userAnswer The user's answer to the question
     */
    public void setUserAnswer(int userAnswer) {
        this.userAnswer = userAnswer;
    }

    /**
     * Checks to see if the user's answer is correct.
     *
     * @return True if the user's answer is correct, false otherwise
     */
    public boolean isCorrect() {
        return userAnswer == answer;
    }

    /**
     * Returns the question and the user's answer in string format.
     *
     * @return The question and the user's answer in string format.
     */
    public String toString() {
        String result = getQuestion() + answer;
        if (isCorrect()) {
            return ANSI_GREEN + result + ANSI_BLACK; // set color back to black in terminal
        } else {
            return ANSI_RED + result + " You answered " + userAnswer + ANSI_BLACK;
        }
    }
}
