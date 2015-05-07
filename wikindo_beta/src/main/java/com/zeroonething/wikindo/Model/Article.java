package com.zeroonething.wikindo.Model;

import com.zeroonething.wikindo.Koneksi.KoneksiPostgre;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;

public class Article implements Serializable {

      private String idArticle;
    private String judulArticle;
    private String isiArticle;
    private Date tanggalDibuat;
    private Date terakhirDiEdit;
    private String caption;
    private Comment comment;
    private String previewArticle;

    public String getPreviewArticle() {
        String article = null;
        article = isiArticle.substring(0, 200);
        return article;
    }

    public void setPreviewArticle(String previewArticle) {
        this.previewArticle = previewArticle;
    }

    public String getCaption() {
        return "../../resources/images/" + caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getIdArticle() {

        return idArticle;
    }

    public void setIdArticle(String idArticle) {
        this.idArticle = idArticle;
    }

    public String getJudulArticle() {
        return judulArticle;
    }

    public void setJudulArticle(String judulArticle) {
        this.judulArticle = judulArticle;
    }

    public String getIsiArticle() {
        return isiArticle;
    }

    public void setIsiArticle(String isiArticle) {
        this.isiArticle = isiArticle;
    }

    public Date getTanggalDibuat() {
        return tanggalDibuat;
    }

    public void setTanggalDibuat(Date tanggalDibuat) {
        this.tanggalDibuat = tanggalDibuat;
    }

    public Date getTerakhirDiEdit() {
        return terakhirDiEdit;
    }

    public void setTerakhirDiEdit(Date terakhirDiEdit) {
        this.terakhirDiEdit = terakhirDiEdit;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }
    
}