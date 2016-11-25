/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerencimanento.dao;

import gerenciamento.controle.Conexao;
import gerenciamento.modelo.Pedidos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class PedidoDao {
    
    public void delete(int clienteCodigo) {

        Conexao conex = new Conexao();
        Connection conn = null;
        PreparedStatement ps = null;

        try {

            conn = conex.getConnection();
            String sql = "delete from produtos where cliente codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(5, clienteCodigo);
            ps.execute();
            conn.commit();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");

        } catch(SQLException e) {

            System.out.println("ERRO: " + e.getMessage());
            JOptionPane.showMessageDialog(null,"código inesistente!");

            if(conn != null){

                try {
                    conn.rollback();
                } catch (SQLException ex) {
                     JOptionPane.showMessageDialog(null,"código inesistente!");
                }
            }
        } 
        finally {

            if( ps != null) {

                try {
                    ps.close();
                } catch (SQLException ex) {
                     JOptionPane.showMessageDialog(null,"código inesistente!");
                }
            }
            if(conn != null) {

                try {
                    conn.close();
                } catch (SQLException ex) {
                     JOptionPane.showMessageDialog(null,"código inesistente!");
                }
            }
        }
    }
    public void insert(Pedidos pedidos) {

         Conexao conex = new Conexao();
        Connection conn = null;
        PreparedStatement ps = null;

        try {

            conn = conex.getConnection();
            String sql = "insert into pedidos (clienteCodigo, produto, cli) "
                    + "values(?,?,?)";

            ps = conn.prepareStatement(sql);
            ps.setInt(1, pedidos.getClienteCodigo());
            ps.setString(2, pedidos.getProduto());
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
    public void atualizar(Pedidos pedidos) {

        Connection conn = null;
        Conexao conex = new Conexao();
        PreparedStatement ps = null;

        try {

            conn = conex.getConnection();

            String sql = "update pedidos set clienteCodigo=?,produto=?, cli=?,  where clienteCodigo = " + pedidos.getClienteCodigo() + "";

            JOptionPane.showMessageDialog(null, pedidos.getClienteCodigo());

            ps = conn.prepareStatement(sql);
            ps.setInt(1, pedidos.getClienteCodigo());
            ps.setString(2, pedidos.getProduto());
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
