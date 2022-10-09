/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p.percobaan3;

/**
 *
 * @author ASUS
 */
public class MainPertanyaan {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants");
        KeretaApi keratApi = new KeretaApi("Gaya Baru", "Bisnis", masinis);

        System.out.println(keratApi.info());
    }
}