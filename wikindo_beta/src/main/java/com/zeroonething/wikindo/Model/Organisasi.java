package com.zeroonething.wikindo.Model;

import java.util.Date;

public class Organisasi {

    private String noOrganisasi;
    private String namaOrganisasi;
    private Date tahunDidirikan;
    private String dasarHukum;
    private String namaPimpinan;
    private String alamatKantorPusat;
    private String alamatWebsite;
    private String jenisOrganisasi;
    private String dasarHukumPendirian;

    private Article article;
    private Misi misi;
    private Visi visi;

    public Organisasi(String noOrganisasi, String namaOrganisasi, Date tahunDidirikan, String dasarHukum, String namaPimpinan, String alamatKantorPusat, String alamatWebsite, String jenisOrganisasi, String dasarHukumPendirian, Article article, Misi misi, Visi visi) {
        this.noOrganisasi = noOrganisasi;
        this.namaOrganisasi = namaOrganisasi;
        this.tahunDidirikan = tahunDidirikan;
        this.dasarHukum = dasarHukum;
        this.namaPimpinan = namaPimpinan;
        this.alamatKantorPusat = alamatKantorPusat;
        this.alamatWebsite = alamatWebsite;
        this.jenisOrganisasi = jenisOrganisasi;
        this.dasarHukumPendirian = dasarHukumPendirian;
        this.article = article;
        this.misi = misi;
        this.visi = visi;
    }

}
