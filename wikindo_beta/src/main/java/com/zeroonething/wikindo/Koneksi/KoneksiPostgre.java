/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zeroonething.wikindo.Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Bebek
 */
public class KoneksiPostgre {

    public static Connection getConnection() {
        //link ke host atau servernya
        //konfigurasi username dan pswd
        return getConnection("jdbc:postgresql://localhost:5432/Wikindo", "postgres", "root");
    }

    public static Connection getConnection(String url, String usr, String pass) {
        Connection con = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = (Connection) DriverManager.getConnection(url, usr, pass);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getMessage());
        }
        return con;
    }
    public static void close(Connection con) {
        try {
            con.close();
        } catch (Exception ex) {
        }
    }
}
