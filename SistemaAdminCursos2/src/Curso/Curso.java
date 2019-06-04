package Curso;

import Alumno.Alumno;
import Profesor.Profesor;

public class Curso {

    public int id;
    public String nombre;
    public String seccion;
    public String inicio;
    public String fin;
    public String horaInicio;
    public String horaFin;
    public Profesor profesor;
    public String nota;    
    public int iteradorAlumno;
    private Alumno alumno[];
    
    public Curso() {
    }

    public Curso(int id, String nombre, String seccion, String inicio, String fin, String horaInicio, String horaFin, Profesor profesor) {
        this.id = id;
        this.nombre = nombre;
        this.seccion = seccion;
        this.inicio = inicio;
        this.fin = fin;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.profesor = profesor;
        this.nota = "0";
        this.iteradorAlumno = 0;
        
        this.alumno = new Alumno[10];
        
    }
    

    
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
    
    

    @Override
    public String toString() {
        return nombre;
    }

    public Alumno[] getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno[] alumno) {
        this.alumno = alumno;
    }

    public int getIteradorAlumno() {
        return iteradorAlumno;
    }

    public void setIteradorAlumno(int iteradorAlumno) {
        this.iteradorAlumno = iteradorAlumno;
    }
    
    
    
    
    
}
