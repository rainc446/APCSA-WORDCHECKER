import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {

        //test 1
        ArrayList<String> arrayInputOne = new ArrayList<String>();
        arrayInputOne.add("an");
        arrayInputOne.add("band");
        arrayInputOne.add("band");
        WordChecker f = new WordChecker(arrayInputOne);
        boolean info = f.isWordChain();
        System.out.println(info);

        //test 2
        ArrayList<String> arrayInputTwo = new ArrayList<String>();
        arrayInputTwo.add("to");
        arrayInputTwo.add("too");
        arrayInputTwo.add("stool");
        arrayInputTwo.add("tools");
        WordChecker g = new WordChecker(arrayInputTwo);
        info = g.isWordChain();
        System.out.println(info);

        ArrayList<String> arrayInputThree = new ArrayList<>();
        arrayInputThree.add("catch");
        arrayInputThree.add("bobcat");
        arrayInputThree.add("catchacat");
        arrayInputThree.add("cat");
        arrayInputThree.add("at");
        WordChecker h = new WordChecker(arrayInputThree);
        System.out.println(h.createList("cat"));
        System.out.println(h.createList("catch"));
        System.out.println(h.createList("dog"));
    }
}
