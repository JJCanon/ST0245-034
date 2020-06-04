import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayDeque;
import java.util.Queue;

import static java.lang.System.currentTimeMillis;
import static java.lang.System.out;

/**
 * @see Leer
 */
public class Leer {
    Queue<String[]> datos = new ArrayDeque<>();

    /**
     * constructor de la clase Leer el cual leera los datos para la prediccion
     * @param nombre
     * @throws FileNotFoundException
     */
    public Leer(String nombre) throws FileNotFoundException
    {
        leerDatos(nombre);
    }

    /**
     * metodo que leerá los datos y los guardara en una cola de arreglos de Strings
     * @param nombre recibe el nombre del archivo para ser leido
     * @throws FileNotFoundException es ejecutado si el archivo no existe
     */
    public void leerDatos(String nombre)throws FileNotFoundException
    {
        try
        {
            FileReader archivo = new FileReader(nombre);
            BufferedReader leer = new BufferedReader(archivo);
            String linea = leer.readLine();
            while(linea!=null) {
                String[] datosLinea = linea.split(";");
                datos.add(datosLinea);
                linea=leer.readLine();
            }
            System.out.println("los Datos han sido guardados con exito");
        }catch (Exception e)
        {
            System.out.println("hubo un erro durante la lectura de datos");
        }
    }
}
