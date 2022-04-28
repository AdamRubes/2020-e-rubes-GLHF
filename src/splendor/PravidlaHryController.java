/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splendor;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Adam
 */
public class PravidlaHryController implements Initializable {
    
    
    @FXML
    private AnchorPane amchorPane;

    @FXML
    private Label labelKartyRozvoje;

    @FXML
    private Label labelKartickySlechticu;

    @FXML
    private Label labelPravidlaHry;

    @FXML
    private Label labelVyberZetonu;

    @FXML
    private Label labelPorizeniKartyRozvoje;
    
    
    @FXML
    private Label labelKonecHry;
    
    
    String pravidlaKartyRozvoje = "Aby hráči získali body, musí si pořizovat karty. Tyto karty jsou umístěny uprostřed obrazovky a hráči si je mohou ve svém tahu pořídit.";
    
    String pravidlaKartickySlechticu = "Kartičky šlechticů jsou umístěny vlevo dole pod herními kartami. "
                                        + "Pokud má hráč stejný nebo vyšší počet karet daných barev, než je vyobrazen na šlechtici, pak se stává jeho majitelem a získá i počet bodů na něm vyobrazených."
                                        + "Hráč si musí šlechtice vzít v tahu kdy splnil podmínky pro jeho získání.";
    
    
    String pravidlaHry = "Role hráče 1 se ujme mladší z hráčů. "
                       + "Ve svém kole musí hráč zahrát jednu z následujících akcí - vzít si 3 žetony různých barev, vzít si 2 kameny stejné barvy(pouze pokud jsou v banku všechny 4 kameny) "
                       + "nebo si pořídit jednu z karet zobrazených uprostřed obrazovky.";
    
    String pravidlaVyberZetonu = "Hráč smí mít maximálně 10 kamenů. Pokud si hráč chce vzít 2 kameny stejné barvy musí být v banku alespoň 4 kameny téže barvy";
    String pravidlaPorizeniKarty = "Hráč může ve svém tahu koupit jednu z karet vyobrazených uprostřed obrazovky výměnou za počet kamenů který je na kartě vyobrazený. Po nákupu karty se hráči přičte bonus a body z karty";
    String pravidlaBonus = "Po nákupu karty hráč získává slevu 1 kámen v barvě karty na budoucí nákupy. Za předpokladu že Modrá karta stojí 3 zel. kameny a hráč má 2 zel. kameny a 1 zel. kartu pak může koupit danou kartu jen za 2 zel. kameny";
    String pravidlaKonec = "Konec hry nastává ve chvíli kdy jeden z hráčů získá alespoň 15b. Závěrečné kolo se dohrává.";
    
    void nastavText(){
        labelKartyRozvoje.setText(pravidlaKartyRozvoje);
        labelKartickySlechticu.setText(pravidlaKartickySlechticu);
        labelPravidlaHry.setText(pravidlaHry);
        labelVyberZetonu.setText(pravidlaVyberZetonu);
        labelPorizeniKartyRozvoje.setText(pravidlaPorizeniKarty);
        labelKonecHry.setText(pravidlaKonec);
    }
    
        void nacistFXML(String nazev) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource(nazev + ".fxml"));
        amchorPane.getChildren().setAll(pane);
    }
    
        @FXML
    void stisknutoNavrat(ActionEvent event) throws IOException {
        nacistFXML("Lobby1");
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nastavText();
    }    
    
}
