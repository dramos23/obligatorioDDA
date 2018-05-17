/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iu;

import com.sun.glass.events.KeyEvent;
import controlador.ControladorMonitorPartidas;
import controlador.VistaMonitorPartidas;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import logica.Admin;
import logica.Partida;


/**
 *
 * @author danie
 */

public class MonitorPartidasDialogo extends javax.swing.JDialog implements VistaMonitorPartidas{
    
    private ControladorMonitorPartidas controlador;
    private Admin admin;
        
    public MonitorPartidasDialogo(java.awt.Frame parent, boolean modal, Admin adm) {
        super(parent, modal);
        initComponents();
        admin = adm;
        controlador = new ControladorMonitorPartidas(this,adm);
    }

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
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText(" Valor de la apuesta base o luz:");

        lblLuz.setText("jLabel2");

        jLabel3.setText("Modificar a:");

        txtLuz.setHorizontalAlignment(txtLuz.CENTER);
        txtLuz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLuzActionPerformed(evt);
            }
        });
        txtLuz.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLuzKeyPressed(evt);
            }
        });

        btnModificarLuz.setText("Modificar");
        btnModificarLuz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarLuzActionPerformed(evt);
            }
        });
        btnModificarLuz.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnModificarLuzKeyPressed(evt);
            }
        });

        jLabel4.setText(" Cant. jugadores por partida:");

        lblCantJugadores.setText("jLabel5");

        jLabel6.setText("Modificar a:");

        txtJugadores.setHorizontalAlignment(txtJugadores.CENTER);
        txtJugadores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtJugadoresKeyPressed(evt);
            }
        });

        btnModificarJugadores.setText("Modificar");
        btnModificarJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarJugadoresActionPerformed(evt);
            }
        });
        btnModificarJugadores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnModificarJugadoresKeyPressed(evt);
            }
        });

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha/Hora", "Cant. Jugadores", "Total Apostado", "Cant. Manos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDatos.setColumnSelectionAllowed(true);
        tblDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDatos);
        tblDatos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
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
                            .addComponent(btnModificarJugadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLuzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLuzActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLuzActionPerformed

    private void btnModificarLuzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarLuzActionPerformed
        controlador.modificarLuz(Integer.parseInt(txtLuz.getText()));
        txtLuz.setText("");
    }//GEN-LAST:event_btnModificarLuzActionPerformed

    private void btnModificarJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarJugadoresActionPerformed
       controlador.modificarCantJugadores(Integer.parseInt(txtJugadores.getText()));
       txtJugadores.setText("");
    }//GEN-LAST:event_btnModificarJugadoresActionPerformed

    private void tblDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDatosMouseClicked

    private void txtLuzKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLuzKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnModificarLuz.setFocusable(true); // How do I get focus on button on App launch?
            btnModificarLuz.requestFocus(true);
        }
    }//GEN-LAST:event_txtLuzKeyPressed

    private void btnModificarLuzKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnModificarLuzKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            java.awt.event.ActionEvent evento = null;
            btnModificarLuzActionPerformed(evento);
        }
    }//GEN-LAST:event_btnModificarLuzKeyPressed

    private void txtJugadoresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJugadoresKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnModificarJugadores.setFocusable(true); // How do I get focus on button on App launch?
            btnModificarJugadores.requestFocus(true);
        }
    }//GEN-LAST:event_txtJugadoresKeyPressed

    private void btnModificarJugadoresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnModificarJugadoresKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            java.awt.event.ActionEvent evento = null;
            btnModificarJugadoresActionPerformed(evento);
        }
    }//GEN-LAST:event_btnModificarJugadoresKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificarJugadores;
    private javax.swing.JButton btnModificarLuz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCantJugadores;
    private javax.swing.JLabel lblLuz;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtJugadores;
    private javax.swing.JTextField txtLuz;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mostrarPartidasAct(ArrayList<Partida> partidas) {
        
        DefaultTableModel model = (DefaultTableModel) tblDatos.getModel();
        while(model.getRowCount() > 0) {
            model.removeRow(0);
        }
        for (Partida p:partidas) {
            model.addRow(new Object[]{p.getFechaHora(),p.getCantJugadores(),p.getTotalApostado(),p.getCantManos()});
        }           
    }    

    @Override
    public void mostrarLuz(int luz) {
        lblLuz.setText(luz + "");
    }

    @Override
    public void mostrarCantJugadores(int cantJugadores) {
        lblCantJugadores.setText(cantJugadores + "");
    }
    
}
