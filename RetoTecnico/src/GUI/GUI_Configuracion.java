package GUI;

import Logica.Entidades.Categoria;
import Logica.Fabrica;
import java.util.List;

/**
 *
 * @author Haff
 */
public class GUI_Configuracion extends javax.swing.JFrame {

    Fabrica fabrica = new Fabrica();
    private Categoria categoriaSeleccionado;

    public GUI_Configuracion() {
        initComponents();
        List<Categoria> categorias = fabrica.getControladorCategorias().getTodasLasCategorias();
        categorias.forEach(categoria -> this.cbox_categorias.addItem(categoria));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSpinner1 = new javax.swing.JSpinner();
        lbl_tituloConfiguraciones = new javax.swing.JLabel();
        panel_agregarPreguntas = new javax.swing.JPanel();
        lbl_tituloPreguntas = new javax.swing.JLabel();
        lbl_pregunta = new javax.swing.JLabel();
        txt_pregunta = new javax.swing.JTextField();
        lbl_Categoria = new javax.swing.JLabel();
        cbox_categorias = new javax.swing.JComboBox<>();
        lbl_correcta = new javax.swing.JLabel();
        txt_respuestaCorrecta = new javax.swing.JTextField();
        txt_respuestaInorrecta1 = new javax.swing.JTextField();
        lbl_incorrecta1 = new javax.swing.JLabel();
        txt_respuestaInorrecta2 = new javax.swing.JTextField();
        lbl_incorrecta2 = new javax.swing.JLabel();
        lbl_incorrecta3 = new javax.swing.JLabel();
        txt_respuestaInorrecta3 = new javax.swing.JTextField();
        btn_agregarPregunta = new javax.swing.JButton();
        panel_agregarCategoria = new javax.swing.JPanel();
        lbl_tituloPreguntas1 = new javax.swing.JLabel();
        btn_agregarPregunta1 = new javax.swing.JButton();
        lbl_nombreCategoria = new javax.swing.JLabel();
        txt_categoria = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_tituloConfiguraciones.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lbl_tituloConfiguraciones.setText("Configuraciones");

        panel_agregarPreguntas.setBackground(new java.awt.Color(102, 102, 102));

        lbl_tituloPreguntas.setText("Agregar preguntas");

        lbl_pregunta.setText("Pregunta:");

        lbl_Categoria.setText("Categoria:");

        cbox_categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_categoriasActionPerformed(evt);
            }
        });

        lbl_correcta.setText("Respuesta correcta:");

        lbl_incorrecta1.setText("Respuesta incorrecta 1:");

        lbl_incorrecta2.setText("Respuesta incorrecta 2:");

        lbl_incorrecta3.setText("Respuesta incorrecta 3:");

        btn_agregarPregunta.setText("Agregar");
        btn_agregarPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarPreguntaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_agregarPreguntasLayout = new javax.swing.GroupLayout(panel_agregarPreguntas);
        panel_agregarPreguntas.setLayout(panel_agregarPreguntasLayout);
        panel_agregarPreguntasLayout.setHorizontalGroup(
            panel_agregarPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_agregarPreguntasLayout.createSequentialGroup()
                .addGroup(panel_agregarPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_agregarPreguntasLayout.createSequentialGroup()
                        .addGroup(panel_agregarPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_agregarPreguntasLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbl_pregunta))
                            .addGroup(panel_agregarPreguntasLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbl_Categoria))
                            .addGroup(panel_agregarPreguntasLayout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(lbl_tituloPreguntas)))
                        .addGap(0, 137, Short.MAX_VALUE))
                    .addGroup(panel_agregarPreguntasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_agregarPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_agregarPregunta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbox_categorias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_pregunta)
                            .addComponent(txt_respuestaInorrecta2)
                            .addComponent(txt_respuestaCorrecta, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_respuestaInorrecta1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_respuestaInorrecta3)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_agregarPreguntasLayout.createSequentialGroup()
                                .addGroup(panel_agregarPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_incorrecta3)
                                    .addComponent(lbl_correcta)
                                    .addComponent(lbl_incorrecta1)
                                    .addComponent(lbl_incorrecta2))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        panel_agregarPreguntasLayout.setVerticalGroup(
            panel_agregarPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_agregarPreguntasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_tituloPreguntas)
                .addGap(11, 11, 11)
                .addComponent(lbl_Categoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbox_categorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_pregunta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_correcta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_respuestaCorrecta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_incorrecta1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_respuestaInorrecta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_incorrecta2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_respuestaInorrecta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_incorrecta3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_respuestaInorrecta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(btn_agregarPregunta)
                .addContainerGap())
        );

        panel_agregarCategoria.setBackground(new java.awt.Color(102, 102, 102));

        lbl_tituloPreguntas1.setText("Agregar preguntas");

        btn_agregarPregunta1.setText("Agregar");

        lbl_nombreCategoria.setText("Nombre de la categoria:");

        javax.swing.GroupLayout panel_agregarCategoriaLayout = new javax.swing.GroupLayout(panel_agregarCategoria);
        panel_agregarCategoria.setLayout(panel_agregarCategoriaLayout);
        panel_agregarCategoriaLayout.setHorizontalGroup(
            panel_agregarCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_agregarCategoriaLayout.createSequentialGroup()
                .addGroup(panel_agregarCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_agregarCategoriaLayout.createSequentialGroup()
                        .addGroup(panel_agregarCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_agregarCategoriaLayout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(lbl_tituloPreguntas1))
                            .addGroup(panel_agregarCategoriaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbl_nombreCategoria)))
                        .addGap(0, 113, Short.MAX_VALUE))
                    .addGroup(panel_agregarCategoriaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_agregarCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_categoria, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_agregarPregunta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panel_agregarCategoriaLayout.setVerticalGroup(
            panel_agregarCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_agregarCategoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_tituloPreguntas1)
                .addGap(12, 12, 12)
                .addComponent(lbl_nombreCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_agregarPregunta1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(lbl_tituloConfiguraciones)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel_agregarPreguntas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                        .addComponent(panel_agregarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_tituloConfiguraciones)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_agregarPreguntas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_agregarCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarPreguntaActionPerformed
        String pregunta = this.txt_pregunta.getText();
        String respuestaCorrecta = this.txt_respuestaCorrecta.getText();
        Integer idCategoria = categoriaSeleccionado.getId();

        if (fabrica.getControladorPreguntas().altaPregunta(idCategoria, pregunta, respuestaCorrecta)) {
            System.out.println("Ingresado correctamente");
        } else {
            System.out.println("Por favor complete todos los campos");
        }
    }//GEN-LAST:event_btn_agregarPreguntaActionPerformed

    private void cbox_categoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_categoriasActionPerformed
        categoriaSeleccionado = (Categoria) this.cbox_categorias.getSelectedItem();
    }//GEN-LAST:event_cbox_categoriasActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Configuracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregarPregunta;
    private javax.swing.JButton btn_agregarPregunta1;
    private javax.swing.JComboBox<Categoria> cbox_categorias;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lbl_Categoria;
    private javax.swing.JLabel lbl_correcta;
    private javax.swing.JLabel lbl_incorrecta1;
    private javax.swing.JLabel lbl_incorrecta2;
    private javax.swing.JLabel lbl_incorrecta3;
    private javax.swing.JLabel lbl_nombreCategoria;
    private javax.swing.JLabel lbl_pregunta;
    private javax.swing.JLabel lbl_tituloConfiguraciones;
    private javax.swing.JLabel lbl_tituloPreguntas;
    private javax.swing.JLabel lbl_tituloPreguntas1;
    private javax.swing.JPanel panel_agregarCategoria;
    private javax.swing.JPanel panel_agregarPreguntas;
    private javax.swing.JTextField txt_categoria;
    private javax.swing.JTextField txt_pregunta;
    private javax.swing.JTextField txt_respuestaCorrecta;
    private javax.swing.JTextField txt_respuestaInorrecta1;
    private javax.swing.JTextField txt_respuestaInorrecta2;
    private javax.swing.JTextField txt_respuestaInorrecta3;
    // End of variables declaration//GEN-END:variables
}
