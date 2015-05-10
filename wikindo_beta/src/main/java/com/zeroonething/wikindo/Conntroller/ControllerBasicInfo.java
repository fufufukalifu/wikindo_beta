/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zeroonething.wikindo.Conntroller;

import com.zeroonething.wikindo.Koneksi.KoneksiPostgre;
import com.zeroonething.wikindo.Model.Article;
import com.zeroonething.wikindo.Model.BasicInformation;
import com.zeroonething.wikindo.Model.Gelar;
import com.zeroonething.wikindo.Model.Pendidikan;
import com.zeroonething.wikindo.Model.PengalamanKerja;
import com.zeroonething.wikindo.Model.Penghargaan;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.FlowEvent;

/**
 *
 * @author Bebek
 */
@ManagedBean
@ViewScoped
public class ControllerBasicInfo implements Serializable {

    private BasicInformation basicInformation = new BasicInformation();
    private Gelar gelar = new Gelar();
    private Pendidikan pendidikan = new Pendidikan();
    private PengalamanKerja pengalamanKerja = new PengalamanKerja();
    private Penghargaan penghargaan = new Penghargaan();

    private boolean skip;

    public BasicInformation getBasicInformation() {
        return basicInformation;
    }

    public void setBasicInformation(BasicInformation basicInformation) {
        this.basicInformation = basicInformation;
    }

    public Gelar getGelar() {
        return gelar;
    }

    public void setGelar(Gelar gelar) {
        this.gelar = gelar;
    }

    public Pendidikan getPendidikan() {
        return pendidikan;
    }

    public void setPendidikan(Pendidikan pendidikan) {
        this.pendidikan = pendidikan;
    }

    public PengalamanKerja getPengalamanKerja() {
        return pengalamanKerja;
    }

    public void setPengalamanKerja(PengalamanKerja pengalamanKerja) {
        this.pengalamanKerja = pengalamanKerja;
    }

    public Penghargaan getPenghargaan() {
        return penghargaan;
    }

    public void setPenghargaan(Penghargaan penghargaan) {
        this.penghargaan = penghargaan;
    }

    public void saveFormBasicInfo() throws SQLException {
        Connection con = KoneksiPostgre.getConnection();
        //fungsi insert ke tabel basic_information
        PreparedStatement stat = con.prepareStatement(
                "Insert into basic_information values(?,?,?,?,?,?,?,?)");

        stat.setString(1, basicInformation.getIdBasicInfo());
        stat.setString(2, null);//get dari cpkies id user
        stat.setString(3, basicInformation.getNamaTokoh());
        stat.setString(4, basicInformation.getTempatLahir());
        stat.setDate(5, null);// basicInformation.getTanggalLahir()
        stat.setDate(6, null);//basicInformation.getTanggalMeninggal()
        stat.setString(7, "0");
        stat.setString(8, basicInformation.getAgama());
        stat.executeUpdate();
        stat.close();

        //fingsi insert ke tabel pendidikan
        stat = con.prepareStatement(
                "Insert into pendidikan values (?,?,?,?,?,?)");
        stat.setString(1, pendidikan.getIdPendidikan());
        stat.setString(2, basicInformation.getIdBasicInfo());
        stat.setString(3, pendidikan.getJenjangPendidikan());
        stat.setString(4, pendidikan.getNamaSekolah());
        stat.setString(5, pendidikan.getAlamatSekolah());
        stat.setString(6, "0");
        stat.executeUpdate();
        stat.close();

        //fungsi insert ke tabel gelar
        stat = con.prepareStatement(
                "Insert into gelar values(?,?,?,?,?,?)");

        stat.setString(1, gelar.getIdGelar());
        stat.setString(2, basicInformation.getIdBasicInfo());
        stat.setString(3, gelar.getNamaGelar());
        stat.setDate(4, null);//
        stat.setString(5, gelar.getSingkatanGelar());
        stat.setString(6, "0");
        stat.executeUpdate();
        stat.close();

        //fungsi insert ke tabel pengalaman kerja
        stat = con.prepareStatement(
                "Insert into pengalaman_kerja values (?,?,?,?,?,?,?,?)");
        stat.setString(1, pengalamanKerja.getIdPengalamanKerja());
        stat.setString(2, basicInformation.getIdBasicInfo());
        stat.setString(3, pengalamanKerja.getJabatan());
        stat.setString(4, pengalamanKerja.getDiangkatOleh());
        stat.setString(5, pengalamanKerja.getMenggantikan());
        stat.setDate(6, null);//pengalamanKerja.getTahunBerhenti()
        stat.setString(7, "0");
        stat.setDate(8, null);//pengalamanKerja.getTahunMenjabat()
        stat.executeUpdate();
        stat.close();

        //fungsi insert ke tabel penghargaan
        stat = con.prepareStatement(
                "Insert into penghargaan values (?,?,?,?,?,?)");
        stat.setString(1, penghargaan.getIdPenghargaan());
        stat.setString(2, basicInformation.getIdBasicInfo());
        stat.setString(3, null);
        stat.setString(4, penghargaan.getNamaPenghargaan());
        stat.setString(5, penghargaan.getKeteranganPenghargaan());
        stat.setString(6, "0");
        stat.executeUpdate();
        stat.close();
    }

