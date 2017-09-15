package br.senac.rn.dao;

import br.senac.rn.model.Categoria;
import br.senac.rn.model.Cliente;
import br.senac.rn.model.Produto;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class ClienteDAO {
    private EntityManager manager;
    private EntityManagerFactory factory;

    public ClienteDAO(){
        factory = Persistence.createEntityManagerFactory("ConexaoDB");
        manager = factory.createEntityManager();
    }
    public void inserir(Cliente cliente){
        manager.getTransaction().begin();
        manager.persist(cliente);
        manager.getTransaction().commit();
    }
    public void excuir(Cliente cliente){
        manager.getTransaction().begin();
        manager.remove(cliente);
        manager.getTransaction().commit();
    }
    public void atualizar(Cliente cliente){
        manager.getTransaction().begin();
        manager.merge(cliente);
        manager.getTransaction().commit();
    }
    public List<Cliente>buscarTodos(){
        TypedQuery<Cliente> consulta = manager.createQuery"SELECT c FROM c", cliente.class);
        return consulta.getResultList();
    }
    public Cliente buscaPorId(Int id){
        return manager.find(Cliente.class, id);
    }
}