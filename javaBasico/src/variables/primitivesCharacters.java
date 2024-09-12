package variables;

public class primitivesCharacters {
    public static void main(String[] args) {
        //acepta todos los unicode
        char characters = '\u0040';
        char decimal = 64;

        System.out.println("characters = " + characters);
        System.out.println("decimal = " + decimal);


        char espacion = ' ';
        char retroceso = '\b';
        char tabulador = '\t';
        char newline = '\n';
        System.out.println("espacion = " + espacion);
        System.out.println("float a byte corresponde a:" +  newline + Character.BYTES);

    }
}
