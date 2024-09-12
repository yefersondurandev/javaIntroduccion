package charactersString;

public class validatedStringExample {
    public static void main(String[] args) {
        String curso = null;  // Variable declarada, pero sin ningún valor asignado (es null)

        // Posteriormente, se le puede asignar un valor válido
        // curso = "Desarrollo Full Stack";  // Ahora curso apunta a un objeto String

        boolean esNulo = curso == null;

        System.out.println(esNulo);

        if(esNulo){
            curso = "";
        }

        boolean esVacio = curso.length() == 0;

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        System.out.println(esVacio);
        if(!esVacio){
            System.out.println(curso.concat("desde cero"));
        }



    }
}
