import model.Pessoa;

import java.sql.*;

public class TestaConexaoBD {

    public static void main(String[] args) {
//        jdbc:mysql://localhost:3306//aranoua_java_web == Onde esta instalado o BD
        String url = "jdbc:mysql://localhost:3306/aranoua_java_web";
        String usuario = "root"; //user do BD que será feita a conexao
        String senha = "root"; //senha do BD que será feita a conexao
        try {
        Pessoa pessoa = new Pessoa(05,"model.Pessoa 02","92993791610","pessoa02@ifam.edu.br");
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão realizada!");//Para mostrar que deu certo

            Statement instrucao = conexao.createStatement();
            String sqlInserir = "insert into pessoa" +
                    " (nome,telefone,email)" +
                    " values" +
                    " ('"+pessoa.getNome()+"',"+pessoa.getTelefone()+",'"+pessoa.getEmail()+"')";
            System.out.println(sqlInserir);
            //Insere a model.Pessoa
            // System.out.println("SQL:"+sqlInserir);
            // boolean resultado = instrucao.execute(sqlInserir);

            String sqlAlterar = "update pessoa" +
                    " set nome = '"+pessoa.getNome()+"'"+
                    " where id = "+pessoa.getId(); //Modifica o campo informado
            // System.out.println("SQL:"+sqlAlterar);
            // boolean resultado = instrucao.execute(sqlAlterar);

            String sqlDeletar = "delete from pessoa" +
                    " where id = 1"; //Deleta a pessoa no id especificado

            //System.out.println("SQL:"+sqlDeletar);
            //boolean resultado = instrucao.execute(sqlDeletar);

            String sqlListar = "select id,nome,telefone,email from pessoa";
            System.out.println("SQL:"+sqlListar);
            boolean resultado = instrucao.execute(sqlListar);
            if(resultado){
                ResultSet resultados = instrucao.getResultSet();
                while(resultados.next()){
                    System.out.println("ID:"+resultados.getInt(1));
                    System.out.println("NOME:"+resultados.getString(2));
                    System.out.println("TELEFONE:"+resultados.getDouble(3));
                    System.out.println("EMAIL:"+resultados.getString(4));
                    System.out.println("*******************************************");
                }
            }

            System.out.println("Instrução realizada com sucesso!");

            //System.out.println("Resultado:"+resultado);

        }catch(SQLException exececao){
            System.out.println("Erro:"+ exececao.getMessage()); //Para mostrar que deu erro
        }
        System.out.println("Progama finalizado"); //Para mostrar que o programa finalizou
    }
}
