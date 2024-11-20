import dao.PessoaDAO;
import model.Pessoa;

import java.sql.SQLException;
import java.util.List;

public class TestaConexaoBDComDAO {

    public static void main(String[] args) {

        try {

            PessoaDAO pessoaDAO = new PessoaDAO();

            // Inserir com o DAO

//            Pessoa pessoa = new Pessoa("Pessoa 08", "pessoa08@ifam.edu.br");
//
//            pessoaDAO.inserir(pessoa);
//
//            System.out.println("Inserido com sucesso!");

            // Alterar com o DAO

//            Pessoa pessoa = new Pessoa(8,"Pessoa 08 Alterado", "pessoa08alterado@ifam.edu.br");
//
//            pessoaDAO.alterar(pessoa);
//
//            System.out.println("Alterado com sucesso!");

            // Excluir com o DAO

//            pessoaDAO.excluir(6L);
//            System.out.println("Excluído com sucesso!");

            // Listar com o DAO

//            List<Pessoa> pessoas = pessoaDAO.listar();
//
//            for(Pessoa pessoa:pessoas){
//                System.out.println("Id:"+pessoa.getId());
//                System.out.println("Nome:"+pessoa.getNome());
//                System.out.println("E-mail:"+pessoa.getEmail());
//                System.out.println("*****************************");
//            }
//
//            System.out.println("Listado com sucesso!");
//
            //Consultar com o DAO

            Pessoa pessoa = pessoaDAO.consultar(5L);
            System.out.println("Id:"+pessoa.getId());
            System.out.println("Nome:"+pessoa.getNome());
            System.out.println("E-mail:"+pessoa.getEmail());
            System.out.println("*****************************");

            System.out.println("Consultado com sucesso!");

        }catch(SQLException e){
            System.out.println("Erro:"+e.getMessage());
        }
    }

}
