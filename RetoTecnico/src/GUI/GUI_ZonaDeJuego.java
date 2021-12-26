package GUI;

import static Logica.Constantes.JUGADOR;
import Logica.Entidades.Categoria;
import Logica.Entidades.Pregunta;
import Logica.Entidades.Respuesta;
import Logica.Fabrica;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Haff
 */
public class GUI_ZonaDeJuego extends javax.swing.JFrame {

    Fabrica fabrica = new Fabrica();

    //OBTENER LAS CATEGORIAS PARA LAS PREGUNTAS DEPENDIENDO DE SU DIFICULTAD
    List<Categoria> faciles = fabrica.getControladorCategorias().getCategoriasFaciles();
    List<Categoria> normales = fabrica.getControladorCategorias().getCategoriasNormales();
    List<Categoria> dificiles = fabrica.getControladorCategorias().getCategoriasDificiles();

    //OBTENER LAS PREGUNTAS PARA EL JUEGO
    List<Pregunta> preguntasFaciles1 = fabrica.getControladorPreguntas().getPreguntasPorIdCategoria(faciles.get(0).getId());
    List<Pregunta> preguntasFaciles2 = fabrica.getControladorPreguntas().getPreguntasPorIdCategoria(faciles.get(1).getId());
    List<Pregunta> preguntasNormales1 = fabrica.getControladorPreguntas().getPreguntasPorIdCategoria(normales.get(0).getId());
    List<Pregunta> preguntasNormales2 = fabrica.getControladorPreguntas().getPreguntasPorIdCategoria(normales.get(1).getId());
    List<Pregunta> preguntasDificiles = fabrica.getControladorPreguntas().getPreguntasPorIdCategoria(dificiles.get(0).getId());

    //CONTADORES PARA EL JUEGO
    Integer cont = 0;
    Integer ronda = 1;
    Boolean flag = false;//BANDERA PARA MENSAJE DE FELICITACIONES
    //PUNTOS DEL JUGADOR
    Integer puntos = JUGADOR.getPuntos();

