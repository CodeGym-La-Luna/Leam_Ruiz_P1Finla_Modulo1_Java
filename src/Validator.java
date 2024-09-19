import java.nio.file.Files;
import java.nio.file.Path;

public class Validator {
   //isValidKey method
    public static boolean isValidKey(int key, char[] alphabet) {
        try {
         if (key >= 0 && key < alphabet.length) {
             System.out.println("La clave es valida");
         }
             return true;

         } catch (Exception e) {
            return false;
        }
    }

    //isFileExists method
    public static boolean isFileExists(String filepath) {
        return Files.exists(Path.of(filepath));
    }

}
