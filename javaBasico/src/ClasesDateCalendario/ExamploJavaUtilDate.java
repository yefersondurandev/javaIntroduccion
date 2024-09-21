package ClasesDateCalendario;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExamploJavaUtilDate {
    public static void main(String[] args) {
        Date fecha = new Date();

        System.out.println("fecha = " + fecha);


        SimpleDateFormat df = new SimpleDateFormat("dd-MMMM-YYYY");
        String fechaStr = df.format(fecha);

        long j = 0;
        for(int i = 0;i < 1000000;i++){
            j += i;
        }
        System.out.println("j = " + j);

        Date fechaFin = new Date();
        long tiempoFinal = fechaFin.getTime() - fecha.getTime();

        System.out.println("tiempoFinal = " + tiempoFinal);
        System.out.println("fechaStr = " + fechaStr);
    }
}
