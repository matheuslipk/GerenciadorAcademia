package view.painel;

import bancodedados.ConexaoMedidas;
import hide.Medidas;
import view.jframe.TelaAjudaCQ;
import java.util.Calendar;

/**
 *
 * @author h4ck3r
 */
public class PainelAdcionarMedidas extends javax.swing.JPanel {

    
    
    public PainelAdcionarMedidas() {
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlImagemCorpoHumano = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        painelId = new javax.swing.JPanel();
        jlIdCliente = new javax.swing.JLabel();
        lID = new javax.swing.JLabel();
        painelGuia = new javax.swing.JTabbedPane();
        painelMedidas1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        tfBracRelDir = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfBracRelEsq = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        tfToraxIns = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        tfQuadril = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        tfRcq = new javax.swing.JTextField();
        botaoAjudaCQ = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tfPescoco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tfOmbro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        tfToraxRelx = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tfBracContDir = new javax.swing.JTextField();
        tfBracContEsq = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        tfCintura = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        tfAntebracoDir = new javax.swing.JTextField();
        tfAntebracoEsq = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        tfCoxaDir = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tfCoxaEsq = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        tfPanturrilhaDir = new javax.swing.JTextField();
        tfPanturrilhaEsq = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        tfAbdomen = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botaoSalvarDados = new javax.swing.JButton();
        painelImc1 = new view.painel.PainelImc();
        painelDataAvaliacao = new javax.swing.JPanel();
        tfDataAvaliacao = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();

        jlImagemCorpoHumano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/corpo-humano.PNG"))); // NOI18N
        jlImagemCorpoHumano.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Peso e medidas Corporais (cm e Kg)");

        jlIdCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlIdCliente.setForeground(new java.awt.Color(255, 0, 0));
        jlIdCliente.setText("0");

        lID.setText("ID: ");

        javax.swing.GroupLayout painelIdLayout = new javax.swing.GroupLayout(painelId);
        painelId.setLayout(painelIdLayout);
        painelIdLayout.setHorizontalGroup(
            painelIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelIdLayout.createSequentialGroup()
                .addComponent(lID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        painelIdLayout.setVerticalGroup(
            painelIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelIdLayout.createSequentialGroup()
                .addGroup(painelIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lID)
                    .addComponent(jlIdCliente))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(380, 80));

        tfBracRelDir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfBracRelDir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfBracRelDir.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Braço relaxado");

        tfBracRelEsq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfBracRelEsq.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfBracRelEsq.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(tfBracRelDir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(tfBracRelEsq, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6)
                .addComponent(tfBracRelDir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tfBracRelEsq, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel7.setPreferredSize(new java.awt.Dimension(380, 42));

        tfToraxIns.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfToraxIns.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfToraxIns.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Tórax inspirado");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(tfToraxIns, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel10)
                .addComponent(tfToraxIns, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel10.setPreferredSize(new java.awt.Dimension(380, 42));

        tfQuadril.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfQuadril.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfQuadril.setEnabled(false);
        tfQuadril.setNextFocusableComponent(tfCoxaDir);
        tfQuadril.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfQuadrilKeyReleased(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Quadril");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(tfQuadril, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel13)
                .addComponent(tfQuadril, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));
        jPanel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel11.setPreferredSize(new java.awt.Dimension(380, 42));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Relação Cin/Quad");

        tfRcq.setEditable(false);
        tfRcq.setBackground(new java.awt.Color(255, 255, 255));
        tfRcq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfRcq.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfRcq.setEnabled(false);

        botaoAjudaCQ.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoAjudaCQ.setText("?");
        botaoAjudaCQ.setMargin(new java.awt.Insets(0, 0, 0, 0));
        botaoAjudaCQ.setMaximumSize(new java.awt.Dimension(25, 25));
        botaoAjudaCQ.setMinimumSize(new java.awt.Dimension(25, 25));
        botaoAjudaCQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAjudaCQActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(tfRcq, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(botaoAjudaCQ, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoAjudaCQ, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(tfRcq, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(380, 42));
        jPanel1.setRequestFocusEnabled(false);

        tfPescoco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfPescoco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfPescoco.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Pescoço");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(tfPescoco, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel4)
                .addComponent(tfPescoco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(380, 42));

        tfOmbro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfOmbro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfOmbro.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Ombro");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(tfOmbro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5)
                .addComponent(tfOmbro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel6.setPreferredSize(new java.awt.Dimension(380, 42));

        tfToraxRelx.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfToraxRelx.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfToraxRelx.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Tórax relaxado");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(tfToraxRelx, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel9)
                .addComponent(tfToraxRelx, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(380, 42));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Braço contraído");

        tfBracContDir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfBracContDir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfBracContDir.setEnabled(false);

        tfBracContEsq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfBracContEsq.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfBracContEsq.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfBracContDir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(tfBracContEsq, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel7)
                .addComponent(tfBracContDir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tfBracContEsq, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel8.setPreferredSize(new java.awt.Dimension(380, 42));

        tfCintura.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfCintura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCintura.setEnabled(false);
        tfCintura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCinturaKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Cintura");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(tfCintura, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel11)
                .addComponent(tfCintura, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel5.setPreferredSize(new java.awt.Dimension(380, 42));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Antebraço");

        tfAntebracoDir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfAntebracoDir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfAntebracoDir.setEnabled(false);

        tfAntebracoEsq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfAntebracoEsq.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfAntebracoEsq.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(tfAntebracoDir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(tfAntebracoEsq, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel8)
                .addComponent(tfAntebracoDir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tfAntebracoEsq, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));
        jPanel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel12.setPreferredSize(new java.awt.Dimension(380, 42));

        tfCoxaDir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfCoxaDir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCoxaDir.setEnabled(false);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Coxa");

        tfCoxaEsq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfCoxaEsq.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCoxaEsq.setEnabled(false);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(76, 76, 76)
                .addComponent(tfCoxaDir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(tfCoxaEsq, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel15)
                .addComponent(tfCoxaDir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tfCoxaEsq, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));
        jPanel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel13.setPreferredSize(new java.awt.Dimension(380, 42));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Panturrilha");

        tfPanturrilhaDir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfPanturrilhaDir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfPanturrilhaDir.setEnabled(false);

        tfPanturrilhaEsq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfPanturrilhaEsq.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfPanturrilhaEsq.setEnabled(false);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(38, 38, 38)
                .addComponent(tfPanturrilhaDir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(tfPanturrilhaEsq, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel16)
                .addComponent(tfPanturrilhaDir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tfPanturrilhaEsq, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel9.setPreferredSize(new java.awt.Dimension(380, 42));

        tfAbdomen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfAbdomen.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfAbdomen.setEnabled(false);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Abdómen");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(tfAbdomen, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel12)
                .addComponent(tfAbdomen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Esquerdo(a)");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Direito(a)");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel2)
                .addGap(83, 83, 83)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        botaoSalvarDados.setBackground(new java.awt.Color(204, 255, 204));
        botaoSalvarDados.setText("Salvar dados");
        botaoSalvarDados.setEnabled(false);
        botaoSalvarDados.setMargin(new java.awt.Insets(0, 0, 0, 0));
        botaoSalvarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarDadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelMedidas1Layout = new javax.swing.GroupLayout(painelMedidas1);
        painelMedidas1.setLayout(painelMedidas1Layout);
        painelMedidas1Layout.setHorizontalGroup(
            painelMedidas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMedidas1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelMedidas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelMedidas1Layout.createSequentialGroup()
                        .addGroup(painelMedidas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelMedidas1Layout.createSequentialGroup()
                                .addGroup(painelMedidas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoSalvarDados)))
                        .addContainerGap(14, Short.MAX_VALUE))))
        );
        painelMedidas1Layout.setVerticalGroup(
            painelMedidas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMedidas1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelMedidas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelMedidas1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botaoSalvarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelGuia.addTab("Parte 1", painelMedidas1);
        painelGuia.addTab("Parte 2", painelImc1);

        tfDataAvaliacao.setEnabled(false);

        jLabel17.setText("Data da avaliação");

        javax.swing.GroupLayout painelDataAvaliacaoLayout = new javax.swing.GroupLayout(painelDataAvaliacao);
        painelDataAvaliacao.setLayout(painelDataAvaliacaoLayout);
        painelDataAvaliacaoLayout.setHorizontalGroup(
            painelDataAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDataAvaliacaoLayout.createSequentialGroup()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfDataAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        painelDataAvaliacaoLayout.setVerticalGroup(
            painelDataAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDataAvaliacaoLayout.createSequentialGroup()
                .addGroup(painelDataAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(tfDataAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jlImagemCorpoHumano, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelGuia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(painelId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelDataAvaliacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(7, 7, 7)
                        .addComponent(painelId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(painelDataAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlImagemCorpoHumano, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelGuia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAjudaCQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAjudaCQActionPerformed
        TelaAjudaCQ tela = new TelaAjudaCQ();
        tela.setLocationRelativeTo(this);
        tela.setVisible(true);
    }//GEN-LAST:event_botaoAjudaCQActionPerformed

    private void botaoSalvarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarDadosActionPerformed
        Medidas medida = getDadosTelaMedidas();
        
        new ConexaoMedidas().addMedidas(medida);
        
    }//GEN-LAST:event_botaoSalvarDadosActionPerformed

    private void tfCinturaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCinturaKeyReleased
        if(eliminarErro(tfCintura.getText())==0 || eliminarErro(tfQuadril.getText())==0){
            tfRcq.setText(null);
            return;
        }
        String valor = String.format("%.3f",
                eliminarErro(tfCintura.getText())/eliminarErro(tfQuadril.getText()));
        
        tfRcq.setText(valor.split(",")[0]+"."+valor.split(",")[1]);
    }//GEN-LAST:event_tfCinturaKeyReleased

    private void tfQuadrilKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfQuadrilKeyReleased
        if(eliminarErro(tfCintura.getText())==0 || eliminarErro(tfQuadril.getText())==0){
            tfRcq.setText(null);
            return;
        }
        String valor = String.format("%.3f",
                eliminarErro(tfCintura.getText())/eliminarErro(tfQuadril.getText()));
        
        tfRcq.setText(valor.split(",")[0]+"."+valor.split(",")[1]);
    }//GEN-LAST:event_tfQuadrilKeyReleased

    public void setIdCliente(int id){
        jlIdCliente.setText(""+id);
        if(id==0){
            bloquearCampos();
            //Bloqueia o painelImc
            painelImc1.setIdCliente(id);
        }
        else{
            liberarCampos();
            //Libera o painelImc
            painelImc1.setIdCliente(id);
        }
    }
    
    
    private void bloquearCampos(){
        tfAbdomen.setEnabled(false);
        tfAntebracoDir.setEnabled(false);
        tfAntebracoEsq.setEnabled(false);
        tfBracContDir.setEnabled(false);
        tfBracContEsq.setEnabled(false);
        tfBracRelDir.setEnabled(false);
        tfBracRelEsq.setEnabled(false);
        tfCintura.setEnabled(false);
        tfCoxaDir.setEnabled(false);
        tfCoxaEsq.setEnabled(false);
        tfOmbro.setEnabled(false);
        tfPanturrilhaDir.setEnabled(false);
        tfPanturrilhaEsq.setEnabled(false);
        tfPescoco.setEnabled(false);
        tfQuadril.setEnabled(false);
        tfRcq.setEnabled(false);
        tfToraxIns.setEnabled(false);
        tfToraxRelx.setEnabled(false);
        botaoSalvarDados.setEnabled(false);
        tfDataAvaliacao.setEnabled(false);
    }
    
    private void liberarCampos(){
        tfAbdomen.setEnabled(true);
        tfAntebracoDir.setEnabled(true);
        tfAntebracoEsq.setEnabled(true);
        tfBracContDir.setEnabled(true);
        tfBracContEsq.setEnabled(true);
        tfBracRelDir.setEnabled(true);
        tfBracRelEsq.setEnabled(true);
        tfCintura.setEnabled(true);
        tfCoxaDir.setEnabled(true);
        tfCoxaEsq.setEnabled(true);
        tfOmbro.setEnabled(true);
        tfPanturrilhaDir.setEnabled(true);
        tfPanturrilhaEsq.setEnabled(true);
        tfPescoco.setEnabled(true);
        tfQuadril.setEnabled(true);
        tfRcq.setEnabled(true);
        tfToraxIns.setEnabled(true);
        tfToraxRelx.setEnabled(true);
        botaoSalvarDados.setEnabled(true);
        tfDataAvaliacao.setEnabled(true);
    }
    
    private void limparCampos(){
        tfAbdomen.setText(null);
        tfAntebracoDir.setText(null);
        tfAntebracoEsq.setText(null);
        tfBracContDir.setText(null);
        tfBracContEsq.setText(null);
        tfBracRelDir.setText(null);
        tfBracRelEsq.setText(null);
        tfCintura.setText(null);
        tfCoxaDir.setText(null);
        tfCoxaEsq.setText(null);
        tfOmbro.setText(null);
        tfPanturrilhaDir.setText(null);
        tfPanturrilhaEsq.setText(null);
        tfPescoco.setText(null);
        tfQuadril.setText(null);
        tfRcq.setText(null);
        tfToraxIns.setText(null);
        tfToraxRelx.setText(null);
    }
    
    private boolean validarCampos(Medidas medida){
        
        if(medida.getIdCliente()==0){
            return false;
        }
        if(medida.getAbdomen()==0){
            return false;
        }
        if(medida.getAntebracoDir()==0){
            return false;
        }
        if(medida.getAntebracoEsq()==0){
            return false;
        }
        if(medida.getBracoConDir()==0){
            return false;
        }
        if(medida.getBracoConEsq()==0){
            return false;
        }
        if(medida.getBracoRlxDir()==0){
            return false;
        }
        if(medida.getBracoRlxEsq()==0){
            return false;
        }
        if(medida.getCintura()==0){
            return false;
        }
        if(medida.getCoxaDir()==0){
            return false;
        }
        if(medida.getCoxaEsq()==0){
            return false;
        }        
        if(medida.getOmbro()==0){
            return false;
        }
        if(medida.getPanturrilhaDir()==0){
            return false;
        }
        if(medida.getPanturrilhaEsq()==0){
            return false;
        }
        if(medida.getPescoco()==0){
            return false;
        }
        if(medida.getQuadril()==0){
            return false;
        }
        if(medida.getRcq()==0){
            return false;
        }
        if(medida.getToraxInsp()==0){
            return false;
        }
        if(medida.getToraxRlx()==0){
            return false;
        }
        
        return true;
    }
    
    private Medidas getDadosTelaMedidas(){
        Medidas medida = new Medidas();
        medida.setIdCliente(eliminarErro2(jlIdCliente.getText()));
        medida.setAbdomen(eliminarErro(tfAbdomen.getText()));
        medida.setAntebracoDir(eliminarErro(tfAntebracoDir.getText()));
        medida.setAntebracoEsq(eliminarErro(tfAntebracoEsq.getText()));
        medida.setBracoConDir(eliminarErro(tfBracContDir.getText()));
        medida.setBracoConEsq(eliminarErro(tfBracContEsq.getText()));
        medida.setBracoRlxDir(eliminarErro(tfBracRelDir.getText()));
        medida.setBracoRlxEsq(eliminarErro(tfBracRelEsq.getText()));
        medida.setCintura(eliminarErro(tfCintura.getText()));
        medida.setCoxaDir(eliminarErro(tfCoxaDir.getText()));   
        medida.setCoxaEsq(eliminarErro(tfCoxaEsq.getText()));  
        medida.setOmbro(eliminarErro(tfOmbro.getText()));          
        medida.setPanturrilhaDir(eliminarErro(tfPanturrilhaDir.getText()));        
        medida.setPanturrilhaEsq(eliminarErro(tfPanturrilhaEsq.getText()));        
        medida.setPescoco(eliminarErro(tfPescoco.getText()));                       
        medida.setQuadril(eliminarErro(tfQuadril.getText()));
        medida.setRcq(eliminarErro(tfRcq.getText()));
        medida.setToraxInsp(eliminarErro(tfToraxIns.getText()));    
        medida.setToraxRlx(eliminarErro(tfToraxRelx.getText()));        
        medida.setDataMedicao(Calendar.getInstance().getTime());
        return medida;
    }        

    private double eliminarErro(String num){
        try{
            return Double.parseDouble(num);
        }catch(Exception e){
            return 0;
        }        
    }
    
    private int eliminarErro2(String num){
        try{
            return Integer.parseInt(num);
        }catch(Exception e){
            return 0;
        }        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAjudaCQ;
    private javax.swing.JButton botaoSalvarDados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jlIdCliente;
    private javax.swing.JLabel jlImagemCorpoHumano;
    private javax.swing.JLabel lID;
    private javax.swing.JPanel painelDataAvaliacao;
    private javax.swing.JTabbedPane painelGuia;
    private javax.swing.JPanel painelId;
    private view.painel.PainelImc painelImc1;
    private javax.swing.JPanel painelMedidas1;
    private javax.swing.JTextField tfAbdomen;
    private javax.swing.JTextField tfAntebracoDir;
    private javax.swing.JTextField tfAntebracoEsq;
    private javax.swing.JTextField tfBracContDir;
    private javax.swing.JTextField tfBracContEsq;
    private javax.swing.JTextField tfBracRelDir;
    private javax.swing.JTextField tfBracRelEsq;
    private javax.swing.JTextField tfCintura;
    private javax.swing.JTextField tfCoxaDir;
    private javax.swing.JTextField tfCoxaEsq;
    private com.toedter.calendar.JDateChooser tfDataAvaliacao;
    private javax.swing.JTextField tfOmbro;
    private javax.swing.JTextField tfPanturrilhaDir;
    private javax.swing.JTextField tfPanturrilhaEsq;
    private javax.swing.JTextField tfPescoco;
    private javax.swing.JTextField tfQuadril;
    private javax.swing.JTextField tfRcq;
    private javax.swing.JTextField tfToraxIns;
    private javax.swing.JTextField tfToraxRelx;
    // End of variables declaration//GEN-END:variables
}
