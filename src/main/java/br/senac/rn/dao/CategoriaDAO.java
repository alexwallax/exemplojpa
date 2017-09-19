package br.senac.rn.dao;

import br.senac.rn.model.Categoria;
import br.senac.rn.model.Sexo;
import br.senac.rn.util.GenericDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class CategoriaDAO extends GenericDAO<Categoria> {
    
//    @override
//    public Class<Categoria> getTypeClass(){
//        return Categoria.class;
//    }


//    private EntityManager manager;
//    private EntityManagerFactory factory;
//    public CategoriaDAO(){   
//        factory = Persistence.createEntityManagerFactory("ConexaoDB");
//        manager = factory.createEntityManager();
//    } 
//    public void inserir(Categoria categoria){
//        manager.getTransaction().begin();
//        manager.persist(categoria);
//        manager.getTransaction().commit();    
//    }
//    public void excluir(Categoria categoria){
//        manager.getTransaction().begin();
//        manager.remove(categoria);
//        manager.getTransaction().commit();    
//    }
//    public void atualizar(Categoria categoria){
//        manager.getTransaction().begin();
//        manager.merge(categoria);
//        manager.getTransaction().commit();    
//    }
//    public List<Categoria> buscarTodos(){ // esses comandos tras tudo o que tem na tabela Categoria
//        TypedQuery<Categoria> consulta = manager.createQuery("SELECT c FROM Categoria c", Categoria.class);
//        return consulta.getResultList();
//    }
//    public Categoria buscarPorId(int id){
//        return manager.find(Categoria.class, id);
//    }
}
