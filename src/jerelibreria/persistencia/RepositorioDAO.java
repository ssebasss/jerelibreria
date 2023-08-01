/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jerelibreria.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public abstract class RepositorioDAO<Object> {
    
    protected final EntityManagerFactory emf; 
    protected EntityManager em;

    public RepositorioDAO() {
        emf = Persistence.createEntityManagerFactory("jereLibreriaPU");
        em = emf.createEntityManager();
    }
    
    protected void conectar(){
        if(!em.isOpen()){
            em= emf.createEntityManager();
        }
    }
    
    protected void desconectar(){
        if(!em.isOpen()){
            em.close();
        }
    }
    
                // persistir es crear!!!
    
    protected void persirtirEntidad(Object object) {
        try {
            conectar();
            em.getTransaction().begin();
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("No se pudo cargar");
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        }finally{
            desconectar();
        }
    }

    protected void editarEstadoEntidad(Object object) {
        try {
            conectar();
            em.getTransaction().begin();
            em.merge(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("No se pudo editar estado");
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        }finally{
            desconectar();
        }
    }
    
    protected void borrarEstadoEntidad(Object object) {
        try {
            conectar();
            em.getTransaction().begin();
            em.remove(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("No se pudo borrar estado");
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        }finally{
            desconectar();
        }
    }
    
    
    
    
    
    
    
    
    
    
}
