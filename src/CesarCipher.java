import java.nio.file.Path;
import java.util.Scanner;

public class CesarCipher {

    //Alfabeto en cifrado
    private static final char[] alfabetonormal = {'a', 'b',
            'c','d', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
            't', 'u', 'v', 'w', 'x', 'y', 'z', '.', ',', '«', '»',
            ':', '!', '?', ' '};
    private static final char[] ALPHABET = {'а', 'б',
            'в','г', 'д', 'е', 'ж', 'з', 'и', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у',
            'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'я', '.', ',', '«', '»',
            ':', '!', '?', ' '};

    public static char[] getALPHABET() {
        return ALPHABET;
    }

    public static char[] getAlfabetonormal() {
        return alfabetonormal;
    }

    //Método para cifrar
    public void encrypt(String inputFile, String outputFile, int key) {
        try {
            FileManager fileManager = new FileManager();
            String text = fileManager.readFile(inputFile);
            if (Validator.isFileExists(inputFile)) {
                if (Validator.isValidKey(key, getALPHABET())) {
                    Cipher cipher = new Cipher(getALPHABET(), getAlfabetonormal());
                    String encryptedText = cipher.encrypt(text, key);
                    fileManager.writeFile(encryptedText, outputFile);
                } else {
                    System.out.println("La clave no es valida");
                }
            } else {
                System.out.println("El archivo no existe");
            }
        } catch (Exception e) {
            System.out.println("No se encontro el archivo");
        }


    }

    public void descrypt(String inputFile, String outputFile, int key) {
        try {
            FileManager fileManager = new FileManager();
            String text = fileManager.readFile(inputFile);
            if (Validator.isFileExists(inputFile)) {
                if (Validator.isValidKey(key, getALPHABET())) {
                    Cipher cipher = new Cipher(getALPHABET(), getAlfabetonormal());
                    String descryptedtext = cipher.decrypt(text, key);
                    fileManager.writeFile(descryptedtext, outputFile);
                } else {
                    System.out.println("La clave no es valida");
                }
            } else {
                System.out.println("El archivo no existe");
            }
        } catch (Exception e) {
            System.out.println("No se encontro el archivo");
        }


    }

}
