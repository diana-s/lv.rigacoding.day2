/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.day2_2;

/**
 *
 * @author Diana
 */
public class Aplis implements GeometriskaFigura {
private int radius;
private String AplaKrasa;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if(radius >0){
        this.radius = radius;
    }
    }

    public String getAplaKrasa() {
        return AplaKrasa;
    }

    public void setAplaKrasa(String AplaKrasa) {
        this.AplaKrasa = AplaKrasa;
    }


    @Override
    public double Laukums() {
        return radius*radius*Math.PI;
        
    }

    @Override
    public String Krasa() {
        System.out.println("Apļa krāsa ir dzeltena.");
        return AplaKrasa;
    }

    @Override
    public double Perimetrs() {
       return radius*3.14*2;
        
        
    }
    
}
