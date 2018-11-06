package Greenfox.week02;

public class TodoPrint {

    public static void main(String[] args) {

        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        StringBuilder str = new StringBuilder(" - Download games\n");
        StringBuilder str2 = new StringBuilder("    - Diablo\n");
        StringBuilder str3 = new StringBuilder("My todo:\n");

        System.out.println(str3 + todoText + str + str2);
//         THIS IS THE WORST POSSIBLE SOLUTION FOR THIS, WILL COME BACK TO IT LATER!!
//        System.out.println(todoText);
    }
}
