package game;

import util.ConsoleReader;


/**
 * This class represents a player that allows the user to guess letters interactively.
 *
 * @author Robert C. Duvall
 */
public class InteractiveGuesser extends Guesser {
    /**
     * @see Guesser#getGuess()
     */
    @Override
    public String getGuess () {
        return ConsoleReader.promptString("Make a guess: ");
    }
}
