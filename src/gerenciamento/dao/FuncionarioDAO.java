package gerenciamento.dao;

import gerenciamento.conexao.Conexao;
import gerenciamento.modelo.Funcionario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FuncionarioDAO {

    Conexao conex = new Conexao();
    Funcionario func = new Funcionario();

    public void Cadastrar(Funcionario func) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into funcionarios(cod_funcionario,usuario_funcionario,senha_funcionario,tipo_funcionario) values(?,?,?,?)");
            pst.setInt(1, func.getCodFuncionario());
            pst.setString(2, func.getUsuarioFuncionario());
            pst.setString(3, func.getSenhaFuncionario());
            pst.setString(4, func.getTipoFuncionario());

            JOptionPane.showMessageDialog(null, "FUncionario inserido com sucesso");

        } catch (SQLException ex) {
            //Logger.getLogger(ControleAdministrador.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao inserir funcionario!/nErro" + ex);

        }

        conex.desconecta();
    }
    
    public Funcionario buscaFuncionario(Funcionario func) {
        conex.conexao();
        conex.executaSql("select *from funcionarios where usuario_funcionario like'%" + func.getPesquisaFuncionario() + "%'");
        try {
            conex.rs.first();
            func.setCodFuncionario(conex.rs.getInt("cod_funcionario"));
            func.setUsuarioFuncionario(conex.rs.getString("usuario_funcionario"));
            func.setSenhaFuncionario(conex.rs.getString("senha_funcionario"));
            func.setTipoFuncionario(conex.rs.getString("sexo_funcionario"));

        } catch (SQLException ex) {
            //Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Funcionario não cadastrado!/nErro");

        }

        conex.desconecta();
        return func;

    }
    
    public void Excluir(Funcionario  func) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from funcionarios  where cod_funcionario =?");
            pst.setInt(1, func.getCodFuncionario());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso");

        } catch (SQLException ex) {
            //Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados!/nErro" + ex);

        }

        conex.desconecta();
    }

}
