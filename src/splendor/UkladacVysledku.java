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
    
    public boolean jeVolnySlot(){
        int i = 1;
        File file = new File("src/Hry/Hra" + i + ".txt");
        while (file.exists()) {// přidat do ifu direktori
            i++;
            file = new File("src/Hry/Hra" + i + ".txt");
        }
        
        if(i >= 10){
            return false;
        }else{
           return true; 
        }
        
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
        FileInputStream f;
        ObjectInputStream o;
        
        int i = 1;
       
        VysledkyHry c;

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
            System.out.println(file.getAbsolutePath());
            
            while(file.exists() == false && i <=9){
                System.out.println("file neexistuje hledam novy");
                i++;
                file = new File("src/Hry/Hra" + i + ".txt");
                System.out.println("novy file");
                System.out.println(file.getAbsolutePath());
            }
            System.out.println(file.getAbsolutePath());
            System.out.println("konec while");
        }

        return poleVysledku;

    }
    
    
    
    
    String smazSoubor(String path){
        File file = new File(path); 
        if(file.delete()){
            return "Uspěšně smazáno";
        }else {
            return "Došlo k chybě";
        }

    }

    public UkladacVysledku() {//konstruktor
    }
    
    

}
