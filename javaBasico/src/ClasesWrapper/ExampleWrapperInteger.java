package ClasesWrapper;

public class ExampleWrapperInteger {
    public static void main(String[] args) {
        int intPriminitvo = 123;
        Integer intObjeto1 = Integer.valueOf(intPriminitvo);
        Integer intObjeto2 = 23232;
        System.out.println("intObjeto2 = " + intObjeto2);

        int num = intObjeto1;
        System.out.println("num = " + num);
        int num2 = intObjeto1.intValue();
        System.out.println("num2 = " + num2);

        String valorTvLcd = "23232";
        Integer valorTv = Integer.valueOf(valorTvLcd);
        System.out.println("valorTv = " + valorTv);

        Byte byteObjeto = intObjeto1.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);

    }
}
