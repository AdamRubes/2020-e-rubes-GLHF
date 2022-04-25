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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Adam
 */
public class VyhodnoceniController implements Initializable {

    /**
     * Initializes the controller class.
     */
    VysledkyHry[] poleVysledku = new VysledkyHry[10];
    UkladacVysledku u;
    VysledkyHry posledniHra;
    Image image;

    @FXML
    private AnchorPane AnchorPaneVyhodnoceni;

    @FXML
    private Button tlacitkoNavrat;

    @FXML
    private ImageView obrazekHrac;

    @FXML
    private ImageView obrazekVyhral;
    
    @FXML
    private Label h1PocetBoduLabel;

    @FXML
    private Label h2PocetBoduLabel;
    
    @FXML
    private Button tlacitkoHistorie;

    
    
    
    @FXML
    void stiskTlacitkoHistorie(ActionEvent event) throws IOException {
        nacistFXML("HistorieHer");
    }
    

    @FXML
    void stiskTlacitkoNavrat(ActionEvent event) throws IOException {
        nacistFXML("Lobby1");
    }

    //metoda pro načítání FXML
    void nacistFXML(String nazev) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource(nazev + ".fxml"));
        AnchorPaneVyhodnoceni.getChildren().setAll(pane);
    }

    public void nactiUlozeneHry() throws IOException, FileNotFoundException, ClassNotFoundException {
        poleVysledku = u.nactiVysledky();
    }

    public void nactiPosledniHru() {
        int i = 1;

        while (poleVysledku[i] != null) {

            posledniHra = poleVysledku[i];
            i++;

        }
        System.out.println(posledniHra.toString());
    }

    public void vykresliViteze() {

        if (posledniHra.vitez.equals("Hrac1")) {

            Image image = new Image("Pics/Obrazky/hrac1.png");
            obrazekHrac.setImage(image);
            String x = Integer.toString(posledniHra.pocetBoduVitez);
            String y = Integer.toString(posledniHra.pocetBoduPorazeny);
            h1PocetBoduLabel.setText(x + ".b");
            h2PocetBoduLabel.setText(y + ".b");

        } else if (posledniHra.vitez.equals("Hrac2")) {

            Image image = new Image("Pics/Obrazky/hrac2.png");
            obrazekHrac.setImage(image);
            String x = Integer.toString(posledniHra.pocetBoduVitez);
            String y = Integer.toString(posledniHra.pocetBoduPorazeny);
            h2PocetBoduLabel.setText(x + ".b");
            h1PocetBoduLabel.setText(y + ".b");
        }
        
        

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        u = new UkladacVysledku();

        try {
            nactiUlozeneHry();

        } catch (IOException ex) {
            Logger.getLogger(VyhodnoceniController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VyhodnoceniController.class.getName()).log(Level.SEVERE, null, ex);
        }

        nactiPosledniHru();

        vykresliViteze();

    }

}
