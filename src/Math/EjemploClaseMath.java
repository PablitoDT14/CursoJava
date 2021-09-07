package Math;

public class EjemploClaseMath {
    public static void main(String[] args) {
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);
        
        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);
        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);
        
        double roof = Math.ceil(3.5);
        System.out.println("roof = " + roof);

        double floor = Math.floor(3.5);
        System.out.println("floor = " + floor);
        
        long redondear = Math.round(3.5000000001);
        System.out.println("redondear = " + redondear);

        System.out.println(Math.PI);
        
        double exp = Math.exp(2);
        System.out.println("exp = " + exp);

        double log = Math.log(10);
        System.out.println("log = " + log);

        double potencia = Math.pow(10, 3);
        System.out.println("potencia = " + potencia);

        double raiz = Math.sqrt(10);
        System.out.println("raiz = " + raiz);



    }
}
