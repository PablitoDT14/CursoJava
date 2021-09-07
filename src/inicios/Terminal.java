package inicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        String numStr = sc.nextLine();
        int numero = 0;
        try{
            //numero= Integer.parseInt(numStr);
            numero = sc.nextInt();
        }
        //catch(NumberFormatException e){
        catch(InputMismatchException e){
            System.out.println("Error, debes ingresar un número");
            main(args);
            System.exit(0);
        }

        System.out.println("numero = " + numero);
    }
}
