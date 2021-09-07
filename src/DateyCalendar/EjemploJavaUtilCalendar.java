package DateyCalendar;

import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        calendario.set(2020, 0 ,25, 18,20,10);
        calendario.set(Calendar.YEAR,2021);
        Date fecha = calendario.getTime();
        System.out.println("calendario = " + fecha);
    }
}
