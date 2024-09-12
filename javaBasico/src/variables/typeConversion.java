package variables;

public class typeConversion {
    public static void main(String[] args) {
        String numberStr = "55";
        int numbeInt = Integer.parseInt(numberStr);
        //System.out.println("numbeInt = " + numbeInt);

        String realStr = "55";
        double realNumber = Double.parseDouble(realStr);
        //System.out.println("realNumber = " + realNumber);

        String booleanStr = "True";
        boolean boolean1 = Boolean.parseBoolean(booleanStr);
        //System.out.println("boolean1 = " + boolean1);


        int anotherInteger = 120;
        //System.out.println("anotherInteger = " + (anotherInteger+10));

        String integerStr = Integer.toString(anotherInteger);
        //System.out.println("IntegerStr = " + integerStr);

        integerStr = String.valueOf(anotherInteger+10);
        //System.out.println("integerStr = " + integerStr);

        int i = 10000;
        short s = (short)i;
        System.out.println("s = " + s);
        long l = i;

    }
}
