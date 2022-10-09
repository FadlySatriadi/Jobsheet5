/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p.percobaan2;

/**
 *
 * @author ASUS
 */
public class Sopir {
    private String nama;
    private int biaya;

    Sopir(){    }

    public void setNama(String nama){
        this.nama = nama;
    }
    public void setBiaya(int biaya){
        this.biaya = biaya;
    }
    public String getNama(){
        return nama;
    }
    public int getBiaya(){
        return biaya;
    }

    public int hitungBiayaSopir(int hari){
        return biaya * hari;
    }
}