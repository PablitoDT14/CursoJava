package DateyCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TareaDate {
    public static void main(String[] args) {
        System.out.println("Ingrese la fecha de nacimiento");
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        try {
            Date fechaNac = df.parse(sc.nextLine());
            System.out.println("fechaNac = " + fechaNac);
            Date today =new Date();
            System.out.println("today = " + today);
            int desde = Integer.parseInt(df.format(fechaNac));
            int hasta = Integer.parseInt(df.format(today));
            System.out.println("Edad= "+((hasta-desde)/10000)+"años");
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
