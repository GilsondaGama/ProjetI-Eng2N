
package modeloDao;

import modeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import modeloBeans.BeansFilhos;

public class DaoFilhos {
        
    ConexaoBD conex = new ConexaoBD();
    BeansFilhos mod = new BeansFilhos();
    
    public void salvar(BeansFilhos mod) {    
        conex.conexao();           
        String sql = "";
                  
        if(mod.getId() == 0) {
            sql = "INSERT INTO MAE (nome, endereco, complemento, bairro, cidade, estado, nascimento, cpf, rg, contato1, contato2, filhos) values (?,?,?,?,?,?,?,?,?,?,?,?)";      
        } else {
            sql = "UPDATE MAE SET nome=?, endereco=?, complemento=?, bairro=?, cidade=?, estado=?, nascimento=?, cpf=?, rg=?, contato1=?, contato2=?, filhos=? WHERE id=?";                          
        }
        try {            
            PreparedStatement pst = conex.con.prepareStatement(sql);
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEndereco());
            pst.setString(3, mod.getComplemento());
            pst.setString(4, mod.getBairro());
            pst.setString(5, mod.getCidade());
            pst.setString(6, mod.getEstado());           
            pst.setString(7, mod.getNascimento());
            pst.setString(10, mod.getContato1());
            if(mod.getId() != 0) {
                pst.setInt(13, mod.getId());     // Pega o Id para a alteração
            }
            pst.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados:\n"+e);                
        }
        conex.desconecta();
    } 
    
    public void Excluir(BeansFilhos mod) {
        conex.conexao();        
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("DELETE FROM mae WHERE id =?");
            pst.setInt(1, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados exluidos com sucesso!");                           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados:\n"+ex);                           
        }
                
        conex.desconecta();        
    }
}
