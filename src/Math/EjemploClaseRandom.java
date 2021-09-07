package Math;

import java.util.Random;

public class EjemploClaseRandom {
    public static void main(String[] args) {
        Random randomOBJ = new Random();
        int randomInt = 15+ randomOBJ.nextInt(25-15);
        System.out.println("randomInt = " + randomInt);
    }
}
