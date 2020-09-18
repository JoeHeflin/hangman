package game;


public class AutoGuesser extends Guesser {
    private static final String LETTERS_ORDERED_BY_FREQUENCY = "etaoinshrldcumfpgwybvkxjqz";

    private String myLetters;
    private int myIndex;


    public AutoGuesser () {
        myLetters = LETTERS_ORDERED_BY_FREQUENCY;
        myIndex = 0;
    }

    public String getGuess () {
        return "" + myLetters.charAt(myIndex++);
    }
}
