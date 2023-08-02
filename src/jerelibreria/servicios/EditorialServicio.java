/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jerelibreria.servicios;

import java.util.Scanner;
import jerelibreria.entidades.Editorial;
import jerelibreria.persistencia.EditorialDAO;

/**
 *
 * @author Seba
 */
public class EditorialServicio {
        Scanner sc=new Scanner(System.in).useDelimiter("\n");

    
    EditorialDAO editorialDAO=new EditorialDAO();
    
    public void crearEditorial(){
    
    Editorial editorial= new Editorial();
        System.out.println("ingresa nombre de editorial");
        String NombreEditorial= sc.next();
        editorial.setAlta(Boolean.TRUE);
        editorial.setNombre(NombreEditorial);
        editorialDAO.persistir(editorial); 
    
    }
            
            
}
