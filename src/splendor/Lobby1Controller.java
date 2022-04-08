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

    @FXML
    private AnchorPane AnchorPaneLobby1;
    
    @FXML
    private GridPane GridPane;

    @FXML
    private ImageView LogoHry;

    @FXML
    private Button tlacitkoHraDvouHRacu;

    @FXML
    private Button tlacitkoHraTriHracu;

    @FXML
    private Button tlacitkoHraPoSiti;
        
        
    
    @FXML
    private MediaView pozadiVideo;

    @FXML
    void stisknutoHraDvouHracu(ActionEvent event) throws IOException {
        nacistFXML("Hra");
    }

    @FXML
    void stisknutoHraTriHracu(ActionEvent event) throws IOException {
        nacistFXML("Hra");
    }
    
        @FXML
    void stisknutoHraPoSiti(ActionEvent event) throws IOException {
        
 
    }
    
    //metoda pro načítání FXML
    void nacistFXML(String nazev) throws IOException{   //https://www.youtube.com/watch?v=RJOza3XQk34
      AnchorPane pane = FXMLLoader.load(getClass().getResource(nazev + ".fxml"));
      AnchorPaneLobby1.getChildren().setAll(pane);
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        File file = new File("src\\Pics\\backgroundvideo.mp4"); //http://tutorials.jenkov.com/javafx/media.html
        Media media = new Media(file.toURI().toString());
        MediaPlayer player = new MediaPlayer(media);
        pozadiVideo.setMediaPlayer(player);
        player.setVolume(0);
        player.play();
    }    
    
}
