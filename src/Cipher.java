public class Cipher {
    private static char[] alphabet;

    //Constructor Cipher
    public Cipher(char[] alphabet) {
        this.alphabet = alphabet;
    }
    //encrypt method
    public static String encrypt(String text, int shift) {
        StringBuilder encrypttext = new StringBuilder();
        for (char letter : text.toCharArray()) {
            int position = new String(alphabet).indexOf(letter);
            if (shift != -1) {
                int newposition = (position + shift) % alphabet.length;
                encrypttext.append(alphabet[newposition]);
            } else {
                encrypttext.append(letter);
            }
        }

        return encrypttext.toString();
    }

    //decrypt method
        public static String decrypt (String text,int shift){
            StringBuilder decrypttext = new StringBuilder();
            for (char letter : text.toCharArray()) {
                int position = new String(alphabet).indexOf(letter);
                if (shift != -1) {
                    int realposition = (position - shift) % alphabet.length;
                    decrypttext.append(alphabet[realposition]);
                } else {
                    decrypttext.append(letter);
                }
            }
            return decrypttext.toString();
        }

}
