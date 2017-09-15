package br.senac.rn.principal;
import br.senac.rn.dao.CategoriaDAO;
import br.senac.rn.dao.SexoDAO;
import br.senac.rn.model.Categoria;
import br.senac.rn.model.Sexo;

public class Principal {
    public static void main(String[] args) {
        
        CategoriaDAO dao = new CategoriaDAO();
        Categoria c1 = new Categoria();
        
    
        c1.setNome("vidro");
        c1.setDescricao("copos");
        
        dao.inserir(c1);
       
       
    //    SexoDAO daoS = new SexoDAO();  
    //    CategoriaDAO dao = new CategoriaDAO();
    //
    //    dao.atualizar(dao.buscarPorId(2));
    //    Sexo s1 = new Sexo();       
    //    s1.setNome("Masculino");
    //    s1.setSigla('M');      
    //    SexoDAO dao = new SexoDAO();        
    //    dao.inserir(s1);        
        System.exit(0);
    }
}
