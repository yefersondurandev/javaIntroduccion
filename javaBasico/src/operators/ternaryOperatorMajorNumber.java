package operators;

import java.util.Scanner;

public class ternaryOperatorMajorNumber {
    public static void main(String[] args) {
        int max = 0;
        int min = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num1 = sc.nextInt();

        System.out.println("ingrese un numero 2");
        int num2 = sc.nextInt();

        System.out.println("ingrese un numero 3");
        int num3 = sc.nextInt();

        max = (num1 > num2)? num1:num2;
        max = (max > num3)?max:num3;
        System.out.println("max = " + max);

    }
}
