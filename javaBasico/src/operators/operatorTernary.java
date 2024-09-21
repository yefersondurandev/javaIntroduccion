package operators;

import java.util.Scanner;

public class operatorTernary {
    public static void main(String[] args) {

        String variable = 7==8 ? "si es verdadero":"si es falso";
        System.out.println(variable);

        String estado = "";
        double promedio = 0.0;

        double matematicas;
        double ciencias;
        double historia;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter nota matemticas");
        matematicas = sc.nextDouble();
        System.out.println("enter nota ciencia");
        ciencias = sc.nextDouble();
        System.out.println("enter nota historia");
        historia = sc.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;

        estado = promedio >= 5.49 ? "aprobado":"rechazado";
        int promedioEntero = (int)promedio;
        System.out.println("estado = " + estado);
        System.out.println("promedio = " + promedio);
        System.out.println("promedioEntero = " + promedioEntero);


    }
}
