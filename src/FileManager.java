import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileManager {

    //readFile method
    public static String readFile(String filepath) {
        try {
            Path path = Path.of(filepath);
            return Files.readString(path);
        } catch (IOException e) {
          return "No se encontro el archivo"; }
    }

    //writeFile method
    public static void writeFile (String content, String filepath){
        try {
            Files.writeString(Path.of(filepath), content);
            System.out.println("Se ha escrito el archivo");
        } catch (Exception e) {
            System.out.println("No se encontro el archivo");
        }
    }
}

