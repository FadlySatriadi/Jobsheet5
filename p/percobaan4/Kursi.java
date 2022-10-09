/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p.percobaan4;

/**
 *
 * @author ASUS
 */
public class Kursi {
    private String nomor;
    private Penumpang penumpang;

    // constructor
    Kursi(String nomor){
        this.nomor = nomor;
    }

    // Setter Getter
    public void setNomor(String nomor){
        this.nomor = nomor;
    }
    public void setPenumpang(Penumpang penumpang){
        this.penumpang = penumpang;
    }
    public String getNomor(){
        return nomor;
    }
    public Penumpang getPenumpang(){
        return penumpang;
    }

    public String info(){
        String info = "";
        info += "Nomor: " + nomor + "\n";
        if (this.penumpang != null){
            info += "Penumpang: " + penumpang.info() + "\n";
        }
        return info;
    }
}