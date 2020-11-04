/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrobd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jadg13
 */
public class TablaCiudad extends Conexion{
    final String mostrarCiudad = "Select * from Ciudad";
    
    public void listarCiudad(){
        Connection conn = this.obtenerConexion();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(mostrarCiudad);
            
            ResultSetMetaData metaData = rs.getMetaData();
            int numDeColumna = metaData.getColumnCount();
            
            System.out.println("Tabla Ciudad");
            for(int i =1; i <= numDeColumna; i++){
                System.out.printf("%-8s\t", metaData.getColumnName(i));
                
            }
            System.out.println("");
            while (rs.next()){
                for(int i= 1; i<= numDeColumna; i++){
                    System.out.printf("%-8s \t", rs.getObject(i));
                    
                }
                System.out.println("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(TablaCiudad.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}
