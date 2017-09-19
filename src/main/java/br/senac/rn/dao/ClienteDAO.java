package br.senac.rn.dao;

import br.senac.rn.model.Cliente;
import br.senac.rn.util.GenericDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class ClienteDAO extends GenericDAO<Cliente> {

    @Override
    public Class<Cliente> getClassType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   

//    @override
//    public Class<Cliente> getTypeClass(){
//        return Cliente.class;
//    } 
    
    
    
//    private EntityManager manager;
//    private EntityManagerFactory factory;
//
//    public ClienteDAO(){
//        factory = Persistence.createEntityManagerFactory("ConexaoDB");
//        manager = factory.createEntityManager();
//    }
//    public Cliente inserir(Cliente cliente){
//        manager.getTransaction().begin();
//        manager.persist(cliente);
//        manager.getTransaction().commit();
//        return cliente;
//    }
//    public void excuir(Cliente cliente){
//        manager.getTransaction().begin();
//        manager.remove(cliente);
//        manager.getTransaction().commit();
//    }
//    public void atualizar(Cliente cliente){
//        manager.getTransaction().begin();
//        manager.merge(cliente);
//        manager.getTransaction().commit();
//    }
//    public List<Cliente> buscarTodos(){
//        TypedQuery<Cliente> consulta = manager.createQuery("SELECT s FROM Cliente s", Cliente.class);
//        return consulta.getResultList();
//    }
//    public Cliente buscaPorId(int id){
//        return manager.find(Cliente.class, id);
//    }
//    public List<Cliente> buscarPorCpf(String cpf){
//        String jpql = "FROM Cliente c where c.cpf like :cpf";
//        TypedQuery<Cliente> consulta = manager.createQuery(jpql, Cliente.class);
//        consulta.setParameter("cpf", "%" + cpf + "%");
//        return consulta.getResultList();
//    }
    
}