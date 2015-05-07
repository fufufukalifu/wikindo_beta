/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zeroonething.wikindo.Conntroller;

/**
 *
 * @author Bebek
 */
import com.zeroonething.wikindo.Koneksi.KoneksiPostgre;
import com.zeroonething.wikindo.Model.User;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.swing.JOptionPane;
import org.primefaces.event.FlowEvent;

@ManagedBean
@ViewScoped
public class UserWizard implements Serializable {

    private User user = new User();

    private boolean skip;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void save() {
        try {
            Connection con = KoneksiPostgre.getConnection();

            PreparedStatement stat = con.prepareStatement(
                    "Insert into orang values(?,?,?,?,?,?,?,?,?,?)");

            stat.setString(1, user.getIdOrang());
            stat.setString(2, user.getNoIdentitas());
            stat.setString(3, user.getJenisIdentitas());
            stat.setString(4, user.getEmail());
            stat.setString(5, user.getPhone());
            stat.setString(6, user.getCaption());
            stat.setString(7, user.getNamaLengkap());
            stat.setDate(8, (Date) user.getTanggalLahir());
            stat.setString(9, user.getTempatLahir());
            stat.setString(10, user.getJenisKelamin());
            stat.executeUpdate();
            System.out.println("hai" + user.getIdUser());

            stat.close();

            stat = con.prepareStatement(
                    "Insert into users values(?,?,?,?,?)");

            stat.setString(1, user.getIdOrang());
            stat.setString(2, user.getUsername());
            stat.setString(3, user.getPassword());
            stat.setString(4, "1");
            stat.setString(5, user.getJabatan());
            stat.executeUpdate();
            

        } catch (SQLException ex) {
            System.out.println("Error in saveOrang() -->" + ex.getMessage());

        }

    }

    public boolean isSkip() {
        return skip;
    }

    public void setSkip(boolean skip) {
        this.skip = skip;
    }

    public String onFlowProcess(FlowEvent event) {
        if (skip) {
            skip = false;   //reset in case user goes back
            return "confirm";
        } else {
            return event.getNewStep();
        }
    }

    private void JOptionPane(String salh_euy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
