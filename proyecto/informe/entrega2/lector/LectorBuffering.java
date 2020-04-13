package lector;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
/**
 *version 1.0 lector
 * esta clase hará la lectura y recoleccion de datos con la biblioteca BufferedReader
 * y guardando los datos en un arrayList de Strings definido como atributo publico para así
 * interactuar con el desde otras clases
 */
public class LectorBuffering {

    ArrayList<String[]> Datos = new ArrayList<>();

    /**
     * @param archivo
     * @throws FileNotFoundException
     */
    public LectorBuffering(String archivo) throws FileNotFoundException
    {
        leerDatos(archivo);
    }

    /**
     * este metodo se encargará de leer los datos con la biblioteca BufferedReader leyendo un archivo FileReader
     *      * para asi leer los datos y guardarlos en el atributo @Datos
     *
     * @param archivos recibe el nombre del archivo para ser leido en el metodo
     *
     * @throws FileNotFoundException
     * lanza un error en caso de que el archivo no se encuentre u ocurra un error durante la lectura de los datos
     */
    public void leerDatos(String archivos) throws FileNotFoundException {
        FileReader archivo = new FileReader(archivos); //lee y busca el archivo con el nombre que es recibido como parametro
        BufferedReader leer = new BufferedReader(archivo); //lee el documento que se encuentra en el FileReader @archivo
        /*
         el try catch separa los datos leidos en Strings por lineas y despues por palabras para asi guardarlos
        en arreglos que seran guardados en arrayList de arreglos

        En caso de error lanza un error que informa al usuario que algo ocurrió mal
        */
        try {
            String linea = leer.readLine();
            while (linea!=null) {
                String[] datos = linea.split(";");
                Datos.add(datos);
                linea=leer.readLine();
            }
        }catch (Exception e) {
                System.out.println("hubo un error durante la recopilacion de datos");
            }
        }
}

