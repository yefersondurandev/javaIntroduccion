package ClasesDateCalendario;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExampleJavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();

        calendario.set(2024, 9, 24, 19, 20, 50);
        calendario.set(Calendar.YEAR, 2024);
        calendario.set(Calendar.MONTH, Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH, 25);
        calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.MINUTE, 29);
        calendario.set(Calendar.SECOND, 10);
        Date fecha = calendario.getTime();
        System.out.println("fecha = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("YYYY-MM-dd  HH:mm:ss");
        String fechaStr = formato.format(fecha);
        System.out.println("fechaStr = " + fechaStr);

    }
}
