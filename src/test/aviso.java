/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.io.FileOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

/**
 *
 * @author BENJAMIN RAYON CORONA
 */
public class aviso extends javax.swing.JFrame {

    String parrafo1;
    String parrafo2;
    String parrafo3;
    String parrafo4;
    String parrafo5;
    String parrafo6;
    String parrafo7;

    public aviso() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Test Vocacional");
        this.setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/logo_cetis96.png")).getImage());

        String aviso = "Los datos de carácter personal que se recopilan dentro de esta Página de Registro Web, denominada “TEST DE ORIENTACIÓN VOCACIONAL”, que usted mismo proporciona de manera voluntaria, serán utilizados única y exclusivamente con la finalidad y el objetivo de obtener información sobre la carrera que podría estudiar dentro de esta Institución Educativa de acuerdo a su Perfil Vocacional como persona.\n"
                + "\n"
                + "Por tanto, desde este momento en que usted proporciona sus datos considerados de carácter personal, tal como lo es el nombre, edad, grado, grupo, carrera, entre otros, el Centro de Estudios Tecnológicos Industrial y de Servicios No 96, se compromete a la debida recopilación, tratamiento, almacenamiento, cuidado, salvaguarda y protección de los mismos, con las medidas de seguridad técnicas y administrativas establecidas en materia legal corresponde.";

        parrafo1 = "Los datos personales que voluntariamente proporciona a esta Institucion Educativa de forma electrónica o personal serán recabados, protegidos, incorporados y tratados en el Sistema de Datos Personales del Centro de Estudios Tecnológicos Industrial y de Servicios No 96, ubicado en calle Emiliano Zapata S/N, La Mora, San Martín Cuautlalpan, Chalco Estado de México, C.P. 56644.";
        parrafo2 = "Debiendo tomar en consideración que por datos personales debe entenderse cualquier información concerniente a una persona física identificada o identificable, como lo son: domicilio particular, número de teléfono particular, cuenta personal de correo electrónico, origen étnico, estado de salud, huella digital, etc.";
        parrafo3 = "En la inteligencia que el responsable del sistema de sus datos personales es la autoridad que los recaba, los mismos serán utilizados única y exclusivamente para los fines propios de cada una de las Dependencias que conforman esta Institución. Asimismo, tales datos personales podrán ser proporcionados únicamente a la Autoridad que al efecto acredite contar con facultad para ello.";
        parrafo4 = "En caso de negativa a suministrar los datos personales requeridos por la autoridad y/o funcionario, interrumpirá indefinidamente el trámite y/o procedimiento a realizar en esta institución.";
        parrafo5 = "La autenticidad y actualización de los datos proporcionados es responsabilidad tanto de Usted como de la Autoridad que los recaba.";
        parrafo6 = "Ahora bien, usted podrá ejercer sus derechos de Acceso, Rectificación, Cancelación u Oposición de sus Datos Personales, de manera presencial ante la Unidad de Enlace de Transparencia, Acceso a la Información y Protección de Datos Personales o bien vía correo en la dirección vinculacioncetis96@gmail.com";
        parrafo7 = "Finalmente para cualquier cambio respecto a este Aviso de Privacidad del Centro de Estudios Tecnológicos Industrial y de Servicios No 96, se reserva el derecho a efectuar en cualquier momento modificaciones o actualizaciones al presente aviso y se compromete a informar a usted, de manera oportuna, a través de los medios adecuados como lo es esta página web https://www.cetis96.edu.mx/cetis96 o mediante correo electrónico que Usted proporcione a esta Institución.";

        jAviso.setText(aviso);
        jAviso.setCaretPosition(0);
        SimpleAttributeSet attribs = new SimpleAttributeSet();
        StyleConstants.setAlignment(attribs, StyleConstants.ALIGN_JUSTIFIED);
        jAviso.getStyledDocument().setParagraphAttributes(0, aviso.length(), attribs, false);
        jAviso.setEditable(false);
        jAviso.setCursor(null);
        jAviso.setCaretColor(Color.WHITE);
        jScrollPane.getVerticalScrollBar().setValue(0);
        getContentPane().setBackground(Color.WHITE);
        jScrollPane.setVerticalScrollBar(new ScrollBarCustom());
        jIniciar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        jAviso = new javax.swing.JTextPane();
        jAvisoCheck = new javax.swing.JCheckBox();
        jAvisoPrivacidad = new javax.swing.JButton();
        jIniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel1.setText("Aviso de privacidad");

        jScrollPane.setBorder(null);

