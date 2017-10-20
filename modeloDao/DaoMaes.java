
package modeloDao;

import modeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import modeloBeans.BeansMaes;

public class DaoMaes {
        
    ConexaoBD conex = new ConexaoBD();
    BeansMaes mod = new BeansMaes();
    
    public void salvar(BeansMaes mod) {    
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
            pst.setString(8, mod.getCpf());
            pst.setString(9, mod.getRg());
            pst.setString(10, mod.getContato1());
            pst.setString(11, mod.getContato2());
            pst.setInt(12, mod.getFilhos());
            if(mod.getId() != 0) {
                pst.setInt(13, mod.getId());     // Pega o Id para a alteração
            }
            pst.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados:\n"+e);                
        }
        conex.desconecta();
    } 
    
    public void Excluir(BeansMaes mod) {
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
