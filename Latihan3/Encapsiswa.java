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
public class Encapsiswa {
    private String name;
    private String address;
    private int absen;
    // cara set dan get data, klik kanan -> insert code -> get/set
    
    // get data
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAbsen() {
        return absen;
    }
    // set data
    //this = mengambil variabel lokal
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAbsen(int absen) {
        this.absen = absen;
    }
    
    
    
    
}
