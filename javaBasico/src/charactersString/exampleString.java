package charactersString;

public class exampleString {
    public static void main(String[] args) {
        String str1 = "Yeferson Duran";
        String str2  = new String("Yeferson Duran");

        System.out.println("Son el mismo objeto?="+(str1 == str2));
        System.out.println("Tienen el mismo valor?="+(str1.equals(str2)));


    }
}
