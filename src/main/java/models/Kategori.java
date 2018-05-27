/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author PCB11
 */
public class Kategori {
    private int id;
    private String nama_kategori;

    public Kategori(int id, String nama_kategori) {
        this.id = id;
        this.nama_kategori = nama_kategori;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama_kategori() {
        return nama_kategori;
    }

    public void setNama_kategori(String nama_kategori) {
        this.nama_kategori = nama_kategori;
    }

    @Override
    public String toString() {
        return "Kategori{" + "id=" + id + ", nama_kategori=" + nama_kategori + '}';
    }
}
