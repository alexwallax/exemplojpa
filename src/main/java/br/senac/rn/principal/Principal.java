package br.senac.rn.principal;
import br.senac.rn.dao.CategoriaDAO;
import br.senac.rn.dao.ClienteDAO;
import br.senac.rn.dao.ProdutoDAO;
import br.senac.rn.dao.SexoDAO;
import br.senac.rn.dao.VendaDAO;
import br.senac.rn.model.Categoria;
import br.senac.rn.model.Cliente;
import br.senac.rn.model.Produto;
import br.senac.rn.model.Sexo;
import br.senac.rn.model.Venda;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class Principal {
    public static void main(String[] args) {
        

        
        
        new SexoDAO().insert(new Sexo(0, "Masculino", 'M'));
        System.exit(0);
//        Venda venda = new Venda();
//        
//        venda.setCliente(new ClienteDAO().buscaPorId(1));
//        venda.setData(Calendar.getInstance());
//        
//        List<Produto> produtos = new ArrayList();
//       
//        produtos.add(new ProdutoDAO().buscaPorId(2));
//        produtos.add(new ProdutoDAO().buscaPorId(3));
//        produtos.add(new ProdutoDAO().buscaPorId(2));
//        produtos.add(new ProdutoDAO().buscaPorId(1));
//        
//        venda.setProduto(produtos);
//        
//        float valor = 0;
//        for (Produto p :produtos){
//            valor += p.getPreco();
//        }
//        venda.setValor(valor);
//        
//        new VendaDAO().inserir(venda);
        
       // System.out.println(new ClienteDAO().buscarPorCpf("123456"));
        
//        System.out.println(new ClienteDAO().buscarTodos());
        
        
//      Produto p1 = new Produto();
//      p1.setNome("Pastel");
//      p1.setDescricao("recheio de vento");
//      p1.setPreco(10);
//      p1.setCategoria(new CategoriaDAO().buscarPorId(1));
//      ProdutoDAO dao = new ProdutoDAO();
//      dao.inserir(p1);
     
//        Cliente cli = new Cliente();
//        ClienteDAO dao = new ClienteDAO();
//        cli.setNome("João");
//        cli.setCpf("01234567809");
//        cli.setSexo(new SexoDAO().buscarPorId(1));
//        System.out.println(dao.inserir(cli));
        
       
        
//      CategoriaDAO dao = new CategoriaDAO();
//      Categoria c1 = new Categoria();
//      c1.setNome("vidro");
//      c1.setDescricao("copos");
//      dao.inserir(c1);
        
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
