package br.senac.rn.dao;

import br.senac.rn.model.Categoria;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;


public class CategoriaDAO {
    
    private EntityManager manager;
    private EntityManagerFactory factory;
    
    public CategoriaDAO(){
        
    }
    
    public void inserir(Categoria categoria){
        manager.getTransaction().begin();
        manager.persist(categoria);
        manager.getTransaction().commit();    
    }
    public void excluir(Categoria categoria){
        manager.getTransaction().begin();
        manager.remove(categoria);
        manager.getTransaction().commit();    
    }
    public void atualizar(Categoria categoria){
        manager.getTransaction().begin();
        manager.merge(categoria);
        manager.getTransaction().commit();    
    }
}
