package Greenfox.week03;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.Scanner;


public class CountLines {
    public static void main(String[] args) {
        System.out.println("File name: ");
        Scanner input = new Scanner(System.in);
        System.out.println("Number of lines in your file: " + countLines(input.nextLine()));
    }

    public static int countLines (String fileName) {
        Path source = Paths.get(fileName);
        try {
            return (int) Files.lines(source).count();
        } catch (Exception e) {
            return 0;
        }
    }
}