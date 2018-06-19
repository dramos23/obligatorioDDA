/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Usuario;

/**
 *
 * @author alumnoFI
 */
public class Persistencia {
    
    private static Persistencia instancia = new Persistencia();
    private BaseDatos base;
    
    public static Persistencia getInstancia() {
        return instancia;
    }

    private Persistencia() {
        base = BaseDatos.getInstancia();
        base.conectar("DDAM4A", "root", "root");
    }
    public int proximoOid(){
        int oid = -1;
        ResultSet rs = base.consultar("SELECT valor FROM oid");
        try {
            if(rs.next()){
                oid = rs.getInt("valor");
                base.modificar("UPDATE oid set valor=" + (oid+1));
            }else{
                System.out.println("FALTA INICIALIZAR EL OID");
            }
        } catch (SQLException ex) {
            System.out.println("ERROR AL CALCULAR PROXIMO OID:" + ex.getMessage());
        }
        return oid;
                
    }
    public void guardar(Mapeador m){
        if(m.getOid()==0){
            insertar(m);
        }else{
            actualizar(m);
        }
    }
  
    private void insertar(Mapeador m) {
        int oid = proximoOid();
        m.setOid(oid);
        ArrayList<String> sqls = m.getSqlInsertar();
        if(!base.transaccion(sqls)){
            System.out.println("Error al insertar el objeto");
            m.setOid(0);
        }
    }
    private void actualizar(Mapeador m) {
        ArrayList<String> sqls = m.getSqlActualizar();
        if(!base.transaccion(sqls)){
            System.out.println("Error al actualizar el objeto");
        }

    }
    public void borrar(Mapeador m){
        ArrayList<String> sqls = m.getSqlBorrar();
        if(base.transaccion(sqls)){
            m.setOid(0);
        }else{
            System.out.println("Error al borrar el objeto");
        }
    }
    public ArrayList todos(Mapeador m){
        return buscar(m,null);
    }
    
    public ArrayList buscar(Mapeador m, String filtro){
        ArrayList lista = new ArrayList();
        String sql = m.getSqlSeleccionar();//
        if(filtro!=null) sql+= " WHERE " + filtro;
        ResultSet rs = base.consultar(sql);
        try {
            int oidAnt = -1;
            int oidActual;
            while(rs.next()){
                oidActual = rs.getInt("oid");//se debe llamar "oid" en la tabla
                if(oidActual!=oidAnt){
                    m.crearObjeto();
                    m.setOid(oidActual); 
                    lista.add(m.getObjeto());
                    oidAnt = oidActual;
                    m.leerCompuesto(rs);
                }
                m.leerComponente(rs);//??              
            }
        } catch (SQLException ex) {
            System.out.println("Error al buscar:" + ex);
            return null;
        }
        return lista;
    }
    
}
