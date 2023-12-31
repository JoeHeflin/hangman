package util;

import game.HangmanGame;
import game.InteractiveGuesser;


/**
 * This class launches the Hangman game and plays once.
 * 
 * @author Michael Hewner
 * @author Mac Mason
 * @author Robert C. Duvall
 */
public class Main {
    public static final String DICTIONARY = "lowerwords.txt";
    public static final int NUM_LETTERS = 6;
    public static final int NUM_MISSES = 8;


    public static void main (String[] args) {
        new HangmanGame(
            new InteractiveGuesser(),
            new HangmanDictionary(DICTIONARY), NUM_LETTERS, NUM_MISSES).play();
//        new HangmanGame(
//            new game.AutoGuesser(),
//            new HangmanDictionary(DICTIONARY), NUM_LETTERS, NUM_MISSES).play();
    }
}
