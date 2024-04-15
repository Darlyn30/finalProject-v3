
package com.finalproject;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

/**
 *
 * @author darlyn
 */
public class ConexionDB {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/gestion_hospital";
    private static final String USER = "root";
    private static final String PASS = "";
    
    public static Connection conectar(){
        try {
            System.out.println("base de datos conectada!");
            return DriverManager.getConnection(URL, USER, PASS);
        } catch(SQLException ex){
            System.out.println("no se pudo conectar la DB " + ex.getMessage());
            return null;
        }
    }
}
