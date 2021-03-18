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
public class UjiBola {
    
    public static void main(String [] args){
        Bola Bolaini = new Bola();
        
        Bolaini.showDiameter();
        Bolaini.showLuasPermukaan();
        Bolaini.showVolume();
        System.out.println();
        
        Bolaini.setJariJari();
        Bolaini.showDiameter();
        Bolaini.showLuasPermukaan();
        Bolaini.showVolume();
        System.out.println();
        
        
    }
    
}
