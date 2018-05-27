/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;

/**
 *
 * @author PCB11
 */
public class Katalog implements Serializable {
    private int id;
    private String nama;
    private int harga;
    private int id_kategori;
    private String ketersediaan;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getId_kategori() {
        return id_kategori;
    }

    public void setId_kategori(int id_kategori) {
        this.id_kategori = id_kategori;
    }

    public String getKetersediaan() {
        return ketersediaan;
    }

    public void setKetersediaan(String ketersediaan) {
        this.ketersediaan = ketersediaan;
    }

    public Katalog(int id, String nama, int harga, int id_kategori, String ketersediaan) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.id_kategori = id_kategori;
        this.ketersediaan = ketersediaan;
    }

    @Override
    public String toString() {
        return "Katalog{" + "id=" + id + ", nama=" + nama + ", harga=" + harga + ", id_kategori=" + id_kategori + ", ketersediaan=" + ketersediaan + '}';
    }
}
