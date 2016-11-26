package gerenciamento.conexao;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexao {

    public Statement stm; //realizar a pesquisa no BD
    public ResultSet rs; //armazenar o resultado da pesquisa no BD
    private String driver = "org.postgresql.Driver"; //indetentifica o serviço no DB
    private String caminho = "jdbc:postgresql://localhost:5432/gerenciamentoloja"; //localizacão do BD(seta o local)
    private String usuario = "postgres";
    private String senha = "amiguel-100292P";
    public Connection con; //realizar conexão com o BD

    public void conexao() { //método responsável por realizar a conexão com o BD
        try {
            System.setProperty("jdbc.Drives", driver); //setar a propriedade do driver de conexão
            con = DriverManager.getConnection(caminho, usuario, senha); //informa o caminha url
            //JOptionPane.showMessageDialog(null, "Conexão efetuada com sucesso");

        } catch (SQLException ex) {
            //Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados:\n" + ex.getMessage());
        }
    }
    
    public void executaSql(String sql){
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            //Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "Erro ExecutaSql:\n" + ex.getMessage());

        }
        
        
    }
    

    public void desconecta() {
        try {
            con.close();
           // JOptionPane.showMessageDialog(null, "Bando de Dados desconectado com sucesso");

        } catch (SQLException ex) {
            //Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n" + ex.getMessage());

        }
    }

    /*Connection conn = null;
            
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
        }*/
}
