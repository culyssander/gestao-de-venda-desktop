/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culysoft.gestaovenda.view.formulario;

import com.culysoft.gestaovenda.modelo.controller.CategoriaController;
import com.culysoft.gestaovenda.modelo.controller.ClienteController;
import com.culysoft.gestaovenda.modelo.controller.DashboardController;
import com.culysoft.gestaovenda.modelo.controller.ProdutoController;
import com.culysoft.gestaovenda.modelo.controller.UsuarioController;
import com.culysoft.gestaovenda.modelo.controller.VendaController;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author quitumba
 */
public class Dashboard extends javax.swing.JFrame {

    private DashboardController dashboardController;
    private CategoriaController categoriaController;
    private ProdutoController produtoController;
    private UsuarioController usuarioController;
    private VendaController vendaController;
    private ClienteController clienteController;
    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        setLocationRelativeTo(null);
        this.dashboardController = new DashboardController(this);
        this.categoriaController = new CategoriaController(this);
        this.usuarioController = new UsuarioController(this);
        this.produtoController = new ProdutoController(this);
        this.vendaController = new VendaController(this);
        this.clienteController = new ClienteController(this);
        eventosDashboard();
        eventoUsuario();
        eventoProduto();
        eventoCategoria();
        eventoVenda();
        eventoCliente();
    }
    
    
    private void eventosDashboard() {
        botaoDashboardProdutos.addActionListener(dashboardController);
        botaoDashboardClientes.addActionListener(dashboardController);
        botaoDashboardHome.addActionListener(dashboardController);
        botaoDashboardVendas.addActionListener(dashboardController);
        botaoDashboardUsuario.addActionListener(dashboardController);
        botaoDashboardSair.addActionListener(dashboardController);
    }
    
    private void eventoUsuario() {
        botaoUsuarioAdicionar.addActionListener(usuarioController);
        botaoUsuarioEditar.addActionListener(usuarioController);
        botaoUsuarioApagar.addActionListener(usuarioController);
        botaoUsuarioSalvar.addActionListener(usuarioController);
        botaoUsuarioCancelar.addActionListener(usuarioController);
        tabelaUsuario.addMouseListener(usuarioController);
        txtUsuarioPesquisar.addKeyListener(usuarioController);
    }
    
    private void eventoProduto() {
        botaoProdutoAdicionar.addActionListener(produtoController);
        botaoProdutoAdicionarCategoria.addActionListener(produtoController);
        botaoProdutoSalvar.addActionListener(produtoController);
        botaoProdutoCancelar.addActionListener(produtoController);
        botaoProdutoEditar.addActionListener(produtoController);
        botaoProdutoApagar.addActionListener(produtoController);
        tabelaProduto.addMouseListener(produtoController);
        txtProdutoPesquisar.addKeyListener(produtoController);
    }
    
    private void eventoVenda() {
        botaoVendaAdicionar.addActionListener(vendaController);
        botaoVendaCancelar.addActionListener(vendaController);
        botaoVendaLimpar.addActionListener(vendaController);
        botaoVendaRegistroRemover.addActionListener(vendaController);
        botaoVendaResgistroAdicionar.addActionListener(vendaController);
        botaoVendaVender.addActionListener(vendaController);
        botaoVendaDetalhes.addActionListener(vendaController);
        
        comboBoxVendaProduto.addActionListener(vendaController);
        comboBoxVendaPesquisarProdutoPelaCategoria.addActionListener(vendaController);
        txtVendaPesquisarProduto.addKeyListener(vendaController);
        tabelaVendRegistro.addMouseListener(vendaController);
        tabelaVenda.addMouseListener(vendaController);
        checkboxVendaDesconto.addActionListener(vendaController);
    }
    
    private void eventoCategoria() {
       botaoCategoriaApagar.addActionListener(categoriaController);
       botaoCategoriaLimpar.addActionListener(categoriaController);
       botaoCategoriaSalvar.addActionListener(categoriaController);
       botaoCategoriaCancelar.addActionListener(categoriaController);
       tabelaCategoria.addMouseListener(categoriaController);
    }
    
    private void eventoCliente() {
        botaoClienteAdicionar.addActionListener(clienteController);        
        botaoClienteCancelar.addActionListener(clienteController);
        botaoClienteApagar.addActionListener(clienteController);
        botaoClienteEditar.addActionListener(clienteController);
        botaoClienteSalvar.addActionListener(clienteController);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogUsuario = new javax.swing.JDialog();
        jPanel13 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        botaoUsuarioCancelar = new javax.swing.JButton();
        botaoUsuarioSalvar = new javax.swing.JButton();
        txtUsuarioId = new javax.swing.JTextField();
        txtUsuarioNome = new javax.swing.JTextField();
        txtUsuarioUsername = new javax.swing.JTextField();
        comboBoxUsuarioPerfil = new javax.swing.JComboBox<>();
        radioBotaoUsuarioActivo = new javax.swing.JRadioButton();
        radioBotaoUsuarioDesativo = new javax.swing.JRadioButton();
        txtUsuarioSenha = new javax.swing.JPasswordField();
        labelUsuarioMensagem = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        labelUsuarioLogadoId = new javax.swing.JLabel();
        dialogProduto = new javax.swing.JDialog();
        jPanel21 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        botaoProdutoCancelar = new javax.swing.JButton();
        botaoProdutoSalvar = new javax.swing.JButton();
        txtProdutoId = new javax.swing.JTextField();
        txtProdutoNome = new javax.swing.JTextField();
        txtProdutoPreco = new javax.swing.JTextField();
        comboBoxProdutoCategoria = new javax.swing.JComboBox<>();
        labelProdutoMensagem = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtProdutoDescricao = new javax.swing.JTextArea();
        botaoProdutoAdicionarCategoria = new javax.swing.JButton();
        txtProdutoQuantidade = new javax.swing.JSpinner();
        dialogCategoria = new javax.swing.JDialog();
        jPanel22 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        botaoCategoriaCancelar = new javax.swing.JButton();
        botaoCategoriaSalvar = new javax.swing.JButton();
        txtCategoriaId = new javax.swing.JTextField();
        txtCategoriaNome = new javax.swing.JTextField();
        labelCategoriaMensagem = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtCategoriaDescricao = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaCategoria = new javax.swing.JTable();
        botaoCategoriaApagar = new javax.swing.JButton();
        botaoCategoriaLimpar = new javax.swing.JButton();
        dialogVenda = new javax.swing.JDialog();
        jPanel23 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        botaoVendaCancelar = new javax.swing.JButton();
        botaoVendaVender = new javax.swing.JButton();
        txtVendaId = new javax.swing.JTextField();
        txtVendaPesquisarProduto = new javax.swing.JTextField();
        txtVendaValorPago = new javax.swing.JTextField();
        comboBoxVendaPesquisarProdutoPelaCategoria = new javax.swing.JComboBox<>();
        labelVendaMensagem = new javax.swing.JLabel();
        botaoVendaResgistroAdicionar = new javax.swing.JButton();
        txtVendaQuantidade = new javax.swing.JSpinner();
        jLabel22 = new javax.swing.JLabel();
        comboBoxVendaProduto = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        botaoVendaRegistroRemover = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        txtVendaDesconto = new javax.swing.JTextField();
        checkboxVendaDesconto = new javax.swing.JCheckBox();
        jSeparator6 = new javax.swing.JSeparator();
        labelVendaTotalDaVenda = new javax.swing.JLabel();
        labelVendaValorPago = new javax.swing.JLabel();
        labelVendaDesconto = new javax.swing.JLabel();
        labelVendaTroco = new javax.swing.JLabel();
        labelVendaPrecoDoProduto = new javax.swing.JLabel();
        labelVendaQuantidadeDoProduto = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        labelVendaNomeDoProduto = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        txtVendaCliente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tabelaVendRegistro = new javax.swing.JTable();
        botaoVendaLimpar = new javax.swing.JButton();
        dialogCliente = new javax.swing.JDialog();
        jPanel14 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        botaoClienteCancelar = new javax.swing.JButton();
        botaoClienteSalvar = new javax.swing.JButton();
        txtClienteId = new javax.swing.JTextField();
        txtClienteNome = new javax.swing.JTextField();
        txtClienteEndereco = new javax.swing.JTextField();
        labelClienteMensagem = new javax.swing.JLabel();
        txtClienteTelefone = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel0 = new javax.swing.JPanel();
        botaoDashboardHome = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        botaoDashboardProdutos = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        botaoDashboardClientes = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        botaoDashboardVendas = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        botaoDashboardSair = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        botaoDashboardUsuario = new javax.swing.JButton();
        panelBody = new javax.swing.JPanel();
        panelHome = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labelHomeProduto = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        labelHomeCliente = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        labelHomeVenda = new javax.swing.JLabel();
        labelDashboardBemvidoUsuario = new javax.swing.JLabel();
        panelProduto = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        botaoProdutoAdicionar = new javax.swing.JButton();
        botaoProdutoEditar = new javax.swing.JButton();
        botaoProdutoApagar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProduto = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtProdutoPesquisar = new javax.swing.JTextField();
        labelP = new javax.swing.JLabel();
        panelCliente = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        botaoClienteAdicionar = new javax.swing.JButton();
        botaoClienteEditar = new javax.swing.JButton();
        botaoClienteApagar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        panelVendas = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        botaoVendaAdicionar = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        botaoVendaDetalhes = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabelaVenda = new javax.swing.JTable();
        jPanel20 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        panelUsuarios = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        botaoUsuarioAdicionar = new javax.swing.JButton();
        botaoUsuarioEditar = new javax.swing.JButton();
        botaoUsuarioApagar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaUsuario = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtUsuarioPesquisar = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        dialogUsuario.setTitle("Registro de usuarios");

        jPanel13.setBackground(java.awt.Color.white);

        jLabel9.setBackground(java.awt.Color.white);
        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("REGISTRO DE USUARIO");
        jLabel9.setOpaque(true);

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel10.setText("Id:");

        jLabel11.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel11.setText("Nome:");

        jLabel18.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel18.setText("Username");

        jLabel19.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel19.setText("Senha:");

        jLabel20.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel20.setText("Perfil:");

        jLabel21.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel21.setText("Estado");

        botaoUsuarioCancelar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoUsuarioCancelar.setText("Cancelar");

        botaoUsuarioSalvar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoUsuarioSalvar.setText("Salvar");

        txtUsuarioId.setEditable(false);
        txtUsuarioId.setText("0");

        comboBoxUsuarioPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonGroup1.add(radioBotaoUsuarioActivo);
        radioBotaoUsuarioActivo.setText("Activo");
        radioBotaoUsuarioActivo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        buttonGroup1.add(radioBotaoUsuarioDesativo);
        radioBotaoUsuarioDesativo.setText("Desativo");

        labelUsuarioMensagem.setBackground(java.awt.Color.white);
        labelUsuarioMensagem.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        labelUsuarioMensagem.setForeground(java.awt.Color.white);
        labelUsuarioMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUsuarioMensagem.setText("OLA");
        labelUsuarioMensagem.setOpaque(true);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(botaoUsuarioSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoUsuarioCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel21)
                                .addComponent(jLabel20)
                                .addComponent(jLabel19)
                                .addComponent(jLabel18)
                                .addComponent(jLabel11)
                                .addComponent(jLabel10))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtUsuarioId)
                                .addComponent(txtUsuarioNome)
                                .addComponent(txtUsuarioUsername)
                                .addComponent(comboBoxUsuarioPerfil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel13Layout.createSequentialGroup()
                                    .addComponent(radioBotaoUsuarioActivo)
                                    .addGap(34, 34, 34)
                                    .addComponent(radioBotaoUsuarioDesativo)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(txtUsuarioSenha)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(98, Short.MAX_VALUE))
            .addComponent(labelUsuarioMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(labelUsuarioMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtUsuarioId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtUsuarioNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtUsuarioUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtUsuarioSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(comboBoxUsuarioPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioBotaoUsuarioActivo)
                        .addComponent(radioBotaoUsuarioDesativo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoUsuarioCancelar)
                    .addComponent(botaoUsuarioSalvar))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dialogUsuarioLayout = new javax.swing.GroupLayout(dialogUsuario.getContentPane());
        dialogUsuario.getContentPane().setLayout(dialogUsuarioLayout);
        dialogUsuarioLayout.setHorizontalGroup(
            dialogUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialogUsuarioLayout.setVerticalGroup(
            dialogUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        labelUsuarioLogadoId.setText("0");

        dialogProduto.setTitle("Registro de produtos");

        jPanel21.setBackground(java.awt.Color.white);

        jLabel30.setBackground(java.awt.Color.white);
        jLabel30.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("REGISTRO DE PRODUTO");
        jLabel30.setOpaque(true);

        jLabel31.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel31.setText("Id:");

        jLabel32.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel32.setText("Nome:");

        jLabel33.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel33.setText("Preço:");

        jLabel34.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel34.setText("Quantidade:");

        jLabel35.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel35.setText("Categoria:");

        jLabel36.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel36.setText("Descrição:");

        botaoProdutoCancelar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoProdutoCancelar.setText("Cancelar");

        botaoProdutoSalvar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoProdutoSalvar.setText("Salvar");

        txtProdutoId.setEditable(false);
        txtProdutoId.setText("0");

        txtProdutoPreco.setText("1");

        comboBoxProdutoCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxProdutoCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxProdutoCategoriaActionPerformed(evt);
            }
        });

        labelProdutoMensagem.setBackground(java.awt.Color.white);
        labelProdutoMensagem.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        labelProdutoMensagem.setForeground(java.awt.Color.white);
        labelProdutoMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelProdutoMensagem.setText("OLA");
        labelProdutoMensagem.setOpaque(true);

        txtProdutoDescricao.setColumns(20);
        txtProdutoDescricao.setRows(5);
        jScrollPane6.setViewportView(txtProdutoDescricao);

        botaoProdutoAdicionarCategoria.setIcon(new javax.swing.ImageIcon("/home/quitumba/NetBeansProjects/gestao-venda/src/main/java/com/culysoft/gestaovenda/view/imagens/add_16px_1160351_easyicon.net.png")); // NOI18N
        botaoProdutoAdicionarCategoria.setActionCommand("adicionarcategoria");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(botaoProdutoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoProdutoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel21Layout.createSequentialGroup()
                            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel36)
                                .addComponent(jLabel35)
                                .addComponent(jLabel34)
                                .addComponent(jLabel33)
                                .addComponent(jLabel32)
                                .addComponent(jLabel31))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtProdutoId)
                                .addComponent(txtProdutoNome)
                                .addComponent(txtProdutoPreco)
                                .addComponent(jScrollPane6)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                                    .addComponent(comboBoxProdutoCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(0, 0, 0)
                                    .addComponent(botaoProdutoAdicionarCategoria))
                                .addComponent(txtProdutoQuantidade)))
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(98, Short.MAX_VALUE))
            .addComponent(labelProdutoMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(labelProdutoMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txtProdutoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txtProdutoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txtProdutoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(txtProdutoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(comboBoxProdutoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoProdutoAdicionarCategoria))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoProdutoCancelar)
                    .addComponent(botaoProdutoSalvar))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dialogProdutoLayout = new javax.swing.GroupLayout(dialogProduto.getContentPane());
        dialogProduto.getContentPane().setLayout(dialogProdutoLayout);
        dialogProdutoLayout.setHorizontalGroup(
            dialogProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialogProdutoLayout.setVerticalGroup(
            dialogProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogProdutoLayout.createSequentialGroup()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        dialogCategoria.setTitle("Registro de categorias");

        jPanel22.setBackground(java.awt.Color.white);

        jLabel37.setBackground(java.awt.Color.white);
        jLabel37.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("REGISTRO DE CATEGORIA");
        jLabel37.setOpaque(true);

        jLabel38.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel38.setText("Id:");

        jLabel39.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel39.setText("Nome:");

        jLabel43.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel43.setText("Descrição:");

        botaoCategoriaCancelar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoCategoriaCancelar.setText("Cancelar");

        botaoCategoriaSalvar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoCategoriaSalvar.setText("Salvar");

        txtCategoriaId.setEditable(false);
        txtCategoriaId.setText("0");

        labelCategoriaMensagem.setBackground(java.awt.Color.white);
        labelCategoriaMensagem.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        labelCategoriaMensagem.setForeground(java.awt.Color.white);
        labelCategoriaMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCategoriaMensagem.setText("OLA");
        labelCategoriaMensagem.setOpaque(true);

        txtCategoriaDescricao.setColumns(20);
        txtCategoriaDescricao.setRows(5);
        jScrollPane7.setViewportView(txtCategoriaDescricao);

        tabelaCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabelaCategoria);

        botaoCategoriaApagar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoCategoriaApagar.setText("Apagar");

        botaoCategoriaLimpar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoCategoriaLimpar.setText("Limpar");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelCategoriaMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(botaoCategoriaLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoCategoriaApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoCategoriaSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoCategoriaCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel22Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel43)
                            .addComponent(jLabel39)
                            .addComponent(jLabel38))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCategoriaId)
                            .addComponent(txtCategoriaNome)
                            .addComponent(jScrollPane7)))
                    .addComponent(jSeparator4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(labelCategoriaMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(txtCategoriaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(txtCategoriaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoCategoriaCancelar)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoCategoriaSalvar)
                        .addComponent(botaoCategoriaApagar)
                        .addComponent(botaoCategoriaLimpar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dialogCategoriaLayout = new javax.swing.GroupLayout(dialogCategoria.getContentPane());
        dialogCategoria.getContentPane().setLayout(dialogCategoriaLayout);
        dialogCategoriaLayout.setHorizontalGroup(
            dialogCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogCategoriaLayout.createSequentialGroup()
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        dialogCategoriaLayout.setVerticalGroup(
            dialogCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogCategoriaLayout.createSequentialGroup()
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        dialogVenda.setTitle("Registro de vendas");

        jPanel23.setBackground(java.awt.Color.white);

        jLabel40.setBackground(java.awt.Color.white);
        jLabel40.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("REGISTRO DE VENDAS");
        jLabel40.setOpaque(true);

        jLabel41.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel41.setText("Id:");

        jLabel42.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel42.setText("Pesquisar produto:");

        jLabel44.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel44.setText("Valor pago:");

        jLabel45.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel45.setText("Quantidade:");

        jLabel46.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel46.setText("Categoria:");

        botaoVendaCancelar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoVendaCancelar.setText("Cancelar");

        botaoVendaVender.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoVendaVender.setText("Vender");

        txtVendaId.setEditable(false);
        txtVendaId.setText("0");

        comboBoxVendaPesquisarProdutoPelaCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxVendaPesquisarProdutoPelaCategoria.setActionCommand("comboboxVendaCategoria");
        comboBoxVendaPesquisarProdutoPelaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxVendaPesquisarProdutoPelaCategoriaActionPerformed(evt);
            }
        });

        labelVendaMensagem.setBackground(java.awt.Color.white);
        labelVendaMensagem.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        labelVendaMensagem.setForeground(java.awt.Color.white);
        labelVendaMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVendaMensagem.setText("OLA");
        labelVendaMensagem.setOpaque(true);

        botaoVendaResgistroAdicionar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoVendaResgistroAdicionar.setText("Adiconar");
        botaoVendaResgistroAdicionar.setActionCommand("adicionarnocesto");

        txtVendaQuantidade.setValue(Integer.valueOf("1")
        );

        jLabel22.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel22.setText("Produto:");

        comboBoxVendaProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxVendaProduto.setActionCommand("comboboxvendaproduto");

        jLabel23.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel23.setText("Preço:");

        jLabel24.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel24.setText("Quantidade disponivel:");

        jLabel25.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel25.setText("Total da Venda:");

        jLabel26.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel26.setText("Valor pago:");

        jLabel27.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel27.setText("Desconto:");

        jLabel28.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel28.setText("Troco:");

        botaoVendaRegistroRemover.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoVendaRegistroRemover.setText("Remover");

        jLabel29.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel29.setText("Desconto:");

        txtVendaDesconto.setEditable(false);
        txtVendaDesconto.setText("0");
        txtVendaDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVendaDescontoActionPerformed(evt);
            }
        });

        checkboxVendaDesconto.setActionCommand("checkboxvendadesconto");

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        labelVendaTotalDaVenda.setText("0.00");

        labelVendaValorPago.setText("0.00");

        labelVendaDesconto.setText("0.00");

        labelVendaTroco.setText("0.00");

        labelVendaPrecoDoProduto.setText("0,00");

        labelVendaQuantidadeDoProduto.setText("0");

        jLabel47.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel47.setText("Nome do produto:");

        jLabel53.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel53.setText("Buscar cliente:");

        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton1.setText("Limpar");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator5)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel23Layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoVendaResgistroAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoVendaRegistroRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoVendaVender, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(botaoVendaCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel23Layout.createSequentialGroup()
                                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel44)
                                            .addComponent(jLabel41)
                                            .addComponent(jLabel46)
                                            .addComponent(jLabel45)
                                            .addComponent(jLabel29)
                                            .addComponent(jLabel42)
                                            .addComponent(jLabel53))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel23Layout.createSequentialGroup()
                                                .addComponent(jLabel47)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(labelVendaNomeDoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(txtVendaId)
                                            .addComponent(txtVendaPesquisarProduto)
                                            .addComponent(txtVendaValorPago)
                                            .addGroup(jPanel23Layout.createSequentialGroup()
                                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel23Layout.createSequentialGroup()
                                                        .addComponent(comboBoxVendaPesquisarProdutoPelaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel22))
                                                    .addGroup(jPanel23Layout.createSequentialGroup()
                                                        .addComponent(jLabel23)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(labelVendaPrecoDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel23Layout.createSequentialGroup()
                                                        .addComponent(jLabel24)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(labelVendaQuantidadeDoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addComponent(comboBoxVendaProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addComponent(txtVendaQuantidade)
                                            .addGroup(jPanel23Layout.createSequentialGroup()
                                                .addComponent(txtVendaDesconto)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(checkboxVendaDesconto))
                                            .addGroup(jPanel23Layout.createSequentialGroup()
                                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel25)
                                                    .addComponent(jLabel26)
                                                    .addComponent(jLabel27)
                                                    .addComponent(jLabel28))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(labelVendaTotalDaVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(labelVendaValorPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(labelVendaDesconto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(labelVendaTroco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addComponent(jSeparator2)
                                            .addComponent(txtVendaCliente))))))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelVendaMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(labelVendaMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(txtVendaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(txtVendaPesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(comboBoxVendaPesquisarProdutoPelaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(comboBoxVendaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel24)
                    .addComponent(jLabel23)
                    .addComponent(labelVendaQuantidadeDoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelVendaPrecoDoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(labelVendaNomeDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(txtVendaQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkboxVendaDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel29)
                        .addComponent(txtVendaDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVendaValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(txtVendaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelVendaTotalDaVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel26)
                    .addComponent(labelVendaValorPago, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(labelVendaDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(labelVendaTroco))
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoVendaCancelar)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoVendaVender)
                        .addComponent(botaoVendaResgistroAdicionar)
                        .addComponent(botaoVendaRegistroRemover)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jSeparator6))
        );

        jPanel24.setBackground(java.awt.Color.white);

        tabelaVendRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(tabelaVendRegistro);

        botaoVendaLimpar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoVendaLimpar.setText("Limpar");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoVendaLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8)
                .addGap(18, 18, 18)
                .addComponent(botaoVendaLimpar)
                .addContainerGap())
        );

        javax.swing.GroupLayout dialogVendaLayout = new javax.swing.GroupLayout(dialogVenda.getContentPane());
        dialogVenda.getContentPane().setLayout(dialogVendaLayout);
        dialogVendaLayout.setHorizontalGroup(
            dialogVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogVendaLayout.createSequentialGroup()
                .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        dialogVendaLayout.setVerticalGroup(
            dialogVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogVendaLayout.createSequentialGroup()
                .addGroup(dialogVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        dialogCliente.setTitle("Registro de clientes");

        jPanel14.setBackground(java.awt.Color.white);

        jLabel48.setBackground(java.awt.Color.white);
        jLabel48.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("REGISTRO DE CLIENTE");
        jLabel48.setOpaque(true);

        jLabel49.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel49.setText("Id:");

        jLabel50.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel50.setText("Nome:");

        jLabel51.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel51.setText("Telefone:");

        jLabel52.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel52.setText("Endereço:");

        botaoClienteCancelar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoClienteCancelar.setText("Cancelar");

        botaoClienteSalvar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoClienteSalvar.setText("Salvar");

        txtClienteId.setEditable(false);
        txtClienteId.setText("0");

        labelClienteMensagem.setBackground(java.awt.Color.white);
        labelClienteMensagem.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        labelClienteMensagem.setForeground(java.awt.Color.white);
        labelClienteMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelClienteMensagem.setText("OLA");
        labelClienteMensagem.setOpaque(true);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(botaoClienteSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoClienteCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel14Layout.createSequentialGroup()
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel52)
                                .addComponent(jLabel51)
                                .addComponent(jLabel50)
                                .addComponent(jLabel49))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtClienteId)
                                .addComponent(txtClienteNome)
                                .addComponent(txtClienteEndereco)
                                .addComponent(txtClienteTelefone)))
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(98, Short.MAX_VALUE))
            .addComponent(labelClienteMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(labelClienteMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(txtClienteId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(txtClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(txtClienteTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel52)
                    .addComponent(txtClienteEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoClienteCancelar)
                    .addComponent(botaoClienteSalvar))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dialogClienteLayout = new javax.swing.GroupLayout(dialogCliente.getContentPane());
        dialogCliente.getContentPane().setLayout(dialogClienteLayout);
        dialogClienteLayout.setHorizontalGroup(
            dialogClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialogClienteLayout.setVerticalGroup(
            dialogClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de gestao de vendas - Culysoft");
        setBackground(java.awt.Color.white);

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/quitumba/NetBeansProjects/gestao-venda/src/main/java/com/culysoft/gestaovenda/view/imagens/culysoft0.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel0.setBackground(java.awt.Color.white);

        botaoDashboardHome.setBackground(java.awt.Color.white);
        botaoDashboardHome.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoDashboardHome.setIcon(new javax.swing.ImageIcon("/home/quitumba/NetBeansProjects/gestao-venda/src/main/java/com/culysoft/gestaovenda/view/imagens/home32.png")); // NOI18N
        botaoDashboardHome.setText("Home");
        botaoDashboardHome.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                botaoDashboardHomeMouseDragged(evt);
            }
        });
        botaoDashboardHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDashboardHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel0Layout = new javax.swing.GroupLayout(jPanel0);
        jPanel0.setLayout(jPanel0Layout);
        jPanel0Layout.setHorizontalGroup(
            jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botaoDashboardHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel0Layout.setVerticalGroup(
            jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botaoDashboardHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        jPanel4.setBackground(java.awt.Color.white);

        botaoDashboardProdutos.setBackground(java.awt.Color.white);
        botaoDashboardProdutos.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoDashboardProdutos.setIcon(new javax.swing.ImageIcon("/home/quitumba/NetBeansProjects/gestao-venda/src/main/java/com/culysoft/gestaovenda/view/imagens/2013070906515354_easyicon_net_32.png")); // NOI18N
        botaoDashboardProdutos.setText("Produtos");
        botaoDashboardProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDashboardProdutosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botaoDashboardProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botaoDashboardProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        jPanel8.setBackground(java.awt.Color.white);

        botaoDashboardClientes.setBackground(java.awt.Color.white);
        botaoDashboardClientes.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoDashboardClientes.setIcon(new javax.swing.ImageIcon("/home/quitumba/NetBeansProjects/gestao-venda/src/main/java/com/culysoft/gestaovenda/view/imagens/client_male_man_person_user_32px_132_easyicon.net.png")); // NOI18N
        botaoDashboardClientes.setText("Clientes");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botaoDashboardClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botaoDashboardClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        jPanel9.setBackground(java.awt.Color.white);

        botaoDashboardVendas.setBackground(java.awt.Color.white);
        botaoDashboardVendas.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoDashboardVendas.setIcon(new javax.swing.ImageIcon("/home/quitumba/NetBeansProjects/gestao-venda/src/main/java/com/culysoft/gestaovenda/view/imagens/pie_chart_32px_1082628_easyicon.net.png")); // NOI18N
        botaoDashboardVendas.setText("Vendas");
        botaoDashboardVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDashboardVendasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botaoDashboardVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botaoDashboardVendas, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        jPanel7.setBackground(java.awt.Color.white);

        botaoDashboardSair.setBackground(java.awt.Color.white);
        botaoDashboardSair.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoDashboardSair.setIcon(new javax.swing.ImageIcon("/home/quitumba/NetBeansProjects/gestao-venda/src/main/java/com/culysoft/gestaovenda/view/imagens/20130709071127978_easyicon_net_32.png")); // NOI18N
        botaoDashboardSair.setText("Sair");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botaoDashboardSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botaoDashboardSair, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel6.setBackground(java.awt.Color.white);

        botaoDashboardUsuario.setBackground(java.awt.Color.white);
        botaoDashboardUsuario.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoDashboardUsuario.setIcon(new javax.swing.ImageIcon("/home/quitumba/NetBeansProjects/gestao-venda/src/main/java/com/culysoft/gestaovenda/view/imagens/user_32px_1134054_easyicon.net.png")); // NOI18N
        botaoDashboardUsuario.setText("Usuarios");
        botaoDashboardUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDashboardUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botaoDashboardUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(botaoDashboardUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelBody.setBackground(java.awt.Color.white);
        panelBody.setLayout(new java.awt.CardLayout());

        panelHome.setBackground(java.awt.Color.white);
        panelHome.setPreferredSize(new java.awt.Dimension(728, 595));

        jPanel5.setBackground(java.awt.Color.white);
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel2.setText("PRODUTOS");

        labelHomeProduto.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        labelHomeProduto.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelHomeProduto)
                .addGap(20, 20, 20))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(labelHomeProduto)
                .addGap(22, 22, 22))
        );

        jPanel10.setBackground(java.awt.Color.white);
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.setPreferredSize(new java.awt.Dimension(204, 88));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel4.setText("CLIENTES");

        labelHomeCliente.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        labelHomeCliente.setText("0");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelHomeCliente)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(labelHomeCliente)
                .addGap(22, 22, 22))
        );

        jPanel11.setBackground(java.awt.Color.white);
        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel11.setPreferredSize(new java.awt.Dimension(204, 88));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel6.setText("VENDAS");

        labelHomeVenda.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        labelHomeVenda.setText("0");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelHomeVenda)
                .addGap(21, 21, 21))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(labelHomeVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        labelDashboardBemvidoUsuario.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N

        javax.swing.GroupLayout panelHomeLayout = new javax.swing.GroupLayout(panelHome);
        panelHome.setLayout(panelHomeLayout);
        panelHomeLayout.setHorizontalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelDashboardBemvidoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelHomeLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 87, Short.MAX_VALUE))
        );
        panelHomeLayout.setVerticalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(labelDashboardBemvidoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(391, Short.MAX_VALUE))
        );

        panelBody.add(panelHome, "card6");

        panelProduto.setBackground(java.awt.Color.white);

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        botaoProdutoAdicionar.setText("Adicionar");
        jPanel2.add(botaoProdutoAdicionar);

        botaoProdutoEditar.setText("Editar");
        jPanel2.add(botaoProdutoEditar);

        botaoProdutoApagar.setText("Apagar");
        jPanel2.add(botaoProdutoApagar);

        tabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane1.setViewportView(tabelaProduto);

        jPanel12.setBackground(java.awt.Color.white);
        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setText("icon");

        txtProdutoPesquisar.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(0, 0, 0)
                .addComponent(txtProdutoPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(txtProdutoPesquisar)
        );

        labelP.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        labelP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelP.setText("PRODUTOS");

        javax.swing.GroupLayout panelProdutoLayout = new javax.swing.GroupLayout(panelProduto);
        panelProduto.setLayout(panelProdutoLayout);
        panelProdutoLayout.setHorizontalGroup(
            panelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProdutoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelProdutoLayout.setVerticalGroup(
            panelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBody.add(panelProduto, "card2");

        panelCliente.setBackground(java.awt.Color.white);

        jPanel15.setBackground(java.awt.Color.white);
        jPanel15.setLayout(new java.awt.GridLayout(1, 0));

        botaoClienteAdicionar.setText("Adicionar");
        jPanel15.add(botaoClienteAdicionar);

        botaoClienteEditar.setText("Editar");
        jPanel15.add(botaoClienteEditar);

        botaoClienteApagar.setText("Apagar");
        jPanel15.add(botaoClienteApagar);

        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane3.setViewportView(tabelaCliente);

        jPanel16.setBackground(java.awt.Color.white);
        jPanel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel12.setText("icon");

        jTextField3.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(0, 0, 0)
                .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jTextField3)
        );

        jLabel13.setBackground(java.awt.Color.white);
        jLabel13.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("CLIENTES");

        javax.swing.GroupLayout panelClienteLayout = new javax.swing.GroupLayout(panelCliente);
        panelCliente.setLayout(panelClienteLayout);
        panelClienteLayout.setHorizontalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClienteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelClienteLayout.setVerticalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBody.add(panelCliente, "card3");

        jPanel19.setBackground(java.awt.Color.white);
        jPanel19.setLayout(new java.awt.GridLayout(1, 0));

        botaoVendaAdicionar.setText("Adicionar");
        jPanel19.add(botaoVendaAdicionar);

        jButton14.setText("Editar");
        jPanel19.add(jButton14);

        jButton15.setText("Apagar");
        jPanel19.add(jButton15);

        botaoVendaDetalhes.setText("Detalhes");
        jPanel19.add(botaoVendaDetalhes);

        tabelaVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane5.setViewportView(tabelaVenda);

        jPanel20.setBackground(java.awt.Color.white);
        jPanel20.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel16.setText("icon");

        jTextField5.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(0, 0, 0)
                .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jTextField5)
        );

        jLabel17.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("VENDAS");

        javax.swing.GroupLayout panelVendasLayout = new javax.swing.GroupLayout(panelVendas);
        panelVendas.setLayout(panelVendasLayout);
        panelVendasLayout.setHorizontalGroup(
            panelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVendasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelVendasLayout.setVerticalGroup(
            panelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBody.add(panelVendas, "card4");

        panelUsuarios.setBackground(java.awt.Color.white);

        jPanel17.setBackground(java.awt.Color.white);
        jPanel17.setLayout(new java.awt.GridLayout(1, 0));

        botaoUsuarioAdicionar.setIcon(new javax.swing.ImageIcon("/home/quitumba/NetBeansProjects/gestao-venda/src/main/java/com/culysoft/gestaovenda/view/imagens/add_16px_1160351_easyicon.net.png")); // NOI18N
        botaoUsuarioAdicionar.setText("Adicionar");
        jPanel17.add(botaoUsuarioAdicionar);

        botaoUsuarioEditar.setIcon(new javax.swing.ImageIcon("/home/quitumba/NetBeansProjects/gestao-venda/src/main/java/com/culysoft/gestaovenda/view/imagens/editar-16.png")); // NOI18N
        botaoUsuarioEditar.setText("Editar");
        jPanel17.add(botaoUsuarioEditar);

        botaoUsuarioApagar.setIcon(new javax.swing.ImageIcon("/home/quitumba/NetBeansProjects/gestao-venda/src/main/java/com/culysoft/gestaovenda/view/imagens/recycle_bin_16px_1134020_easyicon.net.png")); // NOI18N
        botaoUsuarioApagar.setText("Apagar");
        jPanel17.add(botaoUsuarioApagar);

        jScrollPane4.setBackground(java.awt.Color.white);

        tabelaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane4.setViewportView(tabelaUsuario);

        jPanel18.setBackground(java.awt.Color.white);
        jPanel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setIcon(new javax.swing.ImageIcon("/home/quitumba/NetBeansProjects/gestao-venda/src/main/java/com/culysoft/gestaovenda/view/imagens/search16.png")); // NOI18N

        txtUsuarioPesquisar.setToolTipText("Pesquisar pelo Nome");
        txtUsuarioPesquisar.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel14)
                .addGap(0, 0, 0)
                .addComponent(txtUsuarioPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(txtUsuarioPesquisar)
        );

        jLabel15.setBackground(java.awt.Color.white);
        jLabel15.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("USUARIOS");

        javax.swing.GroupLayout panelUsuariosLayout = new javax.swing.GroupLayout(panelUsuarios);
        panelUsuarios.setLayout(panelUsuariosLayout);
        panelUsuariosLayout.setHorizontalGroup(
            panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUsuariosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelUsuariosLayout.setVerticalGroup(
            panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBody.add(panelUsuarios, "card5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoDashboardHomeMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoDashboardHomeMouseDragged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_botaoDashboardHomeMouseDragged

    private void botaoDashboardUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDashboardUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoDashboardUsuarioActionPerformed

    private void botaoDashboardProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDashboardProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoDashboardProdutosActionPerformed

    private void botaoDashboardHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDashboardHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoDashboardHomeActionPerformed

    private void botaoDashboardVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDashboardVendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoDashboardVendasActionPerformed

    private void comboBoxProdutoCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxProdutoCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxProdutoCategoriaActionPerformed

    private void comboBoxVendaPesquisarProdutoPelaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxVendaPesquisarProdutoPelaCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxVendaPesquisarProdutoPelaCategoriaActionPerformed

    private void txtVendaDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVendaDescontoActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_txtVendaDescontoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCategoriaApagar;
    private javax.swing.JButton botaoCategoriaCancelar;
    private javax.swing.JButton botaoCategoriaLimpar;
    private javax.swing.JButton botaoCategoriaSalvar;
    private javax.swing.JButton botaoClienteAdicionar;
    private javax.swing.JButton botaoClienteApagar;
    private javax.swing.JButton botaoClienteCancelar;
    private javax.swing.JButton botaoClienteEditar;
    private javax.swing.JButton botaoClienteSalvar;
    private javax.swing.JButton botaoDashboardClientes;
    private javax.swing.JButton botaoDashboardHome;
    private javax.swing.JButton botaoDashboardProdutos;
    private javax.swing.JButton botaoDashboardSair;
    private javax.swing.JButton botaoDashboardUsuario;
    private javax.swing.JButton botaoDashboardVendas;
    private javax.swing.JButton botaoProdutoAdicionar;
    private javax.swing.JButton botaoProdutoAdicionarCategoria;
    private javax.swing.JButton botaoProdutoApagar;
    private javax.swing.JButton botaoProdutoCancelar;
    private javax.swing.JButton botaoProdutoEditar;
    private javax.swing.JButton botaoProdutoSalvar;
    private javax.swing.JButton botaoUsuarioAdicionar;
    private javax.swing.JButton botaoUsuarioApagar;
    private javax.swing.JButton botaoUsuarioCancelar;
    private javax.swing.JButton botaoUsuarioEditar;
    private javax.swing.JButton botaoUsuarioSalvar;
    private javax.swing.JButton botaoVendaAdicionar;
    private javax.swing.JButton botaoVendaCancelar;
    private javax.swing.JButton botaoVendaDetalhes;
    private javax.swing.JButton botaoVendaLimpar;
    private javax.swing.JButton botaoVendaRegistroRemover;
    private javax.swing.JButton botaoVendaResgistroAdicionar;
    private javax.swing.JButton botaoVendaVender;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkboxVendaDesconto;
    private javax.swing.JComboBox<String> comboBoxProdutoCategoria;
    private javax.swing.JComboBox<String> comboBoxUsuarioPerfil;
    private javax.swing.JComboBox<String> comboBoxVendaPesquisarProdutoPelaCategoria;
    private javax.swing.JComboBox<String> comboBoxVendaProduto;
    private javax.swing.JDialog dialogCategoria;
    private javax.swing.JDialog dialogCliente;
    private javax.swing.JDialog dialogProduto;
    private javax.swing.JDialog dialogUsuario;
    private javax.swing.JDialog dialogVenda;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
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
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel0;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel labelCategoriaMensagem;
    private javax.swing.JLabel labelClienteMensagem;
    private javax.swing.JLabel labelDashboardBemvidoUsuario;
    private javax.swing.JLabel labelHomeCliente;
    private javax.swing.JLabel labelHomeProduto;
    private javax.swing.JLabel labelHomeVenda;
    private javax.swing.JLabel labelP;
    private javax.swing.JLabel labelProdutoMensagem;
    private javax.swing.JLabel labelUsuarioLogadoId;
    private javax.swing.JLabel labelUsuarioMensagem;
    private javax.swing.JLabel labelVendaDesconto;
    private javax.swing.JLabel labelVendaMensagem;
    private javax.swing.JLabel labelVendaNomeDoProduto;
    private javax.swing.JLabel labelVendaPrecoDoProduto;
    private javax.swing.JLabel labelVendaQuantidadeDoProduto;
    private javax.swing.JLabel labelVendaTotalDaVenda;
    private javax.swing.JLabel labelVendaTroco;
    private javax.swing.JLabel labelVendaValorPago;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelCliente;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelProduto;
    private javax.swing.JPanel panelUsuarios;
    private javax.swing.JPanel panelVendas;
    private javax.swing.JRadioButton radioBotaoUsuarioActivo;
    private javax.swing.JRadioButton radioBotaoUsuarioDesativo;
    private javax.swing.JTable tabelaCategoria;
    private javax.swing.JTable tabelaCliente;
    private javax.swing.JTable tabelaProduto;
    private javax.swing.JTable tabelaUsuario;
    private javax.swing.JTable tabelaVendRegistro;
    private javax.swing.JTable tabelaVenda;
    private javax.swing.JTextArea txtCategoriaDescricao;
    private javax.swing.JTextField txtCategoriaId;
    private javax.swing.JTextField txtCategoriaNome;
    private javax.swing.JTextField txtClienteEndereco;
    private javax.swing.JTextField txtClienteId;
    private javax.swing.JTextField txtClienteNome;
    private javax.swing.JTextField txtClienteTelefone;
    private javax.swing.JTextArea txtProdutoDescricao;
    private javax.swing.JTextField txtProdutoId;
    private javax.swing.JTextField txtProdutoNome;
    private javax.swing.JTextField txtProdutoPesquisar;
    private javax.swing.JTextField txtProdutoPreco;
    private javax.swing.JSpinner txtProdutoQuantidade;
    private javax.swing.JTextField txtUsuarioId;
    private javax.swing.JTextField txtUsuarioNome;
    private javax.swing.JTextField txtUsuarioPesquisar;
    private javax.swing.JPasswordField txtUsuarioSenha;
    private javax.swing.JTextField txtUsuarioUsername;
    private javax.swing.JTextField txtVendaCliente;
    private javax.swing.JTextField txtVendaDesconto;
    private javax.swing.JTextField txtVendaId;
    private javax.swing.JTextField txtVendaPesquisarProduto;
    private javax.swing.JSpinner txtVendaQuantidade;
    private javax.swing.JTextField txtVendaValorPago;
    // End of variables declaration//GEN-END:variables

    public JButton getBotaoDashboardHome() {
        return botaoDashboardHome;
    }

    public JButton getBotaoDashboardProdutos() {
        return botaoDashboardProdutos;
    }
    
    public JButton getBotaoDashboardClientes() {
        return botaoDashboardClientes;
    }
    
    public JButton getBotaoDashboardVendas() {
        return botaoDashboardVendas;
    }
    
    public JButton getBotaoDashboardUsuarios() {
        return botaoDashboardUsuario;
    }
    
    public JButton getBotaoDashboardSair() {
        return botaoDashboardSair;
    }
    
    public JPanel getPanelHome() {
        return panelHome;
    }
    
    public JPanel getPanelBody() {
        return panelBody;
    }
    
    public JPanel getPanelProduto() {
        return panelProduto;
    }
    
    public JPanel getPanelCliente() {
        return panelCliente;
    }
    
    public JPanel getPanelVenda() {
        return panelVendas;
    }
    
    public JPanel getPanelUsuario() {
        return panelUsuarios;
    }
    
    public JTable getTabelaUsuarios(){
        return tabelaUsuario;
    }    
    
    public JLabel getLabelBenvindoUsuario() {
        return labelDashboardBemvidoUsuario;
    }

    public JLabel getLabelUsuarioLogadoId() {
        return labelUsuarioLogadoId;
    }
    
    public JButton getBotaoUsuarioAdicionar() {
        return botaoUsuarioAdicionar;
    }
    
    public JButton getBotaoUsuarioEditar() {
        return botaoUsuarioEditar;
    }
    
    public JButton getBotaoUsuarioApagar() {
        return botaoUsuarioApagar;
    }
    
    public JDialog getDialogUsuario() {
        return this.dialogUsuario;
    }
    
    public JComboBox getComboBoxUsuarioPerfil() {
        return comboBoxUsuarioPerfil;
    }
    
    public JTextField getTxtUsuarioId() {
        return txtUsuarioId;
    }
    
    public JTextField getTxtUsuarioNome() {
        return txtUsuarioNome;
    }
    
    public JTextField getTxtUsuarioSenha() {
        return txtUsuarioSenha;
    }
    
    public JTextField getTxtUsuarioUsername() {
        return txtUsuarioUsername;
    }
    
    public JRadioButton getRadioBotaoActivo() {
        return radioBotaoUsuarioActivo;
    }
    
    public JRadioButton getRadioBotaoDesativo() {
        return radioBotaoUsuarioDesativo;
    }
    
    public JLabel getLabelUsuarioMensagem() {
        return labelUsuarioMensagem;
    }
    
    public JTextField getTxtUsuarioPesquisar() {
        return txtUsuarioPesquisar;
    }
    
    public JButton getBotaoCategoriaSalvar() {
        return botaoCategoriaSalvar;
    }
    
    public JButton getBotaoCategoriaCancelar() {
        return botaoCategoriaCancelar;
    }
    
    public JButton getBotaoCategoriaApagar() {
        return botaoCategoriaApagar;
    }
    
    public JButton getBotaoCategoriaLimpar() {
        return botaoCategoriaLimpar;
    }
    
    public JTextField getTxtCategoriaId() {
        return txtCategoriaId;
    }
    
    public JTextField getTxtCategoriaNome() {
        return txtCategoriaNome;
    }
    
    public JTextArea getTxtCategoriaDescricao() {
        return txtCategoriaDescricao;
    }
    
    public JTable getTabelaCategoria() {
        return tabelaCategoria;
    }
    
    public JDialog getDialogProduto() {
        return dialogProduto;
    }
    
    public JButton getBotaoProdutoAdicionarCategoria() {
        return botaoProdutoAdicionarCategoria;
    }
    
    public JDialog getDialogCategoria() {
        return dialogCategoria;
    }
    
    public JButton getBotaoProdutoAdicionar() {
        return botaoProdutoAdicionar;
    }
    
    public JButton getBotaoProdutoEditar() {
        return botaoProdutoEditar;
    }
    
    public JButton getBotaoProdutoApagar() {
        return botaoProdutoApagar;
    }
    
    public JLabel getLabelCategoriaMensagem() {
        return labelCategoriaMensagem;
    }
    
    public JComboBox getComboBoxProdutoCategoria() {
        return comboBoxProdutoCategoria;
    }
    
    public JTextField getTxtProdutoId() {
        return txtProdutoId;
    }
    
    public JTextField getTxtProdutoNome() {
        return txtProdutoNome;
    }
    
    public JTextField getTxtProdutoPreco() {
        return txtProdutoPreco;
    }
    
    public JSpinner getTxtProdutoQuantidade() {
        return txtProdutoQuantidade;
    }
    
    public JTextArea getTxtProdutoDescricao() {
        return txtProdutoDescricao;
    }
 
    public JLabel getLabelProdutoMensagem() {
        return labelProdutoMensagem;
    }
    
    public JTable getTabelaProduto() {
        return tabelaProduto;
    }
    
    public JTextField getTxtProdutoPesquisar() {
        return txtProdutoPesquisar;
    }
    
    public JDialog getDialogVenda() {
        return dialogVenda;
    }
    
    public JLabel getLabelVendaPrecoDoProduto() {
        return labelVendaPrecoDoProduto;
    }
    
    public JLabel getLabelVendaQuantidadeDoProduto() {
        return labelVendaQuantidadeDoProduto;
    }
    
    public JLabel getLabelVendaNomedeDoProduto() {
        return labelVendaNomeDoProduto;
    }
    
    public JTextField getTxtVendaPesquisarProduto() {
        return txtVendaPesquisarProduto;
    }
    
    public JComboBox getComboBoxVendaPesquisarProdutoPelaCategoria() {
        return comboBoxVendaPesquisarProdutoPelaCategoria;
    }
    
    public JComboBox getComboBoVendaProduto() {
        return comboBoxVendaProduto;
    }
    
    public JLabel getLabelVendaMensagem() {
        return labelVendaMensagem;
    }
    
    public JTable getTabelaVendaRegistro() {
        return tabelaVendRegistro;
    }
    
    public JTextField getTxtVendaId() {
        return txtVendaId;
    }
    
    public JSpinner getTxtVendaQuantidade() {
        return txtVendaQuantidade;
    }
    
    public JTextField getTxtVendaValorPago() {
        return txtVendaValorPago;
    }
    
    public JTextField getTxtVendaDesconto() {
        return txtVendaDesconto;
    }
    
    public JLabel getLabelVendaTotalDaVenda() {
        return labelVendaTotalDaVenda;
    }
    
    public JLabel getLabelVendaValorPago() {
        return labelVendaValorPago;
    }
    
    public JLabel getLabelVendaTotalDoDesconto() {
        return labelVendaDesconto;
    }
    
    public JLabel getLabelVendaTroco() {
        return labelVendaTroco;
    }
    
    public JCheckBox getCheckBoxVendaDesconto() {
        return checkboxVendaDesconto;
    }
    
    public JLabel getLabelClienteMensagem() {
        return labelClienteMensagem;
    }
    
    public JTextField getTxtClienteId() {
        return txtClienteId;
    }
    
    public JTextField getTxtClienteNome() {
        return txtClienteNome;
    }
    
    public JTextField getTxtClienteTelefone() {
        return txtClienteTelefone;
    }
    
    public JTextField getTxtClienteEndereco() {
        return txtClienteEndereco;
    }
    
    public JDialog getDialogCliente() {
        return dialogCliente;
    }
    
    public JTextField getTxtVendaCliente() {
        return txtVendaCliente;
    }
    
    public JTable getTabelaVenda() {
        return tabelaVenda;
    }
    
    public JButton getBotaoVendaDetalhes() {
        return botaoVendaDetalhes;
    }
    
    public JLabel getLabelHomeProduto() {
        return labelHomeProduto;
    }
    
    public JLabel getLabelHomeCliente() {
        return labelHomeCliente;
    }
    
    public JLabel getLabelHomeVenda() {
        return labelHomeVenda;
    }
    
    public JTable getTabelaCliente() {
        return tabelaCliente;
    }
}
