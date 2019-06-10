/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notas;

import Alumno.Alumno;
import Curso.Curso;

public class Nota {
    
    private Curso curso;
    private Alumno alumno;
    private String nota;

    public Nota(Curso curso, Alumno alumno, String nota) {
        this.curso = curso;
        this.alumno = alumno;
        this.nota = nota;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
    
    
    
    
    
}
