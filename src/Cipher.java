public class Cipher {
    private static char[] alphabet;
    private static char[] alfabetonormal;
    //Constructor Cipher
    public Cipher(char[] alphabet, char[] alfabetonormal) {
        this.alphabet = alphabet;
        this.alfabetonormal = alfabetonormal;
    }
    //encrypt method
    public String encrypt(String text, int shift) {
        StringBuilder encrypttext = new StringBuilder();
        for (char letter : text.toLowerCase().toCharArray()) {
            int position = new String(alfabetonormal).indexOf(letter);
            if (position != -1) {
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
                    int realposition = (position - shift + alphabet.length) % alphabet.length;
                    decrypttext.append(alfabetonormal[realposition]);
                } else {
                    decrypttext.append(letter);
                }
            }
            return decrypttext.toString();
        }

}
