package com.example.perbanginganapi;

import com.squareup.picasso.Picasso;

public class DataImageModel {
    String nama_gambar;
    String link_gambar;

    public DataImageModel (String nama_gambar, String link_gambar){
        this.nama_gambar = nama_gambar;
        this.link_gambar = link_gambar;
    }

    public String getNama() {
        return nama_gambar;
    }

    public void setNama(String nama_gambar) {
        this.nama_gambar = nama_gambar;
    }

    public String getLink() {
        return link_gambar;
    }

    public void setLink(String link_gambar) {
        this.link_gambar = link_gambar;
    }
}
