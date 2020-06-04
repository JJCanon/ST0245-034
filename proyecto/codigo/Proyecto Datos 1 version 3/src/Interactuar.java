import kotlin.Pair;

import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.TreeSet;

import static java.lang.System.currentTimeMillis;
import static java.lang.System.out;

/**
 * @see Interactuar
 */
public class Interactuar {
    Queue<Persona> personas = new ArrayDeque<>();
    Queue<String[]> cola=new ArrayDeque<>();
    String[][] Datos;
    Boolean[][] posibilidad;
    Queue<Integer>posiciones=new ArrayDeque<>();
    Queue<String>respuestas= new ArrayDeque<>();

    /**
     * predice si las personas tendran exito o no segun los datos que lea
     * @param nombre recibe el nombre del archivo
     * @throws FileNotFoundException el error se lanza en caso de que el archivo no exista
     *
     */
    public Interactuar(String nombre) throws FileNotFoundException
    {
        interactor(nombre);
    }
    public void interactor(String nombre) throws FileNotFoundException
    {
        System.out.println("iniciando lectura de datos");
        Leer leer=new Leer(nombre);
        cola = leer.datos;
        int fila = cola.size()-1;
        int columna = 78;
        Datos=new String[fila][columna];
        posibilidad=new Boolean[fila][columna];
        agregarDatos();
        asignar();
       // TreeSet<String>desiciones=new TreeSet<>();
        TreeSet<Integer>posicionesRecorridas = new TreeSet<>();
        Boolean[] revisadas = new Boolean[78];
        revisadas[0]=true;
        for(int i = 1;i<revisadas.length;i++)
        {
            revisadas[i]=false;
        }
        Tree tree = new Tree(Datos,revisadas,posicionesRecorridas,0);
        long e= currentTimeMillis();
        recorrerArbol(tree);
        //recorrerColas();
        //System.out.println("respuestas: "+ desiciones.size());
        //listaDePersonas();
        System.out.println("el numero de personas que tendran exito son: "+personasConExito());

       /* for (String res: desiciones) {
            System.out.print(res+"    ");
        }*/
    }
    public void agregarDatos()
    {
        int filaArr=0;
        int cont=0;
        for(String[] data: cola) {
            if (cont != 0) {
                if (filaArr != Datos.length)
                    Datos[filaArr] = data;
                filaArr++;
            }
            cont++;
        }
    }
    public void to_String()
    {
        for(int fila = 0; fila<Datos.length;fila++)
        {
            for(int columna = 0; columna<78;columna++)
            {
                System.out.print(Datos[fila][columna]+" ");
            }
            System.out.println();
        }
    }
    public void To_String2()
    {
        for(String[] datos: cola)
        {
            for (int i =0; i<datos.length;i++)
            {
                System.out.print(datos[i]+" ");
            }
            System.out.println();
        }
    }
    public void recorrerArbol(Tree tree)
    {
        if(tree == null||tree.respuestaArbol==null)
        {
            return;
        }
        //System.out.println("respuestas: "+ desiciones.size());
        //System.out.println("respuesta es:" + tree.respuestaArbol+ " en la posicion "+ tree.posicion);
        respuestas.add(tree.respuestaArbol);
        posiciones.add(tree.posicion);
        Exito(tree.respuestaArbol,tree.posicion);
        recorrerArbol(tree.derecha);
        recorrerArbol(tree.izquierda);
    }
    public void listaDePersonas()
    {
        for(int i = 0; i<Datos.length;i++)
        {
            Persona persona = new Persona(Datos[i]);
            personas.add(persona);
        }
        //System.out.println( personas.size()+" personas");
    }
    public void Exito(String respuesta, int posicion)
    {
        //System.out.println();

            for(int fila = 1; fila<Datos.length;fila++)
            {
               // System.out.println("la respuesta es: "+ Datos[fila][posicion]+ " vs "+ respuesta);
                if(Datos[fila][posicion].equals(respuesta))
                {
                    posibilidad[fila][posicion]=true;
                }
            }
    }

    public int personasConExito()
    {
        int personasConExtio = 0;
        for(int fila  = 0; fila< posibilidad.length;fila++)
        {
            int tieneExito=0;
            for(int columna=0;columna<78;columna++)
            {
                if(posibilidad[fila][columna]==true)
                {
                    tieneExito++;
                }
            }
            if(tieneExito>13)
            {
                personasConExtio++;
            }
        }
        return personasConExtio;
    }
    public void recorrerColas()
    {
        for(String a: respuestas)
        {
            System.out.print(a+" ");
        }
        System.out.println();
        for(int b: posiciones)
        {
           System.out.print(b+" ");
        }
        System.out.println();
    }
    public void asignar()
    {
        for(int fila = 0; fila<posibilidad.length;fila++)
        {
            for(int columna = 0;columna<78;columna++)
            {
                if(fila==0)
                {
                    posibilidad[fila][columna]=true;
                }else
                {
                    posibilidad[fila][columna]=false;
                }
            }
        }
    }
}
