/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author erisa
 */
public class TestSiswa {
    public static void main (String [] args){
        Encapsiswa siswa = new Encapsiswa();
        siswa.setName ("Errisa");
        siswa.setAbsen (9);
        siswa.setAddress("Jember");
        
        System.out.println("Name : "+ siswa.getName() 
                + " Absen " + siswa.getAbsen() + 
                " Address " + siswa.getAddress());
    }
    
}
