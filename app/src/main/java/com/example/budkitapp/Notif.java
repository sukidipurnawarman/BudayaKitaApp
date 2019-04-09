package com.example.budkitapp;

public class Notif {
    private int id;
    private static String judul;
    private static String deskripsi;
    private static int gambar;

    public Notif(int id, String judul, String deskripsi, int gambar) {
        this.id = id;
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.gambar = gambar;

    }

    public int getId() {
        return id;
    }

    public static String getjudul() {
        return judul;
    }

    public static String getdeskripsi() {
        return deskripsi;
    }

    public static int getgambar() {
        return gambar;

    }
}
