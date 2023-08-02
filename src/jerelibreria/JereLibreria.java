
package jerelibreria;

import jerelibreria.servicios.AutorServicio;
import jerelibreria.servicios.EditorialServicio;
import jerelibreria.servicios.LibroServicio;


public class JereLibreria {

    public static void main(String[] args) {
        
        AutorServicio autorServicio= new AutorServicio();
        autorServicio.crearAutor();
        EditorialServicio editorialServicio=new EditorialServicio();
        editorialServicio.crearEditorial();
        LibroServicio libroServicio= new LibroServicio();
        libroServicio.crearLibro();
        
        
        
        
    }
    
}
