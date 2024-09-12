package variables;

public class primitivesWhole {
    public static void main(String[] args) {

        byte numerobyte = 127;
        System.out.println("numerobyte = " + numerobyte);
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("byte corresponde en maximo a " + Byte.MAX_VALUE);
        System.out.println("byte corresponde en minimo a " + Byte.MIN_VALUE);

        System.out.println();

        short numeroShort = 30000;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo Short corresponde en byte a " + Short.BYTES);
        System.out.println("tipo Short corresponde en bites a " + Short.SIZE);
        System.out.println("Short corresponde en maximo a " + Short.MAX_VALUE);
        System.out.println("Short corresponde en minimo a " + Short.MIN_VALUE);

        System.out.println();

        int numeroInt = 200030303;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("int corresponde en maximo a " + Integer.MAX_VALUE);
        System.out.println("int corresponde en minimo a " + Integer.MIN_VALUE);

        System.out.println();

        long numeroLong = 1201021020210L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo Long corresponde en byte a " + Long.BYTES);
        System.out.println("tipo Long corresponde en bites a " + Long.SIZE);
        System.out.println("Long corresponde en maximo a " + Long.MAX_VALUE);
        System.out.println("Long corresponde en minimo a " + Long.MIN_VALUE);

    }
}