        jAviso.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jScrollPane.setViewportView(jAviso);

        jAvisoCheck.setBackground(new java.awt.Color(255, 255, 255));
        jAvisoCheck.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jAvisoCheck.setText("He leído y acepto el");
        jAvisoCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAvisoCheckActionPerformed(evt);
            }
        });

        jAvisoPrivacidad.setForeground(new java.awt.Color(0, 51, 204));
        jAvisoPrivacidad.setText("Aviso de Privacidad");
        jAvisoPrivacidad.setBorder(null);
        jAvisoPrivacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAvisoPrivacidadActionPerformed(evt);
            }
        });

        jIniciar.setBackground(new java.awt.Color(105, 20, 50));
        jIniciar.setForeground(new java.awt.Color(255, 255, 255));
        jIniciar.setText("Iniciar");
        jIniciar.setBorder(null);
        jIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(193, 193, 193))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jAvisoCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jAvisoPrivacidad))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAvisoCheck)
                    .addComponent(jAvisoPrivacidad))
                .addGap(33, 33, 33)
                .addComponent(jIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jAvisoPrivacidad.setBackground(Color.WHITE);
        jAvisoPrivacidad.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAvisoCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAvisoCheckActionPerformed
        if (jAvisoCheck.isSelected()) {
            jIniciar.setEnabled(true);
        } else {
            jIniciar.setEnabled(false);
        }
    }//GEN-LAST:event_jAvisoCheckActionPerformed

    private void jIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIniciarActionPerformed
        datos dt = new datos();
        dt.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jIniciarActionPerformed

    private void jAvisoPrivacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAvisoPrivacidadActionPerformed
        Document documento = new Document(PageSize.LEGAL, 72, 72, 36, 36);
        datos datos = new datos();
        String dateTime = DateTimeFormatter.ofPattern("MM/dd/yyy, hh:mm:ss a")
                .format(LocalDateTime.now());

        try {
            String ruta = System.getProperty("user.home");

            PdfWriter writer = PdfWriter.getInstance(documento, new FileOutputStream("Aviso/AVISO DE PRIVACIDAD.pdf"));

            documento.open();

            Image header = Image.getInstance("imagenes/logo.png");

            header.setAlignment(1);
            documento.add(header);
            documento.add(Chunk.NEWLINE);

            Paragraph titutlo = new Paragraph("AVISO DE PRIVACIDAD");
            titutlo.setAlignment(1);
            documento.add(titutlo);
            documento.add(Chunk.NEWLINE);

            Paragraph p1 = new Paragraph(parrafo1);
            p1.setAlignment(Element.ALIGN_JUSTIFIED);
            documento.add(p1);
            documento.add(Chunk.NEWLINE);

            Paragraph p2 = new Paragraph(parrafo2);
            p2.setAlignment(Element.ALIGN_JUSTIFIED);
            documento.add(p2);
            documento.add(Chunk.NEWLINE);

            Paragraph p3 = new Paragraph(parrafo3);
            p3.setAlignment(Element.ALIGN_JUSTIFIED);
            documento.add(p3);
            documento.add(Chunk.NEWLINE);

            Paragraph p4 = new Paragraph(parrafo4);
            p4.setAlignment(Element.ALIGN_JUSTIFIED);
            documento.add(p4);
            documento.add(Chunk.NEWLINE);

            Paragraph p5 = new Paragraph(parrafo5);
            p5.setAlignment(Element.ALIGN_JUSTIFIED);
            documento.add(p5);
            documento.add(Chunk.NEWLINE);

            Paragraph p6 = new Paragraph(parrafo6);
            p6.setAlignment(Element.ALIGN_JUSTIFIED);
            documento.add(p6);
            documento.add(Chunk.NEWLINE);

            Paragraph p7 = new Paragraph(parrafo7);
            p7.setAlignment(Element.ALIGN_JUSTIFIED);
            documento.add(p7);
            documento.add(Chunk.NEWLINE);

            documento.close();

            String URL = "Aviso/AVISO DE PRIVACIDAD.pdf";

            ProcessBuilder p = new ProcessBuilder();
            p.command("cmd.exe", "/c", URL);
            p.start();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jAvisoPrivacidadActionPerformed

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
            java.util.logging.Logger.getLogger(aviso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aviso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aviso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aviso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aviso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane jAviso;
    private javax.swing.JCheckBox jAvisoCheck;
    private javax.swing.JButton jAvisoPrivacidad;
    private javax.swing.JButton jIniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane;
    // End of variables declaration//GEN-END:variables
}
