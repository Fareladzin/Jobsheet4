/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author Fareladzin Wibi
 */
public class Abstractsample {
    public static void main(String[] args) {
        BangunDatar obyek = new BujurSangkar(10);
        
        System.out.println("Luas Bujur Sangar Dengan sisi 10 : "+obyek.hitungLuas());
        System.out.println("Kelilingnya : "+ obyek.hitungKeliling());
        System.out.println("\n");
        
        BangunDatar obyek1 =new Lingkaran(7);
        System.out.println("Luas Lingkaran dengan jari jari 7 : "+obyek1.hitungLuas());
        System.out.println("Kelilingnya : "+obyek1.hitungKeliling());
    }
}
