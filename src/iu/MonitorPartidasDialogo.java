/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iu;

import controlador.ControladorMonitorPartidas;
import controlador.VistaMonitorPartidas;
import logica.Partida;

/**
 *
 * @author danie
 */
public class MonitorPartidasDialogo extends javax.swing.JDialog implements VistaMonitorPartidas{

    /**
     * Creates new form MonitorPartidasDialogo
     * 
     */
    
    private ControladorMonitorPartidas controlador;
    private Partida partida;
    
    public MonitorPartidasDialogo(java.awt.Frame parent, boolean modal, Partida p) {
        super(parent, modal);
        initComponents();
        partida = p;
        controlador = new ControladorMonitorPartidas(this,p);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblLuz = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtLuz = new javax.swing.JTextField();
        btnModificarLuz = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblCantJugadores = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtJugadores = new javax.swing.JTextField();
        btnModificarJugadores = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPartidasAct = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Valor de la apuesta base o luz:");

        lblLuz.setText("jLabel2");

        jLabel3.setText("Modificar a:");

        txtLuz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLuzActionPerformed(evt);
            }
        });

        btnModificarLuz.setText("Modificar");
        btnModificarLuz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarLuzActionPerformed(evt);
            }
        });

        jLabel4.setText("Cant. jugadores por partida:");

        lblCantJugadores.setText("jLabel5");

        jLabel6.setText("Modificar a:");

        btnModificarJugadores.setText("Modificar");
        btnModificarJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarJugadoresActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listPartidasAct);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(lblLuz))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCantJugadores)))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtLuz, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtJugadores)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnModificarLuz, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(btnModificarJugadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblLuz)
                    .addComponent(jLabel3)
                    .addComponent(txtLuz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarLuz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblCantJugadores)
                    .addComponent(jLabel6)
                    .addComponent(txtJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarJugadores))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLuzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLuzActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLuzActionPerformed

    private void btnModificarLuzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarLuzActionPerformed
        controlador.modificarLuz(partida, Integer.parseInt(txtLuz.getText()));
    }//GEN-LAST:event_btnModificarLuzActionPerformed

    private void btnModificarJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarJugadoresActionPerformed
       controlador.modificarCantJugadores(partida, Integer.parseInt(txtJugadores.getText()));
    }//GEN-LAST:event_btnModificarJugadoresActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificarJugadores;
    private javax.swing.JButton btnModificarLuz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantJugadores;
    private javax.swing.JLabel lblLuz;
    private javax.swing.JList<String> listPartidasAct;
    private javax.swing.JTextField txtJugadores;
    private javax.swing.JTextField txtLuz;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mostrarValores(int luz, int cantJugadores) {
        lblLuz.setText(luz + "");
        lblCantJugadores.setText(cantJugadores + "");
    }

}