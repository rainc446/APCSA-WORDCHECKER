import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<String> arrayInput = new ArrayList<String>();
        arrayInput.add("an");
        arrayInput.add("band");
        arrayInput.add("band");
        WordChecker g = new WordChecker(arrayInput);
        boolean info = g.isWordChain();
        System.out.println(info);

    }
}
