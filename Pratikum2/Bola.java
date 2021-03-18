/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum2;

/**
 *
 * @author erisa
 */
public class Bola {
    public double jarijari = 28;
    public double diameter;
    public double luaspermukaan;
    public double volume;
    
    public void setJariJari(){
        jarijari=28;
        System.out.println("Jari Jari bola = "+jarijari+"cm");
        
    }
    public void showDiameter(){
        diameter = 2*jarijari;
        System.out.println("Diameter Bola = "+diameter+"cm");
        
    }
    public void showLuasPermukaan(){
        luaspermukaan =4*Math.PI*jarijari*jarijari;
        System.out.println("Luas Permukaan Bola = "+luaspermukaan+"cm");
        
    }
    public void showVolume(){
        volume = 4/3*Math.PI*jarijari*jarijari*jarijari;
        System.out.println("Volume Bola = "+volume+"cm");
        
    }
    
}
