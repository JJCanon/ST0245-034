import java.io.FileNotFoundException;

import static java.lang.System.currentTimeMillis;
import static java.lang.System.out;

/**
 * @author Cañón
 * @version 3.0
 * @since 11/05/2020
 * @see Main
 */

public class Main {
    /**
     * metodo main que inicia el codigo
     * @param args
     * @throws FileNotFoundException
     * @throws InterruptedException
     */
    public static void main(String[] args) throws FileNotFoundException, InterruptedException
    {
        out.println("Bienvenido al programa de prediccion");
        out.println("vamos a empezar con el arbol de decicion");
        out.println();
        Thread.sleep(5000);



        /*MemoryMXBean mbean1 = ManagementFactory.getMemoryMXBean();
        MemoryUsage before1 = mbean1.getHeapMemoryUsage();*/
        //long e1= currentTimeMillis();
        String nombre = "prueba.csv";
        Interactuar interactuar1 = new Interactuar(nombre);
        //long f1 = currentTimeMillis();
        //long h1 = ((f1-e1)/60000);
        //out.println("el tiempo que dura el procedimiento es : "+ h1 + " minutos");


        /*MemoryUsage after1 = mbean1.getHeapMemoryUsage();
        long consumed1 = ((after1.getUsed()- before1.getUsed())/1000000);
        out.println("memoria consumida: "+consumed1+ " MB");*/

       /* MemoryMXBean mbean2 = ManagementFactory.getMemoryMXBean();
        MemoryUsage before2 = mbean2.getHeapMemoryUsage();*/

        //long e2= currentTimeMillis();
        String nombre2 ="test2.csv";
        Interactuar interactuar2 = new Interactuar(nombre2);
        //long f2 = currentTimeMillis();
        //long h2 = ((f2-e2)/60000);
        //out.println("el tiempo que dura el procedimiento es : "+ h2+ " minutos");




        /*MemoryUsage after2 = mbean2.getHeapMemoryUsage();
        long consumed2 = ((after2.getUsed()- before2.getUsed())/1000000);
        out.println("memoria consumida: "+consumed2+" MB");*/

        /*MemoryMXBean mbean3 = ManagementFactory.getMemoryMXBean();
        MemoryUsage before3 = mbean3.getHeapMemoryUsage();*/

        //long e= currentTimeMillis();
        String nombre3 ="test3.csv";
        Interactuar interactuar3 = new Interactuar(nombre3);
        //long f = currentTimeMillis();
        //long h = ((f-e)/60000);
        //out.println("el tiempo que dura el procedimiento es : "+ h + " minutos");




        /*MemoryUsage after3 = mbean3.getHeapMemoryUsage();
        long consumed3 = ((after3.getUsed()- before3.getUsed())/1000000);
        out.println("memoria consumida: "+consumed3+" MB");*/
    }
}
 /*

         long e= currentTimeMillis();
        long f = currentTimeMillis();
        long h = ((f-e)/1000);
        out.println("el tiempo que dura el procedimiento es : "+ h);




        lector.Interactuador F = new lector.Interactuador(nombreArchivo2);



        lector.Interactuador G = new lector.Interactuador(nombreArchivo3);
       */