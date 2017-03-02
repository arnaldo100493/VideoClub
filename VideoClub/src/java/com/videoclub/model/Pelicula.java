/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.videoclub.model;

/**
 *
 * @author FABAME
 */
public class Pelicula {

    private String nombre;
    private String director;
    private int anio;

    public Pelicula() {
        this.nombre = "";
        this.director = "";
        this.anio = 0;
    }

    public Pelicula(String nombre, String director) {
        this.nombre = nombre;
        this.director = director;
        this.anio = 0;
    }

    public Pelicula(String nombre, String director, int anio) {
        this.nombre = nombre;
        this.director = director;
        this.anio = anio;
    }

    public Pelicula(Pelicula pelicula) {
        this.nombre = pelicula.getNombre();
        this.director = pelicula.getDirector();
        this.anio = pelicula.getAnio();
    }

    public String getInformacion() {
        return this.nombre + " (" + this.anio + "). Dirigida por: " + this.director + ".";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

}
