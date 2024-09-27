import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainApp {
    public static void main(String[] args) {



        descryption();
        encryption();



    }
    //Encryption
    public static void encryption (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la ruta del archivo a cifrar");
        String inputFile = scanner.nextLine();
        System.out.println("Ingrese la ruta del archivo cifrado");
        String outputFile = scanner.nextLine();
        System.out.println("Ingrese la clave");
        int key = scanner.nextInt();
        CesarCipher cesarCipher = new CesarCipher();
        cesarCipher.encrypt(inputFile,outputFile ,key);
    }

    public static void descryption (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la ruta del archivo a descifrar");
        String inputFile = scanner.nextLine();
        System.out.println("Ingrese la ruta del archivo descifrado");
        String outputFile = scanner.nextLine();
        System.out.println("Ingrese la clave");
        int key = scanner.nextInt();
        CesarCipher cesarCipher = new CesarCipher();
        cesarCipher.descrypt(inputFile,outputFile ,key);
    }

}