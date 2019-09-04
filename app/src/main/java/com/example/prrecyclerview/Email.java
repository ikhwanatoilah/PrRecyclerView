package com.example.prrecyclerview;

public class Email {
    private String nama_email, symbol_email, judul_email, isi_email, jam_email;
    private int profile_email, mark;

    public Email(String nama_email, String symbol_email, String judul_email, String isi_email,String jam_email, int profile_email, int mark){
        this.nama_email = nama_email;
        this.symbol_email = symbol_email;
        this.judul_email = judul_email;
        this.isi_email = isi_email;
        this.jam_email = jam_email;
        this.profile_email = profile_email;
        this.mark = mark;
    }
//Get dan Set String

//    Jam_email
    public String getJam_email(){

        return jam_email;
    }
    public void setJam_email(String jam_email){

        this.jam_email=jam_email;

    }

//    Nama_email
    public String getNama_email(){

        return nama_email;
    }
    public void setNama_email(String nama_email){

        this.nama_email = nama_email;
    }
//    Symbol_email

    public String getSymbol_email(){

        return symbol_email;
    }
    public void setSymbol_email(String symbol_email){

        this.symbol_email = symbol_email;
    }

//    isi_email
    public String getIsi_email(){

        return isi_email;
    }
    public void setIsi_email(String isi_email){

        this.isi_email = isi_email;
    }
//    judul_email
    public String getJudul_email(){

        return judul_email;
    }
    public void setJudul_email(String judul_email){

        this.judul_email = judul_email;
    }
//End Dari Get dan Set String

//    Get dan Set Integer untuk image
    public int getProfile_email(){

        return profile_email;
    }
    public void setProfile_email(int profile_email){

        this.profile_email = profile_email;
    }
    public int getMark(){

        return mark;
    }
    public void setMark(int mark){

        this.mark = mark;
    }
//    End dari Get dan Set Integer untuk Image


}
