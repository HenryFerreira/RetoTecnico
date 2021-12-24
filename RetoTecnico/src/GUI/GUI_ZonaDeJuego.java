package GUI;

import Logica.Entidades.Pregunta;
import Logica.Entidades.Respuesta;
import Logica.Fabrica;
import java.util.List;

/**
 *
 * @author Haff
 */
public class GUI_ZonaDeJuego extends javax.swing.JFrame {

    Fabrica fabrica = new Fabrica();
    //Se genera una lista con los usuarios obtenidos de la BD
    List<Pregunta> preguntasGeografia = fabrica.getControladorPreguntas().getTodasLasPreguntasGeografia();

    //Se genera una lista con los usuarios obtenidos de la BD
    List<Pregunta> preguntasHistoria = fabrica.getControladorPreguntas().getTodasLasPreguntasHistoria();

    //Se genera una lista con los usuarios obtenidos de la BD
    List<Pregunta> preguntasCiencia = fabrica.getControladorPreguntas().getTodasLasPreguntasCiencia();

    //Se genera una lista con los usuarios obtenidos de la BD
    List<Pregunta> preguntasDeporte = fabrica.getControladorPreguntas().getTodasLasPreguntasDeporte();

    //Se genera una lista con los usuarios obtenidos de la BD
    List<Pregunta> preguntasArte = fabrica.getControladorPreguntas().getTodasLasPreguntasArte();

    Integer cont = 0;
    Integer ronda = 1;

    public GUI_ZonaDeJuego() {
        initComponents();

        List<Respuesta> respuestas = fabrica.getServicioRespuestas().getTodasLasPreguntasArte(preguntasGeografia.get(0).getId());

        this.lbl_nombre_categoria.setText(preguntasGeografia.get(0).getIdCategoria().toString());
        this.lbl_pregunta.setText(preguntasGeografia.get(0).getPregunta());
        this.rbtn_respuesta1.setText(respuestas.get(0).getRespusta());
        this.rbtn_respuesta2.setText(respuestas.get(1).getRespusta());
        this.rbtn_respuesta3.setText(respuestas.get(2).getRespusta());
        this.rbtn_respuesta4.setText(respuestas.get(3).getRespusta());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_categoria = new javax.swing.JLabel();
        lbl_nombre_categoria = new javax.swing.JLabel();
        lbl_puntos = new javax.swing.JLabel();
        lbl_cantidad_puntos = new javax.swing.JLabel();
        lbl_pregunta = new javax.swing.JLabel();
        panel_preguntas = new javax.swing.JPanel();
        rbtn_respuesta1 = new javax.swing.JRadioButton();
        rbtn_respuesta2 = new javax.swing.JRadioButton();
        rbtn_respuesta3 = new javax.swing.JRadioButton();
        rbtn_respuesta4 = new javax.swing.JRadioButton();
        Salir = new javax.swing.JButton();
        btn_continuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_categoria.setText("Categoria:");

        lbl_nombre_categoria.setText("- - -");

        lbl_puntos.setText("Puntos:");

        lbl_cantidad_puntos.setText("- - -");

        lbl_pregunta.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lbl_pregunta.setText("Pregunta");

        panel_preguntas.setBackground(new java.awt.Color(102, 102, 102));

        rbtn_respuesta1.setText("Respuesta_1");

        rbtn_respuesta2.setText("Respuesta_2");

        rbtn_respuesta3.setText("Respuesta_3");

        rbtn_respuesta4.setText("Respuesta_4");

        javax.swing.GroupLayout panel_preguntasLayout = new javax.swing.GroupLayout(panel_preguntas);
        panel_preguntas.setLayout(panel_preguntasLayout);
        panel_preguntasLayout.setHorizontalGroup(
            panel_preguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_preguntasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_preguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtn_respuesta1)
                    .addComponent(rbtn_respuesta2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 323, Short.MAX_VALUE)
                .addGroup(panel_preguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtn_respuesta3)
                    .addComponent(rbtn_respuesta4))
                .addGap(243, 243, 243))
        );
        panel_preguntasLayout.setVerticalGroup(
            panel_preguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_preguntasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_preguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtn_respuesta1)
                    .addComponent(rbtn_respuesta3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addGroup(panel_preguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtn_respuesta2)
                    .addComponent(rbtn_respuesta4))
                .addContainerGap())
        );

        Salir.setText("Salir");

        btn_continuar.setText("Continuar");
        btn_continuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_continuarMouseClicked(evt);
            }
        });
        btn_continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_continuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_categoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_nombre_categoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_puntos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_cantidad_puntos)
                        .addGap(59, 59, 59))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_pregunta)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Salir)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_continuar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel_preguntas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_categoria)
                    .addComponent(lbl_nombre_categoria)
                    .addComponent(lbl_puntos)
                    .addComponent(lbl_cantidad_puntos))
                .addGap(18, 18, 18)
                .addComponent(lbl_pregunta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_preguntas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_continuar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(Salir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_continuarActionPerformed
        cont += 1;
        //Si es mayor o igual a 4 que son las preguntas por ronda
        if (cont > 4) {
            cont = 0;//Vuelve el contador a cero
            ronda++;
        }

        if (ronda == 2 && cont == 0 || ronda == 2) {
            pasarPregunta(preguntasHistoria, cont);
        } else if (ronda == 3 && cont == 0 || ronda == 3) {
            pasarPregunta(preguntasCiencia, cont);
        } else if (ronda == 4 && cont == 0 || ronda == 4) {
            pasarPregunta(preguntasDeporte, cont);
        } else if (ronda == 5 && cont == 0 || ronda == 5) {
            pasarPregunta(preguntasArte, cont);
        } else {
            pasarPregunta(preguntasGeografia, cont);
        }


    }//GEN-LAST:event_btn_continuarActionPerformed

    private void btn_continuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_continuarMouseClicked


    }//GEN-LAST:event_btn_continuarMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_ZonaDeJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_ZonaDeJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_ZonaDeJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_ZonaDeJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_ZonaDeJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JButton btn_continuar;
    private javax.swing.JLabel lbl_cantidad_puntos;
    private javax.swing.JLabel lbl_categoria;
    private javax.swing.JLabel lbl_nombre_categoria;
    private javax.swing.JLabel lbl_pregunta;
    private javax.swing.JLabel lbl_puntos;
    private javax.swing.JPanel panel_preguntas;
    private javax.swing.JRadioButton rbtn_respuesta1;
    private javax.swing.JRadioButton rbtn_respuesta2;
    private javax.swing.JRadioButton rbtn_respuesta3;
    private javax.swing.JRadioButton rbtn_respuesta4;
    // End of variables declaration//GEN-END:variables

    public void pasarPregunta(List<Pregunta> preguntas, Integer i) {
        
        List<Respuesta> respuestas = fabrica.getServicioRespuestas().getTodasLasPreguntasArte(preguntas.get(i).getId());
        
        this.lbl_nombre_categoria.setText(preguntas.get(i).getIdCategoria().toString());
        this.lbl_pregunta.setText(preguntas.get(i).getPregunta());
        this.rbtn_respuesta1.setText(respuestas.get(0).getRespusta());
        this.rbtn_respuesta2.setText(respuestas.get(1).getRespusta());
        this.rbtn_respuesta3.setText(respuestas.get(2).getRespusta());
        this.rbtn_respuesta4.setText(respuestas.get(3).getRespusta());

    }

}
