/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author irsya
 */
public class AgeCategory {
   // Variable yang ada di database bioskop
    private int id;
    private int usia;
    
    //Constructor
    public AgeCategory(int id, int usia){
        this.id = id;
        this.usia = usia;
}
    
  
    
//    getter & setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }
    
    
}
