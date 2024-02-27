import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalculaEdad {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa tu fecha de nacimiento en formato yyyy-MM-dd");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date fechaNacimiento = format.parse(s.next());
            Date fechaActual = new Date();

            // Calcular la diferencia de tiempo en milisegundos
            long tiempoMilisegundos = fechaActual.getTime() - fechaNacimiento.getTime();

            // Convertir los milisegundos a años aproximados
            long edadEnMillis = tiempoMilisegundos;
            long años = edadEnMillis / (1000L * 60 * 60 * 24 * 365);

            System.out.println("Tu edad es aproximadamente: " + años + " años.");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}