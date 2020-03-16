import java.io.FileNotFoundException;
import java.io.Reader;
import java.util.ArrayList;

public class Estudiantes {
    private ArrayList<Estudiante> estudiantes;

    public Estudiantes()
    {
        try {
            registro();
        }catch(Exception e){}
    }

    public void registro() throws FileNotFoundException
    {
        try
        {
            Reader reader=new Reader();
            estudiantes = reader.Lector();
            this.estudiantes = estudiantes;
        }catch(Exception e)
        {
            System.out.println("\n Error no se detecto ningun archivo\n");
        }
    }

    public void Consultacurso(String materia, String semestre)
    {
        for(Estudiante estudiante : estudiantes)
        {
            if(estudiante.getMateria().equalsIgnoreCase(materia)&&estudiante.getSemestre().equalsIgnoreCase(semestre))
            {
                System.out.println(estudiante.toString());
            }
        }
    }

    public void Consultaestudiante(String nombre, String semestre)
    {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNombre().equalsIgnoreCase(nombre) && estudiante.getSemestre().equalsIgnoreCase(semestre)) {
                System.out.println(estudiante.toString());
            }
        }
    }
}
