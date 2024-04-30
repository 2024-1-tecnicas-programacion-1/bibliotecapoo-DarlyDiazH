package com.mycompany.bibliotecapoo;

import java.util.Scanner;

public class Principal {
    static Scanner sc = new Scanner(System.in);
    
    //Complejidad lineal: O(N) Tiempo lineal.


    public static void main(String[] args) {
        Biblioteca miBiblioteca = new Biblioteca();
        int opcion;
        
        System.out.println("¡BIENVENIDO A TU BIBLIOTECA VIRTUAL!");
    do {
        System.out.println("");
        System.out.println("Ingrese el número de la opción que desea:");
        System.out.println("1) Ingresar libro");
        System.out.println("2) Mostrar todos los libros");
        System.out.println("3) Buscar libro");
        System.out.println("4) Marcar libro como leído");
        System.out.println("5) Mostrar libros no leídos");
        System.out.println("6) Salir");

        opcion = Integer.parseInt(sc.nextLine());
        System.out.println("");

        switch (opcion) {
            case 1:
                System.out.println("DETALLES DEL LIBRO A INGRESAR");
                System.out.println("");
                System.out.println("Ingrese el título del libro");
                String titulo=sc.nextLine();
                System.out.println("Ingrese el autor del libro");
                String autor = sc.nextLine();
                System.out.println("Ingrese el año de publicación del libro");
                int ano = Integer.parseInt(sc.nextLine());
                System.out.println("Ingrese el género del libro");
                String genero = sc.nextLine();
                boolean leido = false;
                Libro libroUsuario = new Libro(titulo, autor, ano, genero, leido);
                miBiblioteca.registrarLibro(libroUsuario);
                System.out.println("¡LIBRO INGRESADO EXITOSAMENTE A LA BIBLIOTECA!");
                System.out.println("");
                break;
            case 2:
                System.out.println("LIBROS DISPONIBLES EN LA BIBLIOTECA");
                System.out.println("");
                System.out.println(miBiblioteca.mostrarLibros());                
                break;
            case 3:
                System.out.println("ENCUENTRA UN LIBRO EN TU BIBLIOTECA:");
                System.out.println("");
                System.out.println("Ingrese el título del libro a buscar");
                String tituloBuscar = sc.nextLine();
                Libro libroBuscado = miBiblioteca.buscarLibro(tituloBuscar);
                if (libroBuscado != null) {
                    System.out.println("Libro encontrado:");
                    System.out.println("Título: " + libroBuscado.getTitulo());
                    System.out.println("Autor: " + libroBuscado.getAutor());
                    System.out.println("Año de publicación: " + libroBuscado.getAnio());
                    System.out.println("Género literario: " + libroBuscado.getGenero());
                    if (libroBuscado.isLeido()) {
                        System.out.println("¿Leído?: Sí");
                    } else {
                        System.out.println("¿Leído?: No");
                    }
                } else {
                    System.out.println("Libro no encontrado");
                }
                break;
            case 4:
                System.out.println("Ingrese el título del libro a marcar como leído");
                String tituloMarcar = sc.nextLine();
                Libro libroAMarcar = miBiblioteca.buscarLibro(tituloMarcar);
                if (libroAMarcar != null) {
                    libroAMarcar.marcarLeido();
                    System.out.println("Libro marcado como leído.");
                } else {
                    System.out.println("Libro no encontrado.");
                }
                break;
            case 5:
                System.out.println("LIBROS NO LEÍDOS");
                System.out.println("");
                System.out.println(miBiblioteca.mostrarLibrosNoLeidos());
                break;
            case 6:
                System.out.println("¡Hasta luego!");
                break;
            default:
                System.out.println("Opción no válida");
        }
    } while (opcion != 6);

    sc.close();
    }
}
