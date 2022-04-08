/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splendor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

/**
 *
 * @author Adam
 */
public class GeneratorKaret implements Serializable {

    public GeneratorKaret() {
    }

    ArrayList<Karta> listKaret3 = new ArrayList<Karta>();
    ArrayList<Karta> listKaret2 = new ArrayList<Karta>();
    ArrayList<Karta> listKaret1 = new ArrayList<Karta>();
    Integer[] indexZabranychKaret3;
    Integer[] indexZabranychKaret2;
    Integer[] indexZabranychKaret1;
    int i = 0;
    int j = 0;

    //Karta(String barva, int body, int cenaB, int cenaM, int cenaC, int cenaH, int cenaZ, int kategorie, String obrazek)
    public void generuj() {
        indexZabranychKaret3 = new Integer[20];
        indexZabranychKaret2 = new Integer[30];
        
        
        listKaret3.add(new Karta("zelena", 5, 0, 7, 0, 0, 3, 3, "Pics/Karty/zel3-2.jpg"));
        listKaret3.add(new Karta("zelena", 4, 3, 6, 0, 0, 3, 3, "Pics/Karty/zel3-4.jpg"));
        listKaret3.add(new Karta("zelena", 4, 0, 7, 0, 0, 0, 3, "Pics/Karty/zel3-1.jpg"));
        listKaret3.add(new Karta("zelena", 3, 5, 3, 3, 3, 0, 3, "Pics/Karty/zel3-3.jpg"));
        //                                  b,b,m,c,h,z,k
        listKaret3.add(new Karta("hneda", 4, 0, 0, 7, 0, 0, 3, "Pics/Karty/hne3-1.jpg"));
        listKaret3.add(new Karta("hneda", 4, 0, 0, 6, 3, 3, 3, "Pics/Karty/hne3-3.jpg"));
        listKaret3.add(new Karta("hneda", 5, 0, 0, 7, 3, 0, 3, "Pics/Karty/hne3-4.jpg"));
        listKaret3.add(new Karta("hneda", 3, 3, 3, 3, 0, 5, 3, "Pics/Karty/hne3-2.jpg"));
        //b,  b, m, c, h, z, k
        listKaret3.add(new Karta("cervena", 3, 3, 5, 0, 3, 2, 3, "Pics/Karty/cer3-1.jpg"));
        listKaret3.add(new Karta("cervena", 4, 0, 3, 3, 0, 6, 3, "Pics/Karty/cer3-2.jpg"));
        listKaret3.add(new Karta("cervena", 4, 0, 0, 0, 0, 7, 3, "Pics/Karty/cer3-3.jpg"));
        listKaret3.add(new Karta("cervena", 5, 0, 0, 3, 0, 7, 3, "Pics/Karty/cer3-4.jpg"));
        //b,  b, m, c, h, z, k 
        listKaret3.add(new Karta("bila", 3, 0, 3, 5, 3, 3, 3, "Pics/Karty/bil3-2.jpg"));
        listKaret3.add(new Karta("bila", 4, 3, 0, 3, 6, 0, 3, "Pics/Karty/bil3-1.jpg"));
        listKaret3.add(new Karta("bila", 5, 3, 0, 0, 7, 0, 3, "Pics/Karty/bil3-3.jpg"));
        listKaret3.add(new Karta("bila", 4, 0, 0, 0, 7, 0, 3, "Pics/Karty/bil3-4.jpg"));
        //b, b, m, c, h, z, k 
        listKaret3.add(new Karta("modra", 5, 7, 3, 0, 0, 0, 3, "Pics/Karty/mod3-3.jpg"));
        listKaret3.add(new Karta("modra", 4, 7, 0, 0, 0, 0, 3, "Pics/Karty/mod3-1.jpg"));
        listKaret3.add(new Karta("modra", 4, 6, 3, 0, 3, 0, 3, "Pics/Karty/mod3-2.jpg"));
        listKaret3.add(new Karta("modra", 3, 3, 0, 3, 5, 3, 3, "Pics/Karty/mod3-4.jpg"));

        //                                 b, b, m, c, h, z, k 
        listKaret2.add(new Karta("zelena", 2, 0, 0, 0, 0, 5, 2, "Pics/Karty/zel2-1.jpg"));
        listKaret2.add(new Karta("zelena", 1, 2, 3, 0, 2, 0, 2, "Pics/Karty/zel2-2.jpg"));
        listKaret2.add(new Karta("zelena", 3, 0, 0, 0, 0, 6, 2, "Pics/Karty/zel2-3.jpg"));
        listKaret2.add(new Karta("zelena", 2, 4, 2, 0, 1, 0, 2, "Pics/Karty/zel2-4.jpg"));
        listKaret2.add(new Karta("zelena", 2, 0, 5, 0, 0, 3, 2, "Pics/Karty/zel2-5.jpg"));
        listKaret2.add(new Karta("zelena", 1, 3, 0, 3, 0, 2, 2, "Pics/Karty/zel2-6.jpg"));
        //                                b, b, m, c, h, z, k 
        listKaret2.add(new Karta("hneda", 1, 3, 2, 0, 0, 2, 2, "Pics/Karty/hne2-1.jpg"));
        listKaret2.add(new Karta("hneda", 1, 3, 0, 0, 2, 3, 2, "Pics/Karty/hne2-2.jpg"));
        listKaret2.add(new Karta("hneda", 2, 0, 1, 2, 0, 4, 2, "Pics/Karty/hne2-3.jpg"));
        listKaret2.add(new Karta("hneda", 2, 0, 0, 3, 0, 5, 2, "Pics/Karty/hne2-4.jpg"));
        listKaret2.add(new Karta("hneda", 3, 0, 0, 0, 6, 0, 2, "Pics/Karty/hne2-5.jpg"));
        listKaret2.add(new Karta("hneda", 2, 5, 0, 0, 0, 0, 2, "Pics/Karty/hne2-6.jpg"));
        //                                  b, b, m, c, h, z, k
        listKaret2.add(new Karta("cervena", 2, 1, 4, 0, 0, 2, 2, "Pics/Karty/cer2-1.jpg"));
        listKaret2.add(new Karta("cervena", 1, 0, 3, 2, 3, 0, 2, "Pics/Karty/cer2-2.jpg"));
        listKaret2.add(new Karta("cervena", 1, 2, 0, 2, 3, 0, 2, "Pics/Karty/cer2-3.jpg"));
        listKaret2.add(new Karta("cervena", 2, 0, 0, 0, 5, 0, 2, "Pics/Karty/cer2-4.jpg"));
        listKaret2.add(new Karta("cervena", 3, 0, 0, 6, 0, 0, 2, "Pics/Karty/cer2-5.jpg"));
        listKaret2.add(new Karta("cervena", 2, 3, 0, 0, 5, 0, 2, "Pics/Karty/cer2-6.jpg"));
        //                               b, b, m, c, h, z, k
        listKaret2.add(new Karta("bila", 2, 0, 0, 4, 2, 1, 2, "Pics/Karty/bil2-1.jpg"));
        listKaret2.add(new Karta("bila", 3, 6, 0, 0, 0, 0, 2, "Pics/Karty/bil2-2.jpg"));
        listKaret2.add(new Karta("bila", 1, 0, 0, 2, 2, 3, 2, "Pics/Karty/bil2-3.jpg"));
        listKaret2.add(new Karta("bila", 2, 0, 0, 5, 0, 0, 2, "Pics/Karty/bil2-4.jpg"));
        listKaret2.add(new Karta("bila", 2, 0, 0, 5, 3, 0, 2, "Pics/Karty/bil2-5.jpg"));
        listKaret2.add(new Karta("bila", 1, 2, 3, 3, 0, 0, 2, "Pics/Karty/bil2-6.jpg"));
        //                                b, b, m, c, h, z, k
        listKaret2.add(new Karta("modra", 2, 0, 5, 0, 0, 0, 2, "Pics/Karty/mod2-1.jpg"));
        listKaret2.add(new Karta("modra", 1, 0, 2, 0, 3, 3, 2, "Pics/Karty/mod2-2.jpg"));
        listKaret2.add(new Karta("modra", 2, 5, 3, 0, 0, 0, 2, "Pics/Karty/mod2-3.jpg"));
        listKaret2.add(new Karta("modra", 2, 2, 0, 1, 4, 0, 2, "Pics/Karty/mod2-4.jpg"));
        listKaret2.add(new Karta("modra", 1, 0, 2, 3, 0, 2, 2, "Pics/Karty/mod2-5.jpg"));
        listKaret2.add(new Karta("modra", 3, 0, 6, 0, 0, 0, 2, "Pics/Karty/mod2-6.jpg"));

        //listKaret2.add(new Karta("cervena", 0, 0, 0, 0, 0, 0, 0, "Pics/Karty/hne2-1.jpg"));
    }

