package operators;

public class instanceofOperator {
    public static void main(String[] args) {
        String texto = "Creando un objeto de la clase String... que tal!";
        String texto1 = "gola que tal ";
        Integer num = 7;

        boolean b1 = num instanceof Object;
        System.out.println("es del tipo String = " + b1);

    }
}
