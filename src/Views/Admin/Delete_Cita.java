package Views.Admin;


public class Delete_Cita extends javax.swing.JPanel {

    public Delete_Cita() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblCurp = new javax.swing.JLabel();
        txtCurp = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JLabel();
        pnlEliminar = new javax.swing.JPanel();
        btnEliminar1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 210, 720, -1));

        lblCurp.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblCurp.setForeground(new java.awt.Color(2, 111, 136));
        lblCurp.setText("CURP:");
        add(lblCurp, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 127, 81, 25));

        txtCurp.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtCurp.setForeground(new java.awt.Color(204, 204, 204));
        txtCurp.setText("Ingresar Curp");
        txtCurp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCurpActionPerformed(evt);
            }
        });
        add(txtCurp, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 170, 247, -1));

        lblTitulo.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(2, 111, 136));
        lblTitulo.setText("Eliminar cita");
        add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 46, 282, 46));

        btnEliminar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("    ELIMINAR");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 307, 157, 48));

        pnlEliminar.setBackground(new java.awt.Color(2, 111, 136));

        btnEliminar1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnEliminar1.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar1.setText("    ELIMINAR");
        btnEliminar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminar1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlEliminarLayout = new javax.swing.GroupLayout(pnlEliminar);
        pnlEliminar.setLayout(pnlEliminarLayout);
        pnlEliminarLayout.setHorizontalGroup(
            pnlEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEliminar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
        );
        pnlEliminarLayout.setVerticalGroup(
            pnlEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEliminar1, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        add(pnlEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 147, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtCurpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCurpActionPerformed

    }//GEN-LAST:event_txtCurpActionPerformed

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered

    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited

    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnEliminar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminar1MouseEntered

    }//GEN-LAST:event_btnEliminar1MouseEntered

    private void btnEliminar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminar1MouseExited

    }//GEN-LAST:event_btnEliminar1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel btnEliminar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCurp;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlEliminar;
    private javax.swing.JTextField txtCurp;
    // End of variables declaration//GEN-END:variables
}
