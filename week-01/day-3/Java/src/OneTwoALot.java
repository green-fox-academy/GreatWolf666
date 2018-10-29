import java.util.Scanner;

public class OneTwoALot {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();

        // Displaying the number
        System.out.println("The number entered by user: "+num);
    }



}
