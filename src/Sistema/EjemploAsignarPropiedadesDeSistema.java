package Sistema;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {
        try {
            FileInputStream archivo = new FileInputStream("src/Sistema/config.properties");
            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada","Mi valor por set");
            System.setProperties(p);
            Properties ps = System.getProperties();
            ps.list(System.out);
            System.out.println("ps.getProperty(\"mi.propiedad.personalizada\") = " + ps.getProperty("mi.propiedad.personalizada"));
        } catch (Exception e) {
            System.err.println("No existe el archivo ");
            System.exit(1);
            e.printStackTrace();
        }
    }
}
