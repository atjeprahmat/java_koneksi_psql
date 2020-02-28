/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_koneksi_psql;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author atjep
 */
public class Java_koneksi_psql {
    private String username, password, url;
    public Connection connect;
    
    public Java_koneksi_psql() {
        try{
            Class.forName("org.postgresql.Driver").newInstance();
            url = "jdbc:postgresql://localhost/db_java_psql";
            username = "postgres";
            password = "445622";
            try{
                connect = DriverManager.getConnection(url, username, password);
                JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
            }
            catch (SQLException ex){
                JOptionPane.showMessageDialog(null, "salah server gagal terhubung"+ ex);
                System.exit(1);
            }
        }
        catch(Exception ex){
            System.out.println("salah"+ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Java_koneksi_psql z = new Java_koneksi_psql();
    }
    
}
