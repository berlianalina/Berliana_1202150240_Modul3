package com.example.android.berliana_1202150240_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ItemMinuman extends AppCompatActivity {

    private String nama, info, deskripsi;
    private int gambar;
    //untuk metode diatas adalah deklarasi seluruh variable yang digunakan didalam class

    public ItemMinuman(String nama, String info, String deskripsi, int gambar) {
        //method ini adalah konstrakter untuk mengisi deklarasi nilai pada variable dengan nilai atau data yang dikirimkan
        this.nama = nama;
        this.info = info;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
    }

    public static Intent toClick(Context context, String title, String desc, @DrawableRes int img){
        //untuk inten memanggil class lain
        Intent in = new Intent(context, DetailMinuman.class);
        in.putExtra("EXTRA_TITLE",title);
        in.putExtra("EXTRA_DESC",desc);
        in.putExtra("EXTRA_IMG",img);
        return in;
    }
    //seluruh method dibawah adalah getter dan setter untuk semua variable pada class model ini
    //(get untuk manggil data dan set untuk update data)
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}
