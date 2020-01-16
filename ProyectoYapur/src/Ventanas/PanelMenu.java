/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Ventanas.Login;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectoyapur.ConnectarBD;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author maick
 */
public class PanelMenu extends javax.swing.JFrame implements FocusListener {

    /**
     * Creates new form PanelMenu
     */
    private String datos[];
    private ConnectarBD conexion;

    public PanelMenu(ConnectarBD conexion, String datos[]) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.conexion = conexion;
        this.datos = datos;
        this.jLabelNombreUsuario.setText(datos[1] + " " + datos[2] + " " + datos[3]);
        this.jPanelAgregarAlumno.setVisible(false);
    }

    public PanelMenu() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @Override
    public void focusLost(FocusEvent e) {
        if (e.getSource() == jTextFieldRutAgregarU) {
            if (!jTextFieldRutAgregarU.getText().equals("")) {
                if (validarRut(FormatearRUT(jTextFieldRutAgregarU.getText()))) {
                    jTextFieldRutAgregarU.setText(FormatearRUT(jTextFieldRutAgregarU.getText()));
                    jLabelErrorRut.setText("");
                } else {
                    jLabelErrorRut.setText("Rut no valido!");
                    jTextFieldRutAgregarU.addFocusListener(this);
                }
            }
        }
    }

    public boolean validarRut(String rut) {

        boolean validacion = false;
        try {
            rut = rut.toUpperCase();
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

            char dv = rut.charAt(rut.length() - 1);

            int m = 0, s = 1;
            for (; rutAux != 0; rutAux /= 10) {
                s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }

    public String FormatearRUT(String rut) {

        int cont = 0;
        String format;
        rut = rut.replace(".", "");
        rut = rut.replace("-", "");
        format = "-" + rut.substring(rut.length() - 1);
        for (int i = rut.length() - 2; i >= 0; i--) {
            format = rut.substring(i, i + 1) + format;
            cont++;
            if (cont == 3 && i != 0) {
                format = "." + format;
                cont = 0;
            }
        }
        return format;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonAgregarUsuario = new javax.swing.JButton();
        jButtonBloquearUsuario = new javax.swing.JButton();
        jButtonEditarUsuairo = new javax.swing.JButton();
        jPanelAgregarAlumno = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldNombresAgregarU = new javax.swing.JTextField();
        jTextFieldRutAgregarU = new javax.swing.JTextField();
        jTextFieldApellidoPaternoAgregarU = new javax.swing.JTextField();
        jTextFieldApellidoMaternoAgregarU = new javax.swing.JTextField();
        jComboBoxTipoUsuarioAgregar = new javax.swing.JComboBox<>();
        jButtonConfirmarAgregar = new javax.swing.JButton();
        jLabelErrorRut = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPasswordFieldConstraseña = new javax.swing.JPasswordField();
        jPasswordFieldContraseña2 = new javax.swing.JPasswordField();
        jLabelUsuario = new javax.swing.JLabel();
        jButtonCambioUsuario = new javax.swing.JButton();
        jLabelNombreUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Viveros Yapur");
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-yapur.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(1089, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(498, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Ventas", jPanel1);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-yapur.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(1089, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(498, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Inventario", jPanel2);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-yapur.png"))); // NOI18N
        jLabel1.setToolTipText("");

        jButtonAgregarUsuario.setText("Agregar usuario");
        jButtonAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarUsuarioActionPerformed(evt);
            }
        });

        jButtonBloquearUsuario.setText("Bloquear usuario");
        jButtonBloquearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBloquearUsuarioActionPerformed(evt);
            }
        });

        jButtonEditarUsuairo.setText("Editar usuario");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Agregar Usuario");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Nombres:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Apellido paterno:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Apellido materno:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Contraseña:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Rut:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Tipo de usuario:");

        jComboBoxTipoUsuarioAgregar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Vendedor", "Inventario" }));
        jComboBoxTipoUsuarioAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoUsuarioAgregarActionPerformed(evt);
            }
        });

        jButtonConfirmarAgregar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonConfirmarAgregar.setText("Agregar Usuario");
        jButtonConfirmarAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarAgregarActionPerformed(evt);
            }
        });

        jLabelErrorRut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelErrorRut.setForeground(new java.awt.Color(255, 0, 0));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Confirma contraseña:");

        javax.swing.GroupLayout jPanelAgregarAlumnoLayout = new javax.swing.GroupLayout(jPanelAgregarAlumno);
        jPanelAgregarAlumno.setLayout(jPanelAgregarAlumnoLayout);
        jPanelAgregarAlumnoLayout.setHorizontalGroup(
            jPanelAgregarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAgregarAlumnoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelAgregarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAgregarAlumnoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(359, 359, 359))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAgregarAlumnoLayout.createSequentialGroup()
                        .addComponent(jButtonConfirmarAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(257, 257, 257))))
            .addGroup(jPanelAgregarAlumnoLayout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addGroup(jPanelAgregarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(21, 21, 21)
                .addGroup(jPanelAgregarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAgregarAlumnoLayout.createSequentialGroup()
                        .addGroup(jPanelAgregarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldRutAgregarU)
                            .addComponent(jTextFieldNombresAgregarU)
                            .addComponent(jTextFieldApellidoPaternoAgregarU)
                            .addComponent(jTextFieldApellidoMaternoAgregarU)
                            .addComponent(jComboBoxTipoUsuarioAgregar, 0, 161, Short.MAX_VALUE)
                            .addComponent(jPasswordFieldConstraseña))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelErrorRut))
                    .addComponent(jPasswordFieldContraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(239, Short.MAX_VALUE))
        );
        jPanelAgregarAlumnoLayout.setVerticalGroup(
            jPanelAgregarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAgregarAlumnoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(45, 45, 45)
                .addGroup(jPanelAgregarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRutAgregarU, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelErrorRut))
                .addGap(18, 18, 18)
                .addGroup(jPanelAgregarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombresAgregarU, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanelAgregarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldApellidoPaternoAgregarU, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanelAgregarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldApellidoMaternoAgregarU, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(28, 28, 28)
                .addGroup(jPanelAgregarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jPasswordFieldConstraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanelAgregarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jPasswordFieldContraseña2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(18, 22, Short.MAX_VALUE)
                .addGroup(jPanelAgregarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxTipoUsuarioAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(33, 33, 33)
                .addComponent(jButtonConfirmarAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonEditarUsuairo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonBloquearUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(jButtonAgregarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(102, 102, 102)
                .addComponent(jPanelAgregarAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanelAgregarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButtonAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButtonBloquearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButtonEditarUsuairo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 297, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Administración", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1210, 600));

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelUsuario.setText("Usuario:");
        getContentPane().add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, -1, -1));

        jButtonCambioUsuario.setText("Cambiar Usuario");
        jButtonCambioUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCambioUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCambioUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, -1, -1));

        jLabelNombreUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombreUsuario.setText("texto");
        getContentPane().add(jLabelNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCambioUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCambioUsuarioActionPerformed
        Login cambioUsuario = new Login(conexion);
        cambioUsuario.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCambioUsuarioActionPerformed

    private void jButtonBloquearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBloquearUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBloquearUsuarioActionPerformed

    private void jComboBoxTipoUsuarioAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoUsuarioAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoUsuarioAgregarActionPerformed

    private void jButtonAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarUsuarioActionPerformed
        jPanelAgregarAlumno.setVisible(true);
        jTextFieldRutAgregarU.addFocusListener(this);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAgregarUsuarioActionPerformed

    private void jButtonConfirmarAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarAgregarActionPerformed
        String sql;
        PreparedStatement st;
        try {
            String rutUsuario = jTextFieldRutAgregarU.getText();
            String nombreUsuario = jTextFieldNombresAgregarU.getText();
            String contrasena = jPasswordFieldConstraseña.getText();
            String apellidoP = jTextFieldApellidoPaternoAgregarU.getText();
            String apellidoM = jTextFieldApellidoMaternoAgregarU.getText();
            String rol = (String) jComboBoxTipoUsuarioAgregar.getSelectedItem();
            int rol1;
            if (rol.equals("Administrador")) {
                rol1 = 1;
            } else {
                if (rol.equals("Vendedor")) {
                    rol1 = 2;
                } else {
                    rol1 = 3;
                }
            }

            if (validarRut(FormatearRUT(rutUsuario))) {

                sql = "INSERT INTO `usuario`(`rutusuario`, `nombreusuario`, `passwd`, `apellidopaterno`, `apellidomaterno`, `bloqueadoS_N`,`idrol`) VALUES (?,?,?,?,?,?,?)";
                st = conexion.getConnection().prepareStatement(sql);

                st.setString(1, rutUsuario);
                st.setString(2, nombreUsuario);
                st.setString(3, contrasena);
                st.setString(4, apellidoP);
                st.setString(5, apellidoM);
                st.setString(6, "false");
                st.setInt(7, rol1);
                st.executeUpdate();
                jTextFieldRutAgregarU.setText("");
                jTextFieldNombresAgregarU.setText("");
                jTextFieldApellidoPaternoAgregarU.setText("");
                jTextFieldApellidoMaternoAgregarU.setText("");
            } else {

                JOptionPane.showMessageDialog(null, "No se puede ingresar un usuario con rut invalido!");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ya hay un usuario con este rut!");;
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConfirmarAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(PanelMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelMenu().setVisible(true);
            }
        });
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Imagenes/logo-yapur.png"));

        return retValue;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarUsuario;
    private javax.swing.JButton jButtonBloquearUsuario;
    private javax.swing.JButton jButtonCambioUsuario;
    private javax.swing.JButton jButtonConfirmarAgregar;
    private javax.swing.JButton jButtonEditarUsuairo;
    private javax.swing.JComboBox<String> jComboBoxTipoUsuarioAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelErrorRut;
    private javax.swing.JLabel jLabelNombreUsuario;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelAgregarAlumno;
    private javax.swing.JPasswordField jPasswordFieldConstraseña;
    private javax.swing.JPasswordField jPasswordFieldContraseña2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldApellidoMaternoAgregarU;
    private javax.swing.JTextField jTextFieldApellidoPaternoAgregarU;
    private javax.swing.JTextField jTextFieldNombresAgregarU;
    private javax.swing.JTextField jTextFieldRutAgregarU;
    // End of variables declaration//GEN-END:variables

    @Override
    public void focusGained(FocusEvent e) {
        //To change body of generated methods, choose Tools | Templates.
    }

}
