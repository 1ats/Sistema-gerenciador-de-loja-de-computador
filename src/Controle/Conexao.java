package Controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {

    Connection connect = null;

    public Connection getConnection() {

        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/tarefas", "sa", "");
        } catch (ClassNotFoundException e) {
            System.out.println("ERRO: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
        return conn;
    }

    public void desconectar() {
        try {
            connect.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexão" + e.getMessage());
        }
    }
}
