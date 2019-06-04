package Profesor;

import Curso.Curso;
import javax.swing.JTextField;
import sistemaadmincursos2.Util;
import static sistemaadmincursos2.Util.lista;

public class Profesor {
    public String usuario;
    public String nombre;
    public String apellido;
    public String password; 
    private Curso[] curso;
    private int iteradorCurso;

    public Profesor() {
    }

    public Profesor(String usuario, String nombre, String apellido, String password) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.iteradorCurso = 0;
        
        //Servirá para asignar un máximo de 3 cursos a cada profesor
        this.curso = new Curso[3];
    }
    public static int buscar(String user, String contracena){
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getUsuario().equals(user)&&lista.get(i).getPassword().equals(contracena)) {
                                                
                Util.setProfesor(lista.get(i));
                Util.getProfesor().setNombre(lista.get(i).getNombre());
                Util.getProfesor().setApellido(lista.get(i).getApellido());
                Util.getProfesor().setPassword(lista.get(i).getPassword());
                                                                                                    
                return i;
            }
        }
        return -1;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return usuario ;
    }

    public Curso[] getCurso() {
        return curso;
    }

    public void setCurso(Curso[] curso) {
        this.curso = curso;
    }

    public int getIteradorCurso() {
        return iteradorCurso;
    }

    public void setIteradorCurso(int iteradorCurso) {
        this.iteradorCurso = iteradorCurso;
    }
    
    
    
    

    
    
    
    
}
