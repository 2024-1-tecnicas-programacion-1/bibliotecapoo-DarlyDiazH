package com.mycompany.bibliotecapoo;

public class Libro {
     private String titulo;
    private String autor;
    private int anio;
    private String genero;
    private boolean leido;


    //Complejidad temporal: O(1) Tiempo constante.
    public Libro(String titulo, String autor, int ano, String genero, boolean leido) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = ano;
        this.genero = genero;
        this.leido = false;
    }


    //Complejidad temporal: O(1) Tiempo constante.
    public String mostrarInformacion() {
        return "Titulo: " + titulo + ", Autor: " + autor + ", Año de publicación: " + anio + ", Género: " + genero;
    }

    //Complejidad temporal: O(1) Tiempo constante.
    public void marcarLeido() {
        leido = true;
    }


    //Complejidad temporal: O(1) Tiempo constante.
    public boolean isLeido() {
        return leido;
    }


    //Complejidad temporal: O(1) Tiempo constante.
    public boolean esAntiguo() {
        if (anio < 1974) {
            return true;
        }
        return false;
    }
    
    //Complejidad temporal: O(1) Tiempo constante.    
    public String getTitulo(){
        return titulo;
    }
    
    //Complejidad temporal: O(1) Tiempo constante.
    public String getAutor(){
        return autor;
    }
    
    //Complejidad temporal: O(1) Tiempo constante.
    public String getGenero(){
        return genero;
        
    }
    
    //Complejidad temporal: O(1) Tiempo constante.
    public int getAnio() {
        return anio;
    }

}