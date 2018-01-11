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
public class Kvadrats implements GeometriskaFigura{
public int MalasGarums;
public String KvadrataKrasa;

  
    @Override
    public double Laukums() {
        int KvadrataLaukums = MalasGarums*MalasGarums;
        return KvadrataLaukums;
                
    }

    @Override
    public String Krasa() {
       
         return KvadrataKrasa;
         
    }

    @Override
    public double Perimetrs() {
        int KvadrataP = MalasGarums*4;
        return KvadrataP;
    }
    
}
