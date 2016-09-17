
package GetSet;
/**
 *
 * @author comp15
 */
public class Funcionario extends Vendedor{
    private Administrador adm;

    public Funcionario(String UsuarioVendedor, String CPFVendedor,String RGVendedor,String TelefoneVendedor,String DiaVendedor,String MesVendedor,
    String AnoVendedor,String MascVendedor,String FeminVendedor,String SolteiroVendedor,String CasadoVendedor,String SenhaVendedor,
    String ConfirmarSenhaVendedor){
        this.adm = adm;
    }
    
    public String getAdm(){
        return adm.getUsuarioAdm();
    }
    
}
