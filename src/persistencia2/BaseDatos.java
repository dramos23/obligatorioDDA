/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumnoFI
 */
public class BaseDatos {
    
    private static BaseDatos instancia = new BaseDatos();
    private Connection conexion;
    private Statement stmt;

    public static BaseDatos getInstancia() {
        return instancia;
    }
    
    private BaseDatos() {
    }
    
    public boolean conectar(String base, String usr,String pass){
        String url = "jdbc:mysql://localhost/" + base;
        try {
            Class.forName ("com.mysql.jdbc.Driver").newInstance ();
            conexion = DriverManager.getConnection (url, usr, pass);
            stmt = conexion.createStatement();
            
        } catch (Exception ex) {
            System.out.println("Error de conexion:" + ex.getMessage());
            return false;
        }
        System.out.println("CONECTADO!");
        return true;
    }
    
    public int modificar(String sql){ //INSERT; DELETE; UPDATE
        int f = -1;
        try {
            f = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println("Error al modificar:" + ex.getMessage());
            System.out.println("SQL:" + sql);
        }
        return f;
    }
    
    public boolean transaccion(ArrayList<String> sqls){
        try {
            conexion.setAutoCommit(false); //BEGIN T
            for(String sql:sqls){
                if(modificar(sql)==-1){
                    //Error
                    throw new SQLException("!");
                }
            }
            //TODO OK
            conexion.commit();
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar la transaccion:"+ ex.getMessage());
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                System.out.println("JAJA ERROR DE ROLLBACK:" + ex1);
            }
            return false;
        }finally{
            try {
                conexion.setAutoCommit(true);
            } catch (SQLException ex) { }
        }
        return true;
    }
    public ResultSet consultar(String sql){ //SELECT
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println("Error al consultar:" + ex.getMessage());
            System.out.println("SQL:" + sql);
        }
        return rs;
    }

    public void desconectar() {
        try {
            conexion.close();
        } catch (SQLException ex) {
         
        }
    }
    
    
    
}
