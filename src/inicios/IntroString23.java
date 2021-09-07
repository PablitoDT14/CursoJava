package inicios;

public class IntroString23 {

    public static void main(String[] args) {
        String a= "Perro";
        String b= "gato";
        String c = "paajrito";
        String d = "hornitorrinco";
        String e = "perro";
        String f="mi vieja mula ya no es lo que era";
        int posicion= 5;

       /*System.out.println("d = " + d);
        System.out.println(d+" tienw "+d.length()+" letras");
        System.out.println(a+ " es igual a "+e+" ? =>"+ a==e);
        System.out.println(a+ " es igual aa "+e+" ? =>"+ a.equals(e));
        System.out.println(a+ " es igual aa "+e+" ? =>"+ a.equalsIgnoreCase(e));
        System.out.println(b.compareTo(a));
        System.out.println("d = " + d.trim());
        System.out.println(d+" en la posición "+posicion+" tiene el caracter "+d.charAt(posicion));

        */

        a.toCharArray();
        a.substring(1,7);
        a.substring(2);
        a.indexOf("g");
        a.lastIndexOf("g");
        a.startsWith("g");
        a.endsWith("h");
        f.split(" ");
            }
}
