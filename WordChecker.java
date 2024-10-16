import java.util.ArrayList;

public class WordChecker {
    /** Initialized in the constructor and contains no null elements */
    private ArrayList<String> wordList;
    private boolean wordMatches;
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

        for (int x = 1; x < wordList.size(); x++)   //index will start at one, if you check less than or equal to then you are checking for index of 3
                                                    //skips index of zero preventing the first word from being checked at all
        {
            //indexOf() w3schools
            int wordMin = 0;
            String wordToCheck = wordList.get(x);
            String lastWord = wordList.get(x - 1);
            if (wordToCheck.indexOf(lastWord) < 0) {
                return wordMatches;
            }

        }
        wordMatches = true;
        return wordMatches;
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
      ArrayList<String> targetRemoved = new ArrayList<>();
      for(int i = 0; i < wordList.size()-1; i++) {
//          String startOfWord = wordList.get(i).substring(0,target.length()-1);
          if (wordList.get(i).startsWith(target)){
              String newWord = wordList.get(i).substring(target.length());
              targetRemoved.add(newWord);
          }
      }
      return targetRemoved;
    }


// There may be instance variables, constructors, and methods that are not shown.
}
