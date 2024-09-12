package variables;

public class primitivoDecimals {
    public static void main(String[] args) {

        //La E de exponencia correo hacia la derecha si es positivo el punto o coma y lo mismo para el negativo
        float numeroFloat = 2.5e-10F;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("float a byte corresponde a " + Float.BYTES);
        System.out.println("float a bites corresponde a " + Float.SIZE);
        System.out.println("float a maximo corresponde a " + Float.MAX_VALUE);
        System.out.println("float a minimo corresponde a " + Float.MIN_VALUE);


        double numberDouble = 2.4343;
        System.out.println("numberDouble = " + numberDouble);
        System.out.println("double a byte corresponde " + Double.BYTES);
        System.out.println("double a bite corresponde " + Double.SIZE);
        System.out.println("double a maximo corresponde " + Double.MAX_VALUE);
        System.out.println("double a maximo corresponde " + Double.MIN_VALUE);



    }
}
