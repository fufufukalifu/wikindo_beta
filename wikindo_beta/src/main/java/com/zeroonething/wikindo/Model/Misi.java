package com.zeroonething.wikindo.Model;
public class Misi {
	private String noMisi;
	private String misi;

    public Misi(String noMisi, String misi) {
        this.noMisi = noMisi;
        this.misi = misi;
    }

    public String getNoMisi() {
        return noMisi;
    }

    public void setNoMisi(String noMisi) {
        this.noMisi = noMisi;
    }

    public String getMisi() {
        return misi;
    }

    public void setMisi(String misi) {
        this.misi = misi;
    }

}