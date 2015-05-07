package com.zeroonething.wikindo.Model;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Penghargaan {

    private String idPenghargaan;
    private String namaPenghargaan;
    private String namaPemberiPenghargaan;
    private String keteranganPenghargaan;
    private int status;

    public Penghargaan() {
        super();
    }

    public Penghargaan(String idPenghargaan, String namaPenghargaan, String namaPemberiPenghargaan, String keteranganPenghargaan, int status) {
        this.idPenghargaan = idPenghargaan;
        this.namaPenghargaan = namaPenghargaan;
        this.namaPemberiPenghargaan = namaPemberiPenghargaan;
        this.keteranganPenghargaan = keteranganPenghargaan;
        this.status = status;
    }

    public String getIdPenghargaan() {
        return idPenghargaan;
    }

    public void setIdPenghargaan(String idPenghargaan) {
        this.idPenghargaan = idPenghargaan;
    }

    public String getNamaPenghargaan() {
        return namaPenghargaan;
    }

    public void setNamaPenghargaan(String namaPenghargaan) {
        this.namaPenghargaan = namaPenghargaan;
    }

    public String getNamaPemberiPenghargaan() {
        return namaPemberiPenghargaan;
    }

    public void setNamaPemberiPenghargaan(String namaPemberiPenghargaan) {
        this.namaPemberiPenghargaan = namaPemberiPenghargaan;
    }

    public String getKeteranganPenghargaan() {
        return keteranganPenghargaan;
    }

    public void setKeteranganPenghargaan(String keteranganPenghargaan) {
        this.keteranganPenghargaan = keteranganPenghargaan;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
