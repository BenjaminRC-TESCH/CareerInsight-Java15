/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author BENJAMIN RAYON CORONA
 */
public class intereses extends javax.swing.JFrame {

    public static int interesesServicioSocial;
    public static int interesesEjecutivoPersuasiva;
    public static int interesesVerbal;
    public static int interesesArtisticoPlastica;
    public static int interesesMusical;
    public static int interesesOrganizacion;
    public static int interesesCientifica;
    public static int interesesCalculo;
    public static int interesesMecanicoConstructiva;
    public static int interesesTrabajoAlAireLibre;

    private int preguntaActual = 0; // Para llevar un seguimiento de la pregunta actual
    private List<Integer> respuestas = new ArrayList<>();
    private String[] preguntas = {
        "1. Atender y cuidar enfermos",
        "2. Intervenir activamente en las discusiones de clase.",
        "3. Escribir cuentos, crónicas o artículos.",
        "4. Dibujar y pintar.",
        "5. Cantar en un coro estudiantil.",
        "6. Llevar en orden tus libros y cuadernos.",
        "7. Conocer y estudiar la estructura de las plantas y de los animales.",
        "8. Resolver cuestionarios de matemáticas.",
        "9. Armar y desarmar objetos mecánicos.",
        "10. Salir de excursión.",
        "11. Proteger a los muchachos menores del grupo.",
        "12. Ser jefe de un grupo.",
        "13. Leer obras literarias.",
        "14. Moldear el barro, plastilina o cualquier otro material.",
        "15. Escuchar música clásica.",
        "16. Ordenar y clasificar los libros de una biblioteca.",
        "17. Hacer experimentos en un laboratorio.",
        "18. Resolver problemas de aritmética.",
        "19. Manejar herramientas y maquinaria.",
        "20. Pertenecer a un grupo de exploradores.",
        "21. Ser miembro de una sociedad de ayuda y asistencia.",
        "22. Dirigir la campaña política para un candidato estudiantil.",
        "23. Hacer versos para una publicación.",
        "24. Encargarte del decorado del lugar para un festival.",
        "25. Aprender a tocar un instrumento musical.",
        "26. Aprender a escribir a máquina y en taquigrafía.",
        "27. Investigar el origen de las costumbres de los pueblos.",
        "28. Llevar las cuentas de una institución.",
        "29. Construir objeto o muebles.",
        "30. Trabajar al aire libre, fuera de la ciudad.",
        "31. Enseñar a leer a los analfabetos.",
        "32. Hacer propaganda para la difusión de una idea.",
        "33. Representar un papel en una obra de teatro.",
        "34. Idear y diseñar el escudo de un club o sociedad.",
        "35. Ser miembro de una asociación musical.",
        "36. Ayudar a calificar pruebas.",
        "37. Estudiar y entender las causas de los movimientos sociales.",
        "38. Explicar a otros cómo resolver problemas de matemáticas.",
        "39. Reparar las instalaciones eléctricas, de gas o de plomería en tu casa.",
        "40. Sembrar y plantar en una granja durante las vacaciones.",
        "41. Ayudar a tus compañeros en sus dificultades y preocupaciones.",
        "42. Leer biografías de políticos eminentes.",
        "43. Participar en un concurso de oratoria.",
        "44. Diseñar el vestuario para una función teatral.",
        "45. Leer biografías de músicos eminentes.",
        "46. Encargarte del archivo y los documentos de una sociedad.",
        "47. Leer revistas y libros científicos.",
        "48. Participar en concursos de matemáticas.",
        "49. Proyectar y dirigir alguna construcción.",
        "50. Atender animales en un rancho durante las vacaciones.",
        "51. ¿Qué tanto te gustaría trabajar como? Funcionario al servicio de las clases humildes.",
        "52. ¿Qué tanto te gustaría trabajar como? Experto en relaciones sociales de una gran empresa.",
        "53. ¿Qué tanto te gustaría trabajar como? Escritor en un periódico o empresa editorial.",
        "54. ¿Qué tanto te gustaría trabajar como? Dibujante profesional en una empresa.",
        "55. ¿Qué tanto te gustaría trabajar como? Concertista en una sinfónica.",
        "56. ¿Qué tanto te gustaría trabajar como? Técnico organizador de oficinas.",
        "57. ¿Qué tanto te gustaría trabajar como? Investigar en un laboratorio.",
        "58. ¿Qué tanto te gustaría trabajar como? Experto calculista en una institución.",
        "59. ¿Qué tanto te gustaría trabajar como? Perito mecánico en un taller.",
        "60. ¿Qué tanto te gustaría trabajar como? Técnico cuyas actividades se desempeñan fuera de la ciudad."};

