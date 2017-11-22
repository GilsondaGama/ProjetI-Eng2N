package visao;

import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.ModeloTabela;
import modeloConection.ConexaoBD;
import modeloDao.DaoAcompanhaF;

public class FormAcompanhaF extends javax.swing.JFrame {
    modeloBeans.BeansAcompanhaF mod = new modeloBeans.BeansAcompanhaF();
    DaoAcompanhaF control = new DaoAcompanhaF();
    ConexaoBD conex = new ConexaoBD();
    ConexaoBD conexNome = new ConexaoBD();
    
    public FormAcompanhaF() {
        initComponents();        
        limpaCampos();
        preencherNomes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jComboBoxNome = new javax.swing.JComboBox<>();
        jDateChooserData = new com.toedter.calendar.JDateChooser();
        jTextFieldMae = new javax.swing.JTextField();
        jTextFieldResponsavel = new javax.swing.JTextField();
        jTextFieldNascimento = new javax.swing.JTextField();
        jTextFieldAnos = new javax.swing.JTextField();
        jTextFieldMeses = new javax.swing.JTextField();
        jTextFieldDias = new javax.swing.JTextField();
        jTextFieldSexo = new javax.swing.JTextField();
        jTextFieldPeso = new javax.swing.JFormattedTextField();
        jTextFieldTamanho = new javax.swing.JFormattedTextField();
        jTextFieldIMC = new javax.swing.JFormattedTextField();
        jTextFieldimcTipo = new javax.swing.JTextField();
        jButtonCalculaIMC = new javax.swing.JButton();
        jComboBoxDiarreia = new javax.swing.JComboBox<>();
        jComboBoxSoro = new javax.swing.JComboBox<>();
        jComboBoxAlimentacao = new javax.swing.JComboBox<>();
        jComboBoxDoente = new javax.swing.JComboBox<>();
        jTextFieldDoenca = new javax.swing.JTextField();
        jComboBoxMama = new javax.swing.JComboBox<>();
        jComboBoxSus = new javax.swing.JComboBox<>();
        jComboBoxMotivo = new javax.swing.JComboBox<>();
        jComboBoxAtendido = new javax.swing.JComboBox<>();
        jComboBoxEstuda = new javax.swing.JComboBox<>();
        jComboBoxVacinacao = new javax.swing.JComboBox<>();
        jTextFieldIdade = new javax.swing.JTextField();
        jTextFieldidFilho = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rjButtonEditar = new javax.swing.JButton();
        rjButtonIncluir = new javax.swing.JButton();
        rjButtonPesquisa = new javax.swing.JButton();
        rjButtonExcluir = new javax.swing.JButton();
        rjButtonSalvar = new javax.swing.JButton();
        rjButtonCancelar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFilhos = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(900, 600));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTitulo.setText("Acompanhamento de Crianças");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setMaximumSize(null);

        jLabel2.setText("Mãe:");

        jLabel8.setText("Data:");

        jLabelId.setText("Código");

        jLabel3.setText("Nome:");

        jLabel4.setText("Responsável:");

        jLabel1.setText("Mama no peito?");

        jLabel5.setText("Peso:");

        jLabel6.setText("Altura:");

        jLabel7.setText("IMC:");

        jLabel9.setText("Idade:");

        jLabel10.setText("Teve Diarréia?");

        jLabel12.setText("Mãe insistiu com a alimentação?");

        jLabel13.setText("Esteve doente?");

        jLabel14.setText("Doença:");

        jLabel15.setText("Levada ao Serviço de Saúde?");

        jLabel16.setText("Qual motivo:");

        jLabel17.setText("Foi atendida:");

        jLabel18.setText("Tomou soro?");

        jLabel19.setText("IMC Situação:");

        jLabel20.setText("Estuda?");

        jLabel21.setText("Vacinação completa para a idade?");

        jTextFieldId.setEnabled(false);

