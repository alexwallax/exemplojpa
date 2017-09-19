package br.senac.rn.util;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public abstract class GenericDAO<T> {
    
    protected EntityManager manager;
    
    public abstract Class<T> getClassType();
    
    public EntityManager getEm(){
        if(manager == null || !manager.isOpen()){
            manager = DataBase.getInstance().getEm();
        }
        return manager;
    } 
    public T insert(T t){  
        EntityManager em = getEm();
        try {
        em.getTransaction().begin();
        em.persist(t);
        em.getTransaction().commit();  
        
        } catch (Exception error){
            error.printStackTrace();
            em.getTransaction().rollback();        
        }
        return t;
    }
    public T delete(T t){
        EntityManager em = getEm();
        try{
        em.getTransaction().begin();
        em.remove(t);
        em.getTransaction().commit();
        }catch (Exception error){
            error.printStackTrace();
            em.getTransaction().rollback();    
    }
     return t;   
    }    
    public T update(T t){
        EntityManager em = getEm();
        try {
        em.getTransaction().begin();
        em.merge(t);
        em.getTransaction().commit();
        } catch (Exception error){
            error.printStackTrace();
            em.getTransaction().rollback();  
        }
        return t;
    }
    public T selectById(int id){
        EntityManager em = getEm();
        return em.find(getClassType(), id);
    }
    public List<T> selectAll(){
        EntityManager em = getEm();
        String jpql = "SELECT t FROM T t";
        TypedQuery<T> query = em.createQuery(jpql, getClassType());
        return query.getResultList();
    }
    
//    public T buscarPorId(int id){
//        return getEm.find(T.class, id);
//    }
}
