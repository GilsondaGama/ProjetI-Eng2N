
package visao;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.ModeloTabela;
import modeloConection.ConexaoBD;
import modeloDao.DaoMaes;


public class FormMaes extends javax.swing.JFrame {
    modeloBeans.BeansMaes mod = new modeloBeans.BeansMaes();
    DaoMaes control = new DaoMaes();
    ConexaoBD conex = new ConexaoBD();
       
    public FormMaes() {
        initComponents();
        preencherTabela("SELECT id, nome, endereco, contato1 FROM mae ORDER BY nome");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldEndereco = new javax.swing.JTextField();
        jTextFieldComplemento = new javax.swing.JTextField();
        jTextFieldBairro = new javax.swing.JTextField();
        jTextFieldCidade = new javax.swing.JTextField();
        jFormattedTextFieldCPF = new javax.swing.JFormattedTextField();
        jTextFieldRG = new javax.swing.JTextField();
        jTextFieldFilhos = new javax.swing.JTextField();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldEstado = new javax.swing.JFormattedTextField();
        jTextFieldContato1 = new javax.swing.JFormattedTextField();
        jTextFieldContato2 = new javax.swing.JFormattedTextField();
        jDateChooserNascimento = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        rjButtonEditar = new javax.swing.JButton();
        rjButtonIncluir = new javax.swing.JButton();
        rjButtonPesquisa = new javax.swing.JButton();
        rjButtonExcluir = new javax.swing.JButton();
        rjButtonSalvar = new javax.swing.JButton();
        rjButtonCancelar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMaes = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(900, 600));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTitulo.setText("Gerenciamento de Mães");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setMaximumSize(null);

        jLabel2.setText("Nome: ");

        jLabel3.setText("RG: ");

        jLabel4.setText("CPF: ");

        jLabel5.setText("Endereço: ");

        jLabel6.setText("Bairro: ");

        jLabel7.setText("Cidade:");

        jLabel8.setText("Nascimento: ");

        jLabel9.setText("Contato 1: ");

        jLabel10.setText("Contato 2: ");

        jLabel12.setText("Complemento: ");

        jLabel13.setText("Estado: ");

        jLabel14.setText("Filhos: ");

        jLabelId.setText("Código");

        jTextFieldNome.setEnabled(false);

        jTextFieldEndereco.setEnabled(false);

        jTextFieldComplemento.setEnabled(false);

        jTextFieldBairro.setEnabled(false);

        jTextFieldCidade.setEnabled(false);

