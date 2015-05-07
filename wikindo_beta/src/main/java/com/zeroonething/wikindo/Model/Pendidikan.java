package com.zeroonething.wikindo.Model;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Pendidikan {

    private String idPendidikan;
    private String jenjangPendidikan;
    private String namaSekolah;
    private String alamatSekolah;

    public Pendidikan() {
        super();
    }

    public Pendidikan(String idPendidikan, String jenjangPendidikan, String namaSekolah, String alamatSekolah) {
        this.idPendidikan = idPendidikan;
        this.jenjangPendidikan = jenjangPendidikan;
        this.namaSekolah = namaSekolah;
        this.alamatSekolah = alamatSekolah;
    }

    public String getIdPendidikan() {
        return idPendidikan;
    }

    public void setIdPendidikan(String idPendidikan) {
        this.idPendidikan = idPendidikan;
    }

    public String getJenjangPendidikan() {
        return jenjangPendidikan;
    }

    public void setJenjangPendidikan(String jenjangPendidikan) {
        this.jenjangPendidikan = jenjangPendidikan;
    }

    public String getNamaSekolah() {
        return namaSekolah;
    }

    public void setNamaSekolah(String namaSekolah) {
        this.namaSekolah = namaSekolah;
    }

    public String getAlamatSekolah() {
        return alamatSekolah;
    }

    public void setAlamatSekolah(String alamatSekolah) {
        this.alamatSekolah = alamatSekolah;
    }

}
