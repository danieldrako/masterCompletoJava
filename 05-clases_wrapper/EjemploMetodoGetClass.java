import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {
        String texto = "hola";
        
        Class strClass = texto.getClass(); // instancia del tipo class

        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());
        System.out.println("strClass.getPackageName() = " + strClass.getPackageName());
        System.out.println("strClass = " + strClass);

        for(Method metodo: strClass.getMethods() ){
            System.out.println("metodo = " + metodo.getName());
        }
        
        Integer num = 34;
        Class intClass = num.getClass();
        Class objClass = intClass.getSuperclass().getSuperclass();
        System.out.println("intClass.getPackage() = " + intClass.getPackage());
        System.out.println("intClass.getSuperclass().getSuperclass() = " + intClass.getSuperclass().getSuperclass());
        System.out.println("intClass.getSuperclass() = " + intClass.getSuperclass());

        for(Method metodo: objClass.getMethods() ){
            System.out.println("metodo = " + metodo.getName());
        }
    }
}
