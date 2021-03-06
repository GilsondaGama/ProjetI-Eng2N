
package visao;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.ModeloTabela;
import modeloConection.ConexaoBD;
import modeloDao.DaoFilhos;


public class FormFilhos extends javax.swing.JFrame {
    modeloBeans.BeansFilhos mod = new modeloBeans.BeansFilhos();
    DaoFilhos control = new DaoFilhos();
    ConexaoBD conex = new ConexaoBD();
       
    String sqlFilho = "SELECT filho.id, filho.nome, mae.nome, responsavel FROM filho INNER JOIN mae ON filho.idMae = mae.id ORDER BY filho .nome";
    public FormFilhos() {
        initComponents();
        preencherTabela(sqlFilho);
        preencherMaes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jComboBoxMaes = new javax.swing.JComboBox<>();
        jTextFieldResponsavel = new javax.swing.JTextField();
        jTextFieldEndereco = new javax.swing.JTextField();
        jTextFieldComplemento = new javax.swing.JTextField();
        jTextFieldBairro = new javax.swing.JTextField();
        jTextFieldCidade = new javax.swing.JTextField();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldEstado = new javax.swing.JFormattedTextField();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        jTextFieldContato1 = new javax.swing.JFormattedTextField();
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
        jTableFilhos = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(900, 600));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTitulo.setText("Gerenciamento de Crianças");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setMaximumSize(null);

        jLabel2.setText("Nome: ");

        jLabel5.setText("Endereço: ");

        jLabel6.setText("Bairro: ");

        jLabel7.setText("Cidade:");

        jLabel8.setText("Nascimento: ");

        jLabel9.setText("Contato: ");

        jLabel12.setText("Complemento: ");

        jLabel13.setText("Estado: ");

        jLabelId.setText("Código");

        jLabel1.setText("Sexo:");

        jLabel3.setText("Mãe:");

        jLabel4.setText("Responsável:");

        jTextFieldNome.setEnabled(false);

        jComboBoxMaes.setEnabled(false);

        jTextFieldResponsavel.setEnabled(false);

        jTextFieldEndereco.setEnabled(false);

        jTextFieldComplemento.setEnabled(false);

        jTextFieldBairro.setEnabled(false);

        jTextFieldCidade.setEnabled(false);

        jTextFieldId.setEnabled(false);

