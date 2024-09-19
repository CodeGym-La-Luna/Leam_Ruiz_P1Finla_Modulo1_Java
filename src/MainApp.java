//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainApp {
    public static void main(String[] args) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Cipher cipher = new Cipher(alphabet);
        System.out.println(cipher.encrypt("hello", 3));
        System.out.println(cipher.decrypt("khoor", 3));
        System.out.println(FileManager.readFile("C:\\Users\\leamf\\jdk-17_windows-x64_bin\\jdk-17.0.11\\Proyecto_Cifrado1\\src\\Prueba"));
        FileManager.writeFile("Hola", "C:\\Users\\leamf\\jdk-17_windows-x64_bin\\jdk-17.0.11\\Proyecto_Cifrado1\\src\\Prueba2");
     }
}