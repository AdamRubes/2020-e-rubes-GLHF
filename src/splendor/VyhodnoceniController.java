/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splendor;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Adam
 */
public class VyhodnoceniController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    VysledkyHry[] poleVysledku = new VysledkyHry[10] ;
    UkladacVysledku u ;
    VysledkyHry posledniHra;
    Image image;
    
    
    @FXML
    private ImageView obrazekHrac;
    
    @FXML
    private ImageView obrazekVyhral;
    private static final long serialVersionUID = -2338626292552177485L;
    
    public void nactiUlozeneHry() throws IOException, FileNotFoundException, ClassNotFoundException{
        poleVysledku = u.nactiVysledky();
    }
    
    
    
    
    public void vykresliPosledni(){
        int i = 1;
        System.out.println("r");
        while(poleVysledku[i] != null){
            System.out.println("t");
            posledniHra = poleVysledku[i];
            i++; 
            System.out.println("z");
        }
        System.out.println("u");
        System.out.println(posledniHra.toString());
        /*   
        int i;
        if(posledniHra.vitez == "hrac1"){
            i = 1;
            image = new Image("Pics/Obrazky/hrac"+ i +".png"); 
        }else if(posledniHra.vitez == "hrac1"){
            i = 2;
            image = new Image("Pics/Obrazky/hrac"+ i +".png"); 
        }
        
        obrazekHrac.setImage(image);
*/
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       u = new UkladacVysledku();
       
       
        try {
            nactiUlozeneHry();
            System.out.println("P");
        } catch (IOException ex) {
            Logger.getLogger(VyhodnoceniController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VyhodnoceniController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        vykresliPosledni();
        System.out.println("o"); 
       
    }    
    
}
