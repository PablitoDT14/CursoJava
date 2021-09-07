package Sistema;

import java.util.Map;

public class EjemploVariablesEntorno {
    public static void main(String[] args) {
        Map<String, String> varEnv = System.getenv();
        System.out.println("varEnv = " + varEnv);
        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);
        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);
        String javaHome2 = varEnv.get("JAVA_HOME");
        System.out.println("javaHome2 = " + javaHome2);


        System.out.println("Listando variables de entorno");
        for (String key: varEnv.keySet()) {
            System.out.println(key +" => " + varEnv.get(key));
        }
    }
}
