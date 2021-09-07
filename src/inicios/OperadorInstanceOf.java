package inicios;

public class OperadorInstanceOf {

    public static void main(String[] args) {
        String texto= "Creando un objeto de la clase String";
        Integer num = 200;
        
        boolean b1= texto instanceof Object;

        System.out.println("b1 = " + b1);
    }
}
