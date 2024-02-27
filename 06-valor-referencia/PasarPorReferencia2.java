class Persona{
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    public String leerNombre(){
        return this.nombre;
    }
}
public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Daniel");

        System.out.println("iniciamos el metodo main");

        System.out.println("persona.nombre = " + persona.leerNombre());

        System.out.println("Antes de llmar el metodo test");

        test(persona);

        System.out.println("Después de llamar el metodo test" );

        System.out.println("persona.nombre = " + persona.leerNombre());

        System.out.println("finalizamos el metodo main con los datos de la persona modificados  ");
    }

    public static void test(Persona persona){
        System.out.println(" iniciamos el metodo test " );
        persona.modificarNombre("Pepe");
        System.out.println("Finaliza con el metodo test ");
    }
}
