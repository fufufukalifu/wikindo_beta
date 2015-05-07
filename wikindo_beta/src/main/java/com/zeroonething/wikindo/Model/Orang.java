package com.zeroonething.wikindo.Model;

import java.util.Date;

public class Orang {
    private String idOrang;
    private String noIdentitas;
    private String jenisIdentitas;
    private String namaLengkap;
    private String email;
    private String alamat;
    private String phone;
    private String caption;
    private String tempatLahir;
    private String jenisKelamin;
    private Date tanggalLahir;

    public Orang(){
        super();
    }

    public Orang(String idOrang, String noIdentitas, String jenisIdentitas, String namaLengkap, String email, String alamat, String phone, String caption, String tempatLahir, String jenisKelamin, Date tanggalLahir) {
        this.idOrang = idOrang;
        this.noIdentitas = noIdentitas;
        this.jenisIdentitas = jenisIdentitas;
        this.namaLengkap = namaLengkap;
        this.email = email;
        this.alamat = alamat;
        this.phone = phone;
        this.caption = caption;
        this.tempatLahir = tempatLahir;
        this.jenisKelamin = jenisKelamin;
        this.tanggalLahir = tanggalLahir;
    }

    public String getJenisIdentitas() {
        return jenisIdentitas;
    }

    public void setJenisIdentitas(String jenisIdentitas) {
        this.jenisIdentitas = jenisIdentitas;
    }

    
    public String getIdOrang() {
        return idOrang;
    }

    public void setIdOrang(String idOrang) {
        this.idOrang = idOrang;
    }

    public String getNoIdentitas() {
        return noIdentitas;
    }

    public void setNoIdentitas(String noIdentitas) {
        this.noIdentitas = noIdentitas;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
      
   
}
