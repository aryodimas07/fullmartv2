/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;
import models.Katalog;

/**
 *
 * @author PCB11
 */
public interface KatalogService {
    //read
    List<Katalog> findAll();
    List<Katalog> findByKategori(int id_kategori);
    Katalog findById(int id);
    //create
    Katalog create(Katalog katalog);
    //update
    Katalog edit(Katalog katalog);
    //delete
    void deleteById(int id);
}
