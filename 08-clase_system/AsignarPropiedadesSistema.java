import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class AsignarPropiedadesSistema {
    public static void main(String[] args) {
        try{
            FileInputStream archivo = new FileInputStream("src/config.properties");

            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties");


            System.setProperties(p);
            Properties ps = System.getProperties();
            System.out.println(System.getProperty("config.texto.ambiente"));

            ps.list(System.out);
        }catch (Exception e){
            System.out.println("no existe el archivo " + e);
        }


    }
}
