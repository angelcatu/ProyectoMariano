package Alumno;

import Curso.Curso;
import sistemaadmincursos2.Util;
import static sistemaadmincursos2.Util.listaAlumno;


public class Alumno {
    String carne;
    String nom;
    String ape;
    String pass;    
    Curso curso[];
    int tamañoCursos;

    public Alumno() {
    }
    
    public Alumno(String carne, String nom, String ape, String pass) {
        this.carne = carne;
        this.nom = nom;
        this.ape = ape;
        this.pass = pass;        
        this.curso = new Curso[5];
        this.tamañoCursos = 0;
    }

    public static int buscar(String user, String contracena){
        for (int i = 0; i < listaAlumno.size(); i++) {
            if (listaAlumno.get(i).getCarne().equals(user)&&listaAlumno.get(i).getPass().equals(contracena)) {
                                
                Util.setAlumno(listaAlumno.get(i));
                Util.getAlumno().setNom(listaAlumno.get(i).getNom());
                Util.getAlumno().setCarne(listaAlumno.get(i).getCarne());                               
                Util.getAlumno().setApe(listaAlumno.get(i).getApe());                               
                                                               
                
                return i;
            }
        }
        return -1;
    }
    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }


    public Curso[] getCurso() {
        return curso;
    }

    public void setCurso(Curso[] curso) {
        this.curso = curso;
    }

    public int getTamañoCursos() {
        return tamañoCursos;
    }

    public void setTamañoCursos(int tamañoCursos) {
        this.tamañoCursos = tamañoCursos;
    }

    

    @Override
    public String toString() {
        return  "carne: " + carne + ", nom: " + nom ;
    }

    
    
}

