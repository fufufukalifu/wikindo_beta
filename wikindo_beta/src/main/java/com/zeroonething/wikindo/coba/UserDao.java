/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zeroonething.wikindo.coba;
import java.sql.*;
/**
 *
 * @author Anggiyasti
 */
public class UserDao {
//    public static boolean login(String user, String password) {
//        Connection con = null;
//        PreparedStatement ps = null;
//        try {
//            con = Koneksi.KoneksiPostgre.getConnection();
//            ps = con.prepareStatement(
//                    "select username, password from user where username= ? and password= ? ");
//            ps.setString(1, user);
//            ps.setString(2, password);
// 
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()) // found
//            {
//                System.out.println(rs.getString("username"));
//                return true;
//            }
//            else {
//                return false;
//            }
//        } catch (Exception ex) {
//            System.out.println("Error in login() -->" + ex.getMessage());
//            return false;
//        } finally {
//            Koneksi.KoneksiPostgre.close(con);
//        }
//    }
//    
}
