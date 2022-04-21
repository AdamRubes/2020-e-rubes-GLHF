/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splendor;

/**
 *
 * @author Adam
 */
public class Hrac {
    int id;
    boolean jeNaTahu;
    int pocetZelKamenu = 0;
    int pocetCerKamenu = 0;
    int pocetHneKamenu = 0;
    int pocetBilKamenu = 0;
    int pocetModKamenu = 0;
    int pocetZoliku = 0;
    int pocetBodu = 0;
    int pocetZelKaret = 0;
    int pocetCerKaret = 0;
    int pocetHneKaret = 0;
    int pocetBilKaret = 0;
    int pocetModKaret = 0;
    boolean muzeSlechtice = false;
    boolean maSlechtice = false;
    String prvniVzatyKamen = null;      
    String druhyVzatyKamen = null;
    String tretiVzatyKamen = null;
    
    public Hrac(int id, boolean jeNaTahu) {
        this.id = id;
        this.jeNaTahu = jeNaTahu;
    }
    
    
    
}