        jComboBoxNome.setEnabled(false);
        jComboBoxNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNomeActionPerformed(evt);
            }
        });

        jDateChooserData.setEnabled(false);

        jTextFieldMae.setEditable(false);
        jTextFieldMae.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jTextFieldMae.setEnabled(false);
        jTextFieldMae.setFocusable(false);

        jTextFieldResponsavel.setEditable(false);
        jTextFieldResponsavel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jTextFieldResponsavel.setEnabled(false);
        jTextFieldResponsavel.setFocusable(false);

        jTextFieldNascimento.setEditable(false);
        jTextFieldNascimento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jTextFieldNascimento.setEnabled(false);
        jTextFieldNascimento.setFocusable(false);

        jTextFieldAnos.setEditable(false);
        jTextFieldAnos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldAnos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jTextFieldAnos.setEnabled(false);
        jTextFieldAnos.setFocusable(false);

        jTextFieldMeses.setEditable(false);
        jTextFieldMeses.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldMeses.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jTextFieldMeses.setEnabled(false);
        jTextFieldMeses.setFocusable(false);

        jTextFieldDias.setEditable(false);
        jTextFieldDias.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldDias.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jTextFieldDias.setEnabled(false);
        jTextFieldDias.setFocusable(false);

        jTextFieldSexo.setEditable(false);
        jTextFieldSexo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jTextFieldSexo.setEnabled(false);
        jTextFieldSexo.setFocusable(false);

        jTextFieldPeso.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jTextFieldPeso.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldPeso.setEnabled(false);

        jTextFieldTamanho.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jTextFieldTamanho.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldTamanho.setEnabled(false);

        jTextFieldIMC.setEditable(false);
        jTextFieldIMC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTextFieldIMC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jTextFieldIMC.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jTextFieldimcTipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTextFieldimcTipo.setEnabled(false);
        jTextFieldimcTipo.setFocusable(false);

        jButtonCalculaIMC.setText("Calcula IMC Infantil");
        jButtonCalculaIMC.setEnabled(false);
        jButtonCalculaIMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalculaIMCActionPerformed(evt);
            }
        });

        jComboBoxDiarreia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        jComboBoxDiarreia.setEnabled(false);
        jComboBoxDiarreia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDiarreiaActionPerformed(evt);
            }
        });

        jComboBoxSoro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        jComboBoxSoro.setEnabled(false);

        jComboBoxAlimentacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        jComboBoxAlimentacao.setEnabled(false);

        jComboBoxDoente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        jComboBoxDoente.setEnabled(false);
        jComboBoxDoente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDoenteActionPerformed(evt);
            }
        });

        jTextFieldDoenca.setEnabled(false);

        jComboBoxMama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        jComboBoxMama.setEnabled(false);

        jComboBoxSus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        jComboBoxSus.setEnabled(false);
        jComboBoxSus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSusActionPerformed(evt);
            }
        });

        jComboBoxMotivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Doença", "Consulta de rotina", "Vacinação" }));
        jComboBoxMotivo.setEnabled(false);

        jComboBoxAtendido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        jComboBoxAtendido.setEnabled(false);

        jComboBoxEstuda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        jComboBoxEstuda.setEnabled(false);

        jComboBoxVacinacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        jComboBoxVacinacao.setEnabled(false);

        jTextFieldIdade.setText("jTextFieldIdade");
        jTextFieldIdade.setEnabled(false);
        jTextFieldIdade.setFocusable(false);
        jTextFieldIdade.setOpaque(false);
        jTextFieldIdade.setRequestFocusEnabled(false);

        jTextFieldidFilho.setEditable(false);
        jTextFieldidFilho.setText("jTextFieldidFilho");
        jTextFieldidFilho.setFocusable(false);
        jTextFieldidFilho.setOpaque(false);
        jTextFieldidFilho.setRequestFocusEnabled(false);

        jLabel22.setText("m");

        jLabel23.setText("anos,");

        jLabel24.setText("meses e");

        jLabel25.setText("dias");

        jLabel26.setText("Nascimento:");

        jLabel27.setText("Sexo:");

        jLabel28.setText("kg");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)
                                .addComponent(jLabel8)
                                .addGap(9, 9, 9)
                                .addComponent(jDateChooserData, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 125, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldMae, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldResponsavel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldAnos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(3, 3, 3)
                                        .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel28)
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel6)
                                        .addGap(6, 6, 6)
                                        .addComponent(jTextFieldTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel22)
                                        .addGap(46, 46, 46)
                                        .addComponent(jButtonCalculaIMC)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldDias, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel25)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 140, Short.MAX_VALUE)
                                        .addComponent(jLabel27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldimcTipo)))))
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxDoente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDoenca)
                        .addGap(95, 95, 95)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxMama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxEstuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxSus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxAtendido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jTextFieldidFilho, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jTextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxVacinacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxDiarreia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxSoro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxAlimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelId)
                        .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jComboBoxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(jDateChooserData, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldAnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jTextFieldMeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jTextFieldDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jTextFieldNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel22)
                    .addComponent(jLabel28)
                    .addComponent(jTextFieldTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCalculaIMC)
                    .addComponent(jLabel19)
                    .addComponent(jTextFieldimcTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldIMC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel18)
                    .addComponent(jComboBoxSoro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jComboBoxDiarreia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxAlimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBoxDoente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxMama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jComboBoxSus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jComboBoxMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jComboBoxAtendido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jComboBoxEstuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxVacinacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jTextFieldidFilho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setMaximumSize(null);

        rjButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ButtonEdit.png"))); // NOI18N
        rjButtonEditar.setToolTipText("Editar");
        rjButtonEditar.setBorderPainted(false);
        rjButtonEditar.setContentAreaFilled(false);
        rjButtonEditar.setDefaultCapable(false);
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

        rjButtonPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ButtonInfo.png"))); // NOI18N
        rjButtonPesquisa.setToolTipText("Pesquisar");
        rjButtonPesquisa.setBorderPainted(false);
        rjButtonPesquisa.setContentAreaFilled(false);
        rjButtonPesquisa.setDefaultCapable(false);
        rjButtonPesquisa.setEnabled(false);

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
                .addComponent(rjButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rjButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rjButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rjButtonPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rjButtonIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rjButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addContainerGap(24, Short.MAX_VALUE))
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
        jTableFilhos.setEnabled(false);
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 995, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Foto4.jpg"))); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(472, 472, 472)
                        .addComponent(jLabelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(1243, 572));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
           
    public void preencherNomes() {
        conexNome.conexao();
        conexNome.executaSql("SELECT id, nome FROM filho ORDER BY nome");
        jComboBoxNome.removeAllItems();
        try {
            conexNome.rs.first();
            do {
                jComboBoxNome.addItem(conexNome.rs.getString("id")+" - "+conexNome.rs.getString("nome"));
            } while(conexNome.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher o campo Mãe!"+ex);
        }
        conexNome.desconecta();
    }
    
 
    private void limpaCampos() {
        jDateChooserData.setDate(null);
        jTextFieldMae.setText(null);
        jTextFieldResponsavel.setText(null);
        jTextFieldNascimento.setText(null);
        jTextFieldAnos.setText(null);
        jTextFieldMeses.setText(null);
        jTextFieldDias.setText(null);
        jTextFieldSexo.setText(null);          
        jTextFieldPeso.setText(null);
        jTextFieldTamanho.setText(null);
        jTextFieldIMC.setText(null);
        jTextFieldimcTipo.setText(null);
        jComboBoxDiarreia.setSelectedItem("Não");
        jComboBoxDoente.setSelectedItem("Não");
        jComboBoxMotivo.setSelectedItem("");
        jComboBoxMama.setSelectedItem("Não");
        jComboBoxSus.setSelectedItem("Não");
        jComboBoxEstuda.setSelectedItem("Não");
        jComboBoxVacinacao.setSelectedItem("Não");
        jTextFieldidFilho.setText(null);
    }   
            
    private void limpaTabela() {       
        preencherTabela("SELECT a.data, a.peso, a.tamanho, a.imc, a.imcTipo, a.idade, a.diarreia, a.soro, a.alimentacao, a.doente, a.doenca, a.mama, a.sus, a.motivo, a.atendido, a.estuda, a.vacinacao, a.idFilho, f.nascimento, f.sexo, f.responsavel, mae.nome FROM acompanhaf AS a INNER JOIN filho AS f ON a.idFilho = f.id INNER JOIN mae ON mae.id = f.idMae WHERE a.idFilho = ' ' ");                   
    }
                        
    private void camposEnable(boolean tf) {
        jComboBoxNome.setEnabled(tf);
        jDateChooserData.setEnabled(tf);
        jTextFieldMae.setEnabled(tf);
        jTextFieldResponsavel.setEnabled(tf);
        jTextFieldNascimento.setEnabled(tf);
        jTextFieldAnos.setEnabled(tf);
        jTextFieldMeses.setEnabled(tf);
        jTextFieldDias.setEnabled(tf);
        jTextFieldSexo.setEnabled(tf);  
        jTableFilhos.setEnabled(tf);  
    }
    
    private void camposEnable2(boolean tf) {       
        jTextFieldPeso.setEnabled(tf);
        jTextFieldTamanho.setEnabled(tf);
        jTextFieldIMC.setEnabled(tf);
        jTextFieldimcTipo.setEnabled(tf);
        jButtonCalculaIMC.setEnabled(tf);
        jComboBoxDiarreia.setEnabled(tf);
        jComboBoxDoente.setEnabled(tf);
        jComboBoxMotivo.setEnabled(tf);
        jComboBoxMama.setEnabled(tf);
        jComboBoxSus.setEnabled(tf);
        jComboBoxEstuda.setEnabled(tf);
        jComboBoxVacinacao.setEnabled(tf);             
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
        modoEdit = "Editar";
        botoesEnable(false, false, false, true, false, false);
        jComboBoxNome.setEnabled(true);      
    }//GEN-LAST:event_rjButtonEditarActionPerformed

    private void rjButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rjButtonExcluirActionPerformed
        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente Excluir?");
        if (resposta == JOptionPane.YES_OPTION){
            mod.setId(Integer.parseInt(jTextFieldId.getText()));
            control.Excluir(mod);
        }        
        modoEdit = "";
        botoesEnable(true, true, false, false, false, false);
        camposEnable(false);
        camposEnable2(false);        
        limpaCampos();
        limpaTabela();
    }//GEN-LAST:event_rjButtonExcluirActionPerformed

    private void rjButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rjButtonSalvarActionPerformed
        if (jTextFieldPeso.getText().isEmpty() || jTextFieldTamanho.getText().isEmpty()) {
            jTextFieldPeso.setText("0");
            jTextFieldTamanho.setText("0");
            jTextFieldIMC.setText("0");
            jTextFieldimcTipo.setText("");
        } else {                     
            double xpeso = Double.parseDouble(jTextFieldPeso.getText().replaceAll(",", "."));
            double xtamanho = Double.parseDouble(jTextFieldTamanho.getText().replaceAll(",", "."));
            double ximc = (xpeso/(xtamanho*xtamanho));
            
            DecimalFormat formatador = new DecimalFormat("0.00");  
            jTextFieldIMC.setText(String.valueOf(formatador.format(ximc)));
            jTextFieldimcTipo.setText(tabelaIMC(ximc));            
            
        }

        mod.setData(jDateChooserData.getDate());                                  
        mod.setIdFilho(Integer.parseInt(jTextFieldidFilho.getText().trim())); 
        mod.setPeso(Double.parseDouble(jTextFieldPeso.getText().trim()));
        mod.setTamanho(Double.parseDouble(jTextFieldPeso.getText().trim()));
        mod.setImc(Double.parseDouble(jTextFieldIMC.getText().trim()));        
        mod.setImcTipo(jTextFieldimcTipo.getText());                
        mod.setDiarreia((String) jComboBoxDiarreia.getSelectedItem());
        mod.setSoro((String) jComboBoxSoro.getSelectedItem());
        mod.setAlimentacao((String) jComboBoxAlimentacao.getSelectedItem());
        mod.setDoente((String) jComboBoxDoente.getSelectedItem());
        mod.setDoenca(jTextFieldDoenca.getText());
        mod.setMama((String) jComboBoxMama.getSelectedItem());
        mod.setSus((String) jComboBoxSus.getSelectedItem());
        mod.setMotivo((String) jComboBoxMotivo.getSelectedItem());
        mod.setAtendido((String) jComboBoxAtendido.getSelectedItem());
        mod.setIdade(Double.parseDouble(jTextFieldIdade.getText()));               
        mod.setEstuda((String) jComboBoxEstuda.getSelectedItem());
        mod.setVacinacao((String) jComboBoxVacinacao.getSelectedItem());
        control.salvar(mod, modoEdit);
        botoesEnable(true, true, false, false, false, false);   
        camposEnable(false);
        camposEnable2(false);        
        limpaCampos();
        limpaTabela();
    }//GEN-LAST:event_rjButtonSalvarActionPerformed

    private void rjButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rjButtonCancelarActionPerformed
        modoEdit = "";
        camposEnable(false);
        camposEnable2(false);
        limpaCampos();
        limpaTabela();
        botoesEnable(true, true, false, false, false, false);  
    }//GEN-LAST:event_rjButtonCancelarActionPerformed

    private void rjButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rjButtonIncluirActionPerformed
        modoEdit = "Incluir";
        jComboBoxNome.setEnabled(true);      
        botoesEnable(false, false, false, true, false, false);                            
    }//GEN-LAST:event_rjButtonIncluirActionPerformed

    private void jComboBoxDiarreiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDiarreiaActionPerformed
        if (jComboBoxDiarreia.getSelectedItem().equals("Sim")) {
           jComboBoxSoro.setEnabled(true);
           jComboBoxAlimentacao.setEnabled(true);
        } else {
           jComboBoxSoro.setEnabled(false);
           jComboBoxSoro.setSelectedItem("Não");
           jComboBoxAlimentacao.setEnabled(false); 
           jComboBoxAlimentacao.setSelectedItem("Não");
        }
    }//GEN-LAST:event_jComboBoxDiarreiaActionPerformed

    private void jComboBoxDoenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDoenteActionPerformed
        if (jComboBoxDoente.getSelectedItem().equals("Sim")) {
           jTextFieldDoenca.setEnabled(true);
        } else {
           jTextFieldDoenca.setEnabled(false);           
           jTextFieldDoenca.setText(null);
        }
    }//GEN-LAST:event_jComboBoxDoenteActionPerformed

    private void jComboBoxSusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSusActionPerformed
        if (jComboBoxSus.getSelectedItem().equals("Sim")) {
           jComboBoxMotivo.setEnabled(true);
           jComboBoxAtendido.setEnabled(true);
        } else {
           jComboBoxMotivo.setEnabled(false);
           jComboBoxAtendido.setEnabled(false);           
           jComboBoxMotivo.setSelectedItem(null);
           jComboBoxAtendido.setSelectedItem("não");
        }
    }//GEN-LAST:event_jComboBoxSusActionPerformed

    private void jComboBoxNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNomeActionPerformed
        String Str = jComboBoxNome.getSelectedItem().toString();
        String posStr = Str.substring(0, Str.indexOf("-"));                                           
        String sqlAcompanha = "SELECT f. id, f.nascimento, f.sexo, f.responsavel, m.nome"+
                              " FROM filho AS f INNER JOIN mae AS m ON f.idMae = m.id WHERE f.id = '"+posStr+"' ";
        conex.conexao();       
        conex.executaSql(sqlAcompanha);
        try {
            conex.rs.first();       
                    
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date dataAte = new Date();
            Date dataDe = conex.rs.getDate("f.nascimento");
            String dataStr = sdf.format(conex.rs.getDate("f.nascimento"));

            jTextFieldidFilho.setText(posStr);  
            jDateChooserData.setDate(dataAte);
            jTextFieldMae.setText(conex.rs.getString("m.nome"));                        
            jTextFieldResponsavel.setText(conex.rs.getString("f.responsavel"));
            jTextFieldSexo.setText(conex.rs.getString("f.sexo"));
 
            long diferencaAnos = ((dataAte.getTime() - dataDe.getTime()) / (1000*60*60*24) / 30) / 12;
            long diferencaMeses = (((dataAte.getTime() - dataDe.getTime()) / (1000*60*60*24) / 30)-diferencaAnos*12);
            long diferencaDias = ((dataAte.getTime() - dataDe.getTime()) / (1000*60*60*24))-(diferencaAnos*365)-(diferencaMeses*30);
            long TotaldiferencaDias = (dataAte.getTime() - dataDe.getTime()) / (1000*60*60*24);

            jTextFieldIdade.setText(String.valueOf(TotaldiferencaDias));
            jTextFieldAnos.setText(String.valueOf(diferencaAnos));
            jTextFieldMeses.setText(String.valueOf(diferencaMeses));
            jTextFieldDias.setText(String.valueOf(Math.abs(diferencaDias)));            
            jTextFieldNascimento.setText(dataStr); 
        } catch (SQLException ex) {
        }   
        conex.desconecta();
                
        String sqlFilho = "SELECT a.data, a.peso, a.tamanho, a.imc, a.imcTipo, a.idade, a.diarreia, a.soro, a.alimentacao, "+
                         " a.doente, a.doenca, a.mama, a.sus, a.motivo, a.atendido, a.estuda, a.vacinacao, a.id,"+
                         " a.idFilho, f.nascimento, f.sexo, f.responsavel, mae.nome"+
                         " FROM acompanhaf AS a INNER JOIN filho AS f ON a.idFilho = f.id"+                          
                         " INNER JOIN mae ON mae.id = f.idMae"+
                         " WHERE a.idFilho = '"+posStr+"' ORDER BY a.data";
        preencherTabela(sqlFilho);
        
        switch (modoEdit) {
            case "Editar":
                camposEnable(true);
                botoesEnable(false, false, true, true, false, false);
                break;
            case "Incluir":
                camposEnable(true);
                camposEnable2(true);
                botoesEnable(false, false, true, true, false, false);
                break;
            case "Inicio":
                camposEnable(false);
                camposEnable2(false);
                limpaTabela();
                modoEdit = "";
                break;
            default:
                break;
        }
    }//GEN-LAST:event_jComboBoxNomeActionPerformed

    private void jButtonCalculaIMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalculaIMCActionPerformed
        if (jTextFieldPeso.getText().isEmpty() || jTextFieldTamanho.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Os campos Peso e Tamanho devem ser preenchidos!");
            jTextFieldPeso.requestFocus();
        } else {
            double xpeso = Double.parseDouble(jTextFieldPeso.getText().replaceAll(",", "."));
            double xtamanho = Double.parseDouble(jTextFieldTamanho.getText().replaceAll(",", "."));
            double ximc = (xpeso/(xtamanho*xtamanho));
            
            DecimalFormat formatador = new DecimalFormat("0.00");  
            jTextFieldIMC.setText(String.valueOf(formatador.format(ximc)));
            jTextFieldimcTipo.setText(tabelaIMC(ximc));                        
        }        
    }//GEN-LAST:event_jButtonCalculaIMCActionPerformed

    private void jTableFilhosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFilhosMouseClicked
        String pesquisa = ""+jTableFilhos.getValueAt(jTableFilhos.getSelectedRow(), 17);
        conex.conexao();
        conex.executaSql("SELECT * FROM acompanhaf WHERE id = '"+pesquisa+"'");
        try {
            conex.rs.first();                       
            jTextFieldId.setText(conex.rs.getString("Id"));          
            jTextFieldPeso.setText(conex.rs.getString("peso"));
            jTextFieldTamanho.setText(conex.rs.getString("tamanho"));
            jTextFieldIMC.setText(conex.rs.getString("imc"));
            jTextFieldimcTipo.setText(conex.rs.getString("imcTipo"));
            jComboBoxDiarreia.setSelectedItem(conex.rs.getString("diarreia"));
            jComboBoxSoro.setSelectedItem(conex.rs.getString("soro"));
            jComboBoxAlimentacao.setSelectedItem(conex.rs.getString("alimentacao"));
            jComboBoxDoente.setSelectedItem(conex.rs.getString("doente"));
            jTextFieldDoenca.setText(conex.rs.getString("doenca"));        
            jComboBoxMama.setSelectedItem(conex.rs.getString("mama"));
            jComboBoxSus.setSelectedItem(conex.rs.getString("sus"));
            jComboBoxMotivo.setSelectedItem(conex.rs.getString("motivo"));
            jComboBoxAtendido.setSelectedItem(conex.rs.getString("atendido"));
            jComboBoxEstuda.setSelectedItem(conex.rs.getString("estuda"));
            jComboBoxVacinacao.setSelectedItem(conex.rs.getString("vacinacao"));
            camposEnable2(true);
            botoesEnable(false, false, true, true, true, false);
                                
        } catch (SQLException ex) {           
            JOptionPane.showMessageDialog(rootPane, "Erro ao selecionar os dados \n"+ex);          
        }
        conex.desconecta();                            
    }//GEN-LAST:event_jTableFilhosMouseClicked
    
     
    public void preencherTabela(String sql) {
        conex.conexao();       
        conex.executaSql(sql);   

        ArrayList dados = new ArrayList();
        String [] colunas = new String []{"Data", "Peso", "Tamanho", "IMC", "IMC Tipo", "Idade", "Diarréia", "Soro", "Alimentação",
                                          "Doente", "Doença", "Mama", "SUS", "Motivo", "Atendido", "Estuda", "Vacinção", "Id"}; 
        try {
            String dataS;
            conex.rs.first(); 
            do {
                    dataS = conex.rs.getString("data").substring(8,10)+"/"+conex.rs.getString("data").substring(5,7)+"/"+conex.rs.getString("data").substring(0,4);
                    dados.add(new Object[]{ dataS, conex.rs.getDouble("peso"), conex.rs.getDouble("tamanho"), conex.rs.getDouble("imc"),
                    conex.rs.getString("imcTipo"), conex.rs.getDouble("idade"), conex.rs.getString("diarreia"), conex.rs.getString("soro"),
                    conex.rs.getString("alimentacao"), conex.rs.getString("doente"), conex.rs.getString("doenca"), conex.rs.getString("mama"),
                    conex.rs.getString("sus"), conex.rs.getString("motivo"), conex.rs.getString("atendido"), conex.rs.getString("estuda"), conex.rs.getString("vacinacao"), conex.rs.getInt("id")});
            } while(conex.rs.next());            
        } catch (SQLException ex) {
        }        
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTableFilhos.setModel(modelo);        
        jTableFilhos.getColumnModel().getColumn(0).setPreferredWidth(90);       jTableFilhos.getColumnModel().getColumn(0).setResizable(false);
        jTableFilhos.getColumnModel().getColumn(1).setPreferredWidth(70);       jTableFilhos.getColumnModel().getColumn(1).setResizable(false);
        jTableFilhos.getColumnModel().getColumn(2).setPreferredWidth(70);       jTableFilhos.getColumnModel().getColumn(2).setResizable(false);
        jTableFilhos.getColumnModel().getColumn(3).setPreferredWidth(70);       jTableFilhos.getColumnModel().getColumn(3).setResizable(false);
        jTableFilhos.getColumnModel().getColumn(4).setPreferredWidth(120);       jTableFilhos.getColumnModel().getColumn(4).setResizable(false);
        jTableFilhos.getColumnModel().getColumn(5).setPreferredWidth(70);       jTableFilhos.getColumnModel().getColumn(5).setResizable(false);
        jTableFilhos.getColumnModel().getColumn(6).setPreferredWidth(70);       jTableFilhos.getColumnModel().getColumn(6).setResizable(false);
        jTableFilhos.getColumnModel().getColumn(7).setPreferredWidth(70);       jTableFilhos.getColumnModel().getColumn(7).setResizable(false);
        jTableFilhos.getColumnModel().getColumn(8).setPreferredWidth(70);       jTableFilhos.getColumnModel().getColumn(8).setResizable(false);
        jTableFilhos.getColumnModel().getColumn(9).setPreferredWidth(70);       jTableFilhos.getColumnModel().getColumn(9).setResizable(false);
        jTableFilhos.getColumnModel().getColumn(10).setPreferredWidth(120);       jTableFilhos.getColumnModel().getColumn(10).setResizable(false);
        jTableFilhos.getColumnModel().getColumn(11).setPreferredWidth(70);       jTableFilhos.getColumnModel().getColumn(11).setResizable(false);        
        jTableFilhos.getColumnModel().getColumn(12).setPreferredWidth(70);       jTableFilhos.getColumnModel().getColumn(12).setResizable(false);
        jTableFilhos.getColumnModel().getColumn(13).setPreferredWidth(140);       jTableFilhos.getColumnModel().getColumn(13).setResizable(false);
        jTableFilhos.getColumnModel().getColumn(14).setPreferredWidth(70);       jTableFilhos.getColumnModel().getColumn(14).setResizable(false);
        jTableFilhos.getColumnModel().getColumn(15).setPreferredWidth(70);       jTableFilhos.getColumnModel().getColumn(15).setResizable(false);
        jTableFilhos.getColumnModel().getColumn(16).setPreferredWidth(70);       jTableFilhos.getColumnModel().getColumn(16).setResizable(false);
        jTableFilhos.getColumnModel().getColumn(17).setPreferredWidth(70);       jTableFilhos.getColumnModel().getColumn(17).setResizable(false);
        jTableFilhos.getTableHeader().setReorderingAllowed(false);              
        jTableFilhos.setAutoResizeMode(jTableFilhos.AUTO_RESIZE_OFF);       
        jTableFilhos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);        
        conex.desconecta();
        jTextFieldPeso.requestFocus(); 
    }

    public String tabelaIMC(double imc) {
        String txt;
        if       (imc >= 19.6) {  txt = "obesidade / p999";
        } else if(imc >= 17.6) {  txt = "obesidade / p99";
        } else if(imc >= 17.3) {  txt = "obesidade / p97";
        } else if(imc >= 16.7) {  txt = "sobrepeso / p95";
        } else if(imc >= 16.4) {  txt = "sobrepeso / p90";
        } else if(imc >= 15.9) {  txt = "sobrepeso / p85";      
        } else if(imc >= 14.9) {  txt = "IMC adequado / p75";       
        } else if(imc >= 14.1) {  txt = "IMC adequado / p50";       
        } else if(imc >= 13.6) {  txt = "IMC adequado / p25";       
        } else if(imc >= 13.3) {  txt = "IMC adequado / p10";        
        } else if(imc >= 12.8) {  txt = "IMC adequado / p5";       
        } else if(imc >= 12.6) {  txt = "IMC adequado / p3";       
        } else if(imc >= 12.0) {  txt = "Baixo IMC para a idade / p1";       
        } else if(imc >= 11.2) {  txt = "Baixo IMC para a idade / p1";    
        } else {  txt = "Baixo IMC para a idade / p1";             
        }
        return  txt;
    }

    
    public static void main(String args[]) {
                    /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {               
                new FormAcompanhaF().setVisible(true);

            }
        });
    }
    
    
    
    public String modoEdit = "Inicio";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalculaIMC;
    private javax.swing.JComboBox<String> jComboBoxAlimentacao;
    private javax.swing.JComboBox<String> jComboBoxAtendido;
    private javax.swing.JComboBox<String> jComboBoxDiarreia;
    private javax.swing.JComboBox<String> jComboBoxDoente;
    private javax.swing.JComboBox<String> jComboBoxEstuda;
    private javax.swing.JComboBox<String> jComboBoxMama;
    private javax.swing.JComboBox<String> jComboBoxMotivo;
    private javax.swing.JComboBox<String> jComboBoxNome;
    private javax.swing.JComboBox<String> jComboBoxSoro;
    private javax.swing.JComboBox<String> jComboBoxSus;
    private javax.swing.JComboBox<String> jComboBoxVacinacao;
    private com.toedter.calendar.JDateChooser jDateChooserData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFilhos;
    private javax.swing.JTextField jTextFieldAnos;
    private javax.swing.JTextField jTextFieldDias;
    private javax.swing.JTextField jTextFieldDoenca;
    private javax.swing.JFormattedTextField jTextFieldIMC;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldIdade;
    private javax.swing.JTextField jTextFieldMae;
    private javax.swing.JTextField jTextFieldMeses;
    private javax.swing.JTextField jTextFieldNascimento;
    private javax.swing.JFormattedTextField jTextFieldPeso;
    private javax.swing.JTextField jTextFieldResponsavel;
    private javax.swing.JTextField jTextFieldSexo;
    private javax.swing.JFormattedTextField jTextFieldTamanho;
    private javax.swing.JTextField jTextFieldidFilho;
    private javax.swing.JTextField jTextFieldimcTipo;
    private javax.swing.JButton rjButtonCancelar;
    private javax.swing.JButton rjButtonEditar;
    private javax.swing.JButton rjButtonExcluir;
    private javax.swing.JButton rjButtonIncluir;
    private javax.swing.JButton rjButtonPesquisa;
    private javax.swing.JButton rjButtonSalvar;
    // End of variables declaration//GEN-END:variables
}
