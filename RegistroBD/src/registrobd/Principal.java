/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrobd;

import java.sql.Connection;

/**
 *
 * @author jadg13
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Conexion conn = new Conexion();
//        Connection conexion = null;
//        conexion = conn.obtenerConexion();
        
        TablaCiudad tciudad = new TablaCiudad();
        tciudad.listarCiudad();
        
    }
    
}
