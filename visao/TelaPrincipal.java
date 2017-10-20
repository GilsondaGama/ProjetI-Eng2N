package visao;

import java.awt.AWTKeyStroke;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import javax.swing.JPanel;
import modeloConection.ConexaoBD;

public class TelaPrincipal extends javax.swing.JFrame {
    
    ConexaoBD conecta = new ConexaoBD();
    public TelaPrincipal() {
        initComponents();
        conecta.conexao();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelFoto03 = new javax.swing.JLabel();
        jLogo2 = new javax.swing.JButton();
        jLabelFoto04 = new javax.swing.JLabel();
        jLabelFoto05 = new javax.swing.JLabel();
        jButtonMenu1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JButtonSair = new javax.swing.JButton();
        jButtonMenu2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItemCadMae = new javax.swing.JMenuItem();
        jMenuItemCadCri = new javax.swing.JMenuItem();
        jMenuItemCadAte = new javax.swing.JMenuItem();
        jMenuItemCadUsu = new javax.swing.JMenuItem();
        jMenuConsultas = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuFerramentas = new javax.swing.JMenu();
        jMenuItemBenVindo = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabelFoto03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Foto3.jpg"))); // NOI18N
        getContentPane().add(jLabelFoto03);
        jLabelFoto03.setBounds(400, 70, 200, 500);

        jLogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Patoral Logo 2.png"))); // NOI18N
        jLogo2.setBorderPainted(false);
        jLogo2.setContentAreaFilled(false);
        jLogo2.setFocusPainted(false);
        jLogo2.setFocusable(false);
        jLogo2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLogo2.setMaximumSize(null);
        jLogo2.setMinimumSize(null);
        jLogo2.setPreferredSize(null);
        jLogo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogo2ActionPerformed(evt);
            }
        });
        getContentPane().add(jLogo2);
        jLogo2.setBounds(10, 10, 220, 30);

        jLabelFoto04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Foto4.jpg"))); // NOI18N
        getContentPane().add(jLabelFoto04);
        jLabelFoto04.setBounds(600, 70, 200, 500);

        jLabelFoto05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Foto5.jpg"))); // NOI18N
        getContentPane().add(jLabelFoto05);
        jLabelFoto05.setBounds(800, 70, 200, 500);

        jButtonMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Foto1.jpg"))); // NOI18N
        jButtonMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenu1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenu1);
        jButtonMenu1.setBounds(0, 70, 200, 500);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/txtMenu1.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 50, 200, 20);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/txtMenu2.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 50, 200, 20);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/txtMenu3.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(400, 50, 200, 20);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/txtMenu4.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(600, 50, 200, 20);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/txtMenu5.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(800, 50, 200, 20);

        JButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ExitMenor.png"))); // NOI18N
        JButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonSair);
        JButtonSair.setBounds(950, 0, 40, 40);

        jButtonMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Foto2.jpg"))); // NOI18N
        jButtonMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenu2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenu2);
        jButtonMenu2.setBounds(197, 70, 200, 500);

        jMenuCadastros.setText("Cadastros");

        jMenuItemCadMae.setText("Mães");
        jMenuItemCadMae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadMaeActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadMae);

        jMenuItemCadCri.setText("Filhos");
        jMenuItemCadCri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadCriActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadCri);

        jMenuItemCadAte.setText("Gestantes");
        jMenuCadastros.add(jMenuItemCadAte);

        jMenuItemCadUsu.setText("Bebês");
        jMenuItemCadUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadUsuActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadUsu);

        jMenuBar1.add(jMenuCadastros);

        jMenuConsultas.setText("Acompanhamento");

        jMenuItem1.setText("Mães");
        jMenuConsultas.add(jMenuItem1);

        jMenuItem2.setText("Bebês");
        jMenuConsultas.add(jMenuItem2);

        jMenuBar1.add(jMenuConsultas);

        jMenuRelatorios.setText("Consultas");
        jMenuBar1.add(jMenuRelatorios);

        jMenuFerramentas.setText("Relatórios");

        jMenuItemBenVindo.setText("Ben-Vindo");
        jMenuItemBenVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBenVindoActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItemBenVindo);

        jMenuBar1.add(jMenuFerramentas);

        jMenuSair.setText("Sair");

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1016, 632));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemCadCriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadCriActionPerformed
        FormFilhos tela = new FormFilhos();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadCriActionPerformed

    private void jMenuItemCadMaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadMaeActionPerformed
        FormMaes tela = new FormMaes();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadMaeActionPerformed

    private void jMenuItemCadUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCadUsuActionPerformed

    private void jMenuItemBenVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBenVindoActionPerformed
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemBenVindoActionPerformed

    private void jLogo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLogo2ActionPerformed

    private void jButtonMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenu1ActionPerformed
        FormMaes tela = new FormMaes();
        tela.setVisible(true);
    }//GEN-LAST:event_jButtonMenu1ActionPerformed

    private void JButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JButtonSairActionPerformed

    private void jButtonMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenu2ActionPerformed
        FormFilhos tela = new FormFilhos();
        tela.setVisible(true);
    }//GEN-LAST:event_jButtonMenu2ActionPerformed
  
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonSair;
    private javax.swing.JButton jButtonMenu1;
    private javax.swing.JButton jButtonMenu2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelFoto03;
    private javax.swing.JLabel jLabelFoto04;
    private javax.swing.JLabel jLabelFoto05;
    private javax.swing.JButton jLogo2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenu jMenuConsultas;
    private javax.swing.JMenu jMenuFerramentas;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemBenVindo;
    private javax.swing.JMenuItem jMenuItemCadAte;
    private javax.swing.JMenuItem jMenuItemCadCri;
    private javax.swing.JMenuItem jMenuItemCadMae;
    private javax.swing.JMenuItem jMenuItemCadUsu;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JMenu jMenuSair;
    // End of variables declaration//GEN-END:variables
}
