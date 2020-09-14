package util;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;


/**
 * This class represents all possible words that might be used in a game.
 *
 * @author Michael Hewner
 * @author Owen Astrachan
 * @author Mac Mason
 * @author Robert C. Duvall
 */
public class HangmanDictionary {
    private Map<Integer, List<String>> myWords;
    // create only one and reuse it so you get a truly random sequence of values
    private Random myRandom;


    /**
     * Create dictionary from file of words.
     */
    public HangmanDictionary (String wordFile) {
        myWords = loadFromFile(wordFile);
        myRandom = new Random();
    }

    /**
     * Return randomly chosen word of specified length, or empty string
     * if there are no words of that length.
     * 
     * @param wordLength is length of returned word
     * @return randomly chosen word (or "" if no words)
     */
    public String getRandomWord (int wordLength) {
        List<String> wordList = getWords(wordLength);
        // are there any words of this length left?
        return (wordList.size() > 0) ? wordList.get(myRandom.nextInt(wordList.size())) : "";
    }

    /**
     * Return all words of specified length, or empty list
     * if there are no words of that length.
     * 
     * @param wordLength is length of all returned words
     * @return list of words all of same length (or empty list)
     */
    public List<String> getWords (int wordLength) {
        return (myWords.containsKey(wordLength)) ? myWords.get(wordLength) : new ArrayList<>();
    }

    /**
     * Returns true if the given word is in the dictionary of words with the given length.
     *
     * @param word word to search for in dictionary
     * @param wordLength is length of all returned words
     */
    public boolean contains (String word, int wordLength) {
        return myWords.containsKey(wordLength) && myWords.get(wordLength).contains(word);
    }


    // load words from a file into map based on their length
    private Map<Integer, List<String>> loadFromFile (String filename) {
        Map<Integer, List<String>> wordsByLength = new HashMap<>();
        try {
            Path path = Paths.get(getClass().getClassLoader().getResource(filename).toURI());
            for (String line : Files.readAllLines(path)) {
                String word = line.trim();
                if (! wordsByLength.containsKey(word.length())) {
                    wordsByLength.put(word.length(), new ArrayList<>());
                }
                wordsByLength.get(word.length()).add(word);
            }
        }
        catch (IOException | URISyntaxException e) {
            System.err.println("A error occurred reading word file: " + e);
        }
        return wordsByLength;
    }
}
