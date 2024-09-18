//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Cipher cipher = new Cipher(alphabet);
        System.out.println(cipher.encrypt("hello", 3));
        System.out.println(cipher.decrypt("khoor", 3));
    }
}