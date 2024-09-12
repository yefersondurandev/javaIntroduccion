package operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int i = 3;
        byte j = 3;
        float k = 127e-7F;
        double l = 2.124343e3;
        boolean m = false;


        boolean b1= i == j || k > l ;
        System.out.println("b1 = " + b1);

        boolean b2 = i == j || k < l && m == true;
        System.out.println("b2 = " + b2);
    }
}
