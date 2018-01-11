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
public class LvRigacodingDay2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kvadrats kvadrats1 = new Kvadrats();
        kvadrats1.MalasGarums = 6;
        kvadrats1.KvadrataKrasa = "zaļa";
        Aplis aplis1 = new Aplis();
        aplis1.setRadius(3);
        aplis1.setAplaKrasa("dzeltena");
        
        
        System.out.println("Kvadrāta malas garums ir "+kvadrats1.MalasGarums+ " un tā laukums ir "+kvadrats1.Laukums());
        System.out.println("Kvadrāta Perimetrs ir "+kvadrats1.Perimetrs()+" un tā krāsa ir "+kvadrats1.Krasa());
        
        System.out.println("Apļa perimetrs ir "+ aplis1.Perimetrs()+". Apļa krāsa ir "+aplis1.getAplaKrasa()+" un laukums = "+aplis1.Laukums());
        
    }
    
}
