package view.painel;

import bancodedados.Conexao;
import hide.Cliente;
import hide.constantes.Strings;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author h4ck3r
 */
public class PainelRegistroCliente extends javax.swing.JPanel {

    /**
     * Creates new form pCadastroCliente
     */
    public PainelRegistroCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelBotoes = new javax.swing.JPanel();
        botaoNovo = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();
        botaoPesquisar = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        botaoAtualizar = new javax.swing.JButton();
        painelNome = new javax.swing.JPanel();
        jlNomeCliente = new javax.swing.JLabel();
        painelGuia = new javax.swing.JTabbedPane();
        painelDadosClientes = new javax.swing.JPanel();
        painelId = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();
        painelDataInclusao = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfDataInclusao = new javax.swing.JTextField();
        painelNome2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        painelDataNascimento = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tfDataNascimento = new javax.swing.JTextField();
        painelRg = new javax.swing.JPanel();
        tfRg = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        painelCpf = new javax.swing.JPanel();
        tfCpf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        painelEmail = new javax.swing.JPanel();
        tfEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        painelTelefone1 = new javax.swing.JPanel();
        tfTelefone1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        painelTelefone2 = new javax.swing.JPanel();
        tfTelefone2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        painelObjetivo = new javax.swing.JPanel();
        cbObjetivo = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        painelEndereco = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        tfEndereco = new javax.swing.JTextField();
        painelBairro = new javax.swing.JPanel();
        tfBairro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        painelCidade = new javax.swing.JPanel();
        tfCidade = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        painelStatus = new javax.swing.JPanel();
        cbStatus = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        painelUf = new javax.swing.JPanel();
        cbUf = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        painelSexo = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox();
        painelAdcionarMedidas1 = new view.painel.PainelAdcionarMedidas();
        jLabel17 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        painelBotoes.setBackground(new java.awt.Color(255, 255, 255));

