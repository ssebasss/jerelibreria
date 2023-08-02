/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jerelibreria.servicios;

import java.util.Scanner;
import jerelibreria.entidades.Libro;
import jerelibreria.persistencia.LibroDAO;

/**
 *
 * @author Seba
 */
public class LibroServicio {
            Scanner sc=new Scanner(System.in).useDelimiter("\n");

     LibroDAO libroDAO=new LibroDAO();
    
    public void crearLibro(){
    Libro libro= new Libro();
        System.out.println("ingresa ISBN del libro");
        Long ISBN= sc.nextLong();
        libro.setIsbn(ISBN);
        System.out.println("ingresa nombre de libro");
        String tituloLibro= sc.next();
        libro.setAlta(Boolean.TRUE);
        libro.setTitulo(tituloLibro);
        libroDAO.persistir(libro); 
    
    }
    
    
    
}
