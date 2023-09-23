package com.rest.rest.model;
import java.util.Arrays;
import java.util.List;

public class Alumno {

    private String nombre;
    private int calificacion;
    private String materia;

    private String curso;

    public Alumno(String nombre, int calificacion, String materia, String curso) {
        this.nombre = nombre;
        this.calificacion = calificacion;
        this.materia = materia;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", calificacion=" + calificacion +
                ", materia='" + materia + '\'' +
                ", curso='" + curso + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public String getMateria() {
        return materia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
