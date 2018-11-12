package Greenfox.week03;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int divisor = scanner.nextInt();

        try {
            int result = divisor / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero!");
        }
    }
}
