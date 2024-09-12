package charactersString;

public class exampleStringFileExtension {
    public static void main(String[] args) {
        String file = "alguna.>imagen.jpg";
        int i = file.lastIndexOf(".");
        System.out.println("funcion lenght "+file.length());
        System.out.println("file = " + file.substring(i));
    }
}
