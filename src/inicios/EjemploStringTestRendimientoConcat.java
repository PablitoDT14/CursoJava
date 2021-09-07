package inicios;

public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a ="a";
        String b = "b";
        String c = a;

        long inicio = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(a);

        for (int i=0; i<1500; i++){
            c= c.concat(a).concat(b).concat("\n");
            //4 milisegndos
            //c+= a+b+"\n";
            //42 milisegs
            //sb.append(a).append(b).append("\n");
            //1 miliseg
        }

        System.gc();

        long fin = System.currentTimeMillis();
        System.out.println(fin-inicio + "< --- tiempo" );
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());

        System.exit(0);
    }
}
