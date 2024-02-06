/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author BENJAMIN RAYON CORONA
 */
public class resultados extends javax.swing.JFrame {

    JFreeChart chart;

    public static String puntajeIntereses;
    public static String puntajeAptitudes;
    public static String areaInteres;

    public static String carreasInteres;

    public static int valorInteresesSS;
    public static int valorInteresesEP;
    public static int valorInteresesV;
    public static int valorInteresesAP;
    public static int valorInteresesMS;
    public static int valorInteresesOG;
    public static int valorInteresesCT;
    public static int valorInteresesCL;
    public static int valorInteresesMC;
    public static int valorInteresesAL;

    public static int valorAptitudesSS;
    public static int valorAptitudesEP;
    public static int valorAptitudesV;
    public static int valorAptitudesAP;
    public static int valorAptitudesMS;
    public static int valorAptitudesOG;
    public static int valorAptitudesCT;
    public static int valorAptitudesCL;
    public static int valorAptitudesMC;
    public static int valorAptitudesAL;

    public resultados() {

        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Test Vocacional");
        this.setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/logo_cetis96.png")).getImage());

        crearGrafico();
        calcularAreasIntereses();
        calcularAreasAptitudes();
        ChartPanel panel = new ChartPanel(chart, false);
        panel.setPreferredSize(new Dimension(550, 320));

        jPanel2.setLayout(new BorderLayout());
        jPanel2.add(panel, BorderLayout.CENTER);

    }

    public int convertirValor(int valorOriginal) {
        if (valorOriginal == 0) {
            return 0;
        } else if (valorOriginal == 1) {
            return 4;
        } else if (valorOriginal == 2) {
            return 8;
        } else if (valorOriginal == 3) {
            return 13;
        } else if (valorOriginal == 4) {
            return 17;
        } else if (valorOriginal == 5) {
            return 21;
        } else if (valorOriginal == 6) {
            return 25;
        } else if (valorOriginal == 7) {
            return 29;
        } else if (valorOriginal == 8) {
            return 33;
        } else if (valorOriginal == 9) {
            return 38;
        } else if (valorOriginal == 10) {
            return 42;
        } else if (valorOriginal == 11) {
            return 46;
        } else if (valorOriginal == 12) {
            return 50;
        } else if (valorOriginal == 13) {
            return 54;
        } else if (valorOriginal == 14) {
            return 58;
        } else if (valorOriginal == 15) {
            return 63;
        } else if (valorOriginal == 16) {
            return 67;
        } else if (valorOriginal == 17) {
            return 71;
        } else if (valorOriginal == 18) {
            return 75;
        } else if (valorOriginal == 19) {
            return 79;
        } else if (valorOriginal == 20) {
            return 83;
        } else if (valorOriginal == 21) {
            return 89;
        } else if (valorOriginal == 22) {
            return 92;
        } else if (valorOriginal == 23) {
            return 96;
        } else if (valorOriginal == 24) {
            return 100;
        } else {
            return valorOriginal;
        }
    }

