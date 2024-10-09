import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {

        //test 1
        ArrayList<String> arrayInputOne = new ArrayList<String>();
        arrayInputOne.add("an");
        arrayInputOne.add("band");
        arrayInputOne.add("band");
        WordChecker g = new WordChecker(arrayInputOne);
        boolean info = g.isWordChain();
        System.out.println(info);

        //test 2
        ArrayList<String> arrayInputTwo = new ArrayList<String>();
        arrayInputTwo.add("to");
        arrayInputTwo.add("too");
        arrayInputTwo.add("stool");
        arrayInputTwo.add("tools");
        WordChecker f = new WordChecker(arrayInputTwo);
        info = f.isWordChain();
        System.out.println(info);
    }
}
