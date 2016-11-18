
package Modelo;

import Controle.Conexao;
import Dominio.Administrador;
import Dominio.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AdminDao {
    public void delete(int cpf) {

        Conexao conex = new Conexao();
        Connection conn = null;
        PreparedStatement ps = null;

        try {

            conn = conex.getConnection();
            String sql = "delete from administrador where cpf = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(7, cpf);
            ps.execute();
            conn.commit();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");

        } catch(SQLException e) {

            System.out.println("ERRO: " + e.getMessage());
            JOptionPane.showMessageDialog(null,"O cpf não existe!");

            if(conn != null){

                try {
                    conn.rollback();
                } catch (SQLException ex) {
                     JOptionPane.showMessageDialog(null,"O cpf não existe!");
                }
            }
        } 
        finally {

            if( ps != null) {

                try {
                    ps.close();
                } catch (SQLException ex) {
                     JOptionPane.showMessageDialog(null,"O cpf não existe!");
                }
            }
            if(conn != null) {

                try {
                    conn.close();
                } catch (SQLException ex) {
                     JOptionPane.showMessageDialog(null,"O cpf não existe!");
                }
            }
        }
    }
    public void insert(Administrador administrador) {

         Conexao conex = new Conexao();
        Connection conn = null;
        PreparedStatement ps = null;

        try {

            conn = conex.getConnection();
            String sql = "insert into administrador (usuario,senha,confirmasenha,nome,sexo,telefone,estadoCivil,cpf,rg,dataNascimento)"
                    + "values(?,?,?,?,?,?,?,?,?)";

            ps = conn.prepareStatement(sql);
            ps.setString(1, administrador.getUsuario());
            ps.setString(2, administrador.getSenha());
            ps.setString(3, administrador.getNome());
            ps.setString(4, administrador.getSexo());
            ps.setInt(5, administrador.getTelefone());
            ps.setString(6, administrador.getEstadoCivil());
            ps.setInt(7, administrador.getCpf());
            ps.setInt(8, administrador.getRg());
            ps.setDate(9, (java.sql.Date) administrador.getDataNascimento());
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
    public void atualizar(Administrador administrador) {

        Connection conn = null;
        Conexao conex = new Conexao();
        PreparedStatement ps = null;

        try {

            conn = conex.getConnection();

            String sql = "update administrador set usuario=?,senha=?, nome=?, sexo=?, telefone=? estadoCivil=?, cpf=? rg=? where cpf = " + administrador.getRg() + "";

            JOptionPane.showMessageDialog(null, administrador.getCpf());

            ps = conn.prepareStatement(sql);
            ps.setString(1, administrador.getUsuario());
            ps.setString(2, administrador.getSenha());
            ps.setString(3, administrador.getNome());
            ps.setString(4, administrador.getSexo());
            ps.setInt(5, administrador.getTelefone());
            ps.setString(6, administrador.getEstadoCivil());
            ps.setInt(7, administrador.getCpf());
            ps.setInt(8, administrador.getRg());
            ps.setDate(9, (java.sql.Date) administrador.getDataNascimento());
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
