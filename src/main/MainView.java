package main;


public class MainView extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainView.class.getName());

 
    public MainView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnClientes = new javax.swing.JButton();
        btnProdutos = new javax.swing.JButton();
        btnPedidos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema de Gerenciamento de Pedidos");

        btnClientes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClientes.setText("Gerenciar Clientes");
        btnClientes.addActionListener(this::btnClientesActionPerformed);

        btnProdutos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnProdutos.setText("Gerenciar Produtos");
        btnProdutos.addActionListener(this::btnProdutosActionPerformed);

        btnPedidos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPedidos.setText("Gerenciar Pedidos");
        btnPedidos.addActionListener(this::btnPedidosActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(114, 114, 114)
                .addComponent(btnClientes)
                .addGap(52, 52, 52)
                .addComponent(btnProdutos)
                .addGap(62, 62, 62)
                .addComponent(btnPedidos)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        view.ClienteView telaCliente = new view.ClienteView();
        telaCliente.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        telaCliente.setLocationRelativeTo(null);
        telaCliente.setVisible(true);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        view.ProdutoView telaProduto = new view.ProdutoView();
        telaProduto.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        telaProduto.setLocationRelativeTo(null);
        telaProduto.setVisible(true);
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void btnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosActionPerformed
        view.PedidoView telaPedido = new view.PedidoView();
        telaPedido.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        telaPedido.setLocationRelativeTo(null);
        telaPedido.setVisible(true);
    }//GEN-LAST:event_btnPedidosActionPerformed


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> new MainView().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
