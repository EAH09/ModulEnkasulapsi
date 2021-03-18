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
public class Bus {
    public double penumpang;
    public double maxPenumpang;
    public double counter;
    public double penumpangBaru;
    
    public Bus (double maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang =0;
    }
    
    public void addPenumpang (double penumpang){
        
        double temp;
        temp = this.penumpang + penumpang;
        if( temp > maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else{
            this.penumpang = temp;
            counter++;
            
        }
        
    }
    public void getPenumpang( int password){
        if(password == 123){
            System.out.println("Password Benar");
        }else{
            System.out.println("Password Salah");
        }
        
    }
    public double getAverage(){
        double average;
        return counter;
        
    }
    
    public void cetak(){
        System.out.println("Berat penumpang Bus sekarang adalah "+penumpang);
        System.out.println("Maksimum berat penumpang yang seharusnya adalah "+ maxPenumpang);
                
                
    }
    
}
