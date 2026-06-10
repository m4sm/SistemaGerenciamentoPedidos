
package view;
import controller.ProdutoController;

public class ProdutoView extends javax.swing.JFrame {
    

    private static final java.util.logging.Logger logger =
            java.util.logging.Logger.getLogger(ProdutoView.class.getName());

    private ProdutoController produtoController;
    private boolean modoAlteracao = false;




    public ProdutoView() {
    initComponents();
    produtoController = new ProdutoController();
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ID_produto = new javax.swing.JTable();
        btnIncluirConfirmar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();

        jLabel2.setText("GERENCIAMENTO DE PRODUTOS");

        jTextField1.addActionListener(this::jTextField1ActionPerformed);

        jLabel3.setText("ID PRODUTO");

        jLabel4.setText("NOME PRODUTO");

        jTextField2.addActionListener(this::jTextField2ActionPerformed);

        jLabel5.setText("PREÇO");

        jTextField3.addActionListener(this::jTextField3ActionPerformed);

        jLabel6.setText("REMESSA");

        ID_produto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id_produto", "Nome", "Preço", "Remessa"
            }
        ));
        jScrollPane1.setViewportView(ID_produto);

        btnIncluirConfirmar.setText("Incluir ");
        btnIncluirConfirmar.addActionListener(this::btnIncluirConfirmarActionPerformed);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnIncluirConfirmar)
                    .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jDialog1Layout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addComponent(jLabel5))
                                .addGroup(jDialog1Layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))))
                            .addGap(150, 150, 150)
                            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jDialog1Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(73, 73, 73)
                            .addComponent(jLabel2))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(46, 46, 46)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIncluirConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gerenciamento de Produtos");

        btnIncluir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnIncluir.setText("Adicionar");
        btnIncluir.addActionListener(this::btnIncluirActionPerformed);

        btnAlterar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(this::btnAlterarActionPerformed);

        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(this::btnExcluirActionPerformed);

        btnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(this::btnConsultarActionPerformed);

        btnAtualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAtualizar.setText("Listar");
        btnAtualizar.addActionListener(this::btnAtualizarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnIncluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAlterar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(btnAtualizar)
                .addGap(30, 30, 30)
                .addComponent(btnExcluir)
                .addContainerGap(176, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIncluir)
                    .addComponent(btnConsultar)
                    .addComponent(btnAlterar))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualizar)
                    .addComponent(btnExcluir))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed

        int proximoCodigo = produtoController.obterProximoCodigo();
        jTextField1.setText(String.valueOf(proximoCodigo));
        jTextField1.setEditable(false); 

        modoAlteracao = false;
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");

        jDialog1.pack();
        jDialog1.setLocationRelativeTo(this);
        jDialog1.setVisible(true);
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        int linhaSelecionada = ID_produto.getSelectedRow();
    
    if (!jDialog1.isVisible()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Por favor, clique em 'Listar' ou 'Consultar' primeiro para visualizar os produtos.");
        return;
    }

    if (linhaSelecionada == -1) {
        javax.swing.JOptionPane.showMessageDialog(this, "Selecione um produto na tabela para alterar!");
        return;
    }

    modoAlteracao = true;

btnIncluirConfirmar.setVisible(true);
btnIncluirConfirmar.setText("Salvar Alteração");

    // Resgata os dados da tabela e joga nos campos do Dialog
    jTextField1.setText(ID_produto.getValueAt(linhaSelecionada, 0).toString());
    jTextField1.setEditable(false); 

    jTextField2.setText(ID_produto.getValueAt(linhaSelecionada, 1).toString());
    jTextField3.setText(ID_produto.getValueAt(linhaSelecionada, 2).toString());
    jTextField4.setText(ID_produto.getValueAt(linhaSelecionada, 3).toString());
    

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // Garante que a janela com a tabela está aberta
    if (!jDialog1.isVisible()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Por favor, clique em 'Listar' primeiro para ver os produtos.");
        return;
    }

    int linhaSelecionada = ID_produto.getSelectedRow();
    if (linhaSelecionada == -1) {
        javax.swing.JOptionPane.showMessageDialog(this, "Selecione um produto na tabela para excluir!");
        return;
    }

    int codigo = Integer.parseInt(ID_produto.getValueAt(linhaSelecionada, 0).toString());
    String nome = ID_produto.getValueAt(linhaSelecionada, 1).toString();

    int confirmacao = javax.swing.JOptionPane.showConfirmDialog(this, 
            "Tem certeza que deseja excluir o produto: " + nome + "?", "Confirmar Exclusão", javax.swing.JOptionPane.YES_NO_OPTION);
            
    if (confirmacao == javax.swing.JOptionPane.YES_OPTION) {
        boolean excluiu = produtoController.removerProduto(codigo);
        if (excluiu) {
            javax.swing.JOptionPane.showMessageDialog(this, "Produto excluído com sucesso!");
            preencherTabela(""); // <--- AQUI: Atualiza a tabela diretamente sem abrir popups extras
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro ao excluir o produto.");
        }
    }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
                                            
    preencherTabela("");

    btnIncluirConfirmar.setVisible(false);

    jDialog1.pack();
    jDialog1.setLocationRelativeTo(this);
    jDialog1.setVisible(true);

    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
