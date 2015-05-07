package com.zeroonething.wikindo.Model;

import java.util.Date;

public class User extends Orang {

    private String idUser;
    private String username;
    private String password;
    private String jabatan;
    private BasicInformation basicInformation;

    public User(){
        super();
    }

    public User(String idUser, String username, String password, String jabatan, BasicInformation basicInformation) {
        this.idUser = idUser;
        this.username = username;
        this.password = password;
        this.jabatan = jabatan;
        this.basicInformation = basicInformation;
    }

    public User(String idUser, String username, String password, String jabatan, BasicInformation basicInformation, String idOrang, String noIdentitas, String jenisIdentitas, String namaLengkap, String email, String alamat, String phone, String caption, String tempatLahir, String jenisKelamin, Date tanggalLahir) {
        super(idOrang, noIdentitas, jenisIdentitas, namaLengkap, email, alamat, phone, caption, tempatLahir, jenisKelamin, tanggalLahir);
        this.idUser = idUser;
        this.username = username;
        this.password = password;
        this.jabatan = jabatan;
        this.basicInformation = basicInformation;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public BasicInformation getBasicInformation() {
        return basicInformation;
    }

    public void setBasicInformation(BasicInformation basicInformation) {
        this.basicInformation = basicInformation;
    }

   
  
}
