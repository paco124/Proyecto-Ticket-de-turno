package Views.User;

import Controllers.User.ControllerUser;
import Models.Login.GetCita;
import Models.User.MAgendar;
import Models.User.ModificarCita;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class EditarCita extends javax.swing.JPanel {
    Color bg = new Color(2,111,136);
    ControllerUser controller = new ControllerUser();
    public EditarCita() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlEditar = new javax.swing.JPanel();
        pnlPrincipal = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblAsunto = new javax.swing.JLabel();
        lblCurp = new javax.swing.JLabel();
        lblPaterno = new javax.swing.JLabel();
        lblMaterno = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblMunicipio = new javax.swing.JLabel();
        lblNivel = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAsunto = new javax.swing.JTextArea();
        pnlLimpiar = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JLabel();
        pnlEdit = new javax.swing.JPanel();
        btnEditar = new javax.swing.JLabel();
        txtCurp = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPaterno = new javax.swing.JTextField();
        txtMaterno = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtNivel = new javax.swing.JTextField();
        txtMunicipio = new javax.swing.JTextField();
        pnlBuscar = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JLabel();
        lblCurp1 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(2, 111, 136));
        lblTitulo.setText("Editar cita");

        lblAsunto.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblAsunto.setForeground(new java.awt.Color(2, 111, 136));
        lblAsunto.setText("ASUNTO:");

        lblCurp.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblCurp.setForeground(new java.awt.Color(2, 111, 136));
        lblCurp.setText("CURP:");

        lblPaterno.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblPaterno.setForeground(new java.awt.Color(2, 111, 136));
        lblPaterno.setText("PATERNO:");

        lblMaterno.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblMaterno.setForeground(new java.awt.Color(2, 111, 136));
        lblMaterno.setText("MATERNO:");

        lblNombre.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(2, 111, 136));
        lblNombre.setText("NOMBRE:");

        lblMunicipio.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblMunicipio.setForeground(new java.awt.Color(2, 111, 136));
        lblMunicipio.setText("MUNICIPIO:");

        lblNivel.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblNivel.setForeground(new java.awt.Color(2, 111, 136));
        lblNivel.setText("NIVEL:");

        lblTelefono.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(2, 111, 136));
        lblTelefono.setText("TELEFONO:");

        txtAsunto.setColumns(20);
        txtAsunto.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txtAsunto.setRows(5);
        jScrollPane1.setViewportView(txtAsunto);

        pnlLimpiar.setBackground(new java.awt.Color(2, 111, 136));

        btnLimpiar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("           LIMPIAR");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlLimpiarLayout = new javax.swing.GroupLayout(pnlLimpiar);
        pnlLimpiar.setLayout(pnlLimpiarLayout);
        pnlLimpiarLayout.setHorizontalGroup(
            pnlLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
        );
        pnlLimpiarLayout.setVerticalGroup(
            pnlLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        pnlEdit.setBackground(new java.awt.Color(2, 111, 136));

        btnEditar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("           EDITAR");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlEditLayout = new javax.swing.GroupLayout(pnlEdit);
        pnlEdit.setLayout(pnlEditLayout);
        pnlEditLayout.setHorizontalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlEditLayout.setVerticalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        txtCurp.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtCurp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCurpActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtPaterno.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaternoActionPerformed(evt);
            }
        });

        txtMaterno.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaternoActionPerformed(evt);
            }
        });

        txtTelefono.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        txtNivel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNivelActionPerformed(evt);
            }
        });

        txtMunicipio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMunicipioActionPerformed(evt);
            }
        });

        pnlBuscar.setBackground(new java.awt.Color(2, 111, 136));

        btnBuscar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("     BUSCAR");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlBuscarLayout = new javax.swing.GroupLayout(pnlBuscar);
        pnlBuscar.setLayout(pnlBuscarLayout);
        pnlBuscarLayout.setHorizontalGroup(
            pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBuscarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlBuscarLayout.setVerticalGroup(
            pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        lblCurp1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblCurp1.setForeground(new java.awt.Color(2, 111, 136));
        lblCurp1.setText("FECHA: DD/MM/AAAA");

        txtFecha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(248, 248, 248))
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(86, 86, 86))
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)))
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(lblMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMunicipio)))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCurp, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCurp, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addComponent(pnlBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCurp1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlPrincipalLayout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(595, Short.MAX_VALUE)))
            .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlPrincipalLayout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(573, Short.MAX_VALUE)))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblCurp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCurp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pnlBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lblCurp1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(lblAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(pnlLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(56, 56, 56))
            .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlPrincipalLayout.createSequentialGroup()
                    .addGap(217, 217, 217)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(388, Short.MAX_VALUE)))
            .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                    .addContainerGap(335, Short.MAX_VALUE)
                    .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(270, 270, 270)))
        );

        javax.swing.GroupLayout pnlEditarLayout = new javax.swing.GroupLayout(pnlEditar);
        pnlEditar.setLayout(pnlEditarLayout);
        pnlEditarLayout.setHorizontalGroup(
            pnlEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlEditarLayout.setVerticalGroup(
            pnlEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCurpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCurpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCurpActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaternoActionPerformed

    private void txtMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaternoActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNivelActionPerformed

    private void txtMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMunicipioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMunicipioActionPerformed

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        bg =pnlBuscar.getBackground();
        pnlBuscar.setBackground(Color.black);
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        pnlBuscar.setBackground(bg);
    }//GEN-LAST:event_btnBuscarMouseExited

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        pnlLimpiar.setBackground(Color.black);
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        pnlLimpiar.setBackground(bg);
    }//GEN-LAST:event_btnLimpiarMouseExited

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        pnlEdit.setBackground(Color.black);
    }//GEN-LAST:event_btnEditarMouseEntered

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        pnlEdit.setBackground(bg);
    }//GEN-LAST:event_btnEditarMouseExited

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        if(true){
            GetCita cita =controller.SelectCita(txtCurp.getText().trim());
            if(cita != null){
                txtNombre.setText(cita.getNombre());
            txtPaterno.setText(cita.getPaterno());
            txtMaterno.setText(cita.getMaterno());
            txtTelefono.setText(Integer.toString(cita.getTelefono()));
            txtNivel.setText(Integer.toString(cita.getNivel()));
            txtMunicipio.setText(cita.getMunicipio());
            txtAsunto.setText(cita.getAsunto());
            }
        }
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        Clear();
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        if(validarForm()){
            ModificarCita cita = new ModificarCita(txtCurp.getText(),txtNombre.getText(), 
                    txtPaterno.getText(), txtMaterno.getText(),
                    Integer.parseInt(txtTelefono.getText()),
                    Integer.parseInt(txtNivel.getText()),
                    txtMunicipio.getText(), txtAsunto.getText(),txtCurp.getText(),
                    txtFecha.getText());
            controller.UpdateCita(cita);
            Clear();
        }
    }//GEN-LAST:event_btnEditarMouseClicked

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed
        private boolean validarForm() {
        if (validarCurp() && validarNombre() && validarPaterno() && validarMaterno()) {
            if (validarTelefono() && validaNivel() && validarMunicipio() && validarAsunto()
                    && validarFecha()) {
                return true;
            }

        }
        return false;
    }

    private boolean validarCurp() {
        String texto = txtCurp.getText().trim();
        if (texto != null) {
            String regex = "^[A-Z]{4}\\d{2}\\d{2}[HM][A-Z]{5}\\d{2}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(texto);
            if(matcher.matches()){
                JOptionPane.showMessageDialog(null, "El curp es incorrecto");
                return false;
            }
            return matcher.matches();
        }else{
            JOptionPane.showMessageDialog(null, "LLenar el campo de curp");
            return false;
        }
        
    }
    private boolean validarFecha() {
        String texto = txtFecha.getText().trim();
        if (texto != null) {
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "LLenar el campo de fecha");
            return false;
        }
    }

    private boolean validarNombre() {
        String texto = txtNombre.getText().trim();
        if (texto != null) {
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "LLenar el campo de nombre");
            return false;
        }
    }

    private boolean validarPaterno() {
        String texto = txtPaterno.getText().trim();
        if (texto != null) {
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "LLenar el campo de Paterno");
            return false;
        }
    }

    private boolean validarMaterno() {
        String texto = txtMaterno.getText().trim();
        if (texto != null) {
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "LLenar el campo de Materno");
            return false;
        }
    }

    private boolean validarTelefono() {
        int numero = Integer.parseInt(txtTelefono.getText().trim());
        if(txtTelefono.getText().trim() != null){
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "LLenar el campo de Telefono");
            return false;
        }
    }

    private boolean validaNivel() {
        int numero = Integer.parseInt(txtNivel.getText().trim());
        if(txtNivel.getText().trim() != null){
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "LLenar el campo de Telefono");
            return false;
        }
    }

    private boolean validarMunicipio() {
        String texto = txtMunicipio.getText().trim();
        if (texto != null) {
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "LLenar el campo de Municipio");
            return false;
        }
    }

    private boolean validarAsunto() {
        String texto = txtAsunto.getText().trim();
        if (texto != null) {
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "LLenar el campo de Asunto");
            return false;
        }
    }
    private void Clear(){
        txtCurp.setText("");
        txtNombre.setText("");
        txtPaterno.setText("");
        txtMaterno.setText("");
        txtTelefono.setText("");
        txtNivel.setText("");
        txtMunicipio.setText("");
        txtAsunto.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBuscar;
    private javax.swing.JLabel btnEditar;
    private javax.swing.JLabel btnLimpiar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAsunto;
    private javax.swing.JLabel lblCurp;
    private javax.swing.JLabel lblCurp1;
    private javax.swing.JLabel lblMaterno;
    private javax.swing.JLabel lblMunicipio;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPaterno;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBuscar;
    private javax.swing.JPanel pnlEdit;
    private javax.swing.JPanel pnlEditar;
    private javax.swing.JPanel pnlLimpiar;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextArea txtAsunto;
    private javax.swing.JTextField txtCurp;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtMaterno;
    private javax.swing.JTextField txtMunicipio;
    private javax.swing.JTextField txtNivel;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPaterno;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
