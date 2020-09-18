package game;


/**
 * This abstraction represents any player that can guess letters.
 *
 * @author Robert C. Duvall
 */
public abstract class Guesser {
    /**
     * Returns the current guess.
     */
    public abstract String getGuess ();
}
