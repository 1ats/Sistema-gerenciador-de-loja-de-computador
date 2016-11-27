package gerenciamento.dao;

import gerenciamento.conexao.Conexao;
import gerenciamento.modelo.Cliente;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClienteDAO {

    Conexao conex = new Conexao();

    public void Cadastrar(Cliente cli) {

        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into clientes(cod_cliente,cpf_cliente,nome_cliente,sexo_cliente,telefone_cliente,nasc_cliente) values(?,?,?,?,?,?)");
            pst.setInt(1, cli.getCodCliente());
            pst.setString(2, cli.getCpf());
            pst.setString(3, cli.getNomeCliente());
            pst.setString(4, cli.getSexo());
            pst.setString(5, cli.getTelefone());
            pst.setString(6, cli.getNasc());
            pst.execute();

            JOptionPane.showMessageDialog(null, "Paciente cadastrado com sucesso");

        } catch (SQLException ex) {
            //Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar paciente" + ex);

        }

        conex.desconecta();
    }

    public Cliente BuscaCliente(Cliente cli) {
        conex.conexao();
        try {
            conex.executaSql("select *from clientes where nome_cliente like'%" + cli.getPesquisa() + "%'");
            conex.rs.first();
            cli.setCodCliente(conex.rs.getInt("cod_cliente"));
            cli.setCpf(conex.rs.getString("cpf_cliente"));
            cli.setNomeCliente(conex.rs.getString("nome_cliente"));
            cli.setSexo(conex.rs.getString("sexo_cliente"));
            cli.setTelefone(conex.rs.getString("telefone_cliente"));
            cli.setNasc(conex.rs.getString("nasc_cliente"));

        } catch (SQLException ex) {
            //Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao buscar paciente" + ex);
        }
        conex.desconecta();
        return cli;
    }

    public void Excluir(Cliente cli) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete form clientes where cod_cliente=?");
            pst.setInt(1, cli.getCodCliente());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso");

        } catch (SQLException ex) {
            //Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao excluir cliente"+ex);

        }

        conex.desconecta();
    }

}
