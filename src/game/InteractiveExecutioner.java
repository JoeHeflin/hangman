package game;

import util.ConsoleReader;

//public class InteractiveExecutioner {
public class InteractiveExecutioner extends Executioner {
    String mySecretWord;

    public InteractiveExecutioner() {
        mySecretWord = ConsoleReader.promptString("Enter secret word: ");
    }

    @Override
    public String getSecretWord() {
        return mySecretWord;
    }
}
