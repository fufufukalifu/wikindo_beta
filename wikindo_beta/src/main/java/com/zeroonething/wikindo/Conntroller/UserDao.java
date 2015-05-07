/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zeroonething.wikindo.Conntroller;
import java.sql.*;
/**
 *
 * @author Anggiyasti
 */
public class UserDao {
    public static boolean login(String user, String password) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = com.zeroonething.wikindo.Koneksi.KoneksiPostgre.getConnection();
            ps = con.prepareStatement(
                    "select usrname, pswd from users where usrname = ? and pswd= ? ");
            ps.setString(1, user);
            ps.setString(2, password);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) // found
            {
                System.out.println(rs.getString("usrname"));
                System.out.println(rs.getString("pswd"));
                return true;
            }
            else {
                return false;
            }
        } catch (Exception ex) {
            System.out.println("Error in login() -->" + ex.getMessage());
            return false;
        } finally {
            com.zeroonething.wikindo.Koneksi.KoneksiPostgre.close(con);
        }
    }
    
}
