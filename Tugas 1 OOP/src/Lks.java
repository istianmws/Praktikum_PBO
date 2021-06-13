/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Lks extends Buku{
    int jumlah_hlmn;
    int harga;
    private int kode_lks;
    boolean baru;
    
    public Lks(int jumlah_hlmn,int harga,boolean baru){
        this.jumlah_hlmn = jumlah_hlmn;
        this.harga = harga;
        this.baru = baru;
    }

    void setKode_lks(int kode_lks){
        this.kode_lks=kode_lks;
    }

    int getKode_lks(){
        return this.kode_lks;
    }

    @Override
    void halaman(){
        this.jumlah_hlmn += 400;
    }

    @OverrideOverloading
    void halaman(int glosarium,int dafpus){
        this.jumlah_hlmn = this.jumlah_hlmn + glosarium + dafpus;
    }

    void sampul(){
        
    }

    void baru(){
        if(this.baru){
            this.harga = this.harga - 55000;
        } 
    }
    
    void tampil(){
        System.out.println("Data Buku");
        System.out.println("Halaman : " + this.jumlah_hlmn);
        System.out.println("Harga : " + this.harga);
    }
} 