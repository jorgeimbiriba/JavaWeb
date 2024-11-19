import model.Pessoa;
import util.ConexaoUtil;

import java.sql.*;

public class TestaConexaoBD {


    public static void main(String[] args) {


          //jdbc:mysql://localhost:3306/aranoua_java_web


        try {

            Pessoa pessoa = new Pessoa(7,"model.Pessoa 05","pessoa05@ifam.edu.br");


            ConexaoUtil conexaoUtil = new ConexaoUtil();
            Connection conexao = conexaoUtil.getConexao();

            System.out.println("Conexão realizada!");

            Statement instrucao = conexao.createStatement();

            String sqlInserir = "insert into pessoa" +
                         " (nome,email)" +
                         " values" +
                         " ('"+pessoa.getNome()+"','"+pessoa.getEmail()+"')";

            System.out.println("SQL:"+sqlInserir);

            String sqlAlterar = "update pessoa " +
                    " set nome = '"+pessoa.getNome()+"'"+
                    " where id = "+pessoa.getId();

            System.out.println("SQL:"+sqlAlterar);

            String sqlListar = "select id,nome,email from pessoa";

            System.out.println("SQL:"+sqlListar);

            boolean resultado = instrucao.execute(sqlAlterar);

            if(resultado){
                ResultSet resultados = instrucao.getResultSet();
                while(resultados.next()){
                    System.out.println("ID:"+resultados.getInt(1));
                    System.out.println("NOME:"+resultados.getString(2));
                    System.out.println("EMAIL:"+resultados.getString(3));
                    System.out.println("******************************************");
                }
            }
            System.out.println("Instrução realizada com sucesso!");

        }catch(SQLException excecao){
            System.out.println("Erro:"+ excecao.getMessage());
        }

        System.out.println("Programa finalizado!");


    }


}