    public void crearGrafico() {
        intereses intereses = new intereses();
        aptitudes aptitudes = new aptitudes();

        DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();

        valorInteresesSS = convertirValor(intereses.interesesServicioSocial);
        valorInteresesEP = convertirValor(intereses.interesesEjecutivoPersuasiva);
        valorInteresesV = convertirValor(intereses.interesesVerbal);
        valorInteresesAP = convertirValor(intereses.interesesArtisticoPlastica);
        valorInteresesMS = convertirValor(intereses.interesesMusical);
        valorInteresesOG = convertirValor(intereses.interesesOrganizacion);
        valorInteresesCT = convertirValor(intereses.interesesCientifica);
        valorInteresesCL = convertirValor(intereses.interesesCalculo);
        valorInteresesMC = convertirValor(intereses.interesesMecanicoConstructiva);
        valorInteresesAL = convertirValor(intereses.interesesTrabajoAlAireLibre);

        valorAptitudesSS = convertirValor(aptitudes.aptitudesServicioSocial);
        valorAptitudesEP = convertirValor(aptitudes.aptitudesEjecutivoPersuasiva);
        valorAptitudesV = convertirValor(aptitudes.aptitudesVerbal);
        valorAptitudesAP = convertirValor(aptitudes.aptitudesArtisticoPlastica);
        valorAptitudesMS = convertirValor(aptitudes.aptitudesMusical);
        valorAptitudesOG = convertirValor(aptitudes.aptitudesOrganizacion);
        valorAptitudesCT = convertirValor(aptitudes.aptitudesCientifica);
        valorAptitudesCL = convertirValor(aptitudes.aptitudesCalculo);
        valorAptitudesMC = convertirValor(aptitudes.aptitudesMecanicoConstructiva);
        valorAptitudesAL = convertirValor(aptitudes.aptitudesTrabajoAlAireLibre);

        dataset1.addValue(valorInteresesSS, "Intereses", "SS");
        dataset1.addValue(valorInteresesEP, "Intereses", "EP");
        dataset1.addValue(valorInteresesV, "Intereses", "V");
        dataset1.addValue(valorInteresesAP, "Intereses", "AP");
        dataset1.addValue(valorInteresesMS, "Intereses", "MS");
        dataset1.addValue(valorInteresesOG, "Intereses", "OG");
        dataset1.addValue(valorInteresesCT, "Intereses", "CT");
        dataset1.addValue(valorInteresesCL, "Intereses", "CL");
        dataset1.addValue(valorInteresesMC, "Intereses", "MC");
        dataset1.addValue(valorInteresesAL, "Intereses", "AL");

        dataset1.addValue(valorAptitudesSS, "Aptitudes", "SS");
        dataset1.addValue(valorAptitudesEP, "Aptitudes", "EP");
        dataset1.addValue(valorAptitudesV, "Aptitudes", "V");
        dataset1.addValue(valorAptitudesAP, "Aptitudes", "AP");
        dataset1.addValue(valorAptitudesMS, "Aptitudes", "MS");
        dataset1.addValue(valorAptitudesOG, "Aptitudes", "OG");
        dataset1.addValue(valorAptitudesCT, "Aptitudes", "CT");
        dataset1.addValue(valorAptitudesCL, "Aptitudes", "CL");
        dataset1.addValue(valorAptitudesMC, "Aptitudes", "MC");
        dataset1.addValue(valorAptitudesAL, "Aptitudes", "AL");

        dataset1.addValue(100, "", "");

        chart = ChartFactory.createBarChart3D(
                "", // chart title
                "", // domain axis label
                "", // range axis label
                dataset1, // data
                PlotOrientation.VERTICAL,
                true, // include legend
                true,
                false
        );

        /*
        ValueAxis axis2 = new NumberAxis3D("Kia (Marca especial)");
        
        CategoryPlot plot = chart.getCategoryPlot();
        plot.setRangeAxis(1, axis2);
        plot.setDataset(1, dataset2);
        plot.mapDatasetToRangeAxis(1, 1);
        
        CategoryItemRenderer renderer2 = new LineAndShapeRenderer();
        renderer2.setSeriesPaint(0, Color.red);
        plot.setRenderer(1, renderer2);
         */
    }

