import java.nio.file.Files;
import java.nio.file.Path;

public class Validator {
   //isValidKey method
    public static boolean isValidKey(int key, char[] alphabet) {
        return key >= 0 && key < alphabet.length;
    }

    //isFileExists method
    public static boolean isFileExists(String filepath) {
        return Files.exists(Path.of(filepath));
    }

}