btnIncluirConfirmar.setVisible(false);

    String termoBusca = javax.swing.JOptionPane.showInputDialog(
            this, "Digite o código ou parte do nome do produto:");

    if (termoBusca == null) {
        return;
    }

    preencherTabela(termoBusca);

    jDialog1.pack();
    jDialog1.setLocationRelativeTo(this);
    jDialog1.setVisible(true);
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void btnIncluirConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirConfirmarActionPerformed

    try {

        String strCodigo = jTextField1.getText().trim();
        String nome = jTextField2.getText().trim();
        String strPreco = jTextField3.getText().trim();
        String strQuantidade = jTextField4.getText().trim();

        if (nome.isEmpty() || strPreco.isEmpty() || strQuantidade.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Por favor, preencha todos os campos antes de salvar!"
            );
            return;
        }

        int codigo = Integer.parseInt(strCodigo);
        double preco = Double.parseDouble(strPreco.replace(",", "."));
        int quantidade = Integer.parseInt(strQuantidade);

        boolean sucesso;

        if (modoAlteracao) {

            sucesso = produtoController.atualizarProduto(
                    codigo,
                    nome,
                    preco,
                    quantidade
            );

        } else {

            sucesso = produtoController.cadastrarProduto(
                    codigo,
                    nome,
                    preco,
                    quantidade
            );

        }

        if (sucesso) {

            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    modoAlteracao
                            ? "Produto alterado com sucesso!"
                            : "Produto cadastrado com sucesso!"
            );

            jDialog1.dispose();
            preencherTabela("");

        } else {

            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Dados inválidos!"
            );

        }

    } catch (NumberFormatException e) {

        javax.swing.JOptionPane.showMessageDialog(
                this,
                "Erro de formato. Verifique os campos Preço e Remessa."
        );

    } catch (Exception e) {

        javax.swing.JOptionPane.showMessageDialog(
                this,
                "Erro: " + e.getMessage()
        );

        e.printStackTrace();
    }
    }//GEN-LAST:event_btnIncluirConfirmarActionPerformed

    private void preencherTabela(String termoBusca) {

    // Busca os produtos
    java.util.List<model.Produto> lista =
            produtoController.listarProdutos(termoBusca);

    
    System.out.println("=================================");
    System.out.println("Quantidade de produtos: " + lista.size());

    // Pega o modelo da tabela
    javax.swing.table.DefaultTableModel modelo =
            (javax.swing.table.DefaultTableModel) ID_produto.getModel();

    // Limpa a tabela
    modelo.setRowCount(0);

    // Adiciona os produtos
    for (model.Produto p : lista) {

        System.out.println(
                "ID: " + p.getCodProduto()
                + " | Nome: " + p.getNome()
                + " | Preço: " + p.getPreco()
                + " | Estoque: " + p.getQuantidadeEstoque()
        );

        Object[] linha = {
            p.getCodProduto(),
            p.getNome(),
            p.getPreco(),
            p.getQuantidadeEstoque()
        };

        modelo.addRow(linha);
    }

    System.out.println("Linhas adicionadas na tabela: " + modelo.getRowCount());
    System.out.println("=================================");
}
    public static void main(String args[]) {

    try {
        for (javax.swing.UIManager.LookAndFeelInfo info :
                javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }

    java.awt.EventQueue.invokeLater(() -> {
        new ProdutoView().setVisible(true);
    });
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ID_produto;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnIncluirConfirmar;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