        try {
            jTextFieldEstado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UU")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldEstado.setEnabled(false);

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        jComboBoxSexo.setEnabled(false);

        try {
            jTextFieldContato1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldContato1.setEnabled(false);

        jDateChooserNascimento.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooserNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldContato1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxMaes, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxMaes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jTextFieldContato1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel1)
                        .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooserNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
                .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setMaximumSize(null);

        jTableFilhos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableFilhos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFilhosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFilhos);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Foto2.jpg"))); // NOI18N
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)))
                .addGap(0, 4, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1200, 571));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
        
    public void preencherMaes() {
        conex.conexao();
        conex.executaSql("SELECT nome FROM mae ORDER BY nome");
        jComboBoxMaes.removeAllItems();
        try {
            conex.rs.first();
            do {
                jComboBoxMaes.addItem(conex.rs.getString("nome"));
            } while(conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher o campo Mãe!"+ex);
        }
        conex.desconecta();
    }
    
    public int codMaes;
    public String nomeMaes;
    public void BuscaMae(String nomeMae) {
        conex.conexao();      
        conex.executaSql("SELECT * FROM mae WHERE nome ='"+nomeMae+"'");
        try {
            conex.rs.first();
            codMaes = conex.rs.getInt("mae.id");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não encontrada!"+ex);
        } 
        conex.desconecta();
    }

    public void BuscaCodMae(int codMae) {
        conex.conexao();      
        conex.executaSql("SELECT * FROM mae WHERE id ='"+codMae+"'");
        try {
            conex.rs.first();
            nomeMaes = conex.rs.getString("mae.nome");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não encontrada!"+ex);
        } 
        conex.desconecta();
    }
    
    private void limpaCampos() {
        jTextFieldId.setText("0");
        jTextFieldNome.setText(""); 
        jComboBoxMaes.setName(null);
        jTextFieldResponsavel.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldComplemento.setText("");
        jTextFieldBairro.setText("");
        jTextFieldCidade.setText("");
        jTextFieldEstado.setText("");
        jComboBoxSexo.setName(null); 
        jDateChooserNascimento.setDate(null);
        jTextFieldContato1.setText("");
    }        
    
    private void camposEnable(boolean tf) {
        jTextFieldNome.setEnabled(tf);
        jComboBoxMaes.setEnabled(tf);
        jTextFieldResponsavel.setEnabled(tf);
        jTextFieldEndereco.setEnabled(tf);
        jTextFieldComplemento.setEnabled(tf);
        jTextFieldBairro.setEnabled(tf);
        jTextFieldCidade.setEnabled(tf);
        jTextFieldEstado.setEnabled(tf);
        jDateChooserNascimento.setEnabled(tf);
        jComboBoxSexo.setEnabled(tf);
        jTextFieldContato1.setEnabled(tf);   
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
        int linhaSelecionada = jTableFilhos.getSelectedRow();
        if(linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(null, "ATENÇÃO!, Selecione um registro na lista!");
        } else {
            botoesEnable(false, false, true, true, false, false);
            camposEnable(true);
        }              
    }//GEN-LAST:event_rjButtonEditarActionPerformed

    private void rjButtonPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rjButtonPesquisaActionPerformed
        preencherTabela("SELECT filho.id, filho.nome, mae.nome, responsavel FROM filho INNER JOIN mae ON filho.idMae = mae.id WHERE filho.nome LIKE '%"+jTextFieldPesquisa.getText()+"%' ORDER BY filho.nome");        
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
        preencherTabela(sqlFilho);
    }//GEN-LAST:event_rjButtonExcluirActionPerformed

    private void rjButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rjButtonSalvarActionPerformed
        if (jTextFieldNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome para continuar!");
            jTextFieldNome.requestFocus();
        }
        BuscaMae((String) jComboBoxMaes.getSelectedItem()); 
        
        mod.setId(Integer.parseInt(jTextFieldId.getText()));
        mod.setNome(jTextFieldNome.getText());      
        mod.setIdMae(codMaes);
        mod.setResponsavel(jTextFieldResponsavel.getText());
        mod.setEndereco(jTextFieldEndereco.getText());
        mod.setComplemento(jTextFieldComplemento.getText());
        mod.setBairro(jTextFieldBairro.getText());
        mod.setCidade(jTextFieldCidade.getText());
        mod.setEstado(jTextFieldEstado.getText());     
        mod.setNascimento(jDateChooserNascimento.getDate());                                  
        mod.setSexo((String) jComboBoxSexo.getSelectedItem());
        mod.setContato1(jTextFieldContato1.getText());
           
        control.salvar(mod);
        camposEnable(false);
        botoesEnable(true, false, false, false, false, true);   
        limpaCampos();
        preencherTabela(sqlFilho);
    }//GEN-LAST:event_rjButtonSalvarActionPerformed

    private void rjButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rjButtonCancelarActionPerformed
        camposEnable(false);
        botoesEnable(true, false, false, false, false, true);  
        limpaCampos();
    }//GEN-LAST:event_rjButtonCancelarActionPerformed

    private void rjButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rjButtonIncluirActionPerformed
        limpaCampos();
        camposEnable(true);
        preencherTabela(sqlFilho);
        preencherMaes();
        botoesEnable(false, false, true, true, false, false);              
        jTextFieldNome.requestFocus();
        
    }//GEN-LAST:event_rjButtonIncluirActionPerformed

    private void jTableFilhosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFilhosMouseClicked
        String pesqNome = ""+jTableFilhos.getValueAt(jTableFilhos.getSelectedRow(), 1);
        conex.conexao();
        conex.executaSql("SELECT * FROM FILHO WHERE nome = '"+pesqNome+"'");
        try {
            conex.rs.first();                       
            jTextFieldId.setText(conex.rs.getString("Id"));
            jTextFieldNome.setText(conex.rs.getString("nome"));            
            jTextFieldResponsavel.setText(conex.rs.getString("responsavel"));
            jTextFieldEndereco.setText(conex.rs.getString("endereco"));
            jTextFieldComplemento.setText(conex.rs.getString("complemento"));
            jTextFieldBairro.setText(conex.rs.getString("bairro"));
            jTextFieldCidade.setText(conex.rs.getString("cidade"));
            jTextFieldEstado.setText(conex.rs.getString("estado"));
            jComboBoxSexo.setName(conex.rs.getString("sexo"));
            jDateChooserNascimento.setDate(conex.rs.getDate("nascimento"));
            jTextFieldContato1.setText(conex.rs.getString("contato1"));
            
            BuscaCodMae(conex.rs.getInt("idMae"));
            jComboBoxMaes.setName(nomeMaes);
            
                                
        } catch (SQLException ex) {           
            JOptionPane.showMessageDialog(rootPane, "Erro ao selecionar os dados \n"+ex);          
        }
        conex.desconecta();    
        botoesEnable(true, true, false, false, true, true);
    }//GEN-LAST:event_jTableFilhosMouseClicked
     
     
    public void preencherTabela(String sql) {
        ArrayList dados = new ArrayList();
        String [] colunas = new String []{"Código", "Nome", "Nome da Mãe", "Responsável"}; 
        conex.conexao();       
        conex.executaSql(sql);                
        try {
            conex.rs.first();
            do {
                dados.add(new Object[]{conex.rs.getInt("id"), conex.rs.getString("nome"), conex.rs.getString("mae.nome"), conex.rs.getString("responsavel")});
            } while(conex.rs.next());            
        } catch (SQLException ex) {
            // JOptionPane.showMessageDialog(rootPane, "Erro ao preencher ArrayList \n"+ex);          
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTableFilhos.setModel(modelo);
        jTableFilhos.getColumnModel().getColumn(0).setPreferredWidth(60);
        jTableFilhos.getColumnModel().getColumn(0).setResizable(false);
        jTableFilhos.getColumnModel().getColumn(1).setPreferredWidth(330);
        jTableFilhos.getColumnModel().getColumn(1).setResizable(false);
        jTableFilhos.getColumnModel().getColumn(2).setPreferredWidth(300);
        jTableFilhos.getColumnModel().getColumn(2).setResizable(false);
        jTableFilhos.getColumnModel().getColumn(3).setPreferredWidth(250);
        jTableFilhos.getColumnModel().getColumn(3).setResizable(false);
        jTableFilhos.getTableHeader().setReorderingAllowed(false);
        jTableFilhos.setAutoResizeMode(jTableFilhos.AUTO_RESIZE_OFF);       
        jTableFilhos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);        
        conex.desconecta();
    }
      
     
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormFilhos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxMaes;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private com.toedter.calendar.JDateChooser jDateChooserNascimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTable jTableFilhos;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldComplemento;
    private javax.swing.JFormattedTextField jTextFieldContato1;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JFormattedTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JTextField jTextFieldResponsavel;
    private javax.swing.JButton rjButtonCancelar;
    private javax.swing.JButton rjButtonEditar;
    private javax.swing.JButton rjButtonExcluir;
    private javax.swing.JButton rjButtonIncluir;
    private javax.swing.JButton rjButtonPesquisa;
    private javax.swing.JButton rjButtonSalvar;
    // End of variables declaration//GEN-END:variables
}
