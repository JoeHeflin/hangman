## Lab Discussion
### Names
# Edem Ahorlu
# Joe Heflin
# Alexander Jimenez


### Collections Discussion

 * What is the purpose of each interface implemented by LinkedList?
  LinkedList implement the interfaces below:
   * Serializable
   * Clonaeable
   * Iterable<E>
   * Collection<E>
   * Deque<E>
   * List<E>
   * Queue<E>

 * What is the purpose of each superclass of HashMap?

 * How many different implementations are there for a Set?

 * What methods are common to all collections?
   - equals()
   - hashCode()
   - toString()

 * What methods are common to all Queues?
   - add()
   - remove()
   - element()

 * What is the purpose of the collection utility classes?
The collection utility classes provide static methods to be called on objects implementing the collection framework. 

### Original Code

 * How readable is the HangmanGame class?

 * What additional methods might be helpful to make the code more readable or usable?

 * Who should be responsible for each of these instance variables:
   * ```mySecretWord``` - Executioner
   * ```myNumGuessesLeft``` - Guesser
   * ```myDisplayWord``` - Executioner

 * What strategies help you identify which parts of the code are related to the different kinds of executioners?


### Refactoring Plan

 * What methods will your Executioner abstraction have?
 - getSecretWord()


### Making Game Between New Kinds of Players

 * NEW CODE: Describe how to implement new players.
 To add the clever execution funcitonality consider creating a new class that extends the Execution class 
 that uses helper methods that use regex to identify which words match the guessed letters. Add a helper method that ranks the words based
  on maximizing the popularity of the letters it contains from the list of words returned by the regex
   method.
  To add the clever guesser functionality create a new Guessser implementation that uses the same methods but 
  minimizes the popularity of the letters it contains from the list of words returned by the regex method.

 * NEW CODE: Describe how to implement a game between any two kinds of players.
 Have Player 1 and Player 2 parameters that you pass into HangmanGame that are of type Executioner.

### Refactored Code

 * In what ways is the refactored code simpler?
 - Fewer lines of code in HangmanGame. The lines that exist are also more readable.
 * In what ways is the refactored code more complex?
    - More classes to read through and navigate
 * What trade-offs did you make when refactoring the original code?
  - Traded small number of classes for increased readability.
  - Traded simplicity for dynamic instance variables in HangmanGame.
 * Which code do you prefer and why?
- I prefer the refactored code because of the improved readability in HangmanGame.java
