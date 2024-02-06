/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test;

import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author BENJAMIN RAYON CORONA
 */
public class aptitudes extends javax.swing.JFrame {

    public static int aptitudesServicioSocial;
    public static int aptitudesEjecutivoPersuasiva;
    public static int aptitudesVerbal;
    public static int aptitudesArtisticoPlastica;
    public static int aptitudesMusical;
    public static int aptitudesOrganizacion;
    public static int aptitudesCientifica;
    public static int aptitudesCalculo;
    public static int aptitudesMecanicoConstructiva;
    public static int aptitudesTrabajoAlAireLibre;

    private int preguntaActual = 0; // Para llevar un seguimiento de la pregunta actual
    private List<Integer> respuestas = new ArrayList<>();
    private String[] preguntas = {
        "1. Tratar y hablar con sensibilidad a las personas.",
        "2. Ser jefe competente de un grupo, equipo o sociedad.",
        "3. Expresarte con facilidad en clase o al platicar con tus amigos.",
        "4. Dibujar casar, objetos, figuras humanas, etcétera.",
        "5. Cantar en un grupo.",
        "6. Llevar en forma correcta y ordenada los apuntes de clase. ",
        "7. Entender principios y experimentos de biología.",
        "8. Ejecutar con rapidez y exactitud operaciones aritméticas.",
        "9. Armar y componer objetos mecánicos como chapas,timbres,etcétera.",
        "10. Actividades que requieren destreza manual.",
        "11. Ser miembro activo y útil en un club o sociedad.",
        "12. Organizar y dirigir festivales, encuentros deportivos, excursiones o campañas sociales.",
        "13. Redactar composiciones o artículos periodísticos.",
        "14. Pintar paisajes.",
        "15. Tocar un instrumento musical.",
        "16. Ordenar y clasificar debidamente documentos en una oficina.",
        "17. Entender principios y experimentos de física.",
        "18. Resolver problemas de aritmética.",
        "19. Desarmar, armar y componer objetos complicados.",
        "20. Manejar con habilidad herramienta de carpintería.",
        "21. Colaborar con otros para el bien de la comunidad.",
        "22. Convencer a otros para que hagan lo que crees que deben hacer.",
        "23. Componer versos serios o jocosos.",
        "24. Decorar artísticamente un salón, corredor, escenario o patio para un festival.",
        "25. Distinguir cuando alguien desentona en las canciones o piezas musicales.",
        "26. Contestar y redactar correctamente oficios y cartas.",
        "27. Entender principios y experimentos de química.",
        "28. Resolver rompecabezas numéricos.",
        "29. Resolver rompecabezas de alambre o de madera.",
        "30. Manejar con facilidad herramientas mecánicas como pinzas, llaves de tuercas, desarmador, etcétera.",
        "31. Saber escuchar a otros con paciencia y comprender su punto de vista.",
        "32. Dar órdenes a otros con seguridad y naturalidad.",
        "33. Escribir cuentos, narraciones o historietas.",
        "34. Modelar con barro, plastilina o grabar madera.",
        "35. Entonar correctamente las canciones de moda.",
        "36. Anotar y manejar con exactitud y rapidez nombres, números y otros datos.",
        "37. Entender principios y hechos económicos y sociales.",
        "38. Resolver problemas de álgebra.",
        "39. Armar y componer muebles.",
        "40. Manejar con habilidad pequeñas piezas y herramientas como agujas, manecillas, joyas, piezas de relojería, etcétera.",
        "41. Conversar en las reuniones y fiestas con acierto y naturalidad.",
        "42. Dirigir un grupo o equipo en situaciones difíciles o peligrosas.",
        "43. Distinguir y apreciar la buena literatura.",
        "44. Distinguir y apreciar la buena pintura.",
        "45. Distinguir y apreciar la buena música.",
        "46. Encargarse de recibir, anotar y dar recados sin olvidar detalles importantes.",
        "47. Entender las causas que determinan los acontecimientos históricos.",
        "48. Resolver problemas de geometría.",
        "49. Aprender el funcionamiento de ciertos mecanismos complicados como motores, relojes, bombas, etcétera.",
        "50. Hacer con facilidad trazos geométricos con la ayudad de las escuadras, la regla “T” y compás.",
        "51. Actuar con desinterés.",
        "52. Corregir a los demás sin ofenderlos.",
        "53. Exponer juicios públicamente sin preocupación por la crítica.",
        "54. Colaborar en la elaboración de un libro sobre el arte en la Arquitectura.",
        "55. Dirigir un grupo musical.",
        "56. Colaborar en el desarrollo de métodos más eficientes de trabajo.",
        "57. Realizar investigaciones científicas teniendo como finalidad la búsqueda de la verdad.",
        "58. Enseñar a resolver problemas de matemáticas.",
        "59. Inducir a las personas a obtener resultados prácticos.",
        "60. Participar en un concurso de modelismo de coches, aviones, barcos, etcétera."
    };

    public aptitudes() {
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

            resultados resultado = new resultados();
            resultado.setVisible(true);
            this.setVisible(false);

        }
    }

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
                aptitudesServicioSocial += respuesta;
                break;
            case 1:
                aptitudesEjecutivoPersuasiva += respuesta;
                break;
            case 2:
                aptitudesVerbal += respuesta;
                break;
            case 3:
                aptitudesArtisticoPlastica += respuesta;
                break;
            case 4:
                aptitudesMusical += respuesta;
                break;
            case 5:
                aptitudesOrganizacion += respuesta;
                break;
            case 6:
                aptitudesCientifica += respuesta;
                break;
            case 7:
                aptitudesCalculo += respuesta;
                break;
            case 8:
                aptitudesMecanicoConstructiva += respuesta;
                break;
            case 9:
                aptitudesTrabajoAlAireLibre += respuesta;
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
        jTitulo.setText("Perfil mis aptitudes");

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
                .addGap(30, 30, 30)
                .addComponent(jPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            java.util.logging.Logger.getLogger(aptitudes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aptitudes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aptitudes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aptitudes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aptitudes().setVisible(true);
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
