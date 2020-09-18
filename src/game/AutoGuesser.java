package game;


/**
 * This class represents a player that guesses letters automatically based on how common they are in English words.
 *
 * @author Robert C. Duvall
 */
public class AutoGuesser extends Guesser {
    private static final String LETTERS_ORDERED_BY_FREQUENCY = "etaoinshrldcumfpgwybvkxjqz";

    private int myIndex = 0;


    /**
     * @see Guesser#getGuess()
     */
    public String getGuess () {
        return "" + LETTERS_ORDERED_BY_FREQUENCY.charAt(myIndex++);
    }
}
