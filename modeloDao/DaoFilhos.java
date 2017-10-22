
package modeloDao;

import modeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import modeloBeans.BeansFilhos;

public class DaoFilhos {
        
    BeansFilhos mod = new BeansFilhos();
    ConexaoBD conex = new ConexaoBD();
    ConexaoBD conexMaes = new ConexaoBD();

      
    public void salvar(BeansFilhos mod) {    
        conex.conexao();           
        
        String sql = "";
                  
        if(mod.getId() == 0) {
            sql = "INSERT INTO FILHO (nome, idMae, responsavel, endereco, complemento, bairro, cidade, estado, nascimento, sexo, contato1) values (?,?,?,?,?,?,?,?,?,?,?)";
        } else {
//            sql = "UPDATE FILHO SET nome=?, endereco=?, complemento=?, bairro=?, cidade=?, estado=?, nascimento=?, cpf=?, rg=?, contato1=?, contato2=?, filhos=? WHERE id=?";                          
        }
        try {            
            PreparedStatement pst = conex.con.prepareStatement(sql);
            pst.setString(1, mod.getNome());
            pst.setInt(2,mod.getIdMae());           
            pst.setString(3, mod.getResponsavel());
            pst.setString(4, mod.getEndereco());
            pst.setString(5, mod.getComplemento());
            pst.setString(6, mod.getBairro());
            pst.setString(7, mod.getCidade());
            pst.setString(8, mod.getEstado());                     
            pst.setDate(9, new java.sql.Date(mod.getNascimento().getTime()));
            pst.setString(10, mod.getSexo());
            pst.setString(11, mod.getContato1());
            if(mod.getId() != 0) {
                pst.setInt(12, mod.getId());     // Pega o Id para a alteração
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
