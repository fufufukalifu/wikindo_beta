package com.zeroonething.wikindo.Model;

import java.util.Date;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class PengalamanKerja {

    private String idPengalamanKerja;
    private String jabatan;
    private String diangkatOleh;
    private String menggantikan;
    private Date tahunMenjabat;
    private Date tahunBerhenti;

    public PengalamanKerja() {
        super();
    }

    public String getIdPengalamanKerja() {
        return idPengalamanKerja;
    }

    public void setIdPengalamanKerja(String idPengalamanKerja) {
        this.idPengalamanKerja = idPengalamanKerja;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getDiangkatOleh() {
        return diangkatOleh;
    }

    public void setDiangkatOleh(String diangkatOleh) {
        this.diangkatOleh = diangkatOleh;
    }

    public String getMenggantikan() {
        return menggantikan;
    }

    public void setMenggantikan(String menggantikan) {
        this.menggantikan = menggantikan;
    }

    public Date getTahunMenjabat() {
        return tahunMenjabat;
    }

    public void setTahunMenjabat(Date tahunMenjabat) {
        this.tahunMenjabat = tahunMenjabat;
    }

    public Date getTahunBerhenti() {
        return tahunBerhenti;
    }

    public void setTahunBerhenti(Date tahunBerhenti) {
        this.tahunBerhenti = tahunBerhenti;
    }

    public PengalamanKerja(String idPengalamanKerja, String jabatan, String diangkatOleh, String menggantikan, Date tahunMenjabat, Date tahunBerhenti) {
        this.idPengalamanKerja = idPengalamanKerja;
        this.jabatan = jabatan;
        this.diangkatOleh = diangkatOleh;
        this.menggantikan = menggantikan;
        this.tahunMenjabat = tahunMenjabat;
        this.tahunBerhenti = tahunBerhenti;
    }

}
