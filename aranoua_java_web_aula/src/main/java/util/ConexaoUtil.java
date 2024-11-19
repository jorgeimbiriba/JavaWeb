package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoUtil {

    private String url;
    private String usuario;
    private String senha;


    public ConexaoUtil() {
        this.url = "jdbc:mysql://localhost:3306/aranoua_java_web";
        this.usuario = "root";

    }

    public Connection getConexao() throws SQLException{

        return DriverManager.getConnection(url, usuario, senha);


    }
}
