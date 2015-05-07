/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zeroonething.wikindo.Koneksi;

import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Bebek
 */
public class CekKoneksi {
      public static void main(String[] args) {
        Connection con = KoneksiPostgre.getConnection();
        if (con != null) {
            JOptionPane.showMessageDialog(null, "Koneksi Sukses");
        } else {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal");
        }
    }
}
