package Views.Login;

import Connection.ConnectionDataBase;
import Controllers.Login.Controller_Login;
import Views.Admin.PrincipalViewAdmin;
import Views.User.PrincipalView;
import Models.Login.*;
import java.awt.Color;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class V_Login extends javax.swing.JFrame {

    int xMouse, yMouse;
    Color bg, bgButton;
    Controller_Login login = new Controller_Login();

    public V_Login() {
        initComponents();
        //
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnlImagen = new javax.swing.JPanel();
        pnlLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlForm = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblContraseña = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JPanel();
        lblEntrar = new javax.swing.JLabel();
        pnlCerrar = new javax.swing.JPanel();
        lblCerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlPrincipal.setMinimumSize(new java.awt.Dimension(900, 650));
        pnlPrincipal.setPreferredSize(new java.awt.Dimension(900, 650));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel2MouseDragged(evt);
            }
        });
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        pnlPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 40));

        pnlImagen.setBackground(new java.awt.Color(255, 255, 255));
        pnlImagen.setPreferredSize(new java.awt.Dimension(380, 650));

        javax.swing.GroupLayout pnlImagenLayout = new javax.swing.GroupLayout(pnlImagen);
        pnlImagen.setLayout(pnlImagenLayout);
        pnlImagenLayout.setHorizontalGroup(
            pnlImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        pnlImagenLayout.setVerticalGroup(
            pnlImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        pnlPrincipal.add(pnlImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, -1));

        pnlLogin.setBackground(new java.awt.Color(6, 78, 98));
        pnlLogin.setPreferredSize(new java.awt.Dimension(520, 650));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Login/imagenes/user_icon-icons.com_57997 (1).png"))); // NOI18N

        pnlForm.setBackground(new java.awt.Color(6, 78, 98));

        lblUsuario.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Iniciar Sesion");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("USUARIO:");

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(102, 102, 102));
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        lblContraseña.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña.setText("CONTRASEÑA:");

        txtContraseña.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnEntrar.setBackground(new java.awt.Color(2, 111, 136));
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblEntrar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblEntrar.setForeground(new java.awt.Color(255, 255, 255));
        lblEntrar.setText("   ENTRAR");
        lblEntrar.setToolTipText("");
        lblEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEntrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEntrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEntrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnEntrarLayout = new javax.swing.GroupLayout(btnEntrar);
        btnEntrar.setLayout(btnEntrarLayout);
        btnEntrarLayout.setHorizontalGroup(
            btnEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEntrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnEntrarLayout.setVerticalGroup(
            btnEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlFormLayout = new javax.swing.GroupLayout(pnlForm);
        pnlForm.setLayout(pnlFormLayout);
        pnlFormLayout.setHorizontalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormLayout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
            .addGroup(pnlFormLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtContraseña)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFormLayout.setVerticalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lblContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pnlCerrar.setBackground(new java.awt.Color(6, 78, 98));

        lblCerrar.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        lblCerrar.setForeground(new java.awt.Color(255, 255, 255));
        lblCerrar.setText(" X");
        lblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCerrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlCerrarLayout = new javax.swing.GroupLayout(pnlCerrar);
        pnlCerrar.setLayout(pnlCerrarLayout);
        pnlCerrarLayout.setHorizontalGroup(
            pnlCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );
        pnlCerrarLayout.setVerticalGroup(
            pnlCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addComponent(pnlForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1))
                    .addComponent(pnlCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pnlPrincipal.add(pnlLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 490, -1));

        getContentPane().add(pnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        Connection conexion = ConnectionDataBase.getConnection();
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(V_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jLabel2MouseDragged

    private void lblCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseEntered
        bg = pnlCerrar.getBackground();
        pnlCerrar.setBackground(Color.red);
    }//GEN-LAST:event_lblCerrarMouseEntered

    private void lblCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseExited
        pnlCerrar.setBackground(bg);
    }//GEN-LAST:event_lblCerrarMouseExited

    private void lblEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrarMouseEntered
        bgButton = btnEntrar.getBackground();
        btnEntrar.setBackground(Color.black);
    }//GEN-LAST:event_lblEntrarMouseEntered

    private void lblEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrarMouseExited
        btnEntrar.setBackground(bgButton);
    }//GEN-LAST:event_lblEntrarMouseExited

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        if (txtUsuario.getText().equals("Ingrese su usuario")) {
            txtUsuario.setText("");
        }
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void lblEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrarMouseClicked
        if (validarForm()) {
            ConsultarUser modelUser = new ConsultarUser(txtUsuario.getText(), String.valueOf(txtContraseña.getPassword()));
            GetUser user = login.getUser(modelUser);
            if (user != null) {
                if (user.getRoleId() == 0) {
                    dispose();
                    PrincipalView user_view = new PrincipalView();
                    user_view.setVisible(true);
                }
                if (user.getRoleId() == 1) {
                    dispose();
                    PrincipalViewAdmin admin_view = new PrincipalViewAdmin();
                    admin_view.setVisible(true);
                }
            }
        }

    }//GEN-LAST:event_lblEntrarMouseClicked
    private boolean validarForm(){
        if(validarUser() && validarPass()){
            return true;
        }else{
            return false;
        }
    }
    private boolean validarUser(){
        String texto = txtUsuario.getText().trim();
        if (texto != null) {
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "El campo Usuario esta vacio");
            return false;
        } 
    }
    private boolean validarPass(){
        String texto = String.valueOf(txtContraseña.getPassword());
        if (texto != null) {
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "El campo Usuario esta vacio");
            return false;
        } 
    }
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
            java.util.logging.Logger.getLogger(V_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblEntrar;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlCerrar;
    private javax.swing.JPanel pnlForm;
    private javax.swing.JPanel pnlImagen;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
