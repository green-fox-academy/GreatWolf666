package Greenfox.week03;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class CopyFile {
    public static void main(String[] args) {
        System.out.println(copyFile("source", "destination"));
    }
    public static boolean copyFile (String source, String destination) {
        Path sourcePath = Paths.get(source);
        Path destinationPath = Paths.get(destination);
        try {
            Files.copy(sourcePath, destinationPath);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
