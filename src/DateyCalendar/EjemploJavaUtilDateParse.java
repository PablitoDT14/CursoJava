package DateyCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una fecha");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date fecha = format.parse(sc.nextLine());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));
            Date fecha2 = new Date();
            if (fecha.after(fecha2)){
                System.out.println("Fecha del usuario es posterior a la fecha actual");
            }
            else if (fecha.before(fecha2)){
                System.out.println("La fecha ingresada es anterior a la fecha actual");
            }
            else if (fecha.equals(fecha2)){
                System.out.println("Estás igual");
            }
            if (fecha.compareTo(fecha2)>0){
                System.out.println("Fecha del usuario es posterior a la fecha actual");
            }
            else if (fecha.compareTo(fecha2)<0){
                System.out.println("La fecha ingresada es anterior a la fecha actual");
            }

        } catch (ParseException e) {
            //e.printStackTrace();
            System.err.println("La fecha tiene un formato incorrecto: "+e.getMessage());
            System.err.println("El formato debe ser \"yyyy-MM-dd\"");
            //System.exit(1);
            main(args);
        }
    }
}
