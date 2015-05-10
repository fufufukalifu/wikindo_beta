package com.zeroonething.wikindo.Model;

import java.io.Serializable;
import java.util.Date;

public class Organisasi implements Serializable {

    private String deskripsi;
    private String namaOrganisasi;
    private Date tahunDidirikan;
    private String dasarHukum;
    private String namaPimpinan;
    private String alamatKantorPusat;
    private String alamatWebsite;
    private String jenisOrganisasi;
    private String dasarHukumPendirian;
    private String caption;

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getCaption() {
        return "../../resources/images/organisasi/" + caption;
    }

    public String getNamaOrganisasi() {
        return namaOrganisasi;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }
    private Article article;
    private String misi;
    private String visi;

    public Organisasi() {
        super();
    }

    public String getPreviewDeskripsi() {
        String deskripsi_temp = "";
        deskripsi_temp = deskripsi.substring(0, 100);
        return deskripsi_temp;
    }

    public void setNamaOrganisasi(String namaOrganisasi) {
        this.namaOrganisasi = namaOrganisasi;
    }

    public Date getTahunDidirikan() {
        return tahunDidirikan;
    }

    public void setTahunDidirikan(Date tahunDidirikan) {
        this.tahunDidirikan = tahunDidirikan;
    }

    public String getDasarHukum() {
        return dasarHukum;
    }

    public void setDasarHukum(String dasarHukum) {
        this.dasarHukum = dasarHukum;
    }

    public String getNamaPimpinan() {
        return namaPimpinan;
    }

    public void setNamaPimpinan(String namaPimpinan) {
        this.namaPimpinan = namaPimpinan;
    }

    public String getAlamatKantorPusat() {
        return alamatKantorPusat;
    }

    public void setAlamatKantorPusat(String alamatKantorPusat) {
        this.alamatKantorPusat = alamatKantorPusat;
    }

    public String getAlamatWebsite() {
        return alamatWebsite;
    }

    public void setAlamatWebsite(String alamatWebsite) {
        this.alamatWebsite = alamatWebsite;
    }

    public String getJenisOrganisasi() {
        return jenisOrganisasi;
    }

    public void setJenisOrganisasi(String jenisOrganisasi) {
        this.jenisOrganisasi = jenisOrganisasi;
    }

    public String getDasarHukumPendirian() {
        return dasarHukumPendirian;
    }

    public void setDasarHukumPendirian(String dasarHukumPendirian) {
        this.dasarHukumPendirian = dasarHukumPendirian;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public String getMisi() {
        return misi;
    }

    public void setMisi(String misi) {
        this.misi = misi;
    }

    public String getVisi() {
        return visi;
    }

    public void setVisi(String visi) {
        this.visi = visi;
    }

}
