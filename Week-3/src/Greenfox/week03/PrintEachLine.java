package Greenfox.week03;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {
//    Not sure if we should have had a file to open, but I'm rolling with this one
    public static void main(String[] args) {
        try {
            Path filePath = Paths.get("my-text.txt");
            List<String> lines = Files.readAllLines(filePath);
            System.out.println(lines.get(0));
        } catch (Exception e) {
            System.out.println("Unable to read file: my-text.txt");
        }
    }
}
