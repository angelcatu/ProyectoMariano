package sistemaadmincursos2;

import Alumno.Alumno;
import Curso.AsignacionMasiva;
import Curso.Curso;
import Profesor.Profesor;
import java.util.ArrayList;

public class Util {

    public static ArrayList<Profesor> lista = new ArrayList<>();
    public static ArrayList<Alumno> listaAlumno = new ArrayList<>();
    public static ArrayList<Curso> listaCurso = new ArrayList<>();
    public static Profesor profesor = new Profesor();
    public static Alumno alumno = new Alumno();
    
    
    public static int numCursosAsignado = 0;
    public static ArrayList<AsignacionMasiva> asignacionMasiva = new ArrayList<>();

    public static Alumno getAlumno() {
        return alumno;
    }

    public static void setAlumno(Alumno alumno) {
        Util.alumno = alumno;
    }
    
    
    
}
