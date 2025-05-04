import java.util.ArrayList;
public class Main
{
    public static void main(String[] args) {
        String[] wordNums = {"one" , "two", "three"};
        WordPairList test1 = new WordPairList(wordNums);
        System.out.println(test1.getAllPairs());
        String[] moreWords = {"the", "red", "fox", "the", "red"};
        WordPairList test2 = new WordPairList(moreWords);
        System.out.println(test2.numMatches());

    }
}