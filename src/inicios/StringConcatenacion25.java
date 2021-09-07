package inicios;

public class StringConcatenacion25 {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Pablo E Aguirre";
        
        int numeroA= 10;
        int numeroB=5;

        String todoJunto= numeroA+numeroB+curso+" con "+profesor;
        System.out.println("todoJunto = " + todoJunto);

        String curso2 = curso.concat(" ").concat(profesor);
        System.out.println("curso2 = " + curso2);

        //usando lambda o arrow function
        String resultado2 = curso.transform(c -> {
            return c + profesor;
        });


        //reemplazando caracteres
        System.out.println("antes resultado2 = " + resultado2);
        String resultado3 = resultado2.replace("a","e");
        System.out.println("después resultado2 = " + resultado3 );

    }
}