        try {
            jFormattedTextFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCPF.setEnabled(false);

        jTextFieldRG.setEnabled(false);

        jTextFieldFilhos.setEnabled(false);

        jTextFieldId.setEnabled(false);

        try {
            jTextFieldEstado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UU")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldEstado.setEnabled(false);

        try {
            jTextFieldContato1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldContato1.setEnabled(false);

        try {
            jTextFieldContato2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldContato2.setEnabled(false);

        jDateChooserNascimento.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldContato1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(654, 654, 654)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDateChooserNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextFieldContato2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(98, 98, 98)
                                        .addComponent(jLabel3)
                                        .addGap(12, 12, 12)
                                        .addComponent(jTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldFilhos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(38, 38, 38))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelId)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addComponent(jDateChooserNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel14)
                            .addComponent(jTextFieldFilhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldContato1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextFieldContato2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setMaximumSize(null);

        rjButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ButtonEdit.png"))); // NOI18N
        rjButtonEditar.setToolTipText("Editar");
        rjButtonEditar.setBorderPainted(false);
        rjButtonEditar.setContentAreaFilled(false);
        rjButtonEditar.setDefaultCapable(false);
        rjButtonEditar.setEnabled(false);
        rjButtonEditar.setMaximumSize(null);
        rjButtonEditar.setMinimumSize(null);
        rjButtonEditar.setPreferredSize(null);
        rjButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rjButtonEditarActionPerformed(evt);
            }
        });

        rjButtonIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ButtonAdiciona.png"))); // NOI18N
        rjButtonIncluir.setToolTipText("Incluir");
        rjButtonIncluir.setBorderPainted(false);
        rjButtonIncluir.setContentAreaFilled(false);
        rjButtonIncluir.setDefaultCapable(false);
        rjButtonIncluir.setMaximumSize(null);
        rjButtonIncluir.setMinimumSize(null);
        rjButtonIncluir.setOpaque(true);
        rjButtonIncluir.setPreferredSize(new java.awt.Dimension(100, 100));
        rjButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rjButtonIncluirActionPerformed(evt);
            }
        });

        rjButtonPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ButtonProcura.png"))); // NOI18N
        rjButtonPesquisa.setToolTipText("Pesquisar");
        rjButtonPesquisa.setBorderPainted(false);
        rjButtonPesquisa.setContentAreaFilled(false);
        rjButtonPesquisa.setDefaultCapable(false);
        rjButtonPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rjButtonPesquisaActionPerformed(evt);
            }
        });

        rjButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ButtonDelete.png"))); // NOI18N
        rjButtonExcluir.setToolTipText("Deletar");
        rjButtonExcluir.setBorderPainted(false);
        rjButtonExcluir.setContentAreaFilled(false);
        rjButtonExcluir.setDefaultCapable(false);
        rjButtonExcluir.setEnabled(false);
        rjButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rjButtonExcluirActionPerformed(evt);
            }
        });

        rjButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ButtonSave.png"))); // NOI18N
        rjButtonSalvar.setToolTipText("Salvar");
        rjButtonSalvar.setBorderPainted(false);
        rjButtonSalvar.setContentAreaFilled(false);
        rjButtonSalvar.setDefaultCapable(false);
        rjButtonSalvar.setEnabled(false);
        rjButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rjButtonSalvarActionPerformed(evt);
            }
        });

        rjButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ButtonCancel.png"))); // NOI18N
        rjButtonCancelar.setToolTipText("Cancelar");
        rjButtonCancelar.setBorderPainted(false);
        rjButtonCancelar.setContentAreaFilled(false);
        rjButtonCancelar.setDefaultCapable(false);
        rjButtonCancelar.setEnabled(false);
        rjButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rjButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(rjButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rjButtonPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(rjButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rjButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(rjButtonIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rjButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rjButtonIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rjButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rjButtonSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rjButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rjButtonPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rjButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setMaximumSize(null);

        jLabel15.setText("Pesquisa: ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPesquisa)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setMaximumSize(null);

        jTableMaes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableMaes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMaesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMaes);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Foto1.jpg"))); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitulo)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1200, 571));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
        
    private void limpaCampos() {
        jTextFieldId.setText("0");
        jTextFieldNome.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldComplemento.setText("");
        jTextFieldBairro.setText("");
        jTextFieldCidade.setText("");
        jTextFieldEstado.setText("");
        jDateChooserNascimento.setDate(null);
        jFormattedTextFieldCPF.setText("");
        jTextFieldRG.setText("");   
        jTextFieldContato1.setText("");
        jTextFieldContato2.setText("");
        jTextFieldFilhos.setText("");        
    }        
    
    private void camposEnable(boolean tf) {
        jTextFieldNome.setEnabled(tf);
        jTextFieldEndereco.setEnabled(tf);
        jTextFieldComplemento.setEnabled(tf);
        jTextFieldBairro.setEnabled(tf);
        jTextFieldCidade.setEnabled(tf);
        jTextFieldEstado.setEnabled(tf);
        jDateChooserNascimento.setEnabled(tf);
        jFormattedTextFieldCPF.setEnabled(tf);
        jTextFieldRG.setEnabled(tf);      
        jTextFieldContato1.setEnabled(tf);
        jTextFieldContato2.setEnabled(tf);
        jTextFieldFilhos.setEnabled(tf);
    }
    
    private void botoesEnable(boolean a,boolean b,boolean c,boolean d,boolean e,boolean f) {
        rjButtonIncluir.setEnabled(a);
        rjButtonEditar.setEnabled(b);
        rjButtonSalvar.setEnabled(c);
        rjButtonCancelar.setEnabled(d);
        rjButtonExcluir.setEnabled(e);
        rjButtonPesquisa.setEnabled(f);          
    }
            
    private void rjButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rjButtonEditarActionPerformed
        int linhaSelecionada = jTableMaes.getSelectedRow();
        if(linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(null, "ATENÇÃO!, Selecione um registro na lista!");
        } else {
            botoesEnable(false, false, true, true, false, false);
            camposEnable(true);
        }              
    }//GEN-LAST:event_rjButtonEditarActionPerformed

    private void rjButtonPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rjButtonPesquisaActionPerformed
        preencherTabela("SELECT id, nome, endereco, contato1 FROM mae WHERE nome LIKE '%"+jTextFieldPesquisa.getText()+"%'  ORDER BY nome");
        botoesEnable(true, false, false, false, false, true);
    }//GEN-LAST:event_rjButtonPesquisaActionPerformed

    private void rjButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rjButtonExcluirActionPerformed

        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente Excluir?");
        if (resposta == JOptionPane.YES_OPTION){
            mod.setId(Integer.parseInt(jTextFieldId.getText()));
            control.Excluir(mod);
        }                               
        limpaCampos();
        botoesEnable(true, false, false, false, false, true);
        preencherTabela("SELECT id, nome, endereco, contato1 FROM mae ORDER BY nome");
    }//GEN-LAST:event_rjButtonExcluirActionPerformed

    private void rjButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rjButtonSalvarActionPerformed
        if (jTextFieldNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome para continuar!");
            jTextFieldNome.requestFocus();
        }
        mod.setId(Integer.parseInt(jTextFieldId.getText()));
        mod.setNome(jTextFieldNome.getText());
        mod.setEndereco(jTextFieldEndereco.getText());
        mod.setComplemento(jTextFieldComplemento.getText());
        mod.setBairro(jTextFieldBairro.getText());
        mod.setCidade(jTextFieldCidade.getText());
        mod.setEstado(jTextFieldEstado.getText());   
        mod.setNascimento(jDateChooserNascimento.getDate());                 
        mod.setCpf(jFormattedTextFieldCPF.getText()); 
        mod.setRg(jTextFieldRG.getText());
        mod.setContato1(jTextFieldContato1.getText());
        mod.setContato2(jTextFieldContato2.getText());
        mod.setFilhos(Integer.parseInt(jTextFieldFilhos.getText()));       
        
        control.salvar(mod);
        camposEnable(false);
        botoesEnable(true, false, false, false, false, true);   
        limpaCampos();
        preencherTabela("SELECT id, nome, endereco, contato1 FROM mae ORDER BY nome");
    }//GEN-LAST:event_rjButtonSalvarActionPerformed

    private void rjButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rjButtonCancelarActionPerformed
        camposEnable(false);
        botoesEnable(true, false, false, false, false, true);  
        limpaCampos();
    }//GEN-LAST:event_rjButtonCancelarActionPerformed

    private void rjButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rjButtonIncluirActionPerformed
        limpaCampos();
        camposEnable(true);
        jTextFieldNome.requestFocus();
        
        botoesEnable(false, false, true, true, false, false);              
    }//GEN-LAST:event_rjButtonIncluirActionPerformed

    private void jTableMaesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMaesMouseClicked
        String pesqNome = ""+jTableMaes.getValueAt(jTableMaes.getSelectedRow(), 1);
        conex.conexao();
        conex.executaSql("SELECT * FROM MAE WHERE nome = '"+pesqNome+"'");
        try {
            conex.rs.first();                       
            jTextFieldId.setText(conex.rs.getString("Id"));
            jTextFieldNome.setText(conex.rs.getString("nome"));
            jTextFieldEndereco.setText(conex.rs.getString("endereco"));
            jTextFieldComplemento.setText(conex.rs.getString("complemento"));
            jTextFieldBairro.setText(conex.rs.getString("bairro"));
            jTextFieldCidade.setText(conex.rs.getString("cidade"));
            jTextFieldEstado.setText(conex.rs.getString("estado"));
            jDateChooserNascimento.setDate(conex.rs.getDate("nascimento"));
            jFormattedTextFieldCPF.setText(conex.rs.getString("cpf"));
            jTextFieldRG.setText(conex.rs.getString("rg"));
            jTextFieldContato1.setText(conex.rs.getString("contato1"));
            jTextFieldContato2.setText(conex.rs.getString("contato2"));
            jTextFieldFilhos.setText(conex.rs.getString("filhos"));                                   
        } catch (SQLException ex) {           
            JOptionPane.showMessageDialog(rootPane, "Erro ao selecionar os dados \n"+ex);          
        }
        conex.desconecta();    
        botoesEnable(true, true, false, false, true, true);
    }//GEN-LAST:event_jTableMaesMouseClicked
     
     
    public void preencherTabela(String sql) {
        ArrayList dados = new ArrayList();
        String [] colunas = new String []{"Código", "Nome", "Endereço", "Número de Contato"}; 
        conex.conexao();       
        conex.executaSql(sql);                
        try {
            conex.rs.first();
            do {
                dados.add(new Object[]{conex.rs.getInt("id"), conex.rs.getString("nome"), conex.rs.getString("endereco"), conex.rs.getString("contato1")});
            } while(conex.rs.next());            
        } catch (SQLException ex) {
            // JOptionPane.showMessageDialog(rootPane, "Erro ao preencher ArrayList \n"+ex);          
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTableMaes.setModel(modelo);
        jTableMaes.getColumnModel().getColumn(0).setPreferredWidth(60);
        jTableMaes.getColumnModel().getColumn(0).setResizable(false);
        jTableMaes.getColumnModel().getColumn(1).setPreferredWidth(400);
        jTableMaes.getColumnModel().getColumn(1).setResizable(false);
        jTableMaes.getColumnModel().getColumn(2).setPreferredWidth(330);
        jTableMaes.getColumnModel().getColumn(2).setResizable(false);
        jTableMaes.getColumnModel().getColumn(3).setPreferredWidth(140);
        jTableMaes.getColumnModel().getColumn(3).setResizable(false);
        jTableMaes.getTableHeader().setReorderingAllowed(false);
        jTableMaes.setAutoResizeMode(jTableMaes.AUTO_RESIZE_OFF);       
        jTableMaes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);        
        conex.desconecta();
    }
    
    
     
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMaes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDateChooserNascimento;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMaes;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldComplemento;
    private javax.swing.JFormattedTextField jTextFieldContato1;
    private javax.swing.JFormattedTextField jTextFieldContato2;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JFormattedTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldFilhos;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JTextField jTextFieldRG;
    private javax.swing.JButton rjButtonCancelar;
    private javax.swing.JButton rjButtonEditar;
    private javax.swing.JButton rjButtonExcluir;
    private javax.swing.JButton rjButtonIncluir;
    private javax.swing.JButton rjButtonPesquisa;
    private javax.swing.JButton rjButtonSalvar;
    // End of variables declaration//GEN-END:variables
}
