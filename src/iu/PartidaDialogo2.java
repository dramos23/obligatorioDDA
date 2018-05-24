/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iu;

import controlador.ControladorPartida;
import controlador.VistaPartida;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import logica.Apuesta;
import logica.Carta;
import logica.JugadorParticipante;

/**
 *
 * @author Diego
 */
public class PartidaDialogo2 extends javax.swing.JDialog implements VistaPartida {

    private ControladorPartida controlador;
    private JugadorParticipante jugador;
    
    public PartidaDialogo2(java.awt.Frame parent, boolean modal, JugadorParticipante j) {
        super(parent, modal);
        initComponents();
        jugador = j;
        controlador = new ControladorPartida(j, this);
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
        pnlFinMano = new javax.swing.JPanel();
        btnJuegoMano = new javax.swing.JButton();
        btnNoJuegoMano = new javax.swing.JButton();
        lblInfoGanador = new javax.swing.JLabel();
        optFinPartida = new javax.swing.JOptionPane();
        pnlAceptarApuesta = new javax.swing.JPanel();
        lblInfoApuesta = new javax.swing.JLabel();
        btnAceptarApuesta = new javax.swing.JButton();
        btnPasarDeApuesta = new javax.swing.JButton();
        btnAbandonar = new javax.swing.JButton();
        pnlFaltan = new javax.swing.JPanel();
        lblInfoIngresados = new javax.swing.JLabel();

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
                .addGroup(pnlApostarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnApostar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtApuesta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPasarApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlApostarLayout.setVerticalGroup(
            pnlApostarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlApostarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlApostarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApostar)
                    .addComponent(btnPasarApuesta))
                .addContainerGap(29, Short.MAX_VALUE))
        );

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

        btnCarta5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta5ActionPerformed(evt);
            }
        });

        lstJugadores.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstJugadores);

        btnCartaGanadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartaGanadoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlManoLayout = new javax.swing.GroupLayout(pnlMano);
        pnlMano.setLayout(pnlManoLayout);
        pnlManoLayout.setHorizontalGroup(
            pnlManoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlManoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCarta1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCarta2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCarta3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCarta4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCarta5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnCartaGanadora, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlManoLayout.setVerticalGroup(
            pnlManoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlManoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlManoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCartaGanadora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlManoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCarta1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCarta2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCarta3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCarta4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCarta5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );

        btnJuegoMano.setText("Si");
        btnJuegoMano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJuegoManoActionPerformed(evt);
            }
        });

        btnNoJuegoMano.setText("No");
        btnNoJuegoMano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoJuegoManoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFinManoLayout = new javax.swing.GroupLayout(pnlFinMano);
        pnlFinMano.setLayout(pnlFinManoLayout);
        pnlFinManoLayout.setHorizontalGroup(
            pnlFinManoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFinManoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFinManoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFinManoLayout.createSequentialGroup()
                        .addComponent(lblInfoGanador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pnlFinManoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnJuegoMano, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNoJuegoMano, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        pnlFinManoLayout.setVerticalGroup(
            pnlFinManoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFinManoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInfoGanador, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFinManoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNoJuegoMano)
                    .addComponent(btnJuegoMano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lblInfoApuesta.setText("texto apuesta");

        btnAceptarApuesta.setText("Aceptar");
        btnAceptarApuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarApuestaActionPerformed(evt);
            }
        });

        btnPasarDeApuesta.setText("Pasar");
        btnPasarDeApuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasarDeApuestaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAceptarApuestaLayout = new javax.swing.GroupLayout(pnlAceptarApuesta);
        pnlAceptarApuesta.setLayout(pnlAceptarApuestaLayout);
        pnlAceptarApuestaLayout.setHorizontalGroup(
            pnlAceptarApuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAceptarApuestaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAceptarApuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAceptarApuestaLayout.createSequentialGroup()
                        .addComponent(lblInfoApuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pnlAceptarApuestaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnAceptarApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPasarDeApuesta)
                        .addGap(38, 38, 38))))
        );
        pnlAceptarApuestaLayout.setVerticalGroup(
            pnlAceptarApuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAceptarApuestaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblInfoApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAceptarApuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarApuesta)
                    .addComponent(btnPasarDeApuesta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAbandonar.setText("Abandonar");
        btnAbandonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbandonarActionPerformed(evt);
            }
        });

        lblInfoIngresados.setToolTipText("");

        javax.swing.GroupLayout pnlFaltanLayout = new javax.swing.GroupLayout(pnlFaltan);
        pnlFaltan.setLayout(pnlFaltanLayout);
        pnlFaltanLayout.setHorizontalGroup(
            pnlFaltanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFaltanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblInfoIngresados, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlFaltanLayout.setVerticalGroup(
            pnlFaltanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFaltanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInfoIngresados, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlApostar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlValores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(optFinPartida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlAceptarApuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(pnlFaltan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(btnAbandonar)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlFinMano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addComponent(pnlMano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMano, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(optFinPartida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlValores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlFinMano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlApostar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlAceptarApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlFaltan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAbandonar))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnApostarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApostarActionPerformed
        if(!Pattern.matches("[a-zA-Z]+", txtApuesta.getText())){
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
        controlador.jugadorNoApuesta();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPasarApuestaActionPerformed

    private void btnAbandonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbandonarActionPerformed
        controlador.removerJugador();
    }//GEN-LAST:event_btnAbandonarActionPerformed

    private void btnPasarDeApuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasarDeApuestaActionPerformed
        controlador.jugadorNoAceptaApuesta();
        pnlAceptarApuesta.setVisible(false);
    }//GEN-LAST:event_btnPasarDeApuestaActionPerformed

    /**
     * @param args the command line arguments
     */
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbandonar;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblInfoApuesta;
    private javax.swing.JLabel lblInfoGanador;
    private javax.swing.JLabel lblInfoIngresados;
    private javax.swing.JLabel lblLuz;
    private javax.swing.JLabel lblMiDinero;
    private javax.swing.JLabel lblPozo;
    private javax.swing.JList lstJugadores;
    private javax.swing.JOptionPane optFinPartida;
    private javax.swing.JPanel pnlAceptarApuesta;
    private javax.swing.JPanel pnlApostar;
    private javax.swing.JPanel pnlFaltan;
    private javax.swing.JPanel pnlFinMano;
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
        optFinPartida.setVisible(false);
    }

    @Override
    public void iniciarPartida(JugadorParticipante j) {
        inicioRonda(j);
        pnlFaltan.setVisible(false);
    }

    @Override
    public void inicioRonda(JugadorParticipante j) {
        pnlApostar.setVisible(true);
        pnlValores.setVisible(true);
        pnlFinMano.setVisible(false);
        txtApuesta.setText("");
        mostrarValores(j.getPartida().getLuz(), j.getPartida().getPozo(), j.getSaldoJugador());
        mostrarMano(j.getMano());
    }
                    
    @Override
    public void mostrarGanador(JugadorParticipante ganador) {
        pnlFinMano.setVisible(true);
        lblInfoGanador.setText("Ganó " + ganador.getNombre() + " con esta carta: \n "
                + "Quieres seguir jugando?");
        mostrarCarta(ganador.devolverMasAlta(), btnCartaGanadora);
    }

    @Override
    public void todosPasan() {
        pnlFinMano.setVisible(true);
        lblInfoGanador.setText("Todos pasaron: el pozo se acumuló. \n "
                + "Quieres seguir jugando?");
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
        //this.dispose();
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
        controlador.removerJugador();
    }
    
    public int devolverCantJugadoresParaEmpezar(){
        int faltan = jugador.getPartida().getCantJugadores();
        return faltan - jugador.getPartida().getJugadoresParticipantes().size();
    }

    @Override
    public void mostrarMensaje(String msg) {
            optFinPartida.showMessageDialog(null, msg);    
    }

}
