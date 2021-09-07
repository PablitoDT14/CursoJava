package inicios;

import java.util.Scanner;

public class OperadorternarioNroMayor {
    public static void main(String[] args) {

        int max=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1= sc.nextInt();
        System.out.println("Ingrese un numero");
        int num2= sc.nextInt();
        System.out.println("Ingrese un numero");
        int num3= sc.nextInt();

        max = (num1>num2)?num1:num2;
        max = (max>num3)?max:num3;

        System.out.println("max = " + max);
    }
}
