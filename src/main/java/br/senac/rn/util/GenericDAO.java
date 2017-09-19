package br.senac.rn.util;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public abstract class GenericDAO<T> {
    
    protected EntityManager manager;
    
//    public abstract Class<T> getClassType();
    
    public EntityManager getEm(){
        if(manager == null){
            manager = DataBase.getInstance().getEm();
        }
        return manager;
    } 
    public void insert(T t){  
        getEm().getTransaction().begin();
        getEm().persist(t);
        getEm().getTransaction().commit();  
        }
    public void excluir(T t){
        getEm().getTransaction().begin();
        getEm().remove(t);
        getEm().getTransaction().commit();
    }
    public void atualizar(T t){
        getEm().getTransaction().begin();
        getEm().merge(t);
        getEm().getTransaction().commit();
    }
//    public List<T> buscarTodos(){
//        TypedQuery<T> consulta = getEm.createQuery("SELECT g FROM T c", T.class);
//        return consulta.getResultList();
//    }
    
//    public T buscarPorId(int id){
//        return getEm.find(T.class, id);
//    }
}
