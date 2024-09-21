package operators;

public class instanceofOperatorTypeGeneric {
    public static void main(String[] args) {

        Object texto = "Creando un objeto de la clase String... que tal!";
        String texto1 = "gola que tal ";
        Number num = 7;

        boolean b1 = texto instanceof Object;
        System.out.println("es texto es del tipo Objetc = " + b1);

        b1 = texto instanceof String;
        System.out.println("es texto del tipo String = " + b1);

        b1 = num instanceof Integer;
        System.out.println("es numero es del tipo Interger = " + b1);

        b1 = num instanceof Long;
        System.out.println("interger es del tipo long " + b1);

    }
}
