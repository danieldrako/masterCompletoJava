import java.util.Map;

public class EjemploVariablesEntorno {
    public static void main(String[] args) {

        Map<String, String> varEnv = System.getenv();
        System.out.println("varEnv del sistema = " + varEnv);

        System.out.println("Listando variables de entrono del sistema");
        for(String key: varEnv.keySet()){
            System.out.println(key + "=>" + varEnv.get(key));
        }
        
        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);
        
        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String temDir = System.getenv("TEMP");
        System.out.println("temDir = " + temDir);
        
        String path2 = varEnv.get("Path");
        System.out.println("path2 = " + path2);


    }
}