    public intereses() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Test Vocacional");
        this.setResizable(false);

        Font customFont = new Font("Roboto Light", Font.PLAIN, 14);
        jOpcion0.setFont(customFont);
        jOpcion1.setFont(customFont);
        jOpcion2.setFont(customFont);
        jOpcion3.setFont(customFont);
        jOpcion4.setFont(customFont);

        setIconImage(new ImageIcon(getClass().getResource("/imagenes/logo_cetis96.png")).getImage());
        mostrarPregunta();
    }

    public String StrToHtml() {
        return "<html><p>" + preguntas + "</p></html>";
    }

    private void mostrarPregunta() {
        if (preguntaActual < preguntas.length) {
            // Dividir el texto de la pregunta en líneas si es demasiado largo
            String pregunta = preguntas[preguntaActual];
            int tamanoLinea = 60; // Nueva longitud de línea
            if (pregunta.length() > tamanoLinea) {
                String[] lineas = dividirTexto(pregunta, tamanoLinea); // Divide en líneas cada 61 caracteres
                StringBuilder preguntaFormateada = new StringBuilder("<html>");
                for (String linea : lineas) {
                    preguntaFormateada.append(linea).append("<br>");
                }
                preguntaFormateada.append("</html>");
                jPregunta.setText(preguntaFormateada.toString());
            } else {
                jPregunta.setText(pregunta);
            }
            limpiarRadioButtons();
            this.jAceptar.setEnabled(false);
        } else {
            for (int i = 0; i < respuestas.size(); i++) {
                System.out.println("Pregunta " + (i + 1) + ": " + respuestas.get(i));
            }

            /*
            resultados resultado = new resultados();
            resultado.setVisible(true);
            this.setVisible(false);
             */
            aptitudes aptitudes = new aptitudes();
            aptitudes.setVisible(true);
            this.setVisible(false);

        }
    }

