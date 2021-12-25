package GUI;

import static Logica.Constantes.JUGADOR;
import Logica.Entidades.Usuario;
import Logica.Fabrica;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Haff
 */
public class GUI_Inicio extends javax.swing.JFrame {

    Fabrica fabrica = new Fabrica();

    public GUI_Inicio() {
        initComponents();

        //CREAR MODELO DE LA TABLA
        DefaultTableModel tabla = new DefaultTableModel();
        //DEFINIR LAS COLUMNAS
        tabla.addColumn("ID");
        tabla.addColumn("Nombre");
        tabla.addColumn("Puntos");

        //OBTENER LOS USUARIOS DE LA BASE DE DATOS
        List<Usuario> usuarios = fabrica.getControladorUsuarios().getTodosLosUsuarios();

        //GENERAR UNA FILA POR CADA USUARIO
        for (Usuario usuario : usuarios) {
            String fila[] = new String[3];//CANTIDAD DE COLUMNAS POR FILA
            //DATOS QUE SE AGREGAN A LA FILA
            fila[0] = usuario.getId().toString();
            fila[1] = usuario.getNickname();
            fila[2] = usuario.getPuntos().toString();
            tabla.addRow(fila);//SE AGREGA LA FILA
        }
        //SE SETEA EL MODELO DE LA TABLA CON LAS FILAS EN EL GUI
        this.tabla_jugadores.setModel(tabla);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_bienvenida = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_jugadores = new javax.swing.JTable();
        panel_nombre_usuario = new javax.swing.JPanel();
        lbl_nombre_usuario = new javax.swing.JLabel();
        txt_nombre_usuario = new javax.swing.JTextField();
        btn_salir = new javax.swing.JButton();
        btn_aceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");

        lbl_bienvenida.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        lbl_bienvenida.setText("Bienvenido al juego");

        tabla_jugadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Puntuación", "Puesto"
            }
        ));
        jScrollPane1.setViewportView(tabla_jugadores);

        panel_nombre_usuario.setBackground(new java.awt.Color(102, 102, 102));

        lbl_nombre_usuario.setText("Nombre de jugador:");

        javax.swing.GroupLayout panel_nombre_usuarioLayout = new javax.swing.GroupLayout(panel_nombre_usuario);
        panel_nombre_usuario.setLayout(panel_nombre_usuarioLayout);
        panel_nombre_usuarioLayout.setHorizontalGroup(
            panel_nombre_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_nombre_usuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_nombre_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_nombre_usuario)
                    .addComponent(txt_nombre_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        panel_nombre_usuarioLayout.setVerticalGroup(
            panel_nombre_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_nombre_usuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_nombre_usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_nombre_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(286, Short.MAX_VALUE))
        );

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        btn_aceptar.setText("Aceptar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        jLabel1.setText("Puntuación de jugadores:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(lbl_bienvenida)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panel_nombre_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_aceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_salir)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbl_bienvenida)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(panel_nombre_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salir)
                    .addComponent(btn_aceptar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        //VARIABLES DEL USUARIO
        String nombre = this.txt_nombre_usuario.getText();//NOMBRE
        Integer puntos = 0;//PUNTOS INICIADOS EN 0
        //SE CREA EL USUARIO
        Usuario jugador = new Usuario(nombre, puntos);

        try {
            //SE AGREGA EL USUARIO A LA BASE DE DATOS
            fabrica.getControladorUsuarios().altaUsuario(jugador);
            //SE SETEA LOS DATOS DEL USUARIO EN LA VARIABLE GLOBAL
            //SE SACAN LA ID DEL USUARIO DE LA BASE DE DATOS
            JUGADOR.setId(fabrica.getControladorUsuarios().getUsuarioPorNickname(nombre).getId());
            JUGADOR.setNickname(nombre);
            JUGADOR.setPuntos(puntos);

            //CAMBIO DE VENTANAS
            GUI_ZonaDeJuego zonaDeJuego = new GUI_ZonaDeJuego();
            this.hide();
            zonaDeJuego.show();
        } catch (Exception e) {//MOSTRAR MENSAJE CON LAS ALERTAS
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_bienvenida;
    private javax.swing.JLabel lbl_nombre_usuario;
    private javax.swing.JPanel panel_nombre_usuario;
    private javax.swing.JTable tabla_jugadores;
    private javax.swing.JTextField txt_nombre_usuario;
    // End of variables declaration//GEN-END:variables
}
