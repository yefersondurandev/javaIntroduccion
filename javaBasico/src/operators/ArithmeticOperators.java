package operators;

import javax.swing.*;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int i = 6, j = 4;
        int suma = i + j;
        System.out.println("suma = " + suma);

        int resta = i - j;
        System.out.println("resta = " + resta);

        int multiplicacion = i * j;
        System.out.println("multiplicacion = " + multiplicacion);

        int division = i / j;
        double divi2 = (double) i / j;
        System.out.println("division = " + division);
        System.out.println("divi2 = " + divi2);

        int resto = i % j;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        if(numero % 2 == 0){
            System.out.println("el numero es par");
        }else{
            System.out.println("es impar");
        }

    }
}
