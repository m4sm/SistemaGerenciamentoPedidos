package view;

public class PedidoView extends javax.swing.JFrame {
   
   private controller.PedidoController pedidoController = new controller.PedidoController();
   private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PedidoView.class.getName());
   private java.time.format.DateTimeFormatter fmtBR = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
   private controller.ClienteController clienteController = new controller.ClienteController(); 
   
    public PedidoView() {
        initComponents();
       
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
        btnGerenciarItens = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setText("Gerenciamento de Pedidos");
        jLabel1.setToolTipText("");

        btnIncluir.setBackground(new java.awt.Color(0, 204, 102));
        btnIncluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIncluir.setForeground(new java.awt.Color(255, 255, 255));
        btnIncluir.setText("INCLUIR");
        btnIncluir.addActionListener(this::btnIncluirActionPerformed);
    

    btnAlterar.setBackground(new java.awt.Color(57, 82, 39));
    btnAlterar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
    btnAlterar.setText("ALTERAR");
    btnAlterar.addActionListener(this::btnAlterarActionPerformed);

    btnExcluir.setBackground(new java.awt.Color(102, 0, 0));
    btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
    btnExcluir.setText("EXCLUIR");
    btnExcluir.addActionListener(this::btnExcluirActionPerformed);

    btnConsultar.setBackground(new java.awt.Color(51, 0, 102));
    btnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    btnConsultar.setForeground(new java.awt.Color(255, 255, 255));
    btnConsultar.setText("CONSULTAR");
    btnConsultar.addActionListener(this::btnConsultarActionPerformed);

    btnListar.setBackground(new java.awt.Color(153, 153, 0));
    btnListar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    btnListar.setForeground(new java.awt.Color(255, 255, 255));
    btnListar.setText("LISTAR");
    btnListar.addActionListener(this::btnListarActionPerformed);

    JLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
    JLabel1.setText("ID Cliente");

    jLabel8.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
    jLabel8.setText("ID Pedido");

    txtIdCliente.addActionListener(this::txtIdClienteActionPerformed);

    jLabel9.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
    jLabel9.setText("Data Pedido");

    jLabel11.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
    jLabel11.setText("Data Entrega");

    jLabel12.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
    jLabel12.setText("Valor Total");

    TabelaDados.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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

    btnGerenciarItens.setBackground(new java.awt.Color(51, 0, 51));
    btnGerenciarItens.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    btnGerenciarItens.setForeground(new java.awt.Color(255, 255, 255));
    btnGerenciarItens.setText("GERENCIAR ITENS");
    btnGerenciarItens.addActionListener(this::btnGerenciarItensActionPerformed);
    

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(117, 117, 117)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                                .addComponent(txtDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel1)))
                .addGroup(layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12)
                        .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(41, 41, 41)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(txtDataPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(txtIdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JLabel1))
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGap(31, 31, 31)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                .addComponent(btnGerenciarItens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(35, 35, 35))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
            .addGap(2, 2, 2)
            .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(34, 34, 34)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnGerenciarItens, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(38, 38, 38))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        try {
            int idPedido = Integer.parseInt(txtIdPedido.getText().trim());
            int idCliente = Integer.parseInt(txtIdCliente.getText().trim());
            java.time.LocalDate dataPedido = java.time.LocalDate.parse(txtDataPedido.getText().trim(), fmtBR);
            java.time.LocalDate dataEntrega = java.time.LocalDate.parse(txtDataEntrega.getText().trim(), fmtBR);        
            
            if (clienteController.consultarCliente(idCliente) == null) {
                  javax.swing.JOptionPane.showMessageDialog(this, 
                  "Erro: O Cliente com ID " + idCliente + " não existe cadastrado.\nNão é possível criar um pedido para ele.", 
                  "Cliente Inválido", 
                  javax.swing.JOptionPane.ERROR_MESSAGE);
                  return;
            }
                        
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
            String txtId = txtIdPedido.getText().trim();
            int idPedido = txtId.isEmpty() 
                ? Integer.parseInt(TabelaDados.getValueAt(linhaSelecionada, 0).toString()) 
                : Integer.parseInt(txtId);

            String txtIdCli = txtIdCliente.getText().trim();
            int idCliente = txtIdCli.isEmpty() 
                ? Integer.parseInt(TabelaDados.getValueAt(linhaSelecionada, 1).toString()) 
                : Integer.parseInt(txtIdCli);

            String txtDataEnt = txtDataEntrega.getText().trim();
            String dataEntregaTexto = txtDataEnt.isEmpty() 
                ? TabelaDados.getValueAt(linhaSelecionada, 2).toString() 
                : txtDataEnt;
            java.time.LocalDate dataEntrega = java.time.LocalDate.parse(dataEntregaTexto, fmtBR);

            String txtDataPed = txtDataPedido.getText().trim();
            String dataPedidoTexto = txtDataPed.isEmpty() 
                ? TabelaDados.getValueAt(linhaSelecionada, 3).toString() 
                : txtDataPed;
            java.time.LocalDate dataPedido = java.time.LocalDate.parse(dataPedidoTexto, fmtBR);

            java.text.NumberFormat nf = java.text.NumberFormat.getInstance(new java.util.Locale("pt", "BR"));
            String valorTexto = TabelaDados.getValueAt(linhaSelecionada, 4).toString();
            float valorTotalAtual = nf.parse(valorTexto).floatValue();

            model.Pedido p = new model.Pedido(idPedido, idCliente, dataEntrega, dataPedido, valorTotalAtual);
            pedidoController.alterarPedido(p);
            
            javax.swing.JOptionPane.showMessageDialog(this, "Pedido alterado com sucesso!");
            pedidoController.listarEmTabela(TabelaDados);

            txtIdPedido.setText("");
            txtIdCliente.setText("");
            txtDataPedido.setText("");
            txtDataEntrega.setText("");
            
        } catch (java.text.ParseException e) {
             javax.swing.JOptionPane.showMessageDialog(this, "Erro de formatação no valor total: " + e.getMessage());
        } catch (java.time.format.DateTimeParseException e) {
             javax.swing.JOptionPane.showMessageDialog(this, "Erro: Verifique se as datas estão no formato DD/MM/AAAA.");
        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro ao alterar. Detalhes: " + ex.getMessage());
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
        String[] opcoes = {"Código do Pedido", "Cliente", "Intervalo de Datas"};
    
        int escolha = javax.swing.JOptionPane.showOptionDialog(this,
            "Como deseja pesquisar o pedido?", 
            "Consultar Pedido",
            javax.swing.JOptionPane.DEFAULT_OPTION, 
            javax.swing.JOptionPane.QUESTION_MESSAGE,
            null, 
            opcoes, 
            opcoes[0]);

        javax.swing.table.DefaultTableModel TabelaDadosModel = (javax.swing.table.DefaultTableModel) TabelaDados.getModel();

        if (escolha == 0) { 
        String idBusca = javax.swing.JOptionPane.showInputDialog(this, "Introduza o ID do Pedido que deseja consultar:");
        if (idBusca != null && !idBusca.trim().isEmpty()) {
            try {
                int id = Integer.parseInt(idBusca.trim());
                model.Pedido p = pedidoController.consultarPedido(id);
                if (p != null) {
                    TabelaDadosModel.setNumRows(0); 
                    TabelaDadosModel.addRow(new Object[]{p.getIdPedido(), p.getIdCliente(), p.getDataPedido(), p.getDataEntrega(), p.getValorTotal()});
                    javax.swing.JOptionPane.showMessageDialog(this, "Pedido encontrado!");
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "Pedido não encontrado.");
                }
            } catch (NumberFormatException ex) {
                javax.swing.JOptionPane.showMessageDialog(this, "Erro: O ID do Pedido deve ser um número.");
            }
        }

    } else if (escolha == 1) {
        String clienteBusca = javax.swing.JOptionPane.showInputDialog(this, "Introduza o ID numérico do Cliente:");
        if (clienteBusca != null && !clienteBusca.trim().isEmpty()) {
            try {

                int idCliente = Integer.parseInt(clienteBusca.trim());
                java.util.List<model.Pedido> listaClientes = pedidoController.consultarPorCliente(idCliente);
                
                if (listaClientes != null && !listaClientes.isEmpty()) {
                    TabelaDadosModel.setNumRows(0); 
                    for(model.Pedido p : listaClientes) {
                        TabelaDadosModel.addRow(new Object[]{p.getIdPedido(), p.getIdCliente(), p.getDataPedido(), p.getDataEntrega(), p.getValorTotal()});
                    }
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "Nenhum pedido encontrado para o Cliente ID: " + idCliente);
                }
            } catch (NumberFormatException ex) {
  
                javax.swing.JOptionPane.showMessageDialog(this, "Erro: Por favor, digite apenas números para o ID do Cliente.");
            } catch (Exception ex) {
                javax.swing.JOptionPane.showMessageDialog(this, "Erro ao buscar cliente: " + ex.getMessage());
            }
        }

    } else if (escolha == 2) {
        String dataInicioStr = javax.swing.JOptionPane.showInputDialog(this, "Data Inicial (DD/MM/AAAA):");
        String dataFimStr = javax.swing.JOptionPane.showInputDialog(this, "Data Final (DD/MM/AAAA):");
        
        if (dataInicioStr != null && !dataInicioStr.trim().isEmpty() && dataFimStr != null && !dataFimStr.trim().isEmpty()) {
            try {
                java.util.List<model.Pedido> listaDatas = pedidoController.consultarPorDatas(dataInicioStr, dataFimStr);
                
                if (listaDatas != null && !listaDatas.isEmpty()) {
                    TabelaDadosModel.setNumRows(0); 
                    for(model.Pedido p : listaDatas) {
                        TabelaDadosModel.addRow(new Object[]{p.getIdPedido(), p.getIdCliente(), p.getDataPedido(), p.getDataEntrega(), p.getValorTotal()});
                    }
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "Nenhum pedido encontrado neste intervalo.");
                }
            } catch (Exception ex) {
                javax.swing.JOptionPane.showMessageDialog(this, "Erro ao buscar por datas. Verifique se digitou no formato correto (DD/MM/AAAA).\nDetalhe: " + ex.getMessage());
            }
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

    private void btnGerenciarItensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerenciarItensActionPerformed

    view.ItemView telaItens = new view.ItemView();

    telaItens.setLocationRelativeTo(this); 

    telaItens.setVisible(true);
    }//GEN-LAST:event_btnGerenciarItensActionPerformed

    public static void main(String args[]) {
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
        java.awt.EventQueue.invokeLater(() -> new PedidoView().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel1;
    private javax.swing.JTable TabelaDados;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGerenciarItens;
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