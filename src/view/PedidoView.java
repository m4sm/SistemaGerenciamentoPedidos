package view;

public class PedidoView extends javax.swing.JFrame {
   
   private controller.PedidoController pedidoController = new controller.PedidoController();
   private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PedidoView.class.getName());
   private java.time.format.DateTimeFormatter fmtBR = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
    
   
    public PedidoView() {
        initComponents();
        // Procure essas linhas dentro do seu initComponents() e substitua por essas:
        txtValorTotal.setEditable(false);
        txtValorTotal.setText("0.0");
        
 
        pedidoController.listarEmTabela(TabelaDados);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        JLabel1 = new javax.swing.JLabel();
        txtIdPedido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtDataPedido = new javax.swing.JTextField();
        txtDataEntrega = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaDados = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        jLabel1.setText("GERENCIAMENTO DE PEDIDOS");
        jLabel1.setToolTipText("");

        btnIncluir.setText("INCLUIR");
        btnIncluir.addActionListener(this::btnIncluirActionPerformed);
    

    btnAlterar.setText("ALTERAR");
    btnAlterar.addActionListener(this::btnAlterarActionPerformed);

    btnExcluir.setText("EXCLUIR");
    btnExcluir.addActionListener(this::btnExcluirActionPerformed);

    btnConsultar.setText("CONSULTAR");
    btnConsultar.addActionListener(this::btnConsultarActionPerformed);

    btnListar.setText("LISTAR");
    btnListar.addActionListener(this::btnListarActionPerformed);

    JLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
    JLabel1.setText("ID_CLIENTE");

    jLabel8.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
    jLabel8.setText("ID PEDIDO");

    txtIdCliente.addActionListener(this::txtIdClienteActionPerformed);

    jLabel9.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
    jLabel9.setText("DATA PEDIDO");

    jLabel11.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
    jLabel11.setText("DATA ENTREGA");

    jLabel12.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
    jLabel12.setText("VALOR TOTAL");

    TabelaDados.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null}
        },
        new String [] {
            "ID PEDIDO", "ID CLIENTE", "DATA ENTREGA", "DATA PEDIDO", "VALOR TOTAL"
        }
    ));
    jScrollPane1.setViewportView(TabelaDados);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(31, 31, 31)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(JLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtIdCliente))
                    .addGap(32, 32, 32)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                        .addComponent(txtDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnIncluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(txtIdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jLabel12)
                .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDataPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel9))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(60, 60, 60))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel1)
                    .addGap(40, 40, 40)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JLabel1)
                        .addComponent(jLabel11))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDataPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel12)
                    .addGap(8, 8, 8)
                    .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(34, 34, 34)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        try {
            int idPedido = Integer.parseInt(txtIdPedido.getText().trim());
            int idCliente = Integer.parseInt(txtIdCliente.getText().trim());
            java.time.LocalDate dataPedido = java.time.LocalDate.parse(txtDataPedido.getText().trim(), fmtBR);
            java.time.LocalDate dataEntrega = java.time.LocalDate.parse(txtDataEntrega.getText().trim(), fmtBR);        
            
            if (pedidoController.idPedidoJaExiste(idPedido)) {
                    javax.swing.JOptionPane.showMessageDialog(this, 
                    "Erro: Já existe um pedido cadastrado com o ID " + idPedido + ".\nPor favor, utilize outro número.", 
                    "ID Duplicado", 
                    javax.swing.JOptionPane.WARNING_MESSAGE);
                    return;
            }
            
            model.Pedido p = new model.Pedido(idPedido, idCliente, dataEntrega, dataPedido, 0.0f);
        
            pedidoController.incluirPedido(p);
        
            javax.swing.JOptionPane.showMessageDialog(this, "Pedido registado com sucesso!");
            pedidoController.listarEmTabela(TabelaDados);
       
            txtIdPedido.setText("");
            txtIdCliente.setText("");
            txtDataPedido.setText("");
            txtDataEntrega.setText("");
            txtValorTotal.setText("0.0");
        
    } 
            catch (Exception ex) {
                javax.swing.JOptionPane.showMessageDialog(this, "Erro: Verifique se as datas estão no formato AAAA-MM-DD e os IDs são números válidos.");
    }
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
    int linhaSelecionada = TabelaDados.getSelectedRow();
    
        if (linhaSelecionada == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione uma linha na tabela para alterar.");
            return;
        }
    
        try {
            int idPedido = Integer.parseInt(txtIdPedido.getText().trim());
            int idCliente = Integer.parseInt(txtIdCliente.getText().trim());
            java.time.LocalDate dataPedido = java.time.LocalDate.parse(txtDataPedido.getText().trim(), fmtBR);
            java.time.LocalDate dataEntrega = java.time.LocalDate.parse(txtDataEntrega.getText().trim(), fmtBR);
        
            float valorTotalAtual = Float.parseFloat(TabelaDados.getValueAt(linhaSelecionada, 4).toString());
        
            model.Pedido p = new model.Pedido(idPedido, idCliente, dataEntrega, dataPedido, valorTotalAtual);
            pedidoController.alterarPedido(p);
        
            javax.swing.JOptionPane.showMessageDialog(this, "Pedido alterado com sucesso!");
            pedidoController.listarEmTabela(TabelaDados);
        
        } 
            catch (Exception ex) {
                javax.swing.JOptionPane.showMessageDialog(this, "Erro ao alterar. Verifique os dados introduzidos.");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
    int linhaSelecionada = TabelaDados.getSelectedRow();
    
        if (linhaSelecionada == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione um pedido na tabela para excluir.");
            return;
        }
    
        int resposta = javax.swing.JOptionPane.showConfirmDialog(this, "Tem a certeza que deseja excluir este pedido?", "Confirmar", javax.swing.JOptionPane.YES_NO_OPTION);
            
        if (resposta == javax.swing.JOptionPane.YES_OPTION) {
            int idPedido = Integer.parseInt(TabelaDados.getValueAt(linhaSelecionada, 0).toString());
        
            pedidoController.excluirPedido(idPedido);
            javax.swing.JOptionPane.showMessageDialog(this, "Pedido excluído com sucesso!");
            pedidoController.listarEmTabela(TabelaDados);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
    String idBusca = javax.swing.JOptionPane.showInputDialog(this, "Introduza o ID do Pedido que deseja consultar:");
    
        if (idBusca != null && !idBusca.trim().isEmpty()) {
            try {
                int id = Integer.parseInt(idBusca.trim());
                model.Pedido p = pedidoController.consultarPedido(id);
            
                if (p != null) {
                txtIdPedido.setText(String.valueOf(p.getIdPedido()));
                txtIdCliente.setText(String.valueOf(p.getIdCliente()));
                txtDataPedido.setText(p.getDataPedido().toString());
                txtDataEntrega.setText(p.getDataEntrega().toString());
                txtValorTotal.setText(String.valueOf(p.getValorTotal()));
                
                javax.swing.JOptionPane.showMessageDialog(this, "Pedido encontrado e carregado no ecrã!");
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "Pedido não encontrado no sistema.");
            }
        } 
            catch (NumberFormatException ex) {
                    javax.swing.JOptionPane.showMessageDialog(this, "O ID deve ser um número inteiro.");
        }
       }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
    pedidoController.listarEmTabela(TabelaDados);
    
        TabelaDados.clearSelection();
        txtIdPedido.setText("");
        txtIdCliente.setText("");
        txtDataPedido.setText("");
        txtDataEntrega.setText("");
        txtValorTotal.setText("0.0");
    }//GEN-LAST:event_btnListarActionPerformed

    private void txtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdClienteActionPerformed
      
    }//GEN-LAST:event_txtIdClienteActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new PedidoView().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel1;
    private javax.swing.JTable TabelaDados;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDataEntrega;
    private javax.swing.JTextField txtDataPedido;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdPedido;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables
}