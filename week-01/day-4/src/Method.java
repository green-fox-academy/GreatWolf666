import java.util.Scanner;

public class Method {

    public static void printNumbers() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a number, now");
        int limit = scanner.nextInt ();
        for (int i = 0; i < limit; i++) {
            System.out.println(i);



        }
    }

    public static void main(String[] args) {

        while (true) {

            printNumbers();
            System.out.println();

        }

    }


  //      Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Give me a number, now");
  //      int limit = scanner.nextInt ();
 //       for (int i = 0; i < limit; i++) {
//            System.out.println(i);
//        }

//        Scanner scanner2 = new Scanner(System.in);

//        System.out.println("Give me a number, now");
//       int limit2 = scanner.nextInt ();
 //       for (int i = 0; i < limit2; i++) {
//            System.out.println(i);
 //       }

    }


