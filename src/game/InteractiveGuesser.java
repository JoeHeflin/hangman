package game;

import util.ConsoleReader;


public class InteractiveGuesser extends Guesser {
    @Override
    public String getGuess () {
        return ConsoleReader.promptString("Make a guess: ");
    }
}
