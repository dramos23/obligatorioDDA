/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iu;

import controlador.ControladorManoGanadora;
import controlador.VistaManoGanadora;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import logica.Carta;
import logica.JugadorParticipante;

/**
 *
 * @author danie
 */
public class ManoGanadora extends javax.swing.JDialog implements VistaManoGanadora{

    /**
     * Creates new form ManoGnadora
     */
    private ControladorManoGanadora controlador;
    private JugadorParticipante ganador;
    
    public ManoGanadora(java.awt.Frame parent, boolean modal, JugadorParticipante j, Point p) {
        super(parent, modal);
        initComponents();
        controlador = new ControladorManoGanadora(this);
        ganador = j;
        this.setLocation(p);
        setTitle("Mano Ganadora!!!...");
        mostrarGanador(j);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCarta1 = new javax.swing.JButton();
        btnCarta2 = new javax.swing.JButton();
        btnCarta3 = new javax.swing.JButton();
        btnCarta4 = new javax.swing.JButton();
        btnCarta5 = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        lblH1 = new javax.swing.JLabel();
        lblH2 = new javax.swing.JLabel();
        lblGanador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(521, 366));
        setMinimumSize(new java.awt.Dimension(521, 366));
        setPreferredSize(new java.awt.Dimension(521, 366));
        setResizable(false);
        getContentPane().setLayout(null);

        btnCarta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarta1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCarta1);
        btnCarta1.setBounds(10, 90, 95, 150);
        getContentPane().add(btnCarta2);
        btnCarta2.setBounds(110, 90, 95, 150);
        getContentPane().add(btnCarta3);
        btnCarta3.setBounds(210, 90, 95, 150);
        getContentPane().add(btnCarta4);
        btnCarta4.setBounds(310, 90, 95, 150);
        getContentPane().add(btnCarta5);
        btnCarta5.setBounds(410, 90, 95, 150);

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar);
        btnAceptar.setBounds(210, 290, 95, 23);

        lblH1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblH1.setText("MANO GANADORA!!!!");
        getContentPane().add(lblH1);
        lblH1.setBounds(10, 10, 196, 31);

        lblH2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblH2.setText("Ganó:");
        getContentPane().add(lblH2);
        lblH2.setBounds(10, 50, 37, 17);

        lblGanador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(lblGanador);
        lblGanador.setBounds(63, 47, 143, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCarta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCarta1ActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    
    public void mostrarCarta(Carta carta, JButton btn) {
        
        String url = "src/cartas/" +carta.getCodImagen() + ".png";
        ImageIcon c = new ImageIcon((new ImageIcon(url).getImage()
                .getScaledInstance(btn.getWidth(), btn.getHeight(), 
                java.awt.Image.SCALE_SMOOTH)));

        btn.setIcon(c);
        
    }

    @Override
    public void mostrarGanador(JugadorParticipante j) {
        lblGanador.setText(j.getNombreCompleto() + "");
        mostrarMano(j.getMano());
    }

    
    public void mostrarMano(ArrayList<Carta> cartas) {
       mostrarCarta(cartas.get(0), btnCarta1);
       mostrarCarta(cartas.get(1), btnCarta2);
       mostrarCarta(cartas.get(2), btnCarta3);
       mostrarCarta(cartas.get(3), btnCarta4);
       mostrarCarta(cartas.get(4), btnCarta5);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCarta1;
    private javax.swing.JButton btnCarta2;
    private javax.swing.JButton btnCarta3;
    private javax.swing.JButton btnCarta4;
    private javax.swing.JButton btnCarta5;
    private javax.swing.JLabel lblGanador;
    private javax.swing.JLabel lblH1;
    private javax.swing.JLabel lblH2;
    // End of variables declaration//GEN-END:variables
}
