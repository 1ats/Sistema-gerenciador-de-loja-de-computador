
package gerencimanento.dao;

import gerenciamento.controle.Conexao;
import gerenciamento.modelo.Cliente;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import javax.swing.JOptionPane;

public class ClienteDao {
public void delete(String nome) {

        Conexao conex = new Conexao();
        Connection conn = null;
        PreparedStatement ps = null;

        try {

            conn = conex.getConnection();
            String sql = "delete from clientes where nome = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(4, nome);
            ps.execute();
            conn.commit();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");

        } catch(SQLException e) {

            System.out.println("ERRO: " + e.getMessage());
            JOptionPane.showMessageDialog(null,"nome inesistente!");

            if(conn != null){

                try {
                    conn.rollback();
                } catch (SQLException ex) {
                     JOptionPane.showMessageDialog(null,"nome inesistente!");
                }
            }
        } 
        finally {

            if( ps != null) {

                try {
                    ps.close();
                } catch (SQLException ex) {
                     JOptionPane.showMessageDialog(null,"nome inesistente!");
                }
            }
            if(conn != null) {

                try {
                    conn.close();
                } catch (SQLException ex) {
                     JOptionPane.showMessageDialog(null,"nome inesistente!");
                }
            }
        }
    }
    public void insert(Cliente cliente) {

         Conexao conex = new Conexao();
        Connection conn = null;
        PreparedStatement ps = null;

        try {

            conn = conex.getConnection();
            String sql = "insert into clientes (cpf,func,rg,nome,sexo,telefone,estadoCivil,dataNascimento) "
                    + "values(?,?,?,?,?)";

            ps = conn.prepareStatement(sql);
            ps.setInt(1, cliente.getCpf());
            ps.setInt(2, cliente.getRg());
            ps.setInt(3, cliente.getTelefone());
            ps.setString(4, cliente.getNome());
            ps.setString(5, cliente.getSexo());
            ps.setString(6, cliente.getEstadoCivil());
            ps.setDate(7, cliente.getDataNascimento());
            ps.execute();
            conn.commit();

            JOptionPane.showMessageDialog(null, "Gravado com sucesso!");

        } catch(SQLException e) {

            JOptionPane.showMessageDialog(null,"erro " + e.getMessage());

            if(conn != null){

                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"ERRO: " + ex.getMessage());
                }
            }
        } finally {

            if( ps != null) {

                try {
                    ps.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"ERRO: " + ex.getMessage());
                }
            }
            if(conn != null) {

                try {
                    conn.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"ERRO: " + ex.getMessage());
                }
            }
        }
    }
    public void atualizar(Cliente cliente) {

        Connection conn = null;
        Conexao conex = new Conexao();
        PreparedStatement ps = null;

        try {

            conn = conex.getConnection();

            String sql = "update clientes set nome=?,rg=?, cpf=?, telefone=?, sexo=? estadoCivil=?, dataNascimento=? func=? where nome = " + cliente.getNome() + "";

            JOptionPane.showMessageDialog(null, cliente.getNome());

            ps = conn.prepareStatement(sql);
            ps.setInt(1, cliente.getCpf());
            ps.setInt(2, cliente.getRg());
            ps.setInt(3, cliente.getTelefone());
            ps.setString(4, cliente.getNome());
            ps.setString(5, cliente.getSexo());
            ps.setString(6, cliente.getEstadoCivil());
            ps.setDate(7, cliente.getDataNascimento());
            ps.execute();
            
            conn.commit();

        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null,"ERRO: " + e.getMessage());
            
            if(conn != null){

                try {
                    conn.rollback();

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"ERRO: " + ex.getMessage());
                }
            }   
        } finally {

            if( ps != null) {

                try {
                    ps.close();

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"ERRO: " + ex.getMessage());
                }
            }
            if(conn != null) {

                try {
                    conn.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"ERRO: " + ex.getMessage());
                }
            }
        }
    }
}
    
    
