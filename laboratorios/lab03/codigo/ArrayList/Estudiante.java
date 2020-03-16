public class Estudiante {
    private String nombre;
    private String codigo;
    private String Codmateria;
    private String semestre;
    private String grupo;
    private String descripevl;
    private String porcentaje;
    private String descrip;
    private String materia;
    private String nota;
    private String notadef;

    public Estudiante(String nombre, String codigo, String codmateria, String semestre, String grupo, String descripevl, String porcentaje, String descrip, String materia, String nota, String notadef) {
        this.nombre = nombre;
        this.codigo = codigo;
        Codmateria = codmateria;
        this.semestre = semestre;
        this.grupo = grupo;
        this.descripevl = descripevl;
        this.porcentaje = porcentaje;
        this.descrip = descrip;
        this.materia = materia;
        this.nota = nota;
        this.notadef = notadef;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getCodmateria() {
        return Codmateria;
    }
    public String getSemestre() {
        return semestre;
    }
    public String getGrupo() {
        return grupo;
    }
    public String getDescripevl() {
        return descripevl;
    }
    public String getPorcentaje() {
        return porcentaje;
    }
    public String getDescrip() {
        return descrip;
    }
    public String getMateria() {
        return materia;
    }
    public String getNota() {
        return nota;
    }
    public String getNotadef() {
        return notadef;
    }
    public String toString() {
        return "Estudiante{" +
                "Nombre='" + nombre + '\'' +
                ", Codigo='" + codigo + '\'' +
                ", Codmateria='" + Codmateria + '\'' +
                ", Semestre='" + semestre + '\'' +
                ", Grupo='" + grupo + '\'' +
                ", Descripcion Evaluacion='" + descripevl + '\'' +
                ", Porcentaje='" + porcentaje + '\'' +
                ", Descripcion='" + descrip + '\'' +
                ", materia='" + materia + '\'' +
                ", Nota='" + nota + '\'' +
                ", Nota Definitiva='" + notadef + '\'' +
                '}';
    }
}
