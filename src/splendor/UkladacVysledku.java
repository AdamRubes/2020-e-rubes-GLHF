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

/**
 *
 * @author Adam
 */
public class UkladacVysledku {
    
    public String připravSoubor() throws IOException {
        int i = 1;
        File file = new File("src/Hry/Hra" + i +".txt");
        while(file.exists()){// přidat do ifu direktori
            i++;
            file = new File("src/Hry/Hra" + i +".txt");
        }
        file.createNewFile();
        return file.getPath();
        
    }
    
    public void ulozHru(String path, VysledkyHry vysledky) throws FileNotFoundException, IOException {
        File file = new File(path);
        FileOutputStream f = new FileOutputStream(file);//https://mkyong.com/java/how-to-read-and-write-java-object-to-a-file/
        ObjectOutputStream o = new ObjectOutputStream(f);
        o.writeObject(vysledky);
    }
    
    public VysledkyHry[] nactiVysledky() throws FileNotFoundException, IOException, ClassNotFoundException {
        int i = 1;
        VysledkyHry[] poleVysledku = null;
        File file = new File("src/Hry/Hra" + i +".txt");
        FileInputStream f = new FileInputStream(file);
        ObjectInputStream o = new ObjectInputStream(f);
        
        while(file.exists()){
            poleVysledku[i] = (VysledkyHry) o.readObject();
            i++;
            file = new File("src/Hry/Hra" + i +".txt");
        }
        return poleVysledku;
    }
    

    public UkladacVysledku() {//konstruktor
    }
    
    
    
    
}
