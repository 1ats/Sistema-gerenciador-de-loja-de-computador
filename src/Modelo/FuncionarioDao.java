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

    public void delete(int cpf) {

        Conexao conex = new Conexao();
        Connection conn = null;
        PreparedStatement ps = null;

        try {

            conn = conex.getConnection();
            String sql = "delete from funcionario where cpf = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(7, cpf);
            ps.execute();
            conn.commit();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");

        } catch (SQLException e) {

            System.out.println("ERRO: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "O cpf não existe!");

            if (conn != null) {

                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "O cpf não existe!");
                }
            }
        } finally {

            if (ps != null) {

                try {
                    ps.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "O cpf não existe!");
                }
            }
            if (conn != null) {

                try {
                    conn.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "O cpf não existe!");
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
            String sql = "insert into funcionario (usuario,senha,confirmasenha,nome,sexo,telefone,estadoCivil,cpf,rg,dataNascimento)"
                    + "values(?,?,?,?,?,?,?,?,?)";

            ps = conn.prepareStatement(sql);
            ps.setString(1, funcionario.getUsuario());
            ps.setString(2, funcionario.getSenha());
            ps.setString(3, funcionario.getNome());
            ps.setString(4, funcionario.getSexo());
            ps.setString(5, funcionario.getTelefone());
            ps.setString(6, funcionario.getEstadoCivil());
            ps.setString(7, funcionario.getCpf());
            ps.setString(8, funcionario.getRg());
            ps.setDate(9, (java.sql.Date) funcionario.getDataNascimento());
            ps.execute();
            conn.commit();

            JOptionPane.showMessageDialog(null, "Gravado com sucesso!");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "erro " + e.getMessage());

            if (conn != null) {

                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "ERRO: " + ex.getMessage());
                }
            }
        } finally {

            if (ps != null) {

                try {
                    ps.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {

                try {
                    conn.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public void atualizar(Funcionario funcionario) {

        Connection conn = null;
        Conexao conex = new Conexao();
        PreparedStatement ps = null;

        try {

            conn = conex.getConnection();

            String sql = "update funcionario set usuario=?,senha=?, nome=?, sexo=?, telefone=? estadoCivil=?, cpf=? rg=? where cpf = " + funcionario.getCpf() + "";

            JOptionPane.showMessageDialog(null, funcionario.getCpf());

            ps = conn.prepareStatement(sql);
            ps.setString(1, funcionario.getUsuario());
            ps.setString(2, funcionario.getSenha());
            ps.setString(3, funcionario.getNome());
            ps.setString(4, funcionario.getSexo());
            ps.setString(5, funcionario.getTelefone());
            ps.setString(6, funcionario.getEstadoCivil());
            ps.setString(7, funcionario.getCpf());
            ps.setString(8, funcionario.getRg());
            ps.setDate(9, (java.sql.Date) funcionario.getDataNascimento());
            ps.execute();
            conn.commit();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());

            if (conn != null) {

                try {
                    conn.rollback();

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "ERRO: " + ex.getMessage());
                }
            }
        } finally {

            if (ps != null) {

                try {
                    ps.close();

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {

                try {
                    conn.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "ERRO: " + ex.getMessage());
                }
            }
        }
    }
}
