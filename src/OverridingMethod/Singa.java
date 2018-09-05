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
public class Singa extends Hewan{
    void setNama(){
        String singa = "Diablo";
        System.out.println("Nama Singa : "+singa);
    }
    void setSuara(){
        String suara = "Roaaaarrrr";
        System.out.println("Suara Singa : "+suara);
    }
    void setBerat(){
        Double berat = 10.0;
        System.out.println("Berat Singa : "+berat+" Kg");
    }
}
