import java.util.ArrayList;
public class Main {

        public static void main(String[] args) {
            try
            {
                Estudiantes ed1 = new Estudiantes();
                //llamado del metodo Consultaestudiante para buscar un estudiante en un semestre en especifico.
                System.out.println("Consultar por estudiante");
                ed1.Consultaestudiante("Abel","20142");
                //llamado del metodo Consultacurso para buscar un curso y un semestre en especifico.
                System.out.println("Consultar por curso");
                ed1.Consultacurso("FUNDAMENTOS DE PROGRAMACIÓN","20151");
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }