import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Reader {
    public Reader(){}

        ArrayList<Estudiante> registro;

        public ArrayList<Estudiante> Lector()throws FileNotFoundException
        {

            registro = new ArrayList<Estudiante>();

            try {

                Scanner input = new Scanner(new File("Libro1.csv"));

                String Nombre = input.nextLine();

                String[] tamorigi = Nombre.split(",");

                while (input.hasNextLine()) {
                    String line = input.nextLine();

                    String[] coleccion = line.split(",");
                    this.registro.add(new Estudiante(coleccion[0], coleccion[1], coleccion[2], coleccion[3], coleccion[4], coleccion[5], coleccion[6], coleccion[7], coleccion[8],coleccion[9],coleccion[10]));
                }
            } catch(Exception e)
            {
                System.out.println("\n Error no se detecto ningun archivo\n");
            }
            return registro;
        }
    }