    public void calcularAreasIntereses() {
        // Calcular el máximo valor de intereses
        int maxIntereses = Math.max(valorInteresesSS, Math.max(valorInteresesEP, Math.max(valorInteresesV, Math.max(valorInteresesAP,
                Math.max(valorInteresesMS, Math.max(valorInteresesOG, Math.max(valorInteresesCT, Math.max(valorInteresesCL,
                        Math.max(valorInteresesMC, valorInteresesAL)))))))));
        // Asignar el valor correspondiente a puntajeIntereses
        if (maxIntereses == valorInteresesSS) {
            areaInteres = "Servicio Social";
            carreasInteres = "Urbanismo, Ingeniería Civil, Sociología, Trabajo Social, Derecho, Enfermería y Obstetricia, Psicología, Pedagogía, Medicina, Odontología, Ciencias Políticas y Administración Pública, Economía, Relaciones Internacionales, Enseñanza de Inglés, Optometría, Planificación para el Desarrollo Agropecuario, Estudios Latinoamericanos, Bibliotecología y Estudios de la Información, Educación Musical.";
            puntajeIntereses = "Preferencia por participar en actividades directamente relacionadas con el bienestar de las personas.";
        } else if (maxIntereses == valorInteresesEP) {
            areaInteres = "Ejecutivo Persuasiva";
            carreasInteres = "Actuaría, Economía, Administración, Ciencias  Políticas y Administración Pública, Derecho, Ingeniería Industrial, Ingeniería de Alimentos, Ingeniería Petrolera, Psicología, Medicina, Relaciones Internacionales.";
            puntajeIntereses = "Agrado por planear, organizar o dirigir las actividades de personas o agrupaciones.";
        } else if (maxIntereses == valorInteresesV) {
            areaInteres = "Verbal";
            carreasInteres = "Derecho, Ciencias de la Comunicación, Letras Clásicas, Lengua y Literaturas Modernas, Relaciones Internacionales, Literatura Dramática y Teatro, Sociología, Ciencias Políticas y Administración Pública.";
            puntajeIntereses = "Gusto por la lectura de obras diversas y satisfacción al expresarse verbalmente o por escrito.";
        } else if (maxIntereses == valorInteresesAP) {
            areaInteres = "Artístico Plástica";
            carreasInteres = "Artes  Visuales, Diseño y Comunicación Visual, Diseño Gráfico, Arquitectura, Arquitectura de Paisaje, Odontología, Literatura Dramática y Teatro.";
            puntajeIntereses = "Agrado por conocer o realizar actividades creativas como dibujo, la pintura, la escultura, el modelado, etcétera.";
        } else if (maxIntereses == valorInteresesMS) {
            areaInteres = "Musical";
            carreasInteres = "Composición, Instrumentista, Canto, Etnomusicología, Piano, Educación Musical.";
            puntajeIntereses = "Gusto por la ejecución, estudio o composición de la música.";
        } else if (maxIntereses == valorInteresesOG) {
            areaInteres = "Organización";
            carreasInteres = "Bibliotecología y Estudios de la Información, Actuaría, Matemáticas Aplicadas y Computación, Informática, Contaduría, Administración, Ciencias de la Comunicación, Matemáticas, Relaciones Internacionales, Economía, Ciencias Políticas y Administración Pública.";
            puntajeIntereses = "Preferencia por actividades que requieren orden y sistematización.";
        } else if (maxIntereses == valorInteresesCT) {
            areaInteres = "Científica";
            carreasInteres = "Investigación Biomédica Básica, Ciencias Genómicas, Matemáticas, Física, Ingeniería Mecatrónica, Química, Biología, Psicología, Medicina Veterinaria y Zootecnia, Ingeniería Química, Química Farmacéutico-Biológica, Química Industrial, Química de Alimentos, Ingeniería en Alimentos, Filosofía, Historia.";
            puntajeIntereses = "Gusto por conocer o investigar los fenómenos, las causas que los provocan y los principios que los explican.";
        } else if (maxIntereses == valorInteresesCL) {
            areaInteres = "Cálculo";
            carreasInteres = "Matemáticas, Economía, Contaduría, Física, Ingenierías: Geológica, Geofísica, Civil, en Telecomunicaciones, Computación, Topográfica, Industrial, Química; Arquitectura, Geografía, Actuaría, Informática, Química, Matemáticas Aplicadas y Computación, Ciencias de la Comunicación.";
            puntajeIntereses = "Gusto por resolver problemas de tipo cuantitativo, donde se utilizan las operaciones matemáticas.";
        } else if (maxIntereses == valorInteresesMC) {
            areaInteres = "Mecánico Constructiva";
            carreasInteres = "Ingenierías: Eléctrica-Electrónica, Geofísica, Topográfica, Civil, Petrolera, Mecánica Eléctrica, Química, en Computación, Mecánica Química Metalúrgica, Mecatrónica, Arquitectura, Diseño Industrial.";
            puntajeIntereses = "Atracción por armar, conocer o descubrir mecanismos mediante los cuales funciona un aparato, así como proyectar y construir objetos diversos.";
        } else if (maxIntereses == valorInteresesAL) {
            areaInteres = "Trabajo Al Aire Libre ";
            carreasInteres = "Biología, Ingeniería Agrícola, Ingeniería Geológica, Ingeniería Petrolera, Geografía, Ingeniería Civil, Ingeniería Topográfica y Geodésica, Medicina Veterinaria y Zootecnia, Planificación para el Desarrollo Agropecuario, Urbanismo.";
            puntajeIntereses = "Satisfacción por actividades que se realizan en lugares abiertos y/o apartados de los conglomerados urbanos.";
        } else {
            areaInteres = "Servicio Social";
            carreasInteres = "Urbanismo, Ingeniería Civil, Sociología, Trabajo Social, Derecho, Enfermería y Obstetricia, Psicología, Pedagogía, Medicina, Odontología, Ciencias Políticas y Administración Pública, Economía, Relaciones Internacionales, Enseñanza de Inglés, Optometría, Planificación para el Desarrollo Agropecuario, Estudios Latinoamericanos, Bibliotecología y Estudios de la Información, Educación Musical.";
            puntajeIntereses = "Preferencia por participar en actividades directamente relacionadas con el bienestar de las personas.";
        }

    }