    public Karta najdiNovouKartu3() {
        if (i == 19) {
            return new Karta("null", 999, 0, 0, 0, 0, 0, 0, "Pics/Karty/prazdnaKarta.jpg");
        }
        Random rand = new Random();
        int randomNum = rand.nextInt(20);
        int a = randomNum;
        //System.out.println(a);

        List<Integer> intList = new ArrayList<>(Arrays.asList(indexZabranychKaret3));//https://stackabuse.com/java-check-if-array-contains-value-or-element/

        while (intList.contains(a)) {
            randomNum = rand.nextInt(20);
            a = randomNum;
            System.out.println("duplicitní karta" + " nové " + a);
        }

        indexZabranychKaret3[i] = a;
        i++;
        for (int i = 0; i <= 19; i++) {
            System.out.println(i + " " + indexZabranychKaret3[i]);
        }
        return listKaret3.get(a);

    }
    
        public Karta najdiNovouKartu2() {
        if (i == 29) {
            return new Karta("null", 999, 0, 0, 0, 0, 0, 0, "Pics/Karty/prazdnaKarta.jpg");
        }
        Random rand = new Random();
        int randomNum = rand.nextInt(30);
        int a = randomNum;
        //System.out.println(a);

        List<Integer> intList = new ArrayList<>(Arrays.asList(indexZabranychKaret2));//https://stackabuse.com/java-check-if-array-contains-value-or-element/

        while (intList.contains(a)) {
            randomNum = rand.nextInt(30);
            a = randomNum;
            System.out.println("duplicitní karta" + " nové " + a);
        }

        indexZabranychKaret2[j] = a;
        j++;
        for (int i = 0; i <= 19; i++) {
            System.out.println(i + " " + indexZabranychKaret3[i]);
        }
        return listKaret2.get(a);

    }

}
