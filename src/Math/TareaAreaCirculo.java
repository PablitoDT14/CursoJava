package Math;

import java.util.Scanner;

public class TareaAreaCirculo {
    public static void main(String[] args) {
        double radio, area;
        System.out.println("Ingrese el diámetro del círculo");
        Scanner sc = new Scanner(System.in);
        radio = (sc.nextDouble())/2;
        area= Math.PI * (Math.pow(radio,2));
        System.out.println("area = " + area);
    }
}