        botaoNovo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoNovo.setText("Novo");
        botaoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoActionPerformed(evt);
            }
        });

        botaoEditar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoEditar.setText("Editar");
        botaoEditar.setEnabled(false);
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });

        botaoPesquisar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoPesquisar.setText("Pesquisar");
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });

        botaoSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoSalvar.setText("Salvar");
        botaoSalvar.setEnabled(false);
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoAtualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoAtualizar.setText("Atualizar");
        botaoAtualizar.setEnabled(false);
        botaoAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelBotoesLayout = new javax.swing.GroupLayout(painelBotoes);
        painelBotoes.setLayout(painelBotoesLayout);
        painelBotoesLayout.setHorizontalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelBotoesLayout.setVerticalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(botaoNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(botaoAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        painelNome.setBackground(new java.awt.Color(204, 255, 255));

        jlNomeCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlNomeCliente.setForeground(new java.awt.Color(255, 0, 0));
        jlNomeCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlNomeCliente.setText("Nome do cliente");

        javax.swing.GroupLayout painelNomeLayout = new javax.swing.GroupLayout(painelNome);
        painelNome.setLayout(painelNomeLayout);
        painelNomeLayout.setHorizontalGroup(
            painelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelNomeLayout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(jlNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        painelNomeLayout.setVerticalGroup(
            painelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlNomeCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelGuia.setBackground(new java.awt.Color(255, 255, 255));

        painelDadosClientes.setBackground(new java.awt.Color(255, 255, 255));

        painelId.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("ID Cliente");

        tfId.setForeground(new java.awt.Color(255, 0, 0));
        tfId.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout painelIdLayout = new javax.swing.GroupLayout(painelId);
        painelId.setLayout(painelIdLayout);
        painelIdLayout.setHorizontalGroup(
            painelIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelIdLayout.createSequentialGroup()
                .addGroup(painelIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );
        painelIdLayout.setVerticalGroup(
            painelIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelIdLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        painelDataInclusao.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Data de inclusão *");

        tfDataInclusao.setEnabled(false);

        javax.swing.GroupLayout painelDataInclusaoLayout = new javax.swing.GroupLayout(painelDataInclusao);
        painelDataInclusao.setLayout(painelDataInclusaoLayout);
        painelDataInclusaoLayout.setHorizontalGroup(
            painelDataInclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDataInclusaoLayout.createSequentialGroup()
                .addGroup(painelDataInclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(tfDataInclusao))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        painelDataInclusaoLayout.setVerticalGroup(
            painelDataInclusaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDataInclusaoLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfDataInclusao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        painelNome2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Nome do Cliente *");

        tfNome.setEnabled(false);

        javax.swing.GroupLayout painelNome2Layout = new javax.swing.GroupLayout(painelNome2);
        painelNome2.setLayout(painelNome2Layout);
        painelNome2Layout.setHorizontalGroup(
            painelNome2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3)
            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        painelNome2Layout.setVerticalGroup(
            painelNome2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNome2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        painelDataNascimento.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Data de Nascimento *");

        tfDataNascimento.setEnabled(false);

        javax.swing.GroupLayout painelDataNascimentoLayout = new javax.swing.GroupLayout(painelDataNascimento);
        painelDataNascimento.setLayout(painelDataNascimentoLayout);
        painelDataNascimentoLayout.setHorizontalGroup(
            painelDataNascimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDataNascimentoLayout.createSequentialGroup()
                .addGroup(painelDataNascimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfDataNascimento))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        painelDataNascimentoLayout.setVerticalGroup(
            painelDataNascimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDataNascimentoLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        painelRg.setBackground(new java.awt.Color(255, 255, 255));

        tfRg.setEnabled(false);

        jLabel5.setText("RG");

        javax.swing.GroupLayout painelRgLayout = new javax.swing.GroupLayout(painelRg);
        painelRg.setLayout(painelRgLayout);
        painelRgLayout.setHorizontalGroup(
            painelRgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5)
            .addComponent(tfRg, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        painelRgLayout.setVerticalGroup(
            painelRgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRgLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        painelCpf.setBackground(new java.awt.Color(255, 255, 255));

        tfCpf.setEnabled(false);

        jLabel6.setText("CPF");

        javax.swing.GroupLayout painelCpfLayout = new javax.swing.GroupLayout(painelCpf);
        painelCpf.setLayout(painelCpfLayout);
        painelCpfLayout.setHorizontalGroup(
            painelCpfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6)
            .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        painelCpfLayout.setVerticalGroup(
            painelCpfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCpfLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        painelEmail.setBackground(new java.awt.Color(255, 255, 255));

        tfEmail.setEnabled(false);

        jLabel7.setText("e-mail");

        javax.swing.GroupLayout painelEmailLayout = new javax.swing.GroupLayout(painelEmail);
        painelEmail.setLayout(painelEmailLayout);
        painelEmailLayout.setHorizontalGroup(
            painelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7)
            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        painelEmailLayout.setVerticalGroup(
            painelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEmailLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        painelTelefone1.setBackground(new java.awt.Color(255, 255, 255));

        tfTelefone1.setEnabled(false);

        jLabel8.setText("Telefone 1");

        javax.swing.GroupLayout painelTelefone1Layout = new javax.swing.GroupLayout(painelTelefone1);
        painelTelefone1.setLayout(painelTelefone1Layout);
        painelTelefone1Layout.setHorizontalGroup(
            painelTelefone1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTelefone1Layout.createSequentialGroup()
                .addGroup(painelTelefone1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(tfTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        painelTelefone1Layout.setVerticalGroup(
            painelTelefone1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTelefone1Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        painelTelefone2.setBackground(new java.awt.Color(255, 255, 255));

        tfTelefone2.setEnabled(false);

        jLabel9.setText("Telefone 2");

        javax.swing.GroupLayout painelTelefone2Layout = new javax.swing.GroupLayout(painelTelefone2);
        painelTelefone2.setLayout(painelTelefone2Layout);
        painelTelefone2Layout.setHorizontalGroup(
            painelTelefone2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9)
            .addComponent(tfTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        painelTelefone2Layout.setVerticalGroup(
            painelTelefone2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTelefone2Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        painelObjetivo.setBackground(new java.awt.Color(255, 255, 255));

        cbObjetivo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hipertrofia", "Emagrecer", "Definição Muscular", "Trabalho cardíaco" }));
        cbObjetivo.setEnabled(false);

        jLabel10.setText("Objetivo");

        javax.swing.GroupLayout painelObjetivoLayout = new javax.swing.GroupLayout(painelObjetivo);
        painelObjetivo.setLayout(painelObjetivoLayout);
        painelObjetivoLayout.setHorizontalGroup(
            painelObjetivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelObjetivoLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(painelObjetivoLayout.createSequentialGroup()
                .addComponent(cbObjetivo, 0, 130, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelObjetivoLayout.setVerticalGroup(
            painelObjetivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelObjetivoLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        painelEndereco.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setText("Endereço (Rua, Num)");

        tfEndereco.setEnabled(false);

        javax.swing.GroupLayout painelEnderecoLayout = new javax.swing.GroupLayout(painelEndereco);
        painelEndereco.setLayout(painelEnderecoLayout);
        painelEnderecoLayout.setHorizontalGroup(
            painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11)
            .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        painelEnderecoLayout.setVerticalGroup(
            painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEnderecoLayout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        painelBairro.setBackground(new java.awt.Color(255, 255, 255));

        tfBairro.setEnabled(false);

        jLabel12.setText("Bairro");

        javax.swing.GroupLayout painelBairroLayout = new javax.swing.GroupLayout(painelBairro);
        painelBairro.setLayout(painelBairroLayout);
        painelBairroLayout.setHorizontalGroup(
            painelBairroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBairroLayout.createSequentialGroup()
                .addGroup(painelBairroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        painelBairroLayout.setVerticalGroup(
            painelBairroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBairroLayout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelCidade.setBackground(new java.awt.Color(255, 255, 255));

        tfCidade.setText("Campo Maior");
        tfCidade.setEnabled(false);

        jLabel13.setText("Cidade");

        javax.swing.GroupLayout painelCidadeLayout = new javax.swing.GroupLayout(painelCidade);
        painelCidade.setLayout(painelCidadeLayout);
        painelCidadeLayout.setHorizontalGroup(
            painelCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13)
            .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        painelCidadeLayout.setVerticalGroup(
            painelCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCidadeLayout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        painelStatus.setBackground(new java.awt.Color(255, 255, 255));

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ativo", "Inativo" }));
        cbStatus.setEnabled(false);

        jLabel14.setText("Status");

        javax.swing.GroupLayout painelStatusLayout = new javax.swing.GroupLayout(painelStatus);
        painelStatus.setLayout(painelStatusLayout);
        painelStatusLayout.setHorizontalGroup(
            painelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelStatusLayout.createSequentialGroup()
                .addGroup(painelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );
        painelStatusLayout.setVerticalGroup(
            painelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelStatusLayout.createSequentialGroup()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        painelUf.setBackground(new java.awt.Color(255, 255, 255));

        cbUf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cbUf.setSelectedIndex(17);
        cbUf.setEnabled(false);

        jLabel15.setText("UF");

        javax.swing.GroupLayout painelUfLayout = new javax.swing.GroupLayout(painelUf);
        painelUf.setLayout(painelUfLayout);
        painelUfLayout.setHorizontalGroup(
            painelUfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelUfLayout.createSequentialGroup()
                .addComponent(jLabel15)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(painelUfLayout.createSequentialGroup()
                .addComponent(cbUf, 0, 60, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelUfLayout.setVerticalGroup(
            painelUfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelUfLayout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        painelSexo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setText("Sexo");

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino" }));
        cbSexo.setEnabled(false);

        javax.swing.GroupLayout painelSexoLayout = new javax.swing.GroupLayout(painelSexo);
        painelSexo.setLayout(painelSexoLayout);
        painelSexoLayout.setHorizontalGroup(
            painelSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSexoLayout.createSequentialGroup()
                .addGroup(painelSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        painelSexoLayout.setVerticalGroup(
            painelSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSexoLayout.createSequentialGroup()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout painelDadosClientesLayout = new javax.swing.GroupLayout(painelDadosClientes);
        painelDadosClientes.setLayout(painelDadosClientesLayout);
        painelDadosClientesLayout.setHorizontalGroup(
            painelDadosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosClientesLayout.createSequentialGroup()
                        .addComponent(painelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(painelBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(painelUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDadosClientesLayout.createSequentialGroup()
                        .addComponent(painelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDadosClientesLayout.createSequentialGroup()
                        .addComponent(painelId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(painelDataInclusao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelNome2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(painelDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelDadosClientesLayout.setVerticalGroup(
            painelDadosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelDataInclusao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelNome2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDadosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelDadosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(painelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(painelTelefone1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(painelTelefone2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(painelObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(painelCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDadosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelDadosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(painelSexo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(painelStatus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
        );

        painelGuia.addTab("Cliente", painelDadosClientes);
        painelGuia.addTab("Avaliação", painelAdcionarMedidas1);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sem-imagem.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelGuia, javax.swing.GroupLayout.PREFERRED_SIZE, 779, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelGuia))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botaoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoActionPerformed
        liberarCampos();
        limparCampos();
        painelGuia.setSelectedIndex(0);
        tfId.setText("(Automatico)");
        botaoNovo.setEnabled(true);
        botaoEditar.setEnabled(false);
        botaoSalvar.setEnabled(true);
        botaoPesquisar.setEnabled(true);
        botaoAtualizar.setEnabled(false);
        painelAdcionarMedidas1.setIdCliente(0);
    }//GEN-LAST:event_botaoNovoActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        if(tfNome.getText().length()<3){
            String mens = "Digite um nome válido.";
            JOptionPane.showMessageDialog(this, mens,"Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(tfDataInclusao.getText().length()<9){
            String mens = "Verifique a data de inclusão";
            JOptionPane.showMessageDialog(this, mens,"Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(tfDataNascimento.getText().length()<9){
            String mens = "Verifique a data de nascimento";
            JOptionPane.showMessageDialog(this, mens,"Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Cliente cliente = getDadosTelaCliente();
        
        if(cliente==null){
            return;
        }
        
        bloquearCampos();
        botaoSalvar.setEnabled(false);
        botaoNovo.setEnabled(true);
        botaoEditar.setEnabled(true);
        
        new Conexao().addCliente(cliente);
        JOptionPane.showMessageDialog(this, Strings.mensCadSucesso , "Sucesso", JOptionPane.OK_OPTION);
        
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        limparCampos();
        bloquearCampos();
        botaoEditar.setEnabled(false);
        botaoSalvar.setEnabled(false);
        if(eliminarErro(tfId.getText())<0){
            JOptionPane.showMessageDialog(this, "Digite um ID válido", "Erro", JOptionPane.OK_OPTION);
            return;
        }
        Cliente cliente = new Conexao().pesqIDCliente(Integer.parseInt(tfId.getText()));      
        if(cliente==null){
            jlNomeCliente.setText("Cliente não encontrado  !!!!!!!");
            painelAdcionarMedidas1.setIdCliente(0);
            return;
        }
        
        setDadosTelaCliente(cliente);
        painelAdcionarMedidas1.setIdCliente(Integer.parseInt(tfId.getText()));
        botaoEditar.setEnabled(true);
    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        liberarCampos();
        botaoNovo.setEnabled(true);
        botaoEditar.setEnabled(false);
        botaoSalvar.setEnabled(false);
        botaoPesquisar.setEnabled(true);
        botaoAtualizar.setEnabled(true);
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void botaoAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarActionPerformed
        Cliente cliente = getDadosTelaCliente();
        
        if(cliente==null){
            return;
        }
        
        Conexao conexao = new Conexao();
        cliente.setIdCliente(Integer.parseInt(tfId.getText()));
        if(conexao.pesqIDCliente(Integer.parseInt(tfId.getText()))==null){
            JOptionPane.showMessageDialog(this, "Id não existe");
            return;
        }            
        conexao.editarCliente(cliente);
        botaoNovo.setEnabled(true);
        botaoEditar.setEnabled(true);
        botaoSalvar.setEnabled(false);
        botaoPesquisar.setEnabled(true);
        botaoAtualizar.setEnabled(false);
        bloquearCampos();
        jlNomeCliente.setText(cliente.getNome());
        JOptionPane.showMessageDialog(this, Strings.mensAtuaSucesso);
    }//GEN-LAST:event_botaoAtualizarActionPerformed

    private Cliente getDadosTelaCliente(){
        Cliente cliente = new Cliente();
//        cliente.setIdCliente(Integer.parseInt(tfCodigo.getText()));
        cliente.setNome(tfNome.getText());
        try {
            cliente.setDataInclusao(dataFormat(tfDataInclusao.getText()));
            cliente.setDataNascimento(dataFormat(tfDataNascimento.getText()));
        } catch (ParseException ex) {
            System.out.println("Erro na funcao getDadosTelaCliente.PainelCadastroCliente:"+ex);
            String[]erro = ex.toString().split(":");
            JOptionPane.showMessageDialog(this, "Formato desconhecido : "+erro[2]);
            return null;
        }
        
        cliente.setRg(tfRg.getText());
        cliente.setCpf(tfCpf.getText());
        cliente.setEmail(tfEmail.getText());
        cliente.setTelefone1(tfTelefone1.getText());
        cliente.setTelefone2(tfTelefone2.getText());
        cliente.setObjetivo(cbObjetivo.getSelectedItem().toString());
        cliente.setEndereco(tfEndereco.getText());
        cliente.setBairro(tfBairro.getText());
        cliente.setCidade(tfCidade.getText());
        cliente.setUf(cbUf.getSelectedItem().toString());
        cliente.setStatus(cbStatus.getSelectedItem().toString());
        cliente.setSexo(cbSexo.getSelectedItem().toString());
        return cliente;
    }
    
    private void setDadosTelaCliente(Cliente cliente){
        jlNomeCliente.setText(cliente.getNome());
        tfNome.setText(cliente.getNome());
        tfDataInclusao.setText(dataImprimir(cliente.getDataInclusao()));
        tfDataNascimento.setText(dataImprimir(cliente.getDataNascimento()));
        tfRg.setText(cliente.getRg());
        tfEmail.setText(cliente.getEmail());
        tfTelefone1.setText(cliente.getTelefone1());
        tfTelefone2.setText(cliente.getTelefone2());
        cbObjetivo.setSelectedItem(cliente.getObjetivo());
        tfCpf.setText(cliente.getCpf());
        tfEndereco.setText(cliente.getEndereco());
        tfBairro.setText(cliente.getBairro());
        tfCidade.setText(cliente.getCidade());
        cbUf.setSelectedItem(cliente.getUf());
        cbStatus.setSelectedItem(cliente.getStatus());
        cbSexo.setSelectedItem(cliente.getSexo());
    }
    
    private Date dataFormat(String dataString) throws ParseException{
        DateFormat f = DateFormat.getDateInstance();
        Date data =  f.parse(dataString);
        return data;
    }
    
    private String dataImprimir(Date data){
        Calendar a = Calendar.getInstance();
        a.set(Calendar.DAY_OF_MONTH, data.getDate());
        a.set(Calendar.MONTH, data.getMonth());
        a.set(Calendar.YEAR, data.getYear()+1900); 
        
        return String.format("%d/%d/%d",a.get(Calendar.DAY_OF_MONTH), 
                a.get(Calendar.MONTH)+1, a.get(Calendar.YEAR));
    }
    
    private String dataFormatSql(Date data){
        Calendar a = Calendar.getInstance();
        a.set(Calendar.DAY_OF_MONTH, data.getDate());
        a.set(Calendar.MONTH, data.getMonth());
        a.set(Calendar.YEAR, data.getYear()+1900); 
        
        return String.format("%d-%d-%d", a.get(Calendar.YEAR), a.get(Calendar.MONTH)+1,
                a.get(Calendar.DAY_OF_MONTH));
    }
    
    private void limparCampos(){
        tfNome.setText(null);
        tfDataInclusao.setText(null);
        tfDataNascimento.setText(null);
        tfRg.setText(null);
        tfEmail.setText(null);
        tfTelefone1.setText(null);
        tfTelefone2.setText(null);
        tfCpf.setText(null);
        tfEndereco.setText(null);
        tfBairro.setText(null);
        tfCidade.setText("Campo Maior");
        cbStatus.setSelectedItem("Ativo");
    }
    
    private void liberarCampos(){
        tfNome.setEnabled(true);
        tfDataInclusao.setEnabled(true);
        tfDataNascimento.setEnabled(true);
        tfRg.setEnabled(true);
        tfEmail.setEnabled(true);
        tfTelefone1.setEnabled(true);
        tfTelefone2.setEnabled(true);
        tfCpf.setEnabled(true);
        tfEndereco.setEnabled(true);
        tfBairro.setEnabled(true);
        tfCidade.setEnabled(true);
        cbObjetivo.setEnabled(true);
        cbUf.setEnabled(true);
        cbStatus.setEnabled(true);
        cbSexo.setEnabled(true);
    }
    
    private void bloquearCampos(){
        tfNome.setEnabled(false);
        tfDataInclusao.setEnabled(false);
        tfDataNascimento.setEnabled(false);
        tfRg.setEnabled(false);
        tfEmail.setEnabled(false);
        tfTelefone1.setEnabled(false);
        tfTelefone2.setEnabled(false);
        tfCpf.setEnabled(false);
        tfEndereco.setEnabled(false);
        tfBairro.setEnabled(false);
        tfCidade.setEnabled(false);
        cbObjetivo.setEnabled(false);
        cbUf.setEnabled(false);
        cbStatus.setEnabled(false);
        cbSexo.setEnabled(false);
    }
    
    private int eliminarErro(String num){
        try{            
            return Integer.parseInt(num);
        }catch(Exception e){
            return -1;
        }        
        
    }
    
    private void liberarAvaliacao(boolean liberar){
        painelAdcionarMedidas1.setEnabled(liberar);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAtualizar;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoNovo;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JComboBox cbObjetivo;
    private javax.swing.JComboBox cbSexo;
    private javax.swing.JComboBox cbStatus;
    private javax.swing.JComboBox cbUf;
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
    private javax.swing.JLabel jlNomeCliente;
    private view.painel.PainelAdcionarMedidas painelAdcionarMedidas1;
    private javax.swing.JPanel painelBairro;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelCidade;
    private javax.swing.JPanel painelCpf;
    private javax.swing.JPanel painelDadosClientes;
    private javax.swing.JPanel painelDataInclusao;
    private javax.swing.JPanel painelDataNascimento;
    private javax.swing.JPanel painelEmail;
    private javax.swing.JPanel painelEndereco;
    private javax.swing.JTabbedPane painelGuia;
    private javax.swing.JPanel painelId;
    private javax.swing.JPanel painelNome;
    private javax.swing.JPanel painelNome2;
    private javax.swing.JPanel painelObjetivo;
    private javax.swing.JPanel painelRg;
    private javax.swing.JPanel painelSexo;
    private javax.swing.JPanel painelStatus;
    private javax.swing.JPanel painelTelefone1;
    private javax.swing.JPanel painelTelefone2;
    private javax.swing.JPanel painelUf;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JTextField tfDataInclusao;
    private javax.swing.JTextField tfDataNascimento;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfRg;
    private javax.swing.JTextField tfTelefone1;
    private javax.swing.JTextField tfTelefone2;
    // End of variables declaration//GEN-END:variables
}
