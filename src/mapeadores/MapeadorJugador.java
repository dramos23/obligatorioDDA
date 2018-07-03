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
import persistencia2.Mapeador;

/**
 *
 * @author alumnoFI
 */
public class MapeadorJugador implements Mapeador{

    private Jugador jug;

    public MapeadorJugador() {
    }

    public MapeadorJugador(Jugador u) {
        this.jug = u;
    }

    public void setJugador(Jugador u) {
        this.jug = u;
    }
    
    @Override
    public int getOid() {
        return jug.getOid();
    }

    @Override
    public void setOid(int oid) {
        jug.setOid(oid);
    }

    @Override
    public ArrayList<String> getSqlInsertar() {
        ArrayList<String> sqls = new ArrayList();
        sqls.add("INSERT INTO usuarios values (" + getOid() + ",'" +
                      jug.getNombre() + "','" + jug.getPass() + "','" + jug.getNombreCompleto() + "')");
        sqls.add("INSERT INTO jugadores values (" + getOid() + ",'" +
                      jug.getSaldo() + "')");
        return sqls;
    }

    @Override
    public ArrayList<String> getSqlActualizar() {
        ArrayList<String> sqls = new ArrayList();
        sqls.add("UPDATE jugadores set saldo='" + jug.getSaldo() +                      
                     "' WHERE oid =" + jug.getOid());
        return sqls;
    }

    @Override
    public ArrayList<String> getSqlBorrar() {
        ArrayList<String> sqls = new ArrayList();
        sqls.add("DELETE FROM jugadores WHERE oid = " + jug.getOid());        
        sqls.add("DELETE FROM usuarios WHERE oid = " + jug.getOid());
        return sqls;
    }

    @Override
    public String getSqlSeleccionar() {
        return "SELECT * FROM jugadores JOIN usuarios ON oid = oidUsuario";
    }

    @Override
    public void crearObjeto() {
        jug = new Jugador();
    }
    
    @Override
    public Object getObjeto() {
        return jug;
    }

    @Override
    public void leerComponente(ResultSet rs) throws SQLException {
        
    }

    @Override
    public void leerCompuesto(ResultSet rs) throws SQLException {
        jug.setNombre(rs.getString("nombre"));
        jug.setPass(rs.getString("password"));
        jug.setNombreCompleto(rs.getString("nombreCompleto"));
        jug.setSaldo(rs.getInt("saldo"));
    }
    
}
