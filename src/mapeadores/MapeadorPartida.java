/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapeadores;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import logica.Jugador;
import logica.JugadorParticipante;
import logica.Partida;
import persistencia2.Mapeador;
import persistencia2.Persistencia;

/**
 *
 * @author alumnoFI
 */
public class MapeadorPartida implements Mapeador{

    private Partida partida;

    public MapeadorPartida() {
    }

    public MapeadorPartida(Partida p) {
        this.partida = p;
    }

    public void setJugador(Partida p) {
        this.partida = p;
    }
    
    @Override
    public int getOid() {
        return partida.getOid();
    }

    @Override
    public void setOid(int oid) {
        partida.setOid(oid);
    }

    @Override
    public ArrayList<String> getSqlInsertar() {
        ArrayList<String> sqls = new ArrayList();
        sqls.add("INSERT INTO partidas values (" + getOid() + ",'" +
                 partida.getFechaHora() + "','" + partida.getCantJugadores() + "','" 
                + partida.getTotalApostado()+ "','" + partida.getCantManos() + "')");
        ArrayList<JugadorParticipante> jugadores = partida.getJugadoresAlInicio();
        for(JugadorParticipante jp : jugadores)
        {
            sqls.add("INSERT INTO jugadoresPartida values (" + getOid() + ",'" +
                 jp.getJugador().getOid() + "','" +
                 jp.getNombreCompleto()+ "','" + 
                 jp.getTotalApostado() + "','" + 
                 jp.getSaldoInicial()+ "','" + 
                 jp.getTotalGanado()+ "')");
        }
        return sqls;
    }

    @Override
    public ArrayList<String> getSqlActualizar() {
/*
        ArrayList<String> sqls = new ArrayList();
        sqls.add("UPDATE jugadores set saldo='" + partida.getSaldo() +                      
                     "' WHERE oid =" + partida.getOid());
        return sqls;
*/
        return null;
    }

    //No sirve
    @Override
    public ArrayList<String> getSqlBorrar() {
        ArrayList<String> sqls = new ArrayList();
        sqls.add("DELETE FROM partida WHERE oid = " + partida.getOid());        
        sqls.add("DELETE FROM partida WHERE oid = " + partida.getOid());        
        return sqls;
    }

    @Override
    public String getSqlSeleccionar() {
        return "SELECT * FROM partidas JOIN jugadoresPartida ON oid = oidPartida";
    }

    @Override
    public void crearObjeto() {
        partida = new Partida();
    }
    
    @Override
    public Object getObjeto() {
        return partida;
    }

    @Override
    public void leerComponente(ResultSet rs) throws SQLException {
        int oidJugador = Integer.parseInt(rs.getString("oidJugador"));
        String nombre = rs.getString("nombreCompleto");
        int totalApos = Integer.parseInt(rs.getString("totalApostado"));
        int saldoIni = Integer.parseInt(rs.getString("saldoInicial"));
        int totalG = Integer.parseInt(rs.getString("totalGanado"));
                
        partida.agregarJugador(
                nombre,
                totalApos,
                saldoIni,
                totalG
        );
    }

    @Override
    public void leerCompuesto(ResultSet rs) throws SQLException {
        partida.setJugadores(new ArrayList());
        partida.setFechaHora(rs.getString("fecha"));
        partida.setCantJugadoresBD(Integer.parseInt(rs.getString("cantJugadores")));
        partida.setTotalApostado(Integer.parseInt(rs.getString("totalApostado")));
        partida.setCantManos(Integer.parseInt(rs.getString("cantManos")));
        partida.setTerminada(true);
    }
    
}
