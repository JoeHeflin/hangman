package game;

import util.HangmanDictionary;

import java.util.Random;

public class RandomExecutioner {
    //private static final String WORDS_FILE = "lowerwords.txt";
    private static final int MAX_WORD_LENGTH = 15;
    private HangmanDictionary myWords;
    private Random myRandomObject;




    public RandomExecutioner(String wordsFile) {
        myWords = new HangmanDictionary(wordsFile);
        myRandomObject = new Random();
    }


    public String getSecretWord() {
        int randomWordSize = myRandomObject.nextInt(MAX_WORD_LENGTH);
        String randomWord = myWords.getRandomWord(randomWordSize);

        return randomWord;
    }


}
