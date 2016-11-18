package Modelo;

import Controle.Conexao;
import Dominio.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class FuncionarioDao {
public void delete(int rg) {

        Conexao conex = new Conexao();
        Connection conn = null;
        PreparedStatement ps = null;

        try {

            conn = conex.getConnection();
            String sql = "delete from funcionario where rg = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(5, rg);
            ps.execute();
            conn.commit();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");

        } catch(SQLException e) {

            System.out.println("ERRO: " + e.getMessage());
            JOptionPane.showMessageDialog(null,"rg não existe!");

            if(conn != null){

                try {
                    conn.rollback();
                } catch (SQLException ex) {
                     JOptionPane.showMessageDialog(null,"rg não existe!");
                }
            }
        } 
        finally {

            if( ps != null) {

                try {
                    ps.close();
                } catch (SQLException ex) {
                     JOptionPane.showMessageDialog(null,"rg não existe!");
                }
            }
            if(conn != null) {

                try {
                    conn.close();
                } catch (SQLException ex) {
                     JOptionPane.showMessageDialog(null,"rg não existe!");
                }
            }
        }
    }
    public void insert(Funcionario funcionario) {

         Conexao conex = new Conexao();
        Connection conn = null;
        PreparedStatement ps = null;

        try {

            conn = conex.getConnection();
            String sql = "insert into clientes (cpf,func,rg,nome,sexo,telefone,estadoCivil,dataNascimento) "
                    + "values(?,?,?,?,?)";

            ps = conn.prepareStatement(sql);
            ps.setString(1, cliente.getCpf());
            ps.setString(3, cliente.getRg());
            ps.setString(4, cliente.getTelefone());
            ps.setString(5, cliente.getNome());
            ps.setString(6, cliente.getSexo());
            ps.setString(7, cliente.getEstadoCivil());
            ps.setDate(8, cliente.getDataNascimento());
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
            ps.setString(1, cliente.getCpf());
            ps.setString(3, cliente.getRg());
            ps.setString(4, cliente.getTelefone());
            ps.setString(5, cliente.getNome());
            ps.setString(6, cliente.getSexo());
            ps.setString(7, cliente.getEstadoCivil());
            ps.setDate(8, cliente.getDataNascimento());
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
    
    

