/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p.percobaan1;

/**
 *
 * @author ASUS
 */
public class processor {
    private String merk;
    private double cahce;
    processor(){    }
    processor(String merk, double cahce){
        this.merk = merk;
        this.cahce = cahce;
    }
    public void setMerk(String merk){
        this.merk = merk;
    }
    public void setCahce(double cahce){
        this.cahce = cahce;
    }
    public String getMerk(){
        return merk;
    }
    public double getCahce(){
        return cahce;
    }
    // method
    public void info(){
        System.out.printf("Merk processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cahce);
    }
}