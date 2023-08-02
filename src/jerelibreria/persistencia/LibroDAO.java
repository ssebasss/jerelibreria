/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jerelibreria.persistencia;

import java.util.List;
import jerelibreria.entidades.Libro;


public class LibroDAO extends RepositorioDAO<Libro>{
     public void persistir(Libro libro){
        super.persirtirEntidad(libro);
    }

    protected void borrarEstadoEntidad(Libro libro) {
        super.borrarEstadoEntidad(libro); 
    }

    protected void editarEstadoEntidad(Libro libro) {
        super.editarEstadoEntidad(libro); 
    }
    
    
     
    public List<Libro> buscarNombre(String nombre){
        String solicitud= "SELECT l FROM Libro l WHERE l.nombre=:nombre";
        return em.createQuery(solicitud, Libro.class)
                .setParameter("nombre", nombre).getResultList();
    }
}
