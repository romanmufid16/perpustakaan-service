package com.romanmufid.client.model;

/**
 *
 * @author Acer
 */
public class Anggota {
    private Long id;
    private String nama;
    private String alamat;
    
    public Anggota(){
        
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    
}
