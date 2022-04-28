/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splendor;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

/**
 * FXML Controller class
 *
 * @author Adam
 */
public class Lobby1Controller implements Initializable {
    
    UkladacVysledku u;

    MediaPlayer mp;

    Media me;

    @FXML
    private AnchorPane AnchorPaneLobby1;

    @FXML
    private GridPane GridPane;

    @FXML
    private Button tlacitkoHraDvouHRacu;

    @FXML
    private Button tlacitkoZobrazitPravidla;

    @FXML
    private Button tlacitkoHistorieHer;

    @FXML
    private MediaView pozadiVideo;

    @FXML
    private TextField poleText1;

    @FXML
    private TextField poleText2;

    @FXML
    private Label labelEror;

    String nickHrac1;
    String nickHrac2;
    String path;

    UkladacNicku n;

    public String nactiNick1() {
        System.out.println("1");

        System.out.println("kratsi nez 8");

        if (poleText1.getText() == null) {
            return null;
        } else {
            return poleText1.getText();
        }

    }

    public String nactiNick2() {
        System.out.println("2");

        System.out.println("kratsi nez 8");

        if (poleText2.getText() == null) {
            return null;
        } else {
            return poleText2.getText();
        }

    }

    public void ulozNicky() throws IOException {

        if (poleText1.getText() != null) {
            nickHrac1 = poleText1.getText();
        }else{
            nickHrac1 = "Hrac1";
        }
        
        if (poleText2.getText() != null) {
            nickHrac2 = poleText2.getText();
        }else{
            nickHrac1 = "Hrac2";
        }

        path = n.připravSoubor();
        System.out.println("potvrzuji");
        System.out.println("pred ulozenim");
        n.ulozNicky(path, nickHrac1, nickHrac2);
        System.out.println("po ulozeni");
    }

    @FXML
    void stisknutoHraDvouHracu(ActionEvent event) throws IOException {
        
        if(u.jeVolnySlot()){
            
        System.out.println("je volno pro uloženi");
        
        System.out.println("pole1" + poleText1.getText());
        System.out.println("pole2" + poleText2.getText());
        
        ulozNicky();
        nacistFXML("Hra"); 
        
        }else{
            labelEror.setVisible(true);
            labelEror.setText("Není volný slot hry");
        }
        
        
    }

    @FXML
    void stisknutoPravidla(ActionEvent event) throws IOException {
        nacistFXML("PravidlaHry");
    }

    @FXML
    void stisknutoHistorieHer(ActionEvent event) throws IOException {
        nacistFXML("HistorieHer");

    }

    //metoda pro načítání FXML
    void nacistFXML(String nazev) throws IOException {   //https://www.youtube.com/watch?v=RJOza3XQk34
        AnchorPane pane = FXMLLoader.load(getClass().getResource(nazev + ".fxml"));
        AnchorPaneLobby1.getChildren().setAll(pane);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        n = new UkladacNicku();
        u = new UkladacVysledku();

        File file2 = new File("src\\Hudba\\Marked+-+320bit.mp3");   //https://www.serpentsoundstudios.com/royalty-free-music/celtic-fantasy

//          Music: Marked by Alexander Nakarada (www.serpentsoundstudios.com)
//          Licensed under Creative Commons BY Attribution 4.0 License
//          http://creativecommons.org/licenses/by/4.0/
        me = new Media(file2.toURI().toString());
        mp = new MediaPlayer(me);
        mp.setCycleCount(MediaPlayer.INDEFINITE);

        mp.play();

    }

}
