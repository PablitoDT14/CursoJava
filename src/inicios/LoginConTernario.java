package inicios;

import java.util.Scanner;

public class LoginConTernario {

    public static void main(String[] args) {

        String[] usernames = {"pablo", "juan", "analia", "anabella", "enzo"};
        String[] passwords = {"050385", "130112", "170285", "281114", "280721"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su usuario");
        String user = sc.nextLine();
        System.out.println("Ingrese su contraseña");
        String pass = sc.nextLine();
        boolean autenticado = false;

        for (int i = 0; i < usernames.length; i++) {
            autenticado = ((usernames[i].equals(user)) && (passwords[i].equals(pass))) ? true : autenticado;
        }

        String mensaje = autenticado ? "Bienvenido ".concat(user) : "Usuario no registrado o clave incorrecta";
        System.out.println(mensaje);
    }
}
