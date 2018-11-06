package Greenfox.week02;

public class UrlFixer {
    public static void main(String[] args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";

        String replaceString = url.replace("bots", "odds");

        System.out.println(replaceString + ".com");
//       Will come back with more solutions.

    }

}
