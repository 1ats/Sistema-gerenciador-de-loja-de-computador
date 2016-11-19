package Modelo;

import Controle.Conexao;
import Dominio.Administrador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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

    public void insert(Administrador administrador) {

        Conexao conex = new Conexao();
        Connection conn = null;
        PreparedStatement ps = null;

        try {

            conn = conex.getConnection();
            String sql = "insert into administrador (usuario,senha,nome,sexo,telefone,estadoCivil,cpf,rg,dataNascimento)"
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

    public void atualizar(Administrador administrador) {

        Connection conn = null;
        Conexao conex = new Conexao();
        PreparedStatement ps = null;

        try {

            conn = conex.getConnection();

            String sql = "update administrador set usuario=?,senha=?, nome=?, sexo=?, telefone=?, estadoCivil=?, cpf=?, rg=?, dataNascimento=? where cpf = " + administrador.getCpf() + "";

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

    public List<Administrador> getAll() {
        List<Administrador> lista = new ArrayList<Administrador>();
        Connection conn = null;
        PreparedStatement ps = null;
        Conexao conex = new Conexao();
        try {
            conn = conex.getConnection();
            String sql = "select usuario,senha,nome,sexo,telefone,estadoCivil,cpf,rg,dataNascimento from administrador";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String usuario = rs.getString(1);
                String senha = rs.getString(2);
                String nome = rs.getString(3);
                String sexo = rs.getString(4);
                Integer telefone = rs.getInt(5);
                String estadoCivil = rs.getString(6);
                Integer cpf = rs.getInt(7);
                Integer rg = rs.getInt(8);
                Date DataNascimento = rs.getDate(9);

                Administrador p = new Administrador();
                p.setUsuario(usuario);
                p.setSenha(senha);  
                p.setNome(nome);
                p.setSexo(sexo);
                p.setTelefone(telefone);
                p.setEstadoCivil(estadoCivil);
                p.setCpf(cpf);
                p.setRg(rg);
                p.setDataNascimento(DataNascimento);
                lista.add(p);
            }
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        return lista;
    }

    public Administrador getAdministrador(Integer cpf) {
        Conexao conex = new Conexao();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = conex.getConnection();
            String sql = "select usuario,senha,confirmasenha,nome,sexo,telefone,estadoCivil,cpf,rg,dataNascimento from administrador where cpf = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, cpf);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String usuario = rs.getString(1);
                String senha = rs.getString(2);
                String nome = rs.getString(3);
                String sexo = rs.getString(4);
                Integer telefone = rs.getInt(5);
                String estadoCivil = rs.getString(6);
                Integer cp = rs.getInt(7);
                Integer rg = rs.getInt(8);
                Date DataNascimento = rs.getDate(9);

                Administrador p = new Administrador();
                p.setUsuario(usuario);
                p.setSenha(senha);
                p.setNome(nome);
                p.setSexo(sexo);
                p.setTelefone(telefone);
                p.setEstadoCivil(estadoCivil);
                p.setCpf(cp);
                p.setRg(rg);
                p.setDataNascimento(DataNascimento);
                return p;
            }
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        return null;
    }

}
