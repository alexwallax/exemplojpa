package br.senac.rn.dao;

import br.senac.rn.model.Categoria;
import br.senac.rn.model.Produto;
import br.senac.rn.model.Sexo;
import br.senac.rn.util.GenericDAO;
import java.util.List;
import static javafx.scene.input.KeyCode.T;
import static javassist.CtMethod.ConstParameter.string;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class CategoriaDAO extends GenericDAO<Categoria> {
   
    
    @Override
    public Class<Categoria> getClassType(){
        return Categoria.class;
  }
//
    
     public List<Categoria> exemploCriteria(String nome){
       
        CriteriaBuilder builder = getEm().getCriteriaBuilder();
        CriteriaQuery<Categoria> query = builder.createQuery(Categoria.class);
        Root<Categoria> root = query.from(Categoria.class);
        Path<String> path = root.<String> get("nome");
        Predicate  predicate = builder.like(path, nome);
        query.where(predicate);
        
        TypedQuery<Categoria> typedQuery = getEm().createQuery(query);
        return typedQuery.getResultList();
    }
    
    
//    @Override
//    public Class<Categoria> getClassType() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }



}
