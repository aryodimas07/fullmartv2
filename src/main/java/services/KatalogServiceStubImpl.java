/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import models.Katalog;
import org.springframework.stereotype.Service;

/**
 *
 * @author PCB11
 */
@Service("katalogService")
public class KatalogServiceStubImpl implements KatalogService {

    private List<Katalog> barang = new ArrayList<Katalog>(){{
        add(new Katalog(1, "eskrim", 3500, 1, "Tersedia"));
        add(new Katalog(2, "aqua", 3500, 1, "Tersedia"));
        add(new Katalog(3, "fanta", 3500, 1, "Tersedia"));
        add(new Katalog(4, "charger hp", 3500, 4, "Tersedia"));
        add(new Katalog(5, "rice cooker", 3500, 3, "Tersedia"));
    }};
    
    @Override
    public List<Katalog> findAll() {
        return this.barang;
    }

    @Override
    public List<Katalog> findByKategori(int id_ktg) {
        return (List<Katalog>) this.barang.stream()
                .filter(p -> Objects.equals(p.getId_kategori(), id_ktg))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Katalog findById(int id) {
        return this.barang.stream()
                .filter(p -> Objects.equals(p.getId_kategori(), id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Katalog create(Katalog katalog) {
        katalog.setId(this.barang.stream().mapToInt(p -> p.getId()).max().getAsInt()+1);
        this.barang.add(katalog);
        return katalog;
    }

    @Override
    public Katalog edit(Katalog katalog) {
        for (int i = 0; i < this.barang.size(); i++) {
            if (Objects.equals(this.barang.get(i).getId(), katalog.getId())) {
                this.barang.set(i, katalog);
                return katalog;
            }
        }
        throw new RuntimeException("Katalog Not Found! "+katalog.getId());
    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i < this.barang.size(); i++) {
            if (Objects.equals(this.barang.get(i).getId(), id)) {
                this.barang.remove(i);
                return;
            }
        }
        throw new RuntimeException("Katalog Not Found! "+id);
    }
    
}
