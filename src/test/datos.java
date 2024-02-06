/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test;

import java.awt.Color;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author BENJAMIN RAYON CORONA
 */
public class datos extends javax.swing.JFrame {

    public static String nombre;

    public datos() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Test Vocacional");
        this.setResizable(false);

        setIconImage(new ImageIcon(getClass().getResource("/imagenes/logo_cetis96.png")).getImage());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        labelDatos = new javax.swing.JLabel();
        fieldNombre = new test.TextField();
        fieldEdad = new test.TextField();
        fieldGrado = new test.TextField();
        fieldGrupo = new test.TextField();
        fieldEspecialidad = new test.TextField();
        buttonAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_cetis96.png"))); // NOI18N

        labelDatos.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        labelDatos.setText("INGRESA TUS DATOS");

        fieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNombreActionPerformed(evt);
            }
        });
        fieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldNombreKeyTyped(evt);
            }
        });

        fieldEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldEdadKeyTyped(evt);
            }
        });

        fieldGrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldGradoActionPerformed(evt);
            }
        });
        fieldGrado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldGradoKeyTyped(evt);
            }
        });

        fieldGrupo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldGrupoKeyTyped(evt);
            }
        });

        fieldEspecialidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldEspecialidadKeyTyped(evt);
            }
        });

        buttonAceptar.setBackground(new java.awt.Color(105, 20, 50));
        buttonAceptar.setForeground(new java.awt.Color(255, 255, 255));
        buttonAceptar.setText("Aceptar");
        buttonAceptar.setBorder(null);
        buttonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(labelDatos)
                .addContainerGap(212, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(fieldEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fieldEspecialidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fieldGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fieldGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labelLogo)
                        .addGap(248, 248, 248))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLogo)
                .addGap(18, 18, 18)
                .addComponent(labelDatos)
                .addGap(19, 19, 19)
                .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(fieldEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(buttonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        fieldNombre.setLabelText("Nombre");
        fieldEdad.setLabelText("Edad");
        fieldGrado.setLabelText("Grado");
        fieldGrupo.setLabelText("Grupo");
        fieldEspecialidad.setLabelText("Especialidad");

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAceptarActionPerformed
        if (fieldNombre.getText().isEmpty() || fieldEdad.getText().isEmpty()
                || fieldGrado.getText().isEmpty() || fieldGrupo.getText().isEmpty()) {

            // Configurar el color de fondo de JOptionPane
            //UIManager.put("OptionPane.background", new Color(255, 255, 255));
            //UIManager.put("Panel.background", new Color(255, 255, 255));
            // Mostrar un JOptionPane
            JOptionPane.showMessageDialog(null, "Completa todos los campos", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        } else {

            String nombreTexto = fieldNombre.getText().trim(); // Elimina espacios en blanco al principio y al final

            // Verifica si la cadena contiene al menos una letra
            if (nombreTexto.matches(".*[a-zA-Z].*")) {
                nombre = nombreTexto;

                instrucciones ins = new instrucciones();
                ins.setVisible(true);

                this.setVisible(false);
            } else {
                // Muestra un JOptionPane si la cadena contiene solo espacios en blanco
                JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }

        }


    }//GEN-LAST:event_buttonAceptarActionPerformed

    private void fieldGradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldGradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldGradoActionPerformed

    private void fieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldNombreKeyTyped
        char c = evt.getKeyChar();

        if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {
            evt.consume();
        }


    }//GEN-LAST:event_fieldNombreKeyTyped

    private void fieldEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldEdadKeyTyped
        char c = evt.getKeyChar();
        String text = fieldEdad.getText();

        if ((c < '0' || c > '9') || (text.length() >= 2 && Integer.parseInt(text + c) > 99) || (Integer.parseInt(text + c) == 0)) {
            evt.consume();
        }
    }//GEN-LAST:event_fieldEdadKeyTyped

    private void fieldGradoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldGradoKeyTyped
        char c = evt.getKeyChar();
        String text = fieldGrado.getText();

        if ((c < '1' || c > '6') || (text.length() >= 1 && Integer.parseInt(text + c) > 6)) {
            evt.consume();
        }

    }//GEN-LAST:event_fieldGradoKeyTyped

    private void fieldGrupoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldGrupoKeyTyped
        char c = evt.getKeyChar();
        String text = fieldGrupo.getText();

        if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) || (text.length() >= 1)) {
            evt.consume();
        }
    }//GEN-LAST:event_fieldGrupoKeyTyped

    private void fieldEspecialidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldEspecialidadKeyTyped
        char c = evt.getKeyChar();

        if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_fieldEspecialidadKeyTyped

    private void fieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNombreActionPerformed

    }//GEN-LAST:event_fieldNombreActionPerformed

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
            java.util.logging.Logger.getLogger(datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new datos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAceptar;
    private test.TextField fieldEdad;
    private test.TextField fieldEspecialidad;
    private test.TextField fieldGrado;
    private test.TextField fieldGrupo;
    private test.TextField fieldNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelDatos;
    private javax.swing.JLabel labelLogo;
    // End of variables declaration//GEN-END:variables
}
