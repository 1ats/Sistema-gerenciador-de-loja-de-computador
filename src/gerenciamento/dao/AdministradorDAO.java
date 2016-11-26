package gerenciamento.dao;

import gerenciamento.conexao.Conexao;
import gerenciamento.modelo.Administrador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AdministradorDAO {

    Conexao conex = new Conexao();
    Administrador admin = new Administrador();

    public void Cadastrar(Administrador admin) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into administrador(usuario_administrador,senha_administrador,nome_administrador,cpf_administrador,datanasc_administrador,sexo_administrador,telefone_administrador) values(?,?,?,?,?,?,?)");
            pst.setString(1, admin.getUsuario());
            pst.setString(2, admin.getSenha());
            pst.setString(3, admin.getNome());
            pst.setInt(4, admin.getCpf());
            pst.setDate(5, (java.sql.Date) admin.getDataNascimento());
            pst.setString(6, admin.getSexo());
            pst.setInt(7, admin.getTelefone());
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");

        } catch (SQLException ex) {
            //Logger.getLogger(ControleAdministrador.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!/nErro" + ex);

        }

        conex.desconecta();
    }

    public Administrador buscaAdministrador(Administrador admin) {
        conex.conexao();
        conex.executaSql("select *from administrador where nome_administrador like'%" + admin.getPesquisa() + "%'");
        try {
            conex.rs.first();
            admin.setUsuario(conex.rs.getString("usuario_administrador"));
            admin.setSenha(conex.rs.getString("senha_administrador"));
            admin.setNome(conex.rs.getString("nome_administrador"));
            admin.setCpf(conex.rs.getInt("cpf_administrador"));
            admin.setDataNascimento(conex.rs.getDate("datanasc_adminstrador"));
            admin.setSexo(conex.rs.getString("sexo_adminstrador"));
            admin.setTelefone(conex.rs.getInt("telefone_administrador"));
        } catch (SQLException ex) {
            //Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "Erro ao buscar adminstrador!/nErro" + ex);

        }

        conex.desconecta();
        return admin;

    }
}
