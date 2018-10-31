import java.util.Scanner;

public class OneTwoALot {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int as = in.nextInt();
        int a = 0;
        int b = 1;
        int c = 2;


        if (as <= a) {
            System.out.println("Not enough.");
        } else {
            if (as == b)

                System.out.println(b);
        }
        if (as == c) {

            System.out.println(c);
        }
        if (as > c) {
            System.out.println("A lot.");
        }

    }

}





