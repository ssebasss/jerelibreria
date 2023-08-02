/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jerelibreria.persistencia;

import java.util.List;
import jerelibreria.entidades.Editorial;

/**
 *
 * @author Seba
 */
public class EditorialDAO extends RepositorioDAO<Editorial>{
     public void persistir(Editorial editorial){
        super.persirtirEntidad(editorial);
    }

    protected void borrarEstadoEntidad(Editorial editorial) {
        super.borrarEstadoEntidad(editorial); 
    }

    protected void editarEstadoEntidad(Editorial editorial) {
        super.editarEstadoEntidad(editorial); 
    }
    
    
    
    public List<Editorial> buscarNombre(String nombre){
        String solicitud= "SELECT e FROM Editorial e WHERE e.nombre=:nombre";
        return em.createQuery(solicitud, Editorial.class)
                .setParameter("nombre", nombre).getResultList();
    }
}
