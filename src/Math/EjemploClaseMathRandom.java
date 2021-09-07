package Math;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {
        double aleatorio = Math.random();
        System.out.println("aleatorio del 0 al 100 = " + Math.round(aleatorio*100));

        String[] colores = {"azul", "rojo", "verde","amarillo"};
        double random = aleatorio* colores.length;
        System.out.println("colores[(int)aleatorio*4] = " + colores[(int)random]);
        
    }
}
