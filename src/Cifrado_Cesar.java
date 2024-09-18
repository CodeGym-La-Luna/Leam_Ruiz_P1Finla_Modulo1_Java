public class Cifrado_Cesar {
    private static final char[] alfabeto = new char [] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
            'ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
    static int clave = 1;
    static String mensaje = "zbgh";
    static String mensajecifrado;

    public Cifrado_Cesar(int clave, String mensaje) {
        this.clave = clave;
        this.mensaje = mensaje;
    }

    public static String encrypt() {
        StringBuffer cifrado = new StringBuffer();
        for (char letras : mensaje.toCharArray()) {
            int posicion = new String(alfabeto).indexOf(letras);
            if (posicion != 0) {
                int nuevaPosicion = (posicion + clave) % alfabeto.length;
                cifrado.append(alfabeto[nuevaPosicion]);
            } else {
                cifrado.append(letras); // No cambia caracteres que no están en el alfabeto
            }
        }
            return cifrado.toString();
    }

}
