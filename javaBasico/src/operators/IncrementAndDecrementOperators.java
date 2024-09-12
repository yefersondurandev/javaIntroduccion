package operators;

public class IncrementAndDecrementOperators {
    public static void main(String[] args) {
        // pre incremeto
        int i = 1;
        int j = ++i; // i = i + 1 = 2
        System.out.println(j);

        // post incremento
        i = 2;
        j = i++;
        System.out.println("j = " + j);
        System.out.println("i = " + i);

        //pre decremento
        i = 3;
        j = --i;// i = i - 1 = 2
        System.out.println("j = " + j);

        //post decremento
        i = 4;
        System.out.println("i decremento sin  -- = " + i);
        j = i--;// i = i - 1 = 3
        System.out.println("i con dremento pos  = " + i);
        System.out.println("j con decremento pos = " + j);

        System.out.println("j = " + (++j));
        System.out.println("j = " + (j++));
        System.out.println(j);
    }
}
