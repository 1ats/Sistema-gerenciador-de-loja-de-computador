
package gerenciamento.dao;

import gerenciamento.conexao.Conexao;
import gerenciamento.modelo.Computadores;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ComputadorDAO {
    Conexao conex = new Conexao();
    Computadores comp = new Computadores();

    public void Cadastrar(Computadores comp) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into computadores(cod_computador,marca_computador,cor_computador,modelo_computador, memoria_computador,grantia_computador,sistema_computador) values(?,?,?,?,?,?,?)");
            pst.setInt(1, comp.getCodComputador());
            pst.setString(2, comp.getMarca());
            pst.setString(3, comp.getCor());
            pst.setString(4, comp.getModelo());
            pst.setString(5, comp.getMemoria());
            pst.setString(6, comp.getGarantiaFornecedor());
            pst.setString(7, comp.getSitemaOpercional());

            JOptionPane.showMessageDialog(null, "Computador inserido com sucesso");

        } catch (SQLException ex) {
            //Logger.getLogger(ControleAdministrador.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao inserir computador!/nErro" + ex);

        }

        conex.desconecta();
    }
    
    public Computadores buscaComputador(Computadores comp) {
        conex.conexao();
        conex.executaSql("select *from computadores where cod_computador like'%" + comp.getPesquisa()+ "%'");
        try {
            conex.rs.first();
            comp.setCodComputador(conex.rs.getInt("cod_computador"));
            comp.setMarca(conex.rs.getString("marca_computador"));
            comp.setCor(conex.rs.getString("cor_computador"));
            comp.setModelo(conex.rs.getString("modelo_computador"));
            comp.setMemoria(conex.rs.getString("memeoria_computador"));
            comp.setGarantiaFornecedor(conex.rs.getString("garantia_computador"));
            comp.setSitemaOpercional(conex.rs.getString("sistema_computador"));

        } catch (SQLException ex) {
            //Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Computador não cadastrado!/nErro");

        }

        conex.desconecta();
        return comp;

    }
    
    public void Excluir(Computadores comp) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from computadores  where cod_computador =?");
            pst.setInt(1, comp.getCodComputador());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso");

        } catch (SQLException ex) {
            //Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados!/nErro" + ex);

        }

        conex.desconecta();
    }
    
}
