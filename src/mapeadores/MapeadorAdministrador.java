/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapeadores;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import logica.Admin;
import persistencia2.Mapeador;

/**
 *
 * @author alumnoFI
 */
public class MapeadorAdministrador implements Mapeador{

    private Admin admin;

    public MapeadorAdministrador() {
    }

    public MapeadorAdministrador(Admin u) {
        this.admin = u;
    }

    public void setJugador(Admin u) {
        this.admin = u;
    }
    
    @Override
    public int getOid() {
        return admin.getOid();
    }

    @Override
    public void setOid(int oid) {
        admin.setOid(oid);
    }

    @Override
    public ArrayList<String> getSqlInsertar() {
        ArrayList<String> sqls = new ArrayList();
        sqls.add("INSERT INTO usuarios values (" + getOid() + ",'" +
                      admin.getNombre() + "','" + admin.getPass() + "','" + admin.getNombreCompleto() + "')");
        sqls.add("INSERT INTO administradores values (" + getOid() +")");
        return sqls;
    }

    @Override
    public ArrayList<String> getSqlActualizar() {
/*
        ArrayList<String> sqls = new ArrayList();
        sqls.add("UPDATE jugadores set saldo='" + admin.getSaldo() +                      
                     "' WHERE oid =" + admin.getOid());
        return sqls;
*/
        return null;
    }

    @Override
    public ArrayList<String> getSqlBorrar() {
        ArrayList<String> sqls = new ArrayList();
        sqls.add("DELETE FROM administradores WHERE oid = " + admin.getOid());        
        sqls.add("DELETE FROM usuarios WHERE oid = " + admin.getOid());
        return sqls;
    }

    @Override
    public String getSqlSeleccionar() {
        return "SELECT * FROM administradores JOIN usuarios ON oid = oidUsuario";
    }

    @Override
    public void crearObjeto() {
        admin = new Admin();
    }
    
    @Override
    public Object getObjeto() {
        return admin;
    }

    @Override
    public void leerComponente(ResultSet rs) throws SQLException {
        
    }

    @Override
    public void leerCompuesto(ResultSet rs) throws SQLException {
        admin.setNombre(rs.getString("nombre"));
        admin.setPass(rs.getString("password"));
        admin.setNombreCompleto(rs.getString("nombreCompleto"));
    }
    
}
