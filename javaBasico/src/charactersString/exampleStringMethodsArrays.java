package charactersString;

public class exampleStringMethodsArrays {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.toCharArray());


        char [] arreglos = trabalenguas.toCharArray();
        int largo = arreglos.length;//esto es atributo o propiedad del arreglo
        for (int i = 0;i < largo;i++){
            System.out.print(arreglos[i]);
        }
        System.out.println("\ntrabalenguas = " + trabalenguas.split("a"));//

        String[] arreglos2 = trabalenguas.split("a");
        int i = arreglos2.length;
        for(int j = 0;j<1;j++){
            System.out.println(arreglos2[j]);

        }
    }
}
