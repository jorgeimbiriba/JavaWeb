package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoUtil {

    private String url;
    private String usuario;
    private String senha;

    //jdbc:mysql://127.0.0.1:3306/?user=root
    public ConexaoUtil() {
        this.url = "jdbc:mysql://localhost:3306/aranoua_java_web";
        this.usuario = "root";
        this.senha = "Jhenrique#7171";
    }

    public Connection getConexao() throws SQLException{
        return DriverManager.getConnection(url, usuario, senha);
    }
}
