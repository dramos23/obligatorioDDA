/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iu;

import controlador.ControladorPartida;
import controlador.VistaPartida;
import java.awt.Component;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import logica.Apuesta;
import logica.Carta;
import logica.Figura;
import logica.JugadorParticipante;

/**
 *
 * @author Diego
 */
public class PartidaDialogo2_1 extends javax.swing.JDialog implements VistaPartida {

    private ControladorPartida controlador;
    private JugadorParticipante jugador;
    
    public PartidaDialogo2_1(java.awt.Frame parent, boolean modal, JugadorParticipante j) {
        super(parent, modal);
        initComponents();
        jugador = j;
        controlador = new ControladorPartida(j, this);
        lblCartaGanadora.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlApostar = new javax.swing.JPanel();
        btnApostar = new javax.swing.JButton();
        txtApuesta = new javax.swing.JTextField();
        btnPasarApuesta = new javax.swing.JButton();
        pnlValores = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblLuz = new javax.swing.JLabel();
        lblPozo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblMiDinero = new javax.swing.JLabel();
        pnlMano = new javax.swing.JPanel();
        btnCarta1 = new javax.swing.JButton();
        btnCarta2 = new javax.swing.JButton();
        btnCarta3 = new javax.swing.JButton();
        btnCarta4 = new javax.swing.JButton();
        btnCarta5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstJugadores = new javax.swing.JList();
        btnCartaGanadora = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnlFinMano = new javax.swing.JPanel();
        btnJuegoMano = new javax.swing.JButton();
        btnNoJuegoMano = new javax.swing.JButton();
        lblInfoGanador = new javax.swing.JLabel();
        lblInfoGanador2 = new javax.swing.JLabel();
        optFinPartida = new javax.swing.JOptionPane();
        pnlAceptarApuesta = new javax.swing.JPanel();
        lblInfoApuesta = new javax.swing.JLabel();
        btnAceptarApuesta = new javax.swing.JButton();
        btnPasarDeApuesta = new javax.swing.JButton();
        pnlFaltan = new javax.swing.JPanel();
        lblInfoIngresados = new javax.swing.JLabel();
        pnlJugadoresMano = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstJugadoresMano = new javax.swing.JList();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblCartaGanadora = new javax.swing.JLabel();
        lblFigura = new javax.swing.JLabel();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnApostar.setText("Apostar");
        btnApostar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApostarActionPerformed(evt);
            }
        });

        txtApuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApuestaActionPerformed(evt);
            }
        });

        btnPasarApuesta.setText("Pasar");
        btnPasarApuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasarApuestaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlApostarLayout = new javax.swing.GroupLayout(pnlApostar);
        pnlApostar.setLayout(pnlApostarLayout);
        pnlApostarLayout.setHorizontalGroup(
            pnlApostarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlApostarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlApostarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlApostarLayout.createSequentialGroup()
                        .addComponent(btnApostar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(btnPasarApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlApostarLayout.createSequentialGroup()
                        .addComponent(txtApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlApostarLayout.setVerticalGroup(
            pnlApostarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlApostarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlApostarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApostar)
                    .addComponent(btnPasarApuesta))
                .addContainerGap())
        );

        getContentPane().add(pnlApostar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, -1, -1));

        jLabel1.setText("Luz: ");

        jLabel2.setText("Pozo:");

        jLabel3.setText("Mi dinero: ");

        javax.swing.GroupLayout pnlValoresLayout = new javax.swing.GroupLayout(pnlValores);
        pnlValores.setLayout(pnlValoresLayout);
        pnlValoresLayout.setHorizontalGroup(
            pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlValoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlValoresLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblLuz))
                    .addGroup(pnlValoresLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(lblPozo))
                    .addGroup(pnlValoresLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMiDinero)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlValoresLayout.setVerticalGroup(
            pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlValoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblLuz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblPozo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblMiDinero))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pnlValores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, -1, -1));

        btnCarta5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta5ActionPerformed(evt);
            }
        });

        lstJugadores.setAutoscrolls(false);
        jScrollPane1.setViewportView(lstJugadores);

        btnCartaGanadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartaGanadoraActionPerformed(evt);
            }
        });

        jLabel4.setText("Jugadores en");

        jLabel5.setText("partida:");

        javax.swing.GroupLayout pnlManoLayout = new javax.swing.GroupLayout(pnlMano);
        pnlMano.setLayout(pnlManoLayout);
        pnlManoLayout.setHorizontalGroup(
            pnlManoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlManoLayout.createSequentialGroup()
                .addGroup(pnlManoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlManoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pnlManoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlManoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnCarta1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnCarta2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnCarta3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnCarta4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnCarta5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnCartaGanadora, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        pnlManoLayout.setVerticalGroup(
            pnlManoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlManoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addComponent(jLabel5)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pnlManoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlManoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCarta1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarta2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarta3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarta4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarta5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCartaGanadora, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(pnlMano, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 760, -1));

        pnlFinMano.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnJuegoMano.setText("Si");
        btnJuegoMano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJuegoManoActionPerformed(evt);
            }
        });
        pnlFinMano.add(btnJuegoMano, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 86, -1));

        btnNoJuegoMano.setText("No");
        btnNoJuegoMano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoJuegoManoActionPerformed(evt);
            }
        });
        pnlFinMano.add(btnNoJuegoMano, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 86, -1));
        pnlFinMano.add(lblInfoGanador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 253, 20));
        pnlFinMano.add(lblInfoGanador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 253, 20));

        getContentPane().add(pnlFinMano, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 235, -1, 90));
        getContentPane().add(optFinPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 331, -1, -1));

        pnlAceptarApuesta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblInfoApuesta.setText("texto apuesta");
        pnlAceptarApuesta.add(lblInfoApuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 240, 38));

        btnAceptarApuesta.setText("Aceptar");
        btnAceptarApuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarApuestaActionPerformed(evt);
            }
        });
        pnlAceptarApuesta.add(btnAceptarApuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 86, -1));

        btnPasarDeApuesta.setText("Pasar");
        btnPasarDeApuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasarDeApuestaActionPerformed(evt);
            }
        });
        pnlAceptarApuesta.add(btnPasarDeApuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 86, -1));

        getContentPane().add(pnlAceptarApuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 427, 258, 94));

        lblInfoIngresados.setToolTipText("");

        javax.swing.GroupLayout pnlFaltanLayout = new javax.swing.GroupLayout(pnlFaltan);
        pnlFaltan.setLayout(pnlFaltanLayout);
        pnlFaltanLayout.setHorizontalGroup(
            pnlFaltanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 232, Short.MAX_VALUE)
            .addGroup(pnlFaltanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlFaltanLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblInfoIngresados, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlFaltanLayout.setVerticalGroup(
            pnlFaltanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
            .addGroup(pnlFaltanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlFaltanLayout.createSequentialGroup()
                    .addGap(4, 4, 4)
                    .addComponent(lblInfoIngresados, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(pnlFaltan, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 197, -1, -1));

        lstJugadoresMano.setAutoscrolls(false);
        jScrollPane2.setViewportView(lstJugadoresMano);

        jLabel7.setText("la mano:");

        jLabel6.setText("Jugadores en");

        javax.swing.GroupLayout pnlJugadoresManoLayout = new javax.swing.GroupLayout(pnlJugadoresMano);
        pnlJugadoresMano.setLayout(pnlJugadoresManoLayout);
        pnlJugadoresManoLayout.setHorizontalGroup(
            pnlJugadoresManoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlJugadoresManoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlJugadoresManoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        pnlJugadoresManoLayout.setVerticalGroup(
            pnlJugadoresManoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlJugadoresManoLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(6, 6, 6)
                .addComponent(jLabel7)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        getContentPane().add(pnlJugadoresMano, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, 150));

        lblCartaGanadora.setText("!!CARTA GANADORA!!");
        getContentPane().add(lblCartaGanadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, -1, -1));
        getContentPane().add(lblFigura, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 190, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnApostarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApostarActionPerformed
        if(!Pattern.matches("[a-zA-Z]+", txtApuesta.getText()) && !txtApuesta.getText().equals("")){
            controlador.realizarApuesta(jugador, Integer.parseInt(txtApuesta.getText()));
        }else
        {
            mostrarMensaje("Solo puede ingresar numeros sin espacios en la apuesta.");
            txtApuesta.setText("");
        }
    }//GEN-LAST:event_btnApostarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        controlador.removerJugador();
    }//GEN-LAST:event_formWindowClosed

    private void txtApuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApuestaActionPerformed

    private void btnAceptarApuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarApuestaActionPerformed
        controlador.aceptarApuesta();
    }//GEN-LAST:event_btnAceptarApuestaActionPerformed

    private void btnNoJuegoManoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoJuegoManoActionPerformed
        controlador.removerJugador();
        pnlFinMano.setVisible(false);
    }//GEN-LAST:event_btnNoJuegoManoActionPerformed

    private void btnJuegoManoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJuegoManoActionPerformed
        controlador.continuoJugando();
        pnlFinMano.setVisible(false);
    }//GEN-LAST:event_btnJuegoManoActionPerformed

    private void btnCartaGanadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartaGanadoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCartaGanadoraActionPerformed

    private void btnCarta5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCarta5ActionPerformed

    private void btnPasarApuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasarApuestaActionPerformed
        pnlApostar.setVisible(false);
        controlador.jugadorNoApuesta();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPasarApuestaActionPerformed

    private void btnPasarDeApuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasarDeApuestaActionPerformed
        pnlAceptarApuesta.setVisible(false);
        controlador.jugadorNoAceptaApuesta();
    }//GEN-LAST:event_btnPasarDeApuestaActionPerformed

    /**
     * @param args the command line arguments
     */
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarApuesta;
    private javax.swing.JButton btnApostar;
    private javax.swing.JButton btnCarta1;
    private javax.swing.JButton btnCarta2;
    private javax.swing.JButton btnCarta3;
    private javax.swing.JButton btnCarta4;
    private javax.swing.JButton btnCarta5;
    private javax.swing.JButton btnCartaGanadora;
    private javax.swing.JButton btnJuegoMano;
    private javax.swing.JButton btnNoJuegoMano;
    private javax.swing.JButton btnPasarApuesta;
    private javax.swing.JButton btnPasarDeApuesta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCartaGanadora;
    private javax.swing.JLabel lblFigura;
    private javax.swing.JLabel lblInfoApuesta;
    private javax.swing.JLabel lblInfoGanador;
    private javax.swing.JLabel lblInfoGanador2;
    private javax.swing.JLabel lblInfoIngresados;
    private javax.swing.JLabel lblLuz;
    private javax.swing.JLabel lblMiDinero;
    private javax.swing.JLabel lblPozo;
    private javax.swing.JList lstJugadores;
    private javax.swing.JList lstJugadoresMano;
    private javax.swing.JOptionPane optFinPartida;
    private javax.swing.JPanel pnlAceptarApuesta;
    private javax.swing.JPanel pnlApostar;
    private javax.swing.JPanel pnlFaltan;
    private javax.swing.JPanel pnlFinMano;
    private javax.swing.JPanel pnlJugadoresMano;
    private javax.swing.JPanel pnlMano;
    private javax.swing.JPanel pnlValores;
    private javax.swing.JTextField txtApuesta;
    // End of variables declaration//GEN-END:variables


    @Override
    public void mostrarCarta(Carta carta, JButton btn) {

        String url = "src/cartas/" +carta.getCodImagen() + ".png";
        ImageIcon c = new ImageIcon((new ImageIcon(url).getImage()
                .getScaledInstance(btn.getWidth(), btn.getHeight(), 
                java.awt.Image.SCALE_SMOOTH)));

        btn.setIcon(c);
    }
    

   @Override
   public void mostrarMano(ArrayList<Carta> cartas)
   {
       mostrarCarta(cartas.get(0), btnCarta1);
       mostrarCarta(cartas.get(1), btnCarta2);
       mostrarCarta(cartas.get(2), btnCarta3);
       mostrarCarta(cartas.get(3), btnCarta4);
       mostrarCarta(cartas.get(4), btnCarta5);
       btnCartaGanadora.setIcon(null);
   }
    
    @Override
    public void mostrarJugadores(ArrayList<JugadorParticipante> jugadores) {
        lstJugadores.setListData(jugadores.toArray());
        int faltan = devolverCantJugadoresParaEmpezar();
        if(faltan == 1){
                lblInfoIngresados.setText("Esperando al último jugador.");             
        }else
        {
                lblInfoIngresados.setText("Esperando jugadores... faltan " + faltan);
        }
    }
    
    @Override
    public void mostrarJugadoresMano(ArrayList<JugadorParticipante> jugadores) {
        lstJugadoresMano.setListData(jugadores.toArray());
    }
            
    @Override
    public void mostrarValores(int luz, int pozo, int dineroJugador) {
        lblLuz.setText(luz + "");
        lblPozo.setText(pozo + "");
        lblMiDinero.setText(dineroJugador + "");
    }

    @Override
    public void mostrarEstado(String estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrarApuesta(Apuesta a) {        
        pnlAceptarApuesta.setVisible(true);        
        pnlApostar.setVisible(false);

        lblInfoApuesta.setText(a.getApostador().getNombre() + " apostó $" + 
                a.getMontoApostado() + ". ¿Aceptas?");
    }

    @Override
    public void cambiaDinero(JugadorParticipante jugador) {
        lblPozo.setText(jugador.getPartida().getPozo() + "");
        lblMiDinero.setText(jugador.getSaldoJugador() + "");
    }

    @Override
    public void esconderAndMostrarAlInicio() {
        pnlAceptarApuesta.setVisible(false);
        pnlApostar.setVisible(false);
        pnlValores.setVisible(false);
        pnlFinMano.setVisible(false);
        pnlJugadoresMano.setVisible(false);
        optFinPartida.setVisible(false);
    }

    @Override
    public void iniciarPartida(JugadorParticipante j) {
        inicioRonda(j);
        pnlFaltan.setVisible(false);
    }

    @Override
    public void inicioRonda(JugadorParticipante j) {
        lblCartaGanadora.setVisible(false);
        pnlJugadoresMano.setVisible(true);
        pnlApostar.setVisible(true);
        pnlValores.setVisible(true);
        pnlFinMano.setVisible(false);
        txtApuesta.setText("");
        mostrarFigura(j.getFigura());
        mostrarValores(j.getPartida().getLuz(), j.getPartida().getPozo(), j.getSaldoJugador());
        mostrarMano(j.getMano());
    }
                    
    @Override
    public void mostrarGanador(JugadorParticipante ganador) {
        pnlFinMano.setVisible(true);
        lblInfoGanador.setText("Ganó " + ganador.getNombre());
        lblInfoGanador2.setText("Quieres seguir jugando?");
        Point p = this.getLocationOnScreen();
        new ManoGanadora(null,false,ganador, p).setVisible(true);
        //mostrarCarta(ganador.devolverMasAlta(), btnCartaGanadora);
        //lblCartaGanadora.setVisible(true);
    }

    @Override
    public void todosPasan() {
        pnlFinMano.setVisible(true);
        lblInfoGanador.setText("Todos pasaron: el pozo se acumuló.");
        lblInfoGanador2.setText("Quieres seguir jugando?");
    }

    
    @Override
    public void finMano() {
    }

    @Override
    public void aceptarApuesta() {
        pnlAceptarApuesta.setVisible(false);

    }

    @Override
    public void actualizarPozo(int pozo) {
        lblPozo.setText(pozo + "");
    }

    @Override
    public void jugadorAposto() {
        pnlApostar.setVisible(false);
    }

    @Override
    public void jugadorNoPuedeSeguir(String msg) {
        optFinPartida.showMessageDialog(null, msg);
        this.dispose();
    }
    
    @Override
    public void cerrarVentana(){
        this.dispose();
    }
    
    @Override
    public void mostrarNombreJugador(String nombreCompleto) {
        setTitle(nombreCompleto);
    }

    @Override
    public void mostrarGanadorPorSerUltimo(JugadorParticipante ganador) {
        optFinPartida.showMessageDialog(null, "Ganó " + ganador.getNombre() + " por ser el último jugador");
        //controlador.removerJugador();
    }
    
    public int devolverCantJugadoresParaEmpezar(){
        int faltan = jugador.getPartida().getCantJugadores();
        return faltan - jugador.getPartida().getJugadoresParticipantes().size();
    }

    @Override
    public void mostrarMensaje(String msg) {
            optFinPartida.showMessageDialog(null, msg);    
    }
    
    public void mostrarFigura(Figura f){
        if (f != null){
            lblFigura.setText("Tenes: " + f.toString());
            lblFigura.setVisible(true);
        }else{
            lblFigura.setVisible(false);
        }
    }

    @Override
    public void iniciaContador(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void finalizarContador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
