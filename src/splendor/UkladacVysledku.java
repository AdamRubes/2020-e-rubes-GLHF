/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splendor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adam
 */
public class UkladacVysledku implements Serializable {

    private static final long serialVersionUID = 1L;

    public String připravSoubor() throws IOException {
        int i = 1;
        File file = new File("src/Hry/Hra" + i + ".txt");
        while (file.exists()) {// přidat do ifu direktori
            i++;
            file = new File("src/Hry/Hra" + i + ".txt");
        }
        file.createNewFile();
        return file.getPath();

    }

    public void ulozHru(String path, VysledkyHry vysledky) throws FileNotFoundException, IOException {
        File file = new File(path);
        FileOutputStream f = new FileOutputStream(file);//https://mkyong.com/java/how-to-read-and-write-java-object-to-a-file/
        ObjectOutputStream o = new ObjectOutputStream(f);
        o.writeObject(vysledky);
        o.close();
        f.close();
    }

    public VysledkyHry[] nactiVysledky() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream f = null;
        ObjectInputStream o = null;
        int i = 1;
        int x = 1;
        VysledkyHry c;
        File fi = new File("src/Hry/Hra" + x + ".txt");
        while (fi.exists()) {
            x++;
            fi = new File("src/Hry/Hra" + x + ".txt");

        }
        System.out.println(x - 1);

        VysledkyHry[] poleVysledku = new VysledkyHry[10];

        File file = new File("src/Hry/Hra" + i + ".txt");

        while (file.exists()) {

            f = new FileInputStream(file);
            o = new ObjectInputStream(f);

            c = (VysledkyHry) o.readObject();

            o.close();
            f.close();

            poleVysledku[i] = c;

            i++;
            file = new File("src/Hry/Hra" + i + ".txt");

        }

        return poleVysledku;

    }

    public UkladacVysledku() {//konstruktor
    }

}
