/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author alumnoFI
 */
public interface Mapeador {

    public int getOid();
    public void setOid(int oid);
    
    public ArrayList<String> getSqlInsertar();

    public ArrayList<String> getSqlActualizar();

    public ArrayList<String> getSqlBorrar();

    public String getSqlSeleccionar();

    public void crearObjeto();

    public Object getObjeto();

    public void leerComponente(ResultSet rs) throws SQLException;

    public void leerCompuesto(ResultSet rs) throws SQLException; //Es el que contiene los componentes

    
    
}
