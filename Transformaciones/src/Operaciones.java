/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maick
 */
public class Operaciones extends javax.swing.JFrame {

    /**
     * Creates new form Operaciones
     */
    public Operaciones() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jComboBoxTipo1 = new javax.swing.JComboBox<>();
        jComboBoxTipo2 = new javax.swing.JComboBox<>();
        jTextFieldNumero1 = new javax.swing.JTextField();
        jTextFieldNumero2 = new javax.swing.JTextField();
        jComboBoxOperacion = new javax.swing.JComboBox<>();
        jTextFieldResultado = new javax.swing.JTextField();
        jComboBoxTipo3 = new javax.swing.JComboBox<>();
        jButtonAtras = new javax.swing.JButton();
        jButtonIgual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(679, 468));
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel2.setText("Calculadora");

        jComboBoxTipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Decimal", "Binario", "Hexadecimal", "Octal" }));

        jComboBoxTipo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Decimal", "Binario", "Hexadecimal", "Octal" }));
        jComboBoxTipo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipo2ActionPerformed(evt);
            }
        });

        jTextFieldNumero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumero1ActionPerformed(evt);
            }
        });

        jComboBoxOperacion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jComboBoxOperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-", "X", "/" }));
        jComboBoxOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOperacionActionPerformed(evt);
            }
        });

        jTextFieldResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldResultadoActionPerformed(evt);
            }
        });

        jComboBoxTipo3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Decimal", "Binario", "Hexadecimal", "Octal" }));

        jButtonAtras.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonAtras.setText("Atras");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });

        jButtonIgual.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonIgual.setText("=");
        jButtonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNumero1)
                            .addComponent(jComboBoxTipo1, 0, 159, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jComboBoxTipo2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBoxOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonIgual)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldResultado)
                                    .addComponent(jComboBoxTipo3, 0, 159, Short.MAX_VALUE))))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTipo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTipo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        String[] args = new String[1];
        Interfaz.main(args);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jComboBoxTipo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipo2ActionPerformed

    private void jTextFieldNumero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumero1ActionPerformed

    private void jButtonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIgualActionPerformed
        String numero1 = jTextFieldNumero1.getText();
        String numero2 = jTextFieldNumero2.getText();

        int tipo1 = jComboBoxTipo1.getSelectedIndex();
        int tipo2 = jComboBoxTipo2.getSelectedIndex();
        int tipo3 = jComboBoxTipo3.getSelectedIndex();

        int operacion = jComboBoxOperacion.getSelectedIndex();

        int tipo1Trans = 0;
        int tipo2Trans = 0;

        if (tipo1 == 0) {
            tipo1Trans = Integer.parseInt(numero1);
        } else if (tipo1 == 1) {
            tipo1Trans = binarioAdecimal(numero1);
        } else if (tipo1 == 2) {
            tipo1Trans = hexadecimalAdecimal(numero1);
        } else {
            tipo1Trans = Integer.parseInt(octalAdecimal(numero1));
        }

        if (tipo2 == 0) {
            tipo2Trans = Integer.parseInt(numero2);
        } else if (tipo2 == 1) {
            tipo2Trans = binarioAdecimal(numero2);
        } else if (tipo2 == 2) {
            tipo2Trans = hexadecimalAdecimal(numero2);
        } else {
            tipo2Trans = Integer.parseInt(octalAdecimal(numero2));
        }

        if (operacion == 0) {
            if (tipo3 == 0) {
                jTextFieldResultado.setText("" + (tipo1Trans + tipo2Trans));
            } else if (tipo3 == 1) {
                jTextFieldResultado.setText(decimalAbinario(tipo1Trans + tipo2Trans));
            } else if (tipo3 == 2) {
                jTextFieldResultado.setText(decimalAhexadecimal(tipo1Trans + tipo2Trans));
            } else {
                jTextFieldResultado.setText("" + decimalAoctal(tipo1Trans + tipo2Trans));
            }
        } else if (operacion == 1) {
            if (tipo3 == 0) {
                jTextFieldResultado.setText("" + (tipo1Trans - tipo2Trans));
            } else if (tipo3 == 1) {
                jTextFieldResultado.setText(decimalAbinario(tipo1Trans - tipo2Trans));
            } else if (tipo3 == 2) {
                jTextFieldResultado.setText(decimalAhexadecimal(tipo1Trans - tipo2Trans));
            } else {
                jTextFieldResultado.setText("" + decimalAoctal(tipo1Trans - tipo2Trans));
            }
        } else if (operacion == 2) {
            if (tipo3 == 0) {
                jTextFieldResultado.setText("" + (tipo1Trans * tipo2Trans));
            } else if (tipo3 == 1) {
                jTextFieldResultado.setText(decimalAbinario(tipo1Trans * tipo2Trans));
            } else if (tipo3 == 2) {
                jTextFieldResultado.setText(decimalAhexadecimal(tipo1Trans * tipo2Trans));
            } else {
                jTextFieldResultado.setText("" + decimalAoctal(tipo1Trans * tipo2Trans));
            }
        } else if (tipo3 == 0) {
            jTextFieldResultado.setText("" + (tipo1Trans / tipo2Trans));
        } else if (tipo3 == 1) {
            jTextFieldResultado.setText(decimalAbinario(tipo1Trans / tipo2Trans));
        } else if (tipo3 == 2) {
            jTextFieldResultado.setText(decimalAhexadecimal(tipo1Trans / tipo2Trans));
        } else {
            jTextFieldResultado.setText("" + decimalAoctal(tipo1Trans / tipo2Trans));
        }

    }//GEN-LAST:event_jButtonIgualActionPerformed

    private void jComboBoxOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOperacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxOperacionActionPerformed

    private void jTextFieldResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldResultadoActionPerformed

    public static String octalAdecimal(String numero) {
        return octalAdecimalRec(Integer.parseInt(numero));
    }

    public static String octalAdecimalRec(int numero) {
        if (numero / 8 != 0) {
            return octalAdecimalRec(numero / 8) + Integer.toString(numero % 8);
        }
        return Integer.toString(numero % 8);
    }

    public static int decimalAoctal(int numero) {
        return decimalAoctalRec("" + numero);
    }

    public static int decimalAoctalRec(String numero) {
        int sum = 0;
        int j = 0;
        for (int i = numero.length() - 1; i > -1; i--) {
            sum = sum + Integer.parseInt(String.valueOf(numero.charAt(j))) * ((int) Math.pow(8, i));
            j++;
        }
        return sum;
    }

    public static int binarioAdecimal(String binario) {
        int sum = 0;
        int j = 0;
        for (int i = binario.length() - 1; i > -1; i--) {
            sum = sum + Integer.parseInt(String.valueOf(binario.charAt(j))) * ((int) Math.pow(2, i));
            j++;
        }
        return sum;
    }

    public static String decimalAbinario(int numero) {
        if (numero / 2 >= 1) {
            if (numero % 2 == 0) {
                return decimalAbinario(numero / 2) + "0";
            } else {
                return decimalAbinario(numero / 2) + "1";
            }
        } else if (numero % 2 == 1) {
            return "1";
        } else {
            return "0";
        }
    }

    private static String decimalAhexadecimal(int numero) {
        String[] digito = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        int valor = numero / 16;
        int resto = numero % 16;

        if (numero < 16) {
            return digito[resto];

        } else {
            return decimalAhexadecimal(valor) + digito[resto];
        }
    }

    private static int hexadecimalAdecimal(String numero) {
        int suma = 0;
        int j = 0;

        for (int i = numero.length() - 1; i > -1; i--) {
            if (numero.charAt(j) == 'A' || numero.charAt(j) == 'a') {
                suma = suma + 10 * (int) Math.pow(16, i);
            } else if (numero.charAt(j) == 'B' || numero.charAt(j) == 'b') {
                suma = suma + 11 * (int) Math.pow(16, i);
            } else if (numero.charAt(j) == 'C' || numero.charAt(j) == 'c') {
                suma = suma + 12 * (int) Math.pow(16, i);
            } else if (numero.charAt(j) == 'D' || numero.charAt(j) == 'd') {
                suma = suma + 13 * (int) Math.pow(16, i);
            } else if (numero.charAt(j) == 'E' || numero.charAt(j) == 'e') {
                suma = suma + 14 * (int) Math.pow(16, i);
            } else if (numero.charAt(j) == 'F' || numero.charAt(j) == 'f') {
                suma = suma + 15 * (int) Math.pow(16, i);
            } else {
                suma = suma + Integer.parseInt(String.valueOf(numero.charAt(j))) * (int) Math.pow(16, i);
            }
            j++;
        }
        return suma;
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
            java.util.logging.Logger.getLogger(Operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Operaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonIgual;
    private javax.swing.JComboBox<String> jComboBoxOperacion;
    private javax.swing.JComboBox<String> jComboBoxTipo1;
    private javax.swing.JComboBox<String> jComboBoxTipo2;
    private javax.swing.JComboBox<String> jComboBoxTipo3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextFieldNumero1;
    private javax.swing.JTextField jTextFieldNumero2;
    private javax.swing.JTextField jTextFieldResultado;
    // End of variables declaration//GEN-END:variables
}
