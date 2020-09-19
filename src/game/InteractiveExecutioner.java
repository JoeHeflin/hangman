package game;

import util.ConsoleReader;

public class InteractiveExecutioner {
    String mySecretWord;

    public InteractiveExecutioner() {
        mySecretWord = ConsoleReader.promptString("Enter secret word: ");
    }

    public String getSecretWord() {
        return mySecretWord;
    }
}
