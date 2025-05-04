public class WordPair {
    private String firstWord;
    private String secondWord;
    public WordPair(String first, String second) {
        firstWord = first;
        secondWord = second;
    }

    /** Returns the first string of this WordPair object. */
    public String getFirst() {
        return firstWord;
        }

    /** Returns the second string of this WordPair object. */
    public String getSecond() {
        return secondWord; }

    public String toString(){
        return "(\"" + firstWord + "\", \"" + secondWord + "\")";
    }
}