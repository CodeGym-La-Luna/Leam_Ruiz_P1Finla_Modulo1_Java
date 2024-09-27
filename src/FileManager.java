import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class   FileManager {

    //readFile method
    public String readFile(String filepath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filepath)));
    }

    //writeFile method
    public static void writeFile (String content, String filepath){
        try {
            Files.writeString(Path.of(filepath), content);
            System.out.println("Se ha escrito el archivo");
        } catch (Exception e) {
            System.out.println("No se pudo escribir el archivo");
        }
    }
}

