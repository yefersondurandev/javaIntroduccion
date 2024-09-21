package ValorReferencia;

public class PasarPorReferencia {
    public static void main(String[] args) {
        int[] edad  = {10,11,12,13,14,15};
        System.out.println("iniciamos en metodo main");
        for (int edades:edad){
            System.out.print(edades+", ");
        }
        System.out.println("Antes de invocar el metodo test\n");
        test(edad);
        System.out.println("Despues de invocar al metodo test");
        for (int edades:edad){
            System.out.print(edades+", ");
        }
        System.out.println("Finaliza el metodo main!");

    }

    public static void test(int[] edadArray) {
        System.out.println("Iniciamos el método test");
        for (int i = 0; i < edadArray.length; i++) {
            edadArray[i] = edadArray[i] + 20;  // Modificamos el mismo array
        }
    }

}

