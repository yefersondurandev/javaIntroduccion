package variables;

public class primitivesBoolean {
    public static void main(String[] args) {
        boolean logicalData = false;
        System.out.println("logicalData = " + logicalData);

        double d = 2323.3233e-3;//2.3233233
        System.out.println("d = " + d);
        float f = 1.2323e2F;//123.23
        System.out.println("f = " + f);
        logicalData = d < f;
        System.out.println("logicalData = " + logicalData);

    }
}
