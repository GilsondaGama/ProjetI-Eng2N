
package modeloDao;

import modeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansAcompanhaF;

public class DaoAcompanhaF {       
    BeansAcompanhaF mod = new BeansAcompanhaF();
    ConexaoBD conex = new ConexaoBD();
      
    public void salvar(BeansAcompanhaF mod, String incEdi) {    
        conex.conexao();           
        
        String sql = "";
        if (incEdi.equals("Incluir")) {
            sql = "INSERT INTO acompanhaf (data, idFilho, peso, tamanho, imc, imcTipo, diarreia, soro, alimentacao, doente, doenca, mama, sus, motivo, "
                + "atendido, idade, estuda, vacinacao) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        } else if (incEdi.equals("Editar")) {
            sql = "UPDATE acompanhaf SET data=?, idFilho=?, peso=?, tamanho=?, imc=?, imcTipo=?, diarreia=?, soro=?, alimentacao=?, doente=?, doenca=?, "
                 +"mama=?, sus=?, motivo=?, atendido=?, idade=?, estuda=?, vacinacao=? WHERE id=?";                                          
        }
        try {             
            PreparedStatement pst = conex.con.prepareStatement(sql);            
            pst.setDate(1, new java.sql.Date(mod.getData().getTime()));        
            pst.setInt(2, mod.getIdFilho());  
            pst.setDouble(3, mod.getPeso());  
            pst.setDouble(4, mod.getTamanho());  
            pst.setDouble(5, mod.getImc());  
            pst.setString(6, mod.getImcTipo());
            pst.setString(7, mod.getDiarreia());
            pst.setString(8, mod.getSoro());
            pst.setString(9, mod.getAlimentacao());
            pst.setString(10, mod.getDoente());
            pst.setString(11, mod.getDoenca());
            pst.setString(12, mod.getMama());
            pst.setString(13, mod.getSus());
            pst.setString(14, mod.getMotivo());
            pst.setString(15, mod.getAtendido());
            pst.setDouble(16, mod.getIdade());  
            pst.setString(17, mod.getEstuda());
            pst.setString(18, mod.getVacinacao());

            if (incEdi.equals("Editar")) {
                pst.setInt(19, mod.getId());     // Pesquisa pelo Id para a alteração
            }
            pst.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados:\n"+e);                
        }
        conex.desconecta();
    } 
    
    public void Excluir(BeansAcompanhaF mod) {
        conex.conexao();        
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("DELETE FROM acompanhaf WHERE id =?");
            pst.setInt(1, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados exluidos com sucesso!");                           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados:\n"+ex);                           
        }
                
        conex.desconecta();        
    }
    
}

