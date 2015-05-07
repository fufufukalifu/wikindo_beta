/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zeroonething.wikindo.Conntroller;

import com.zeroonething.wikindo.Koneksi.KoneksiPostgre;
import com.zeroonething.wikindo.Model.Article;
import com.zeroonething.wikindo.Model.BasicInformation;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Bebek
 */
@ManagedBean
@ViewScoped
public class ControllerArticle implements Serializable {

    private Article article = new Article();
    private BasicInformation basicInfo = new BasicInformation();

    public BasicInformation getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(BasicInformation basicInfo) {
        this.basicInfo = basicInfo;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

  

    public void simpan() throws SQLException {

        Connection con = KoneksiPostgre.getConnection();

        PreparedStatement stat = con.prepareStatement(
                "Insert into article values(?,?,?,?,?,?,?,?)");

        stat.setString(1, "a18");
        stat.setString(2, null);
        stat.setString(3, null);
        stat.setString(4, null);
        stat.setString(5, article.getJudulArticle());
        stat.setString(6, article.getIsiArticle());
        stat.setDate(7, null);
        stat.setDate(8, null);
        stat.executeUpdate();

    }

    public void save() {
        addMessage("Success", "Data saved");
    }

    public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    public List<Article> getInfoArticle() throws SQLException {
        Connection con = KoneksiPostgre.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<Article> listArticle;
        String sql = "select * from article limit 10";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        listArticle = new ArrayList<>();
        while (rs.next()) {
            Article article = new Article();
            article.setIdArticle(rs.getString("id_basic_information"));
            article.setJudulArticle(rs.getString("judul_article"));
            article.setIsiArticle(rs.getString("isi_article"));
            article.setCaption(rs.getString("caption"));

            listArticle.add(article);
        }
        return listArticle;
    }
    
      public List<BasicInformation> getBasicInformation() throws SQLException {
        Connection con = KoneksiPostgre.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<BasicInformation> listBasicInfo;
        String sql = "select * from basic_information";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        listBasicInfo = new ArrayList<>();

        while (rs.next()) {
           BasicInformation basicInfo = new BasicInformation();
            basicInfo.setIdBasicInfo(rs.getString("id_basic_information"));
            basicInfo.setNamaTokoh(rs.getString("nama_tokoh"));
            basicInfo.setTempatLahir(rs.getString("tempat_lahir"));

            listBasicInfo.add(basicInfo);
        }
        return listBasicInfo;
    }

    public void delete() throws SQLException {
        Connection con = KoneksiPostgre.getConnection();

        PreparedStatement stat;

        stat = con.prepareStatement(
                "DELETE FROM `article` WHERE `article`.`id_article` = ?");
        //? di lokasikan ke 1, 2 , 3
        stat.setString(1, "12wa");
        stat.executeUpdate();

    }

}
