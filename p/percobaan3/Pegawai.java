/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p.percobaan3;

/**
 *
 * @author ASUS
 */
public class Pegawai {
    private String nip;
    private String nama;

    Pegawai(String nip, String nama){
        this.nip = nip;
        this.nama = nama;
    }

    public void setNip(String nip){
        this.nip = nip;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNip(){
        return nip;
    }
    public String getNama(){
        return nama;
    }
    
    // method
    public String info(){
        String info = "";
        info += "Nip: " + this.nip + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
}