/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Fareladzin Wibi
 */
public class InterfaceSample {
    public static void main(String[] args) {
    
        InterfaceBujurSangkar obyek1 = new InterfaceBujurSangkar(10){};
        System.out.println("Luas Bujur Sangkar dengan sisi 10 = "+ obyek1.hitungLuas());
        System.out.println("Kelilingnya : "+ obyek1.hitungKeliling());
        System.out.println("\n");
        
        InterfaceSegitiga obyek2 = new InterfaceSegitiga(6,8){};
        System.out.println("Luas Segitiga dengan alas 6, dan tinggi 8 : "+obyek2.hitungLuas());
        System.out.println("Kelilingnya : "+obyek2.hitungKeliling());
    }

}
