package br.senac.rn.principal;

import br.senac.rn.dao.SexoDAO;
import br.senac.rn.model.Sexo;

public class Principal {
    public static void main(String[] args) {
        
        SexoDAO dao = new SexoDAO();    
        System.out.println(dao.buscarTodos().toString());
        
        System.out.println(dao.buscarPorId(2).toString());
        
        dao.buscarTodos().stream().forEach((s) -> {
            System.out.println(s);
        });
        
        dao.excluir(dao.buscarPorId(3));
        
       // dao.atualizar(dao.buscarPorId(2));

    //    Sexo s1 = new Sexo();       
    //    s1.setNome("Masculino");
    //    s1.setSigla('M');      
    //    SexoDAO dao = new SexoDAO();        
    //    dao.inserir(s1);
        
        System.exit(0);

        
    }
}
