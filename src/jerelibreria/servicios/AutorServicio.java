/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jerelibreria.servicios;

import java.util.Scanner;
import jerelibreria.entidades.Autor;
import jerelibreria.persistencia.AutorDAO;

/**
 *
 * @author Seba
 */
public class AutorServicio {
    Scanner sc=new Scanner(System.in).useDelimiter("\n");
    
    
    AutorDAO a1=new AutorDAO();
    
    public void crearAutor(){
        Autor autor=new Autor();
        System.out.println("ingresa nombre del autor");
        String nombre= sc.next();
        autor.setAlta(Boolean.TRUE);
        autor.setNombre(nombre);
        a1.persistir(autor);
        
    }
    
    
}
