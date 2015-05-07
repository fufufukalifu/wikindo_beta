package com.zeroonething.wikindo.Model;

import java.sql.Date;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class Gelar {

    private String idGelar;
    private String namaGelar;
    private Date tahunDiraihnya;
    private String singkatanGelar;

    public Gelar(){
        super();
    }
    public String getIdGelar() {
        return idGelar;
    }

    public void setIdGelar(String idGelar) {
        this.idGelar = idGelar;
    }

    public String getNamaGelar() {
        return namaGelar;
    }

    public void setNamaGelar(String namaGelar) {
        this.namaGelar = namaGelar;
    }

    public Date getTahunDiraihnya() {
        return tahunDiraihnya;
    }

    public void setTahunDiraihnya(Date tahunDiraihnya) {
        this.tahunDiraihnya = tahunDiraihnya;
    }

    public String getSingkatanGelar() {
        return singkatanGelar;
    }

    public void setSingkatanGelar(String singkatanGelar) {
        this.singkatanGelar = singkatanGelar;
    }

    public Gelar(String idGelar, String namaGelar, Date tahunDiraihnya, String singkatanGelar) {
        this.idGelar = idGelar;
        this.namaGelar = namaGelar;
        this.tahunDiraihnya = tahunDiraihnya;
        this.singkatanGelar = singkatanGelar;
    }

}
