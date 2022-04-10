/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splendor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Adam
 */
public class GeneratorSlechticu {

    ArrayList<Slechtic> listSlechticu = new ArrayList<Slechtic>();
    Integer[] poleZabranychSlechticu;
    int i = 0;

    public void generujSlechtice() {
        //                              B, M, C, Z, H,obrazek
        listSlechticu.add(new Slechtic(3, 3, 0, 3, 0, "Pics/Slechta/Sl1.jpg"));
        listSlechticu.add(new Slechtic(0, 0, 4, 4, 0, "Pics/Slechta/Sl2.jpg"));
        listSlechticu.add(new Slechtic(4, 0, 0, 0, 4, "Pics/Slechta/Sl3.jpg"));
        listSlechticu.add(new Slechtic(3, 3, 0, 0, 3, "Pics/Slechta/Sl4.jpg"));
        listSlechticu.add(new Slechtic(3, 0, 3, 0, 3, "Pics/Slechta/Sl5.jpg"));
        listSlechticu.add(new Slechtic(0, 0, 3, 3, 3, "Pics/Slechta/Sl6.jpg"));
        listSlechticu.add(new Slechtic(0, 3, 3, 3, 0, "Pics/Slechta/Sl7.jpg"));
        listSlechticu.add(new Slechtic(0, 4, 0, 4, 0, "Pics/Slechta/Sl8.jpg"));
        listSlechticu.add(new Slechtic(0, 0, 4, 0, 4, "Pics/Slechta/Sl9.jpg"));
        listSlechticu.add(new Slechtic(4, 4, 0, 0, 0, "Pics/Slechta/Sl10.jpg"));
        poleZabranychSlechticu = new Integer[3];

    }

    public Slechtic najdiSlechtice() {
        Random rand = new Random();
        int randomNum = rand.nextInt(10);
        int a = randomNum;
        System.out.println(a);
        //System.out.println("random");

        List<Integer> intList = new ArrayList<>(Arrays.asList(poleZabranychSlechticu));//https://stackabuse.com/java-check-if-array-contains-value-or-element/
        //System.out.println("vstup do while");
        
        
            while (intList.contains(a)) {
            randomNum = rand.nextInt(10);
            a = randomNum;
            //System.out.println("duplicitní slechtic" + " nové " + a);
        }
            //System.out.println("zádné duplikáty");
            poleZabranychSlechticu[i] = a;
            i++;
            //System.out.println("return");
            return listSlechticu.get(a);
    }

    public GeneratorSlechticu() {
    }

}
