package Alumno;

import sistemaadmincursos2.Util;
import static sistemaadmincursos2.Util.listaAlumno;


public class Alumno {
    String carne;
    String nom;
    String ape;
    String pass;
    int nota;
    String curso[];

    public Alumno() {
    }
    
    public Alumno(String carne, String nom, String ape, String pass) {
        this.carne = carne;
        this.nom = nom;
        this.ape = ape;
        this.pass = pass;
        this.nota = 0;
        this.curso = null;
    }

    public static int buscar(String user, String contracena){
        for (int i = 0; i < listaAlumno.size(); i++) {
            if (listaAlumno.get(i).getCarne().equals(user)&&listaAlumno.get(i).getPass().equals(contracena)) {
                Util.alumno.setCarne(listaAlumno.get(i).getCarne());
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

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String[] getCurso() {
        return curso;
    }

    public void setCurso(String[] curso) {
        this.curso = curso;
    }



    @Override
    public String toString() {
        return  "carne: " + carne + ", nom: " + nom ;
    }

    
    
}

