package Views.User;

import Views.Login.V_Login;
import java.awt.BorderLayout;
import java.awt.Color;


public class PrincipalView extends javax.swing.JFrame {

    int xMouse,yMouse;
    Color bg, bgButton;
    Agendar_Cita agendar = new Agendar_Cita();
    public PrincipalView() {
        initComponents();
        generarComponentes();
    }
    private void generarComponentes(){
        agendar.setSize(740,630);
        agendar.setLocation(0,0);
        pnlVistas.removeAll();
        pnlVistas.add(agendar, BorderLayout.CENTER);
        pnlVistas.revalidate();
        pnlVistas.repaint();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnlNav = new javax.swing.JPanel();
        btnPerfil = new javax.swing.JLabel();
        pnlPrincipal = new javax.swing.JPanel();
        pnlPerfil = new javax.swing.JPanel();
        imgPerfil = new javax.swing.JLabel();
        pnlMenu = new javax.swing.JPanel();
        imgMenu = new javax.swing.JLabel();
        pnlHome = new javax.swing.JPanel();
        btnAgendar = new javax.swing.JLabel();
        pnlEditar = new javax.swing.JPanel();
        btnEditar = new javax.swing.JLabel();
        pnlEliminar = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JLabel();
        pnlCerrarSesion = new javax.swing.JPanel();
        btnCerrarSesion = new javax.swing.JLabel();
        pnlConsultar = new javax.swing.JPanel();
        btnConsultar = new javax.swing.JLabel();
        pnlVistas = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(900, 650));
        setResizable(false);

