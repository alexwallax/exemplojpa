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
   
    
    @Override
    public Class<Categoria> getClassType(){
        return Categoria.class;
  }
//
//    @Override
//    public Class<Categoria> getClassType() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }



}
