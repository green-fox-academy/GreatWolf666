import java.util.Scanner;

    public class OddEven {

        private static void isEven(int currentNumber) {
            if (currentNumber % 2 == 0) {
                System.out.println(currentNumber + " is even\n");
            }
            else {
                System.out.println(currentNumber + " is odd\n");
            }
        }

        public static void main(String[] args) {

            int number = 0;

            Scanner input = new Scanner(System.in);
            do {
                System.out.println("Enter number (-1 to quit): ");
                number = input.nextInt();

                if (number == -1) {
                    break;
                }
                else {
                    OddEven.isEven(number);
                }

            } while (number > 0); //end do while loop

            System.out.println("Program Terminated");
        }
    }