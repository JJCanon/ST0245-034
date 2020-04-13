package lector;

import lector.LectorBuffering;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 *el interactuador invocaará la clase que será la que leerá los datos enviandole el nombre del archivo a dicha clase
 *
 * tambien informará al usuario el procedimiento
 */
public class Interactuador {
    /**
     * el atributo Data2 será quien guarde los dartos leidos de la @Class LectorBufferig
     * para luego ser usados en el proyecto en la prediccion
     */
    ArrayList<String[]> Data2;

    /**
     * constructor de la clase el cual invocará el metodo Interactor para leer los datos
     * @param nombre recibe el nombre del archivo para ser Leido por la @Class lectorBuffering del metodo interactor
     * @throws FileNotFoundException
     */
    public Interactuador(String nombre) throws FileNotFoundException
    {
    Interactor(nombre);
    }

    /**
     * interactor será el metodo el cual invoque la @Class LectorBuffering para así leer los datos y guardarlos en el atributo Data2 de la clase Interactuador
     *
     * @param nombre recibe el nombre del archivo para ser Leido por la @Class lectorBuffering
     *
     * @throws FileNotFoundException
     */
    public void Interactor(String nombre) throws FileNotFoundException {
        System.out.println("iniciando lectura de datos");
        LectorBuffering bf2 = new LectorBuffering(nombre);
        Data2 = bf2.Datos;
        System.out.println("los datos han sido guardados con exito");
    }
}
