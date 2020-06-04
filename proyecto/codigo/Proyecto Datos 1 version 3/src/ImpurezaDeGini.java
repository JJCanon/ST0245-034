/**
 * @see ImpurezaDeGini
 * @version 1.0
 */
public class ImpurezaDeGini {
    float impureza;
    public String[][] padre, hijoIz, hijoDe;
    int posicion;
    String respuesta;
    int tamañoRaiz;
    int tamañoHijoIz, tamañoHijoDe;

    /**
     * constructor de la clase
     * @param padre recibe la matriz para así realizar los calculos
     * @param posicion posicion que ayuda a buscar los diferentes datos que hay en la columna de la matriz
     * @param respuesta ayuda a comparar y calcular los datos en base a la respuesta recibida
     */
    public ImpurezaDeGini(String[][] padre, int posicion, String respuesta) {
        this.padre = padre;
        this.posicion = posicion;
        this.respuesta = respuesta;
        declararHijos();
        //System.out.println("el tamaño de las matrizes son: " + hijoIz.length + " y " + hijoDe.length);
        float a = (impureza(hijoDe)*hijoDe.length);
        float b =(impureza(hijoIz)*hijoIz.length);
        impureza= ((a+b)/padre.length);
        //System.out.println("la impureza es: "+impureza);
    }

    public void declararHijos() {
        int siEntran = 0;
        int noEntran = 0;
        for (int fila = 0; fila < padre.length ; fila++) {
            if (padre[fila][posicion].equals(respuesta)) {
                siEntran++;
            } else {
                noEntran++;
            }
        }
        hijoDe = new String[siEntran][padre[0].length];
        hijoIz = new String[noEntran][padre[0].length];
        tamañoHijoDe=siEntran;
        tamañoHijoIz=noEntran;
        asignarValores();
        //System.out.println("total de datos: "+(tamañoHijoDe+tamañoHijoIz));
    }

    /*public float hallarImpureza()
    {
        float impureza;

        return impureza;
    }*/
    public void asignarValores()
    {
        int filaHijoDe=0;
        int filaHijoIz=0;
        for(int fila = 0; fila<padre.length;fila++)
        {
            if(padre[fila][posicion].equals(respuesta))
            {
                if(filaHijoDe<hijoDe.length) {
                    hijoDe[filaHijoDe] = padre[fila];
                    //System.out.println(filaHijoDe+" Datos guardados en la matriz 1");
                    filaHijoDe++;
                }
            }else{
                if(filaHijoIz<hijoIz.length) {
                    hijoIz[filaHijoIz] = padre[fila];
                    //System.out.println(filaHijoIz+" Datos guardados en la matriz 2");
                    filaHijoIz++;
                }
            }
        }
        //System.out.println("el numero de datos guardados es: "+padre.length);
    }
    public float impureza(String[][] matriz)
    {
        float respuesta;
        int tienenExito=0;
        int noTieneExito=0;
        for(int fila=0;fila<matriz.length;fila++)
        {
            if(matriz[fila][matriz[0].length-1].equals("1"))
            {
                tienenExito++;
            }else
            {
                noTieneExito++;
            }
        }
        if(matriz.length>0)
        {
            float exito=(tienenExito/matriz.length);
            //System.out.println("tiene exito = "+exito);
            float noExito=(noTieneExito/matriz.length);
            //System.out.println("no tiene exito = "+noExito);
            respuesta=(1-(exito*exito)-(noExito*noExito));
            //System.out.println(respuesta);
        } else
            respuesta=0;

        return respuesta;
    }

}
