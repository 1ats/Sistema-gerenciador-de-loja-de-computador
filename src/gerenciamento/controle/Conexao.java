package gerenciamento.controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {

    Connection conn = null;

    public static Connection getConnection() {

        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/tarefas", "sa", "");
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
        return conn;
    }

    public void desconectar() {
        try {
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexão" + e.getMessage());
        }
    }

}