    public List<BasicInformation> getBasicInfo() throws SQLException {
        Connection con = KoneksiPostgre.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<BasicInformation> listbasicinfo;
        String sql = "select id_basic_information, nama_tokoh, tempat_lahir, tanggal_lahir, caption from basic_information";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        listbasicinfo = new ArrayList<>();
        while (rs.next()) {
            BasicInformation basicInfo = new BasicInformation();
            basicInfo.setIdBasicInfo(rs.getString("id_basic_information"));
            basicInfo.setNamaTokoh(rs.getString("nama_tokoh"));
            basicInfo.setTempatLahir(rs.getString("tempat_lahir"));
            basicInfo.setTanggalLahir(rs.getDate("tanggal_lahir"));
            basicInfo.setCaption(rs.getString("caption"));

            listbasicinfo.add(basicInfo);
        }
        return listbasicinfo;
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
     public ArrayList<BasicInformation> getTampilApp() throws SQLException {
        ArrayList<BasicInformation> Art;
        Connection con = KoneksiPostgre.getConnection();

        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("Select * from basic_information");
            Art = new ArrayList<BasicInformation>();
            while (rs.next()) {
                BasicInformation basic = new BasicInformation();
                basic.setIdBasicInfo(rs.getString("id_basic_information"));
                basic.setNamaTokoh(rs.getString("nama_tokoh"));
                basic.setTanggalLahir(rs.getDate("tanggal_lahir"));
                basic.setTanggalMeninggal(rs.getDate("tanggal_meninggal"));
                basic.setAgama(rs.getString("agama"));
                Art.add(basic);
            }

        } finally {
            if (con != null) {
                con.close();
            }
        }
        return Art;
    }

    public List<BasicInformation> getSearch(String namaTokoh) throws SQLException {
        PreparedStatement ps = KoneksiPostgre.getConnection().prepareStatement("select * from basic_information where nama_tokoh like ?");
        ps.setString(1, "%" + namaTokoh + "%");
        ResultSet rs = ps.executeQuery();
        List<BasicInformation> list = new ArrayList<BasicInformation>();
        if (rs.next()) {
            BasicInformation basic = new BasicInformation();
            basic.setIdBasicInfo(rs.getString("id_basic_information"));
            basic.setNamaTokoh(rs.getString("nama_tokoh"));
            basic.setTanggalLahir(rs.getDate("tanggal_lahir"));
            basic.setTanggalMeninggal(rs.getDate("tanggal_meninggal"));
            basic.setAgama(rs.getString("agama"));
            list.add(basic);
        }
        return list;
    }
}
