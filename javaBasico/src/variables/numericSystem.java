package variables;

import javax.swing.JOptionPane;

public class numericSystem {
    public static void main(String[] args) {
        // Ingresar un número entero
        String numberStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");
        int decimalNumber = Integer.parseInt(numberStr);

        // Mostrar el número en decimal
        System.out.println("Número decimal = " + decimalNumber);

        // Convertir y mostrar el número en binario
        System.out.println("Número binario de " + decimalNumber + " = " + Integer.toBinaryString(decimalNumber));

        // Convertir y mostrar el número en octal
        System.out.println("Número octal de " + decimalNumber + " = " + Integer.toOctalString(decimalNumber));

        // Convertir y mostrar el número en hexadecimal
        System.out.println("Número hexadecimal de " + decimalNumber + " = " + Integer.toHexString(decimalNumber));

        // Ejemplo de conversión de binario a decimal
        int binaryNumber = 0b111110100; // 500 en decimal
        System.out.println("Número binario 0b111110100 = " + binaryNumber + " en decimal");

        // Ejemplo de conversión de octal a decimal y a binario
        int octalNumber = 052; // 42 en decimal
        System.out.println("Número octal 0o52 = " + octalNumber + " en decimal");
        System.out.println("Número octal 0o52 = " + Integer.toBinaryString(octalNumber) + " en binario");

        // Ejemplo de conversión de binario a octal
        int binaryToOctal = 0b101010; // 42 en decimal
        System.out.println("Número binario 0b101010 = " + Integer.toOctalString(binaryToOctal) + " en octal");

        String mensaje = "Número binario de " + decimalNumber + " = " + Integer.toBinaryString(decimalNumber);
        mensaje += "\nNúmero octal de " + decimalNumber + " = " + Integer.toOctalString(decimalNumber);
        mensaje += "\nNúmero hexadecimal de " + decimalNumber + " = " + Integer.toHexString(decimalNumber);
        JOptionPane.showMessageDialog(null,mensaje);




        /*
         int numero = 42;
        System.out.println("Decimal: " + numero);
        System.out.println("Binario: " + Integer.toBinaryString(numero));
        System.out.println("Octal: " + Integer.toOctalString(numero));
        System.out.println("Hexadecimal: " + Integer.toHexString(numero));
         */

    }
}

