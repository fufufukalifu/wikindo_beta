/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zeroonething.wikindo.Conntroller;

import com.zeroonething.wikindo.Koneksi.KoneksiPostgre;
import com.zeroonething.wikindo.Model.Organisasi;
import com.zeroonething.wikindo.Model.User;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.event.FlowEvent;

/**
 *
 * @author Bebek
 */
@ManagedBean
@ViewScoped
public class ControllerOrganisasi implements Serializable {
    
    private Organisasi organisasi = new Organisasi();
    private User user = new User();
    
    private int jumlahOrganisasi;
    private int jumlahMisi;
    private boolean skip;
    
    public Organisasi getOrganisasi() {
        return organisasi;
    }
    
    public void setOrganisasi(Organisasi organisasi) {
        this.organisasi = organisasi;
    }
    
    public int countOrganisasi() throws SQLException {
        Connection con = KoneksiPostgre.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "select count(id_Organisasi) as jumlah_organisasi from organisasi ";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        while (rs.next()) {
            jumlahOrganisasi = rs.getInt("jumlah_organisasi");
        }
        return jumlahOrganisasi;
    }
    
    public List<Organisasi> getListOrganisasi() throws SQLException {
        Connection con = KoneksiPostgre.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<Organisasi> listOrganisasi;
        String sql = "SELECT * FROM ORGANISASI";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        listOrganisasi = new ArrayList<>();
        while (rs.next()) {
            Organisasi organisasi = new Organisasi();
            organisasi.setNamaOrganisasi(rs.getString("nama_organisasi"));
            organisasi.setCaption(rs.getString("caption"));
            organisasi.setAlamatWebsite(rs.getString("alamat_website"));
            organisasi.setDeskripsi(rs.getString("deskripsi"));
            listOrganisasi.add(organisasi);
        }
        return listOrganisasi;
    }
    
    public String getIdOrganisasi() throws SQLException {
        String idOrganisasi;
        int tahun = Calendar.getInstance().get(Calendar.YEAR);
        String tahunString = String.valueOf(tahun);
        
        idOrganisasi = "2a" + new ControllerOrganisasi().countOrganisasi();
        
        return idOrganisasi;
        
    }
    
    public int countVisi() throws SQLException {
        Connection con = KoneksiPostgre.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "select count(id_visi) as jumlah_misi from visi ";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        while (rs.next()) {
            jumlahMisi = rs.getInt("jumlah_misi");
        }
        return jumlahMisi;
    }
    
    public String getVisi() throws SQLException {
        String idVisi;
        int tahun = Calendar.getInstance().get(Calendar.YEAR);
        String tahunString = String.valueOf(tahun);
        
        idVisi = "a1" + new ControllerOrganisasi().countVisi();
        
        return idVisi;
        
    }
    
    public int countMisi() throws SQLException {
        Connection con = KoneksiPostgre.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "select count(id_misi) as jumlah_misi from misi ";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        while (rs.next()) {
            jumlahMisi = rs.getInt("jumlah_misi");
        }
        return jumlahMisi;
    }
    
    public String getMisi() throws SQLException {
        String idMisi;
        int tahun = Calendar.getInstance().get(Calendar.YEAR);
        String tahunString = String.valueOf(tahun);
        
        idMisi = "a2" + new ControllerOrganisasi().countMisi();
        
        return idMisi;
        
    }
    
    public void saveFormOrganisasi() throws SQLException {
        String tampungIdOrganisasi = new ControllerOrganisasi().getIdOrganisasi();
        Connection con = KoneksiPostgre.getConnection();
        //fungsi insert ke tabel basic_information
        PreparedStatement stat;
        stat = con.prepareStatement(
                "Insert into organisasi values(?,?,?,?,?,?,?,?,?,?,?)");
        
        stat.setString(1, tampungIdOrganisasi);
        stat.setString(2, user.getIdUser());
        stat.setString(3, organisasi.getNamaOrganisasi());
        stat.setDate(4, (Date) organisasi.getTahunDidirikan());
        stat.setString(5, organisasi.getDasarHukum());
        stat.setString(6, organisasi.getNamaPimpinan());
        stat.setString(7, organisasi.getAlamatKantorPusat());
        stat.setString(8, organisasi.getAlamatWebsite());
        stat.setString(9, organisasi.getJenisOrganisasi());
        stat.setString(10, organisasi.getDasarHukum());
        stat.setString(11, "0");
        stat.executeUpdate();
        stat.close();
        
        stat = con.prepareStatement(
                "Insert into visi values(?,?,?,?)");
        stat.setString(1, new ControllerOrganisasi().getVisi());
        stat.setString(2, tampungIdOrganisasi);//id organisasi
        stat.setString(3, "0");
        stat.setString(4, organisasi.getVisi());
        
        stat.executeUpdate();
        stat.close();
        
        stat = con.prepareStatement(
                "Insert into misi values(?,?,?,?)");
        stat.setString(1, new ControllerOrganisasi().getMisi());
        stat.setString(2, organisasi.getMisi());
        stat.setString(3, tampungIdOrganisasi);//id organisasi
        stat.setString(4, "0");
        stat.executeUpdate();
        stat.close();
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
    
    public List<Organisasi> getOrganisasiBack() throws SQLException {
        Connection con = KoneksiPostgre.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<Organisasi> listOrganisasi;
        String sql = "SELECT * FROM ORGANISASI";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        listOrganisasi = new ArrayList<>();
        while (rs.next()) {
            Organisasi organisasi = new Organisasi();
            organisasi.setNamaOrganisasi(rs.getString("nama_organisasi"));
            organisasi.setAlamatWebsite(rs.getString("alamat_website"));
            listOrganisasi.add(organisasi);
        }
        return listOrganisasi;
    }
    
    public void deleteOrganisasi(String namaOrganisasi) throws SQLException {
        Connection con = KoneksiPostgre.getConnection();

        try {
            PreparedStatement preparedStatement = con
                    .prepareStatement("delete from organisasi where nama_organisasi=?");
            // Parameters start with 1
            preparedStatement.setString(1, namaOrganisasi);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void editOrganisasi() throws SQLException {
        Connection con = KoneksiPostgre.getConnection();
        try {
            PreparedStatement ps = null;
            String query = "UPDATE organisasi set nama_organisasi=? where id_organisasi=?";
            System.out.println("Masuk Edit");
            ps.executeUpdate();
            System.out.println("Edit");
        } catch (SQLException e) {
            System.out.println("Gagal");
            e.printStackTrace();
        }
    }
    
}