        pnl.setBackground(new java.awt.Color(255, 255, 255));
        pnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        pnl.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 40));

        btnPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPerfilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPerfilMouseExited(evt);
            }
        });

        pnlPrincipal.setBackground(new java.awt.Color(2, 111, 136));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlPerfil.setBackground(new java.awt.Color(2, 111, 136));

        imgPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Login/imagenes/Edit User.png"))); // NOI18N
        imgPerfil.setAlignmentX(0.5F);
        imgPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgPerfil.setIconTextGap(0);

        javax.swing.GroupLayout pnlPerfilLayout = new javax.swing.GroupLayout(pnlPerfil);
        pnlPerfil.setLayout(pnlPerfilLayout);
        pnlPerfilLayout.setHorizontalGroup(
            pnlPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPerfilLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(imgPerfil)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPerfilLayout.setVerticalGroup(
            pnlPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
        );

        pnlPrincipal.add(pnlPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 57, 160, -1));

        pnlMenu.setBackground(new java.awt.Color(2, 111, 136));

        imgMenu.setBackground(new java.awt.Color(255, 255, 255));
        imgMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Login/imagenes/List.png"))); // NOI18N
        imgMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgMenuMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(imgMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlPrincipal.add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlHome.setBackground(new java.awt.Color(2, 111, 136));

        btnAgendar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnAgendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Login/imagenes/Home Page.png"))); // NOI18N
        btnAgendar.setText("Agendar Cita");
        btnAgendar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgendarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgendarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgendarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlHomeLayout = new javax.swing.GroupLayout(pnlHome);
        pnlHome.setLayout(pnlHomeLayout);
        pnlHomeLayout.setHorizontalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAgendar, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        pnlHomeLayout.setVerticalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAgendar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        pnlPrincipal.add(pnlHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 160, 60));

        pnlEditar.setBackground(new java.awt.Color(2, 111, 136));

        btnEditar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Login/imagenes/Edit.png"))); // NOI18N
        btnEditar.setText("Editar Cita");
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

        javax.swing.GroupLayout pnlEditarLayout = new javax.swing.GroupLayout(pnlEditar);
        pnlEditar.setLayout(pnlEditarLayout);
        pnlEditarLayout.setHorizontalGroup(
            pnlEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        pnlEditarLayout.setVerticalGroup(
            pnlEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        pnlPrincipal.add(pnlEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 160, 60));

        pnlEliminar.setBackground(new java.awt.Color(2, 111, 136));

        btnEliminar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Login/imagenes/Remove.png"))); // NOI18N
        btnEliminar.setText("Eliminar Cita");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlEliminarLayout = new javax.swing.GroupLayout(pnlEliminar);
        pnlEliminar.setLayout(pnlEliminarLayout);
        pnlEliminarLayout.setHorizontalGroup(
            pnlEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        pnlEliminarLayout.setVerticalGroup(
            pnlEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        pnlPrincipal.add(pnlEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 160, 60));

        pnlCerrarSesion.setBackground(new java.awt.Color(2, 111, 136));

        btnCerrarSesion.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Login/imagenes/logout.png"))); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlCerrarSesionLayout = new javax.swing.GroupLayout(pnlCerrarSesion);
        pnlCerrarSesion.setLayout(pnlCerrarSesionLayout);
        pnlCerrarSesionLayout.setHorizontalGroup(
            pnlCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        pnlCerrarSesionLayout.setVerticalGroup(
            pnlCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        pnlPrincipal.add(pnlCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 160, 60));

        pnlConsultar.setBackground(new java.awt.Color(2, 111, 136));

        btnConsultar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Login/imagenes/Search.png"))); // NOI18N
        btnConsultar.setText("Consultar Cita");
        btnConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConsultarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsultarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlConsultarLayout = new javax.swing.GroupLayout(pnlConsultar);
        pnlConsultar.setLayout(pnlConsultarLayout);
        pnlConsultarLayout.setHorizontalGroup(
            pnlConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        pnlConsultarLayout.setVerticalGroup(
            pnlConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        pnlPrincipal.add(pnlConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 160, 60));

        javax.swing.GroupLayout pnlNavLayout = new javax.swing.GroupLayout(pnlNav);
        pnlNav.setLayout(pnlNavLayout);
        pnlNavLayout.setHorizontalGroup(
            pnlNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
        );
        pnlNavLayout.setVerticalGroup(
            pnlNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
            .addGroup(pnlNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlNavLayout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addComponent(btnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(484, Short.MAX_VALUE)))
        );

        pnl.add(pnlNav, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlVistas.setBackground(new java.awt.Color(255, 255, 255));
        pnlVistas.setPreferredSize(new java.awt.Dimension(740, 630));

        javax.swing.GroupLayout pnlVistasLayout = new javax.swing.GroupLayout(pnlVistas);
        pnlVistas.setLayout(pnlVistasLayout);
        pnlVistasLayout.setHorizontalGroup(
            pnlVistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        pnlVistasLayout.setVerticalGroup(
            pnlVistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        pnl.add(pnlVistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 740, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x -xMouse, y - yMouse);
    }//GEN-LAST:event_jLabel2MouseDragged

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jLabel2MousePressed
    private void btnPerfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPerfilMouseEntered
        pnlPerfil.setBackground(Color.white);
    }//GEN-LAST:event_btnPerfilMouseEntered
    private void btnPerfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPerfilMouseExited
        pnlPerfil.setBackground(bg);
    }//GEN-LAST:event_btnPerfilMouseExited
    private void imgMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMenuMouseEntered
        pnlMenu.setBackground(Color.white);
    }//GEN-LAST:event_imgMenuMouseEntered
    private void imgMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMenuMouseExited
        pnlMenu.setBackground(bg);
    }//GEN-LAST:event_imgMenuMouseExited
    private void btnAgendarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgendarMouseEntered
        pnlHome.setBackground(Color.white);
    }//GEN-LAST:event_btnAgendarMouseEntered
    private void btnAgendarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgendarMouseExited
        pnlHome.setBackground(bg);
    }//GEN-LAST:event_btnAgendarMouseExited
    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        pnlEditar.setBackground(Color.white);
    }//GEN-LAST:event_btnEditarMouseEntered
    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        pnlEditar.setBackground(bg);
    }//GEN-LAST:event_btnEditarMouseExited
    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        pnlEliminar.setBackground(Color.white);
    }//GEN-LAST:event_btnEliminarMouseEntered
    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        pnlEliminar.setBackground(bg);
    }//GEN-LAST:event_btnEliminarMouseExited
    private void btnCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseEntered
        pnlCerrarSesion.setBackground(Color.white);
    }//GEN-LAST:event_btnCerrarSesionMouseEntered
    private void btnCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseExited
        pnlCerrarSesion.setBackground(bg);
    }//GEN-LAST:event_btnCerrarSesionMouseExited
    private void btnAgendarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgendarMouseClicked
        agendar.setSize(740,630);
        agendar.setLocation(0,0);
        pnlVistas.removeAll();
        pnlVistas.add(agendar, BorderLayout.CENTER);
        pnlVistas.revalidate();
        pnlVistas.repaint();
    }//GEN-LAST:event_btnAgendarMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        EditarCita editarCita = new EditarCita();
        editarCita.setSize(740,630);
        editarCita.setLocation(0,0);
        pnlVistas.removeAll();
        pnlVistas.add(editarCita, BorderLayout.CENTER);
        pnlVistas.revalidate();
        pnlVistas.repaint();
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        Delete_Cita deleteCita = new Delete_Cita();
        deleteCita.setSize(740,630);
        deleteCita.setLocation(0,0);
        pnlVistas.removeAll();
        pnlVistas.add(deleteCita, BorderLayout.CENTER);
        pnlVistas.revalidate();
        pnlVistas.repaint();
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
        dispose();
        V_Login login = new V_Login();
        login.setVisible(true);
    }//GEN-LAST:event_btnCerrarSesionMouseClicked

    private void btnConsultarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarMouseEntered
        pnlConsultar.setBackground(Color.white);
    }//GEN-LAST:event_btnConsultarMouseEntered

    private void btnConsultarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarMouseExited
        pnlConsultar.setBackground(bg);
    }//GEN-LAST:event_btnConsultarMouseExited

    private void btnConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarMouseClicked
        Consultar_Cita consultarCita = new Consultar_Cita();
        consultarCita.setSize(740,630);
        consultarCita.setLocation(0,0);
        pnlVistas.removeAll();
        pnlVistas.add(consultarCita, BorderLayout.CENTER);
        pnlVistas.revalidate();
        pnlVistas.repaint();
    }//GEN-LAST:event_btnConsultarMouseClicked
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
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAgendar;
    private javax.swing.JLabel btnCerrarSesion;
    private javax.swing.JLabel btnConsultar;
    private javax.swing.JLabel btnEditar;
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel btnPerfil;
    private javax.swing.JLabel imgMenu;
    private javax.swing.JLabel imgPerfil;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pnl;
    private javax.swing.JPanel pnlCerrarSesion;
    private javax.swing.JPanel pnlConsultar;
    private javax.swing.JPanel pnlEditar;
    private javax.swing.JPanel pnlEliminar;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlNav;
    private javax.swing.JPanel pnlPerfil;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlVistas;
    // End of variables declaration//GEN-END:variables
}
