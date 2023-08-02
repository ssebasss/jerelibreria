
package jerelibreria.persistencia;

import java.util.List;
import jerelibreria.entidades.Autor;


public class AutorDAO extends RepositorioDAO<Autor>{
    
    public void persistir(Autor autor){
        super.persirtirEntidad(autor);
    }

    protected void borrarEstadoEntidad(Autor object) {
        super.borrarEstadoEntidad(object); 
    }

    protected void editarEstadoEntidad(Autor object) {
        super.editarEstadoEntidad(object); 
    }
    
    
     

    public List<Autor> buscarNombre(String nombre){
        String solicitud= "SELECT a FROM Autor a WHERE a.nombre=:nombre";
        return em.createQuery(solicitud, Autor.class)
                .setParameter("nombre", nombre).getResultList();
    }
    
    
    
    
    
    
    
    
    
    
}
