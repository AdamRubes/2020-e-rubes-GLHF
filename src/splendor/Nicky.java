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
public class Nicky implements Serializable {
    private static final long serialVersionUID = 1L;
    String nickHrac1;
    String nickHrac2;

    public Nicky(String nickHrac1, String nickHrac2) {
        this.nickHrac1 = nickHrac1;
        this.nickHrac2 = nickHrac2;
    }
    
    
}
