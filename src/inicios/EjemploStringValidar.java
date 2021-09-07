package inicios;

import java.util.Locale;

public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;
        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);
        if(esNulo) {
            curso="Programación Java";
        }
        boolean esvacio = curso.length()==0;
        boolean esvacio2 = curso.isEmpty();
        boolean esBlanco = curso.isBlank();

        if (!esvacio) {
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }
    }
}
