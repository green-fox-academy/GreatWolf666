package Greenfox.week02;

public class TakesLonger {
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        StringBuilder sb = new StringBuilder(quote);
        int indexOfA = sb.indexOf(" you");
        sb.insert(indexOfA +1, "always takes longer than ");

        //  When saving this quote a disk error has occured. Please fix it.
        // Using pieces of the quote variable (instead of just redefining the string)

        System.out.println(sb);
    }
}
