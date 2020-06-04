import java.util.Queue;
import java.util.TreeSet;

/**
 * @see Tree
 * @version 5.0
 */
public class Tree {

    public String[][] padre, hijoIz, hijoDe;
    int posicion;
    String respuestaArbol;
    Boolean[] revisadas;
    Tree izquierda, derecha;
    TreeSet<Integer> posiciones;
    int contador;

    /**
     * constructor de la clase
     * @param padre recibe la matriz que contiene los datos con los cuales va a interactuar
     * @param revisadas recibe un arreglo que ayudará con la interaccion y creacion del arbol
     * @param posiciones definira si ya se han recorrido todas las posiciones sin repetirse
     * @param contador inicirara en 0 el cual ira aumentando segun el numero de hojas y ramas que cree
     */
    public Tree(String[][] padre, Boolean[] revisadas, TreeSet<Integer> posiciones,int contador)
    {
        this.padre = padre;
        this.revisadas = revisadas;
        this.posiciones = posiciones;
        this.contador=contador;
        //System.out.println("arbol: "+ contador);
        this.contador++;
        int a=1;
        for(int i = 0; i<revisadas.length;i++)
        {
            if(revisadas[i]==true)
            {
                a++;
            }
        }
       if(posiciones.size()!=78&&a!=78) {
           dividir();
           derecha();
           izquierda();

            //System.out.println(a+" y "+posiciones.size());



        }
        else {
            //System.out.println("proceso terminado");
            return;
        }
    }
    public void dividir()
    {
        float impureza = 2;
      for(int columna=0;columna<77;columna++)
      {
         // System.out.println(columna+" revisada");
        if(revisadas[columna]==true)
        {
           // System.out.println("la columna: "+ columna + " ya ha sido revisada");
            continue;
        }else{
            TreeSet<String>respuestas=respuestas(columna);
            for (String respuesta:respuestas)
            {
                ImpurezaDeGini impurezaDeGini = new ImpurezaDeGini(padre,columna,respuesta);
                if(impurezaDeGini.impureza<impureza)
                {
                    impureza=impurezaDeGini.impureza;
                    posicion=columna;
                    respuestaArbol=respuesta;
                    hijoDe=impurezaDeGini.hijoDe;
                    hijoIz=impurezaDeGini.hijoIz;
                }
            }

        }
      }
      posiciones.add(posicion);
      revisadas[posicion]=true;
    }
    public TreeSet<String> respuestas(int columna)
    {
        TreeSet<String>Respuesta = new TreeSet<>();
        for(int fila = 0; fila<padre.length;fila++)
        {
            Respuesta.add(padre[fila][columna]);
        }
        return Respuesta;
    }
    public void derecha()
    {

        derecha=new Tree(padre,revisadas,posiciones,contador);
        //revisadas=derecha.revisadas;
        //posiciones=izquierda.posiciones;
    }
    public void izquierda()
    {

        izquierda = new Tree(padre, revisadas,posiciones,contador);
        //revisadas=izquierda.revisadas;
        //posiciones=izquierda.posiciones;
    }
}
