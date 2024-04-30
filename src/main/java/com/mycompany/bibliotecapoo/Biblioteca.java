package com.mycompany.bibliotecapoo;

import java.util.LinkedList;

public class Biblioteca {
    private LinkedList<Libro> libros;
    
    //Complejidad temporal: O(1) Tiempo constante.
    public Biblioteca() {
        this.libros = new LinkedList<>();
    }
    
    //Complejidad temporal: O(1) Tiempo constante.
    public void registrarLibro(Libro libro) {
        libros.add(libro);
    }

    //Complejidad lineal: O(N) Tiempo lineal.
    public Libro buscarLibro(String palabraBusqueda) {
        for (int i = 0; i < libros.size(); i++) {
            Libro libroVisitado = libros.get(i);
            if (libroVisitado.getTitulo().contains(palabraBusqueda) || libroVisitado.getAutor().contains(palabraBusqueda) || libroVisitado.getGenero().contains(palabraBusqueda)) {
                return libroVisitado;
            }
        }
        return null;
    }

    //Complejidad lineal: O(N) Tiempo lineal.
    public String mostrarLibros() {
        String listaLibros = "";
        for (int i = 0; i < libros.size(); i++) {
            Libro libro = libros.get(i);
            listaLibros += libro.getTitulo() + "\n";
        }
    return listaLibros;
    }
    
    //Complejidad lineal: O(N) Tiempo lineal.
    public String mostrarLibrosNoLeidos() {
        String librosNoLeidos = "";
        for (int i = 0; i < libros.size(); i++) {
            Libro libro = libros.get(i);
            if (!libro.isLeido()) {
                librosNoLeidos += libro.mostrarInformacion() + "\n";
            }
        }
        if (librosNoLeidos.isEmpty()) {
            return "No hay libros sin leer";
        } else {
            return librosNoLeidos;
        }
    }

}
