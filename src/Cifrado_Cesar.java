public class Cifrado_Cesar {
    static char[] alfabeto = new char [] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
            'ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
    static int clave = 1;
    static String mensaje = "abcd";
    static String mensajecifrado;

    public Cifrado_Cesar(int clave, String mensaje) {
        this.clave = clave;
        this.mensaje = mensaje;
    }

}
