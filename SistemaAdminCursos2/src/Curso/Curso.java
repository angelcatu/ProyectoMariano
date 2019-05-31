package Curso;

public class Curso {

    public String id;
    public String nombre;
    public String seccion;
    public String inicio;
    public String fin;
    public String horaInicio;
    public String horaFin;
    public String profesor;

    public Curso() {
    }

    public Curso(String id, String nombre, String seccion, String inicio, String fin, String horaInicio, String horaFin, String profesor) {
        this.id = id;
        this.nombre = nombre;
        this.seccion = seccion;
        this.inicio = inicio;
        this.fin = fin;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.profesor = profesor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
