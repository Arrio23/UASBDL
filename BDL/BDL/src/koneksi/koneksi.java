/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author RIO
 */
public class koneksi {
    private static Connection MySQLConfig;

    public static Connection configDB() throws SQLException{
       try {
            String user = "postgres";
            String pass = "11111";
            String url = "jdbc:postgresql://localhost:5432/UASBDL";
                
            DriverManager.registerDriver(new org.postgresql.Driver());
            MySQLConfig = DriverManager.getConnection(url, user, pass);
       }   
       catch (SQLException e) {
           System.out.println("Koneksi ke Database Gagal" + e.getMessage());
       }
        return MySQLConfig;
    }
}
