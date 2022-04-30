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
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

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
    private ImageView obrazekYoda;

    @FXML
    private ImageView obrazekVyhral;
    
    @FXML
    private Label h1PocetBoduLabel;

    @FXML
    private Label h2PocetBoduLabel;
    
    @FXML
    private Button tlacitkoHistorie;
    
    
        @FXML
    private Label labelH1;

    @FXML
    private Label labelH2;

    @FXML
    private Label labelVitez;

    
    
    
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
    
    
        void zvyrazniZlute(Node node) {
        DropShadow borderGlow = new DropShadow();
        borderGlow.setOffsetY(0f);
        borderGlow.setOffsetX(0f);
        borderGlow.setColor(Color.YELLOW);
        borderGlow.setWidth(100);
        borderGlow.setHeight(100);

        node.setEffect(borderGlow);
    }
        
        void zvyrazneni(Node node) {
        DropShadow borderGlow = new DropShadow();
        borderGlow.setOffsetY(0f);
        borderGlow.setOffsetX(0f);
        borderGlow.setColor(Color.RED);
        borderGlow.setWidth(100);
        borderGlow.setHeight(100);

        node.setEffect(borderGlow);

    }
        
        public void animaceYoda(Node node){
        RotateTransition rotate = new RotateTransition();
        rotate.setNode(node);
        rotate.setDuration(Duration.millis(1500));
        rotate.setCycleCount(RotateTransition.INDEFINITE);
        rotate.setInterpolator(Interpolator.LINEAR);
        rotate.setByAngle(360);
        rotate.setAxis(Rotate.Z_AXIS);
        rotate.play();
        }

    public void vykresliViteze() {

            String x = Integer.toString(posledniHra.pocetBoduVitez);
            String y = Integer.toString(posledniHra.pocetBoduPorazeny);

            
            labelVitez.setText(posledniHra.vitez);
            labelH1.setText(posledniHra.vitez);
            labelH2.setText(posledniHra.porazeny);
            
            zvyrazniZlute(labelVitez);
            zvyrazniZlute(labelH1);
            zvyrazneni(labelH2);
                    
            h1PocetBoduLabel.setText(x + ".b");
            h2PocetBoduLabel.setText(y + ".b");
        
            
            
            
            
           

       


        
        
        

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        obrazekYoda.setImage(new Image("Pics/Obrazky/BabyYodaTransparent.png"));
        animaceYoda(obrazekYoda);
        
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
