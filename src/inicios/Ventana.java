package inicios;

import javax.swing.*;

public class Ventana {

    public static void main(String[] args) {
        int numero = 0;
        try{
            numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número"));
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error, debes ingresar un número");
            main(args);
            System.exit(0);
        }

        System.out.println("numero = " + numero);

        JOptionPane.showMessageDialog(null, "Hola");
    }
}
