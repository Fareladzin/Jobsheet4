/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OverridingMethod;

/**
 *
 * @author Fareladzin Wibi
 */
public class Kucing extends Hewan{
    void setNama(){
        String kucing = "Cerberus";
        System.out.println("Nama Kucing : "+kucing);
    }
    void setSuara(){
        String suara = "Meow Meow Meow";
        System.out.println("Suara Kucing : "+suara);
    }
    void setBerat(){
        Double berat = 2.0;
        System.out.println("Berat Kucing : "+berat+" Kg");
    }
}