    public void calcularAreasAptitudes() {
        // Calcular el máximo valor de aptitudes
        int maxAptitudes = Math.max(valorAptitudesSS, Math.max(valorAptitudesEP, Math.max(valorAptitudesV, Math.max(valorAptitudesAP,
                Math.max(valorAptitudesMS, Math.max(valorAptitudesOG, Math.max(valorAptitudesCT, Math.max(valorAptitudesCL,
                        Math.max(valorAptitudesMC, valorAptitudesAL)))))))));
        if (maxAptitudes == valorAptitudesSS) {
            puntajeAptitudes = "Habilidad para comprender problemas humanos, para tratar personas, cooperar y persuadir; para hacer lo más adecuado ante situaciones sociales. Actitud de ayuda afectuosa y desinteresada hacia sus semejantes.";
        } else if (maxAptitudes == valorAptitudesEP) {
            puntajeAptitudes = "Capacidad para organizar, dirigir y supervisar a otros adecuadamente; poseer iniciativa, confianza en sí mismo, ambición de progreso, habilidad para dominar en situaciones sociales y en relaciones de persona a persona.";
        } else if (maxAptitudes == valorAptitudesV) {
            puntajeAptitudes = "Habilidad  para  comprender  y  expresarse  correctamente.  También  para  utilizar  las  palabras precisas y adecuadas.";
        } else if (maxAptitudes == valorAptitudesAP) {
            puntajeAptitudes = "Habilidad para apreciar las formas o colores de un objeto, dibujo, escultura o pintura y para crear obras de mérito artístico en pintura, escultura, grabado o dibujo.";
        } else if (maxAptitudes == valorAptitudesMS) {
            puntajeAptitudes = "Habilidad para captar y distinguir sonidos en  sus diversas modalidades, para imaginar estos sonidos, reproducirlos o utilizarlos en forma creativa; sensibilidad a la combinación y armonía de sonidos.";
        } else if (maxAptitudes == valorAptitudesOG) {
            puntajeAptitudes = "Capacidad de  organización, orden,  exactitud  y  rapidez en  el  manejo de  nombres, números, documentos, sistemas y sus detalles en trabajos rutinarios.";
        } else if (maxAptitudes == valorAptitudesCT) {
            puntajeAptitudes = "Habilidad para la investigación; aptitud para captar, definir y comprender principios y relaciones causales de los fenómenos proponiéndose siempre la obtención de la novedad.";
        } else if (maxAptitudes == valorAptitudesCL) {
            puntajeAptitudes = "Dominio de las operaciones y mecanizaciones numéricas, así como habilidad para el cálculo matemático.";
        } else if (maxAptitudes == valorAptitudesMC) {
            puntajeAptitudes = "Comprensión y habilidad en la manipulación de objetos y facilidad para percibir, imaginar y analizar formas en dos o tres dimensiones, así como para abstraer sistemas, mecanismos y movimientos.";
        } else if (maxAptitudes == valorAptitudesAL) {
            puntajeAptitudes = "Habilidad en el uso de las manos para el manejo de herramientas; ejecución de movimientos coordinados y precisos.";
        } else {
            puntajeAptitudes = "Habilidad para comprender problemas humanos, para tratar personas, cooperar y persuadir; para hacer lo más adecuado ante situaciones sociales. Actitud de ayuda afectuosa y desinteresada hacia sus semejantes.";
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel1.setText("Resultados");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

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
                        .addGap(239, 239, 239)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(225, 225, 225))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAceptarActionPerformed
        reporte reporte = new reporte();
        reporte.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resultados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
