import java.util.ArrayList;

public class WordChecker {
    /** Initialized in the constructor and contains no null elements */
    private ArrayList<String> wordList;
    /**
     * Returns true if each element of wordList (except the first) contains the previous
     * element as a substring and returns false otherwise, as described in part (a)
     * Precondition: wordList contains at least two elements.
     * Postcondition: wordList is unchanged.
     */
    public WordChecker(ArrayList<String> inputList)
    {
        wordList = inputList;
    }

    public boolean isWordChain()
    { /* to be implemented in part (a) */
        for (int x = 1; x <= wordList.length(); x++) //index will start at one
        {
            int wordMin = 0;
            String lastWord = wordList.get(x-1);
            String wordToCheck = wordList.get(x);
            for (int wordMax = 0; wordMax < wordToCheck.length(); wordMax++)
            {
                if (wordToCheck.substring(wordMin, wordMax).equals(lastWord))
                {
                    return
                }

            }

        }

    }
    /**
     * Returns an ArrayList<String> based on strings from wordList that start
     * with target, as described in part (b). Each element of the returned ArrayList has had
     * the initial occurrence of target removed.
     * Postconditions: wordList is unchanged.
     * Items appear in the returned list in the same order as they appear in wordList.
     */
    public ArrayList<String> createList(String target)
    { /* to be implemented in part (b) */
    }
// There may be instance variables, constructors, and methods that are not shown.
}