    public GUI_ZonaDeJuego() {
        initComponents();
        pasarPregunta(preguntasFaciles1, cont);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_categoria.setText("Categoria:");

        lbl_nombre_categoria.setText("- - -");

        lbl_puntos.setText("Puntos:");

        lbl_cantidad_puntos.setText("- - -");

        lbl_pregunta.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lbl_pregunta.setText("Pregunta");

        panel_preguntas.setBackground(new java.awt.Color(102, 102, 102));

        rbtn_respuesta1.setText("Respuesta_1");
        rbtn_respuesta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtn_respuesta1MouseClicked(evt);
            }
        });

        rbtn_respuesta2.setText("Respuesta_2");
        rbtn_respuesta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtn_respuesta2MouseClicked(evt);
            }
        });

        rbtn_respuesta3.setText("Respuesta_3");
        rbtn_respuesta3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtn_respuesta3MouseClicked(evt);
            }
        });

        rbtn_respuesta4.setText("Respuesta_4");
        rbtn_respuesta4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtn_respuesta4MouseClicked(evt);
            }
        });

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
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
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
                        .addComponent(panel_preguntas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(Salir)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rbtn_respuesta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtn_respuesta1MouseClicked
        //LLAMAR AL METODO DE RESPUESTA SELECCIONADA
        seleccionarRespuesta(this.rbtn_respuesta1.getText());
    }//GEN-LAST:event_rbtn_respuesta1MouseClicked

    private void rbtn_respuesta2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtn_respuesta2MouseClicked
        //LLAMAR AL METODO DE RESPUESTA SELECCIONADA
        seleccionarRespuesta(this.rbtn_respuesta2.getText());
    }//GEN-LAST:event_rbtn_respuesta2MouseClicked

    private void rbtn_respuesta3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtn_respuesta3MouseClicked
        //LLAMAR AL METODO DE RESPUESTA SELECCIONADA
        seleccionarRespuesta(this.rbtn_respuesta3.getText());
    }//GEN-LAST:event_rbtn_respuesta3MouseClicked

    private void rbtn_respuesta4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtn_respuesta4MouseClicked
        //LLAMAR AL METODO DE RESPUESTA SELECCIONADA
        seleccionarRespuesta(this.rbtn_respuesta4.getText());

    }//GEN-LAST:event_rbtn_respuesta4MouseClicked

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        GUI_Inicio inicio = new GUI_Inicio();
        this.dispose();
        inicio.show();
    }//GEN-LAST:event_SalirActionPerformed

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

    //PASAR PREGUNTAS
    private void pasarPregunta(List<Pregunta> preguntas, Integer i) {
        //RESPUESTAS DEPENDIENDO DE LA PREGUNTA
        List<Respuesta> respuestas = fabrica.getServicioRespuestas().getRespuestasPorIdPregunta(preguntas.get(i).getId());

        //CARGAR LOS DATOS EN EL GUI
        this.lbl_nombre_categoria.setText(preguntas.get(i).getNombreCategoria());
        this.lbl_pregunta.setText(preguntas.get(i).getPregunta());
        this.rbtn_respuesta1.setText(respuestas.get(0).getRespusta());
        this.rbtn_respuesta2.setText(respuestas.get(1).getRespusta());
        this.rbtn_respuesta3.setText(respuestas.get(2).getRespusta());
        this.rbtn_respuesta4.setText(respuestas.get(3).getRespusta());

        this.lbl_cantidad_puntos.setText(puntos.toString());
    }

    //VERIFICAR RESPUESTA DEL USUARIO
    private void respustaUsuario(String respuesta) throws SQLException {
        //MENSAJE PARA CONTINUAR
        int i = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Siguiente pregunta", JOptionPane.YES_NO_OPTION);
        if (i == JOptionPane.YES_OPTION) {//EN EL CASO DE CONFIRMAR "SI"
            //SI LA RESPUESTA ES CORRECTA
            if (fabrica.getControladorRespuestas().verificarRespuestaUsuario(respuesta)) {
                //EN CADA ITERACION SE VERIFICA LA RONDA Y EN QUE PREGUNTA SE ENCUENTRA EL JUGADOR
                if (ronda == 2) {
                    pasarPregunta(preguntasFaciles2, cont);
                    puntos += 150;
                    fabrica.getControladorUsuarios().modificarPuntos(JUGADOR, puntos);
                } else if (ronda == 3) {
                    pasarPregunta(preguntasNormales1, cont);
                    puntos += 200;
                    fabrica.getControladorUsuarios().modificarPuntos(JUGADOR, puntos);
                } else if (ronda == 4) {
                    pasarPregunta(preguntasNormales2, cont);
                    puntos += 250;
                    fabrica.getControladorUsuarios().modificarPuntos(JUGADOR, puntos);
                } else if (ronda == 5) {
                    pasarPregunta(preguntasDificiles, cont);
                    puntos += 300;
                    fabrica.getControladorUsuarios().modificarPuntos(JUGADOR, puntos);

                } else {
                    if (flag == true) {
                        JOptionPane.showMessageDialog(null, "TERMINASTE EL JUEGO, FELICIDADES!!");
                        GUI_Inicio inicio = new GUI_Inicio();
                        this.dispose();
                        inicio.show();
                    }
                    pasarPregunta(preguntasFaciles1, cont);
                    puntos = puntos + 100;
                    fabrica.getControladorUsuarios().modificarPuntos(JUGADOR, puntos);
                }
            } else { //EN CASO DE QUE LA RESPUESTA SEA INCORRECTA
                flag = false;
                JOptionPane.showMessageDialog(null, "RESPUESTA INCORRECTA, FIN DEL JUEGO!!");
                GUI_Inicio inicio = new GUI_Inicio();
                this.dispose();
                inicio.show();
            }
        }
    }

    private void seleccionarRespuesta(String respuestaSeleccionada) {
        cont += 1;
        if (cont == 4 && ronda == 5) {
            flag = true;
        }
        //Si es mayor a la cantidad de preguntas
        //Se le resta uno al valor del tamaño ya que los indices van del 0 en delante
        switch (ronda) {
            case 1:
                if (cont > preguntasFaciles1.size() - 1) {
                    cont = 0;//Vuelve el contador a cero
                    ronda++;//Avanza de ronda
                }
                break;
            case 2:
                if (cont > preguntasFaciles2.size()- 1) {
                    cont = 0;//Vuelve el contador a cero
                    ronda++;//Avanza de ronda
                }
                break;
            case 3:
                if (cont > preguntasNormales1.size()- 1) {
                    cont = 0;//Vuelve el contador a cero
                    ronda++;//Avanza de ronda
                }
                break;
            case 4:
                if (cont > preguntasNormales2.size()- 1) {
                    cont = 0;//Vuelve el contador a cero
                    ronda++;//Avanza de ronda
                }
                break;
            case 5:
                if (cont > preguntasDificiles.size()- 1) {
                    cont = 0;//Vuelve el contador a cero
                    ronda++;//Avanza de ronda
                }
                break;
            default:
                break;
        }

        try {
            respustaUsuario(respuestaSeleccionada);
        } catch (SQLException ex) {
            Logger.getLogger(GUI_ZonaDeJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.rbtn_respuesta1.setSelected(false);
        this.rbtn_respuesta2.setSelected(false);
        this.rbtn_respuesta3.setSelected(false);
        this.rbtn_respuesta4.setSelected(false);

    }

}
