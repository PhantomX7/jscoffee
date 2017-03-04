public class DlgStock extends javax.swing.JDialog {
    
    public DlgStock(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents(); 
        setLocationRelativeTo(null);
        viewStock();
    }
    
    private void viewStock() {
        txtAmericano.setText(String.valueOf(FrmMain.stockAmericano));
        txtCafeeLatte.setText(String.valueOf(FrmMain.stockCafeeLatte));
        txtCappucino.setText(String.valueOf(FrmMain.stockCappucino));
        txtJavaFrappe.setText(String.valueOf(FrmMain.stockJavaFrappe));
        txtMochaFrappe.setText(String.valueOf(FrmMain.stockMochaFrappe));
        txtVanilleFrappe.setText(String.valueOf(FrmMain.stockVanilleFrappe));
        
        /*
        SOAL
        - perlu dilanjutkan fitur utk preview current baverages stock.
        */
    }
    
    private void saveStock() {
       /*
        SOAL
        - perlu ditambahkan fitur utk save edit beverages stock.
        */
       FrmMain.setStock(Integer.valueOf(txtAmericano.getText()),Integer.valueOf(txtCafeeLatte.getText()),Integer.valueOf(txtCappucino.getText())
               , Integer.valueOf(txtJavaFrappe.getText()), Integer.valueOf(txtMochaFrappe.getText()), Integer.valueOf(txtVanilleFrappe.getText()));
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtAmericano = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCafeeLatte = new javax.swing.JTextField();
        txtCappucino = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtJavaFrappe = new javax.swing.JTextField();
        txtMochaFrappe = new javax.swing.JTextField();
        txtVanilleFrappe = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();

        setTitle("Initial Beverage Stock");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(" STOCK DATA "));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Americano");

        txtAmericano.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtAmericano.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setText("Cafee latte");

        txtCafeeLatte.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtCafeeLatte.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtCappucino.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtCappucino.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setText("Cappucino");

        jLabel3.setText("Java Frappe");

        txtJavaFrappe.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtJavaFrappe.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJavaFrappe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJavaFrappeActionPerformed(evt);
            }
        });

        txtMochaFrappe.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtMochaFrappe.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMochaFrappe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMochaFrappeActionPerformed(evt);
            }
        });

        txtVanilleFrappe.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtVanilleFrappe.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setText("Mocha Frappe");

        jLabel5.setText("Vanille Frappe");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVanilleFrappe, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMochaFrappe, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCappucino, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAmericano, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCafeeLatte, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJavaFrappe, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAmericano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCafeeLatte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCappucino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJavaFrappe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMochaFrappe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVanilleFrappe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        btnSave.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(139, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        saveStock();
        dispose();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtJavaFrappeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJavaFrappeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJavaFrappeActionPerformed

    private void txtMochaFrappeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMochaFrappeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMochaFrappeActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAmericano;
    private javax.swing.JTextField txtCafeeLatte;
    private javax.swing.JTextField txtCappucino;
    private javax.swing.JTextField txtJavaFrappe;
    private javax.swing.JTextField txtMochaFrappe;
    private javax.swing.JTextField txtVanilleFrappe;
    // End of variables declaration//GEN-END:variables
}
