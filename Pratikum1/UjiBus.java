/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum1;

/**
 *
 * @author erisa
 */
public class UjiBus {
    public static void main (String[] args){
        Bus Busini = new Bus (50);
        
        Busini.getPenumpang(123);
        Busini.cetak();
        System.out.println();
        
        //penambahan penumpang
        Busini.getPenumpang(123);
        Busini.addPenumpang(10);
        Busini.cetak();
        System.out.println();
        
        //penambahan penumpang
        Busini.getPenumpang(123);
        Busini.addPenumpang(5);
        Busini.cetak();
        System.out.println();
        
        //penambahan penumpang
        Busini.getPenumpang(12);
        Busini.addPenumpang(10);
        Busini.cetak();
        System.out.println();
        //Nah yang ini kan passwordnya salahh knp kok masih ditambahkan ke berat penumpang? 
        
        //penambahan penumpang
        Busini.getPenumpang(123);
        Busini.addPenumpang(10);
        Busini.cetak();
        System.out.println();
        
        System.out.println("Rata Rata berat penumpang bus sekarang adalah "+Busini.getAverage());
        
                
        
    }
    
}
