/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import java.util.Scanner;

/**
 *
 * @author Fareladzin Wibi
 */
public class Program {
    
    
    public static void main(String[] args) {
        String kelamin;
        Scanner masukan = new Scanner(System.in);
        Manusia l = new Lakilaki(0);
        Manusia p = new Perempuan(0);
        System.out.println("User 1 ");
        System.out.print("Masukan Tinggi Badan Anda : ");
        l.TinggiBadan = p.TinggiBadan = masukan.nextDouble();
        System.out.print("Masukan Jenis Kelamin : ");
        kelamin = masukan.next();
        switch(kelamin){
            case "L":System.out.print("Berat Badan Pria Ideal Anda Adalah : "+l.HtgBBI());
            break;
            case "l":System.out.print("Berat Badan Pria Ideal Anda Adalah : "+l.HtgBBI());
            break;
            case "P":System.out.print("Berat Badan Wanita Ideal Anda Adalah : "+l.HtgBBI());
            break;
            case "p":System.out.print("Berat Badan Wanita Ideal Anda Adalah : "+l.HtgBBI());
            break;
        }
        System.out.println("\n");
        System.out.println("User 2 ");
        System.out.print("Masukan Tinggi Badan Anda : ");
        l.TinggiBadan = p.TinggiBadan = masukan.nextDouble();
        System.out.print("Masukan Jenis Kelamin : ");
        kelamin = masukan.next();
        switch(kelamin){
            case "L":System.out.print("Berat Badan Pria Ideal Anda Adalah : "+l.HtgBBI());
            break;
            case "l":System.out.print("Berat Badan Pria Ideal Anda Adalah : "+l.HtgBBI());
            break;
            case "P":System.out.print("Berat Badan Wanita Ideal Anda Adalah : "+l.HtgBBI());
            break;
            case "p":System.out.print("Berat Badan Wanita Ideal Anda Adalah : "+l.HtgBBI());
            break;
        }
        System.out.println("\n");
        
        
        
        
        
    }
    
}

