/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iu;

import controlador.ControladorPartida;
import controlador.VistaPartida;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import logica.Apuesta;
import logica.Carta;
import logica.JugadorParticipante;

/**
 *
 * @author Diego
 */
public class PartidaDialogo extends javax.swing.JDialog implements VistaPartida {

    private ControladorPartida controlador;
    private JugadorParticipante jugador;
    
    public PartidaDialogo(java.awt.Frame parent, boolean modal, JugadorParticipante j) {
        super(parent, modal);
        initComponents();
        jugador = j;
        controlador = new ControladorPartida(j, this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstJugadores = new javax.swing.JList();
        pnlApostar = new javax.swing.JPanel();
        btnApostar = new javax.swing.JButton();
        txtApuesta = new javax.swing.JTextField();
        pnlAceptarApuesta = new javax.swing.JPanel();
        lblInfoApuesta = new javax.swing.JLabel();
        btnAceptarApuesta = new javax.swing.JButton();
        btnPasar = new javax.swing.JButton();
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
        pnlFinMano = new javax.swing.JPanel();
        btnJuegoMano = new javax.swing.JButton();
        btnNoJuegoMano = new javax.swing.JButton();
        lblInfoGanador = new javax.swing.JLabel();
        btnCartaGanadora = new javax.swing.JButton();
        optFinPartida = new javax.swing.JOptionPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lstJugadores.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstJugadores);

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

        javax.swing.GroupLayout pnlApostarLayout = new javax.swing.GroupLayout(pnlApostar);
        pnlApostar.setLayout(pnlApostarLayout);
        pnlApostarLayout.setHorizontalGroup(
            pnlApostarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlApostarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlApostarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlApostarLayout.createSequentialGroup()
                        .addComponent(btnApostar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(19, 19, 19))
                    .addGroup(pnlApostarLayout.createSequentialGroup()
                        .addComponent(txtApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlApostarLayout.setVerticalGroup(
            pnlApostarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlApostarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnApostar)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        lblInfoApuesta.setText("texto apuesta");

        btnAceptarApuesta.setText("Aceptar");
        btnAceptarApuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarApuestaActionPerformed(evt);
            }
        });

        btnPasar.setText("Abandonar");
        btnPasar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAceptarApuestaLayout = new javax.swing.GroupLayout(pnlAceptarApuesta);
        pnlAceptarApuesta.setLayout(pnlAceptarApuestaLayout);
        pnlAceptarApuestaLayout.setHorizontalGroup(
            pnlAceptarApuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAceptarApuestaLayout.createSequentialGroup()
                .addGroup(pnlAceptarApuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAceptarApuestaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblInfoApuesta)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlAceptarApuestaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAceptarApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPasar)))
                .addContainerGap())
        );
        pnlAceptarApuestaLayout.setVerticalGroup(
            pnlAceptarApuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAceptarApuestaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInfoApuesta)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAceptarApuestaLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(pnlAceptarApuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPasar)
                    .addComponent(btnAceptarApuesta))
                .addContainerGap())
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        javax.swing.GroupLayout pnlManoLayout = new javax.swing.GroupLayout(pnlMano);
        pnlMano.setLayout(pnlManoLayout);
        pnlManoLayout.setHorizontalGroup(
            pnlManoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlManoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnCarta1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCarta2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCarta3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCarta4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCarta5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnlManoLayout.setVerticalGroup(
            pnlManoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlManoLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(pnlManoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCarta1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarta2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarta3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarta4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarta5, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlFinManoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFinManoLayout.createSequentialGroup()
                        .addComponent(btnJuegoMano, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNoJuegoMano, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblInfoGanador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(pnlFinManoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnCartaGanadora, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFinManoLayout.setVerticalGroup(
            pnlFinManoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFinManoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInfoGanador, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCartaGanadora, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFinManoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnJuegoMano)
                    .addComponent(btnNoJuegoMano))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlApostar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(pnlFinMano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(pnlAceptarApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(pnlValores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlMano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(optFinPartida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(pnlAceptarApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlValores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(pnlApostar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlFinMano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(optFinPartida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlMano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnApostarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApostarActionPerformed
        //Revisar excepcion si jugador pone letras.
        controlador.realizarApuesta(jugador, Integer.parseInt(txtApuesta.getText()));
    }//GEN-LAST:event_btnApostarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        controlador.removerJugador();
    }//GEN-LAST:event_formWindowClosed

    private void txtApuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApuestaActionPerformed

    private void btnPasarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasarActionPerformed
        controlador.removerJugador();
    }//GEN-LAST:event_btnPasarActionPerformed

    private void btnAceptarApuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarApuestaActionPerformed
        controlador.aceptarApuesta();
    }//GEN-LAST:event_btnAceptarApuestaActionPerformed

    private void btnNoJuegoManoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoJuegoManoActionPerformed
        controlador.removerJugador();
    }//GEN-LAST:event_btnNoJuegoManoActionPerformed

    private void btnJuegoManoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJuegoManoActionPerformed
    }//GEN-LAST:event_btnJuegoManoActionPerformed

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
    private javax.swing.JButton btnPasar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblInfoApuesta;
    private javax.swing.JLabel lblInfoGanador;
    private javax.swing.JLabel lblLuz;
    private javax.swing.JLabel lblMiDinero;
    private javax.swing.JLabel lblPozo;
    private javax.swing.JList lstJugadores;
    private javax.swing.JOptionPane optFinPartida;
    private javax.swing.JPanel pnlAceptarApuesta;
    private javax.swing.JPanel pnlApostar;
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
        pnlApostar.setVisible(true);
        pnlValores.setVisible(true);
        mostrarValores(j.getPartida().getLuz(), j.getPartida().getPozo(), j.getSaldoJugador());
        mostrarMano(j.getMano());
    }

    private void togglePanelFinMano() {
        if(!pnlFinMano.isVisible()) pnlFinMano.setVisible(true);
        else pnlFinMano.setVisible(false);                
    }

    @Override
    public void mostrarGanador(JugadorParticipante ganador) {
        pnlFinMano.setVisible(true);
        lblInfoGanador.setText("Ganó " + ganador.getNombre() + " con esta carta: ");
        mostrarCarta(ganador.devolverMasAlta(), btnCartaGanadora);
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
    
    public void cerrarVentana(){
        this.dispose();
    }
                    
}
