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
public class UkladacNicku implements Serializable{
    
    private static final long serialVersionUID = 1L;
    Nicky n;
    
    
    public String připravSoubor() throws IOException {
        File file = new File("src/Hry/nicky.txt");
        
            if(file.exists()){
                file.delete();
            } 
            
            file.createNewFile();
            
            System.out.println("uspěšně připravil soubor");
            return file.getPath();
    }
    
    public void ulozNicky(String path, String nickH1, String nickH2) throws FileNotFoundException, IOException {
        n = new Nicky(nickH1, nickH2);
        File file = new File(path);
        FileOutputStream f = new FileOutputStream(file);
        ObjectOutputStream o = new ObjectOutputStream(f);
        
        o.writeObject(n);
        System.out.println("ulozeno");
        o.close();
        f.close();
    }
    
    public Nicky nactiNicky(String path)throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream f;
        ObjectInputStream o;
        
        File file = new File(path);
        System.out.println("a");
        f = new FileInputStream(file);
        o = new ObjectInputStream(f);
        System.out.println("b");
        
        Nicky n2;
        
        n2 = (Nicky) o.readObject();
        System.out.println("c");
        o.close();
        f.close();
        System.out.println("d");
        
        
        return n2;
    }

    public UkladacNicku() {
    }
    
}
