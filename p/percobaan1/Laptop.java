/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p.percobaan1;

/**
 *
 * @author ASUS
 */
public class Laptop {
    private String merk;
    private processor proc;
    Laptop(){}
    Laptop(String merk, processor proc){
        this.merk = merk;
        this.proc = proc;
    }
    public void setMerk(String merk){
        this.merk = merk;
    }
    public void setProc(processor proc){
        this.proc = proc;
    }
    public String getMerk(){
        return merk;
    }
    public processor getCahce(){
        return proc;
    }
    public void info(){
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }
}