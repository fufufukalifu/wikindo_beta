package com.zeroonething.wikindo.Model;

import java.io.Serializable;
import java.util.Date;
import javax.faces.bean.ManagedBean;

public class BasicInformation implements Serializable{

    private String idBasicInfo;
    private String namaTokoh;
    private String tempatLahir;
    private Date tanggalLahir;
    private Date tanggalMeninggal;
    private String agama;

    private PengalamanKerja pengalamankerja;
    private Article article;
    private Organisasi organisasi;
    private Penghargaan penghargaan;
    private Gelar gelar;

    public BasicInformation(){
        super();
    }

    public BasicInformation(String idBasicInfo, String namaTokoh, String tempatLahir, Date tanggalLahir, Date tanggalMeninggal, String agama, PengalamanKerja pengalamankerja, Article article, Organisasi organisasi, Penghargaan penghargaan, Gelar gelar) {
        this.idBasicInfo = idBasicInfo;
        this.namaTokoh = namaTokoh;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.tanggalMeninggal = tanggalMeninggal;
        this.agama = agama;
        this.pengalamankerja = pengalamankerja;
        this.article = article;
        this.organisasi = organisasi;
        this.penghargaan = penghargaan;
        this.gelar = gelar;
    }
    
    public String getIdBasicInfo() {
        return idBasicInfo;
    }

    public void setIdBasicInfo(String idBasicInfo) {
        this.idBasicInfo = idBasicInfo;
    }

    public String getNamaTokoh() {
        return namaTokoh;
    }

    public void setNamaTokoh(String namaTokoh) {
        this.namaTokoh = namaTokoh;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public Date getTanggalMeninggal() {
        return tanggalMeninggal;
    }

    public void setTanggalMeninggal(Date tanggalMeninggal) {
        this.tanggalMeninggal = tanggalMeninggal;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public PengalamanKerja getPengalamankerja() {
        return pengalamankerja;
    }

    public void setPengalamankerja(PengalamanKerja pengalamankerja) {
        this.pengalamankerja = pengalamankerja;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Organisasi getOrganisasi() {
        return organisasi;
    }

    public void setOrganisasi(Organisasi organisasi) {
        this.organisasi = organisasi;
    }

    public Penghargaan getPenghargaan() {
        return penghargaan;
    }

    public void setPenghargaan(Penghargaan penghargaan) {
        this.penghargaan = penghargaan;
    }

    public Gelar getGelar() {
        return gelar;
    }

    public void setGelar(Gelar gelar) {
        this.gelar = gelar;
    }


}
