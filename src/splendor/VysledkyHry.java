/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splendor;

import java.io.Serializable;

/**
 *
 * @author Adam
 */
public class VysledkyHry implements Serializable{
    String vitez;
    String porazeny;
    int pocetBoduVitez;
    int pocetBoduPorazeny;
    String casHry;// cele cislo hodiny desetine minuty
    
    private static final long serialVersionUID = 1L;

    public VysledkyHry(String vitez, String porazeny, int pocetBoduVitez, int pocetBoduPorazeny, String casHry) {
        this.vitez = vitez;
        this.porazeny = porazeny;
        this.pocetBoduVitez = pocetBoduVitez;
        this.pocetBoduPorazeny = pocetBoduPorazeny;
        this.casHry = casHry;
    }


    @Override
    public String toString(){
        
        String s = "Vitez " + vitez + ", porazeny " + porazeny + ", pocet bodů vitěz " + pocetBoduVitez + ", pocet bodů porazeny " + pocetBoduPorazeny + ", cas hry " + casHry ;
        return s;
    }
    
    
}
