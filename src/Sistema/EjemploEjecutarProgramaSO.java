package Sistema;

import java.io.IOException;
import java.util.Locale;

public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process proceso;
        try {
            if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
                proceso = rt.exec("notepad");
            } else {
                proceso = rt.exec("gedit");
            }
            proceso.waitFor();
        }
            catch (Exception e) {
                System.err.println("El comando es desconocido "+ e.getMessage());
                System.exit(1);
            }
        System.out.println("Se ha cerrado el editor");
        System.out.println();
        }
    }