// Función para dividir un texto en líneas de un tamaño dado
    private String[] dividirTexto(String texto, int tamanoLinea) {
        List<String> lineas = new ArrayList<>();
        String[] palabras = texto.split(" "); // Dividir el texto en palabras

        StringBuilder lineaActual = new StringBuilder();

        for (String palabra : palabras) {
            if (lineaActual.length() + palabra.length() <= tamanoLinea) {
                lineaActual.append(palabra).append(" "); // Agregar palabra a la línea actual
            } else {
                lineas.add(lineaActual.toString()); // Agregar línea completa a la lista
                lineaActual = new StringBuilder(palabra + " "); // Comenzar una nueva línea con la palabra actual
            }
        }

        // Agregar la última línea al resultado
        if (lineaActual.length() > 0) {
            lineas.add(lineaActual.toString());
        }

        return lineas.toArray(new String[0]);
    }

    private void guardarRespuesta() {
        int respuesta = -1; // Inicializamos la respuesta como -1 para detectar si no se seleccionó ninguna opción

        if (jOpcion0.isSelected()) {
            respuesta = 0;
        } else if (jOpcion1.isSelected()) {
            respuesta = 1;
        } else if (jOpcion2.isSelected()) {
            respuesta = 2;
        } else if (jOpcion3.isSelected()) {
            respuesta = 3;
        } else if (jOpcion4.isSelected()) {
            respuesta = 4;
        }

        respuestas.add(respuesta);

        int preguntaPosicion = preguntaActual % 10;

        switch (preguntaPosicion) {
            case 0:
                interesesServicioSocial += respuesta;
                break;
            case 1:
                interesesEjecutivoPersuasiva += respuesta;
                break;
            case 2:
                interesesVerbal += respuesta;
                break;
            case 3:
                interesesArtisticoPlastica += respuesta;
                break;
            case 4:
                interesesMusical += respuesta;
                break;
            case 5:
                interesesOrganizacion += respuesta;
                break;
            case 6:
                interesesCientifica += respuesta;
                break;
            case 7:
                interesesCalculo += respuesta;
                break;
            case 8:
                interesesMecanicoConstructiva += respuesta;
                break;
            case 9:
                interesesTrabajoAlAireLibre += respuesta;
                break;
        }
    }

    private void limpiarRadioButtons() {
        /*
        jOpcion0.setSelected(false);
        jOpcion1.setSelected(false);
        jOpcion2.setSelected(false);
        jOpcion3.setSelected(false);
        jOpcion4.setSelected(false);
         */

        buttonGroup1.clearSelection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTitulo = new javax.swing.JLabel();
        jPregunta = new javax.swing.JLabel();
        jOpcion0 = new test.RadioButtonCustom();
        jOpcion1 = new test.RadioButtonCustom();
        jOpcion2 = new test.RadioButtonCustom();
        jOpcion3 = new test.RadioButtonCustom();
        jOpcion4 = new test.RadioButtonCustom();
        jAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 500));

        jTitulo.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jTitulo.setText("Perfil mis intereses");

        jPregunta.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N

        buttonGroup1.add(jOpcion0);
        jOpcion0.setText("Me desagrado mucho o totalmente");
        jOpcion0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOpcion0ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jOpcion1);
        jOpcion1.setText("Me desagrada algo o en parte");
        jOpcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOpcion1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jOpcion2);
        jOpcion2.setText("Me es indiferente, pues ni me gusta, ni me disgusta");
        jOpcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOpcion2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jOpcion3);
        jOpcion3.setText("Me gusta algo o en parte");
        jOpcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOpcion3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jOpcion4);
        jOpcion4.setText("Me gusta mucho");
        jOpcion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOpcion4ActionPerformed(evt);
            }
        });

        jAceptar.setBackground(new java.awt.Color(105, 20, 50));
        jAceptar.setForeground(new java.awt.Color(255, 255, 255));
        jAceptar.setText("Aceptar");
        jAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jOpcion0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jOpcion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jOpcion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jOpcion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jOpcion4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jTitulo)
                .addGap(44, 44, 44)
                .addComponent(jPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jOpcion4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jOpcion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jOpcion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jOpcion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jOpcion0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAceptarActionPerformed
        guardarRespuesta();
        preguntaActual++;
        mostrarPregunta();
    }//GEN-LAST:event_jAceptarActionPerformed

    private void jOpcion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOpcion4ActionPerformed
        this.jAceptar.setEnabled(true);
    }//GEN-LAST:event_jOpcion4ActionPerformed

    private void jOpcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOpcion3ActionPerformed
        this.jAceptar.setEnabled(true);
    }//GEN-LAST:event_jOpcion3ActionPerformed

    private void jOpcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOpcion2ActionPerformed
        this.jAceptar.setEnabled(true);
    }//GEN-LAST:event_jOpcion2ActionPerformed

    private void jOpcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOpcion1ActionPerformed
        this.jAceptar.setEnabled(true);
    }//GEN-LAST:event_jOpcion1ActionPerformed

    private void jOpcion0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOpcion0ActionPerformed
        this.jAceptar.setEnabled(true);
    }//GEN-LAST:event_jOpcion0ActionPerformed

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
            java.util.logging.Logger.getLogger(intereses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(intereses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(intereses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(intereses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new intereses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jAceptar;
    private test.RadioButtonCustom jOpcion0;
    private test.RadioButtonCustom jOpcion1;
    private test.RadioButtonCustom jOpcion2;
    private test.RadioButtonCustom jOpcion3;
    private test.RadioButtonCustom jOpcion4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jPregunta;
    private javax.swing.JLabel jTitulo;
    // End of variables declaration//GEN-END:variables
}
