package br.senac.rn.principal;
import br.senac.rn.dao.CategoriaDAO;
import br.senac.rn.dao.ClienteDAO;
import br.senac.rn.dao.ProdutoDAO;
import br.senac.rn.dao.SexoDAO;
import br.senac.rn.model.Categoria;
import br.senac.rn.model.Cliente;
import br.senac.rn.model.Produto;
import br.senac.rn.model.Sexo;

public class Principal {
    public static void main(String[] args) {
        
//        Produto p1 = new Produto();
//        p1.setNome("Pastel");
//        p1.setDescricao("recheio de vento");
//        p1.setPreco(10);
//        p1.setCategoria(new CategoriaDAO().buscarPorId(1));
//        ProdutoDAO dao = new ProdutoDAO();
//        dao.inserir(p1);
     
        Cliente cli = new Cliente();
        ClienteDAO dao = new ClienteDAO();
        cli.setNome("João");
        cli.setCpf(123456789);
        cli.setSexo(new SexoDAO().buscarPorId(1));
        dao.inserir(cli);
        
//        CategoriaDAO dao = new CategoriaDAO();
//        Categoria c1 = new Categoria();
//        c1.setNome("vidro");
//        c1.setDescricao("copos");
//        dao.inserir(c1);
        
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
