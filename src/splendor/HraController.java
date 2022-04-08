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
import javafx.animation.ScaleTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Adam
 */
public class HraController implements Initializable {

    Karta karta1;
    Karta karta2;
    Karta karta3;
    Karta karta4;
    Karta karta5;
    Karta karta6;
    Karta karta7;
    Karta karta8;
    Karta karta9;

    Hrac hrac1;
    Hrac hrac2;

    @FXML
    private AnchorPane AnchorPaneHra;

    @FXML
    private ImageView poleKarty4;

    @FXML
    private ImageView poleKarty5;

    @FXML
    private ImageView poleKarty6;

    @FXML
    private ImageView poleKarty1;

    @FXML
    private ImageView poleKarty2;

    @FXML
    private ImageView poleKarty3;

    @FXML
    private ImageView poleKarty7;

    @FXML
    private ImageView poleKarty8;

    @FXML
    private ImageView poleKarty9;

    @FXML
    private Button tlacitkoDocasne;

    @FXML
    private ImageView h1z10;

    @FXML
    private ImageView h1z11;

    @FXML
    private ImageView h1z12;

    @FXML
    private ImageView h1z13;

    @FXML
    private ImageView h1z14;

    @FXML
    private ImageView h1z15;

    @FXML
    private ImageView h1z16;

    @FXML
    private ImageView h1z17;

    @FXML
    private ImageView h1h10; //hneda

    @FXML
    private ImageView h1h11;

    @FXML
    private ImageView h1h12;

    @FXML
    private ImageView h1h13;

    @FXML
    private ImageView h1h14;

    @FXML
    private ImageView h1h15;

    @FXML
    private ImageView h1h16;

    @FXML
    private ImageView h1h17;

    @FXML   //bila
    private ImageView h1b10;

    @FXML
    private ImageView h1b11;

    @FXML
    private ImageView h1b12;

    @FXML
    private ImageView h1b13;

    @FXML
    private ImageView h1b14;

    @FXML
    private ImageView h1b15;

    @FXML
    private ImageView h1b16;

    @FXML
    private ImageView h1b17;
// modra

    @FXML
    private ImageView h1m10;

    @FXML
    private ImageView h1m11;

    @FXML
    private ImageView h1m12;

    @FXML
    private ImageView h1m13;

    @FXML
    private ImageView h1m14;

    @FXML
    private ImageView h1m15;

    @FXML
    private ImageView h1m16;

    @FXML
    private ImageView h1m17;

    @FXML// cervena
    private ImageView h1c10;

    @FXML
    private ImageView h1c11;

    @FXML
    private ImageView h1c12;

    @FXML
    private ImageView h1c13;

    @FXML
    private ImageView h1c14;

    @FXML
    private ImageView h1c15;

    @FXML
    private ImageView h1c16;

    @FXML
    private ImageView h1c17;

    ////////////////////druhý hráč
    @FXML
    private ImageView h2z10;

    @FXML
    private ImageView h2h10;

    @FXML
    private ImageView h2b10;

    @FXML
    private ImageView h2m10;

    @FXML
    private ImageView h2c10;

    @FXML
    private ImageView h2z11;

    @FXML
    private ImageView h2z12;

    @FXML
    private ImageView h2z13;

    @FXML
    private ImageView h2z14;

    @FXML
    private ImageView h2z15;

    @FXML
    private ImageView h2z16;

    @FXML
    private ImageView h2z17;

    @FXML
    private ImageView h2h11;

    @FXML
    private ImageView h2h12;

    @FXML
    private ImageView h2h13;

    @FXML
    private ImageView h2h14;

    @FXML
    private ImageView h2h15;

    @FXML
    private ImageView h2h16;

    @FXML
    private ImageView h2h17;

    @FXML
    private ImageView h2b11;

    @FXML
    private ImageView h2b12;

    @FXML
    private ImageView h2b13;

    @FXML
    private ImageView h2b14;

    @FXML
    private ImageView h2b15;

    @FXML
    private ImageView h2b16;

    @FXML
    private ImageView h2b17;

    @FXML
    private ImageView h2m11;

    @FXML
    private ImageView h2m12;

    @FXML
    private ImageView h2m13;

    @FXML
    private ImageView h2m14;

    @FXML
    private ImageView h2m15;

    @FXML
    private ImageView h2m16;

    @FXML
    private ImageView h2m17;

    @FXML
    private ImageView h2c11;

    @FXML
    private ImageView h2c12;

    @FXML
    private ImageView h2c13;

    @FXML
    private ImageView h2c14;

    @FXML
    private ImageView h2c15;

    @FXML
    private ImageView h2c16;

    @FXML
    private ImageView h2c17;

    GeneratorKaret g = new GeneratorKaret();

    void kresli() {
        nactiPuvodniKarty();
        vykresliKartu();

    }

    //metoda pro načítání FXML
    void nacistFXML(String nazev) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource(nazev + ".fxml"));
        AnchorPaneHra.getChildren().setAll(pane);
    }

    public void nactiPuvodniKarty() {

        karta1 = g.najdiNovouKartu3();
        karta2 = g.najdiNovouKartu3();
        karta3 = g.najdiNovouKartu3();

        karta4 = g.najdiNovouKartu2();
        karta5 = g.najdiNovouKartu2();
        karta6 = g.najdiNovouKartu2();
        
        karta7 = g.najdiNovouKartu1();
        karta8 = g.najdiNovouKartu1();
        karta9 = g.najdiNovouKartu1();
/*
        System.out.println(karta1.barva);
        System.out.println(karta2.barva);
        System.out.println(karta3.barva);

        System.out.println(karta4.barva);
        System.out.println(karta5.barva);
        System.out.println(karta6.barva);*/
    }

    public void nactiKartu(int i) {
        switch (i) {
            case (1):
                karta1 = g.najdiNovouKartu3();
                System.out.println(karta1.barva);
                poleKarty1.setImage(new Image(karta1.obrazek));
                break;
            case (2):
                karta2 = g.najdiNovouKartu3();
                System.out.println(karta2.barva);
                poleKarty2.setImage(new Image(karta2.obrazek));
                break;
            case (3):
                karta3 = g.najdiNovouKartu3();
                System.out.println(karta3.barva);
                poleKarty3.setImage(new Image(karta3.obrazek));
                break;
            case (4):
                karta4 = g.najdiNovouKartu2();
                System.out.println(karta4.barva);
                poleKarty4.setImage(new Image(karta4.obrazek));
                break;
            case (5):
                karta5 = g.najdiNovouKartu2();
                System.out.println(karta5.barva);
                poleKarty5.setImage(new Image(karta5.obrazek));
                break;
            case (6):
                karta6 = g.najdiNovouKartu2();
                System.out.println(karta6.barva);
                poleKarty6.setImage(new Image(karta6.obrazek));
                break;
            case (7):
                karta7 = g.najdiNovouKartu1();
                System.out.println(karta7.barva);
                poleKarty7.setImage(new Image(karta7.obrazek));
                break;
            case (8):
                karta8 = g.najdiNovouKartu1();
                System.out.println(karta8.barva);
                poleKarty8.setImage(new Image(karta8.obrazek));
                break;
            case (9):
                karta9 = g.najdiNovouKartu1();
                System.out.println(karta9.barva);
                poleKarty9.setImage(new Image(karta9.obrazek));
                break;
        }
    }

    public void vykresliKartu() {// argument "1"

        poleKarty1.setImage(new Image(karta1.obrazek));

        poleKarty2.setImage(new Image(karta2.obrazek));

        poleKarty3.setImage(new Image(karta3.obrazek));

        poleKarty4.setImage(new Image(karta4.obrazek));

        poleKarty5.setImage(new Image(karta5.obrazek));

        poleKarty6.setImage(new Image(karta6.obrazek));
        
        poleKarty7.setImage(new Image(karta7.obrazek));
        
        poleKarty8.setImage(new Image(karta8.obrazek));
        
        poleKarty9.setImage(new Image(karta9.obrazek));

    }

    void animaceDotekuKarty(Node node) {
        node.toFront();
        //node.setOpacity(0.9);
        ScaleTransition scale = new ScaleTransition();
        scale.setNode(node);
        scale.setDuration(Duration.millis(150));
        scale.setToX(1.1);
        scale.setToY(1.1);
        scale.play();

    }//https://www.youtube.com/watch?v=UdGiuDDi7Rg&t=150s&ab_channel=BroCode

    void animaceOupusteniKarty(Node node) {
        node.toBack();
        //node.setOpacity(1.0);
        ScaleTransition scale = new ScaleTransition();
        scale.setNode(node);
        scale.setDuration(Duration.millis(100));
        scale.setToX(1);
        scale.setToY(1);
        scale.play();

    }

    void aktualizaceStavu() {

    }

    @FXML
    void poleKarty1Klik() {
        System.out.println("pred nakupem");
        nakupKarty(karta1);

        System.out.println("po nakupu");
        nactiKartu(1);

        System.out.println(karta1.barva + karta2.barva + karta3.barva);

    }

    @FXML
    void poleKarty2Klik() {
        System.out.println("pred nakupem");
        nakupKarty(karta2);
        System.out.println("po nakupu");
        nactiKartu(2);

        System.out.println(karta1.barva + karta2.barva + karta3.barva);

    }

    @FXML
    void poleKarty3Klik() {
        System.out.println("pred nakupem");
        nakupKarty(karta3);
        System.out.println("po nakupu");
        nactiKartu(3);

        System.out.println(karta1.barva + karta2.barva + karta3.barva);

    }

    @FXML
    void poleKarty4Klik(MouseEvent event) {
        System.out.println("pred nakupem");
        nakupKarty(karta4);
        System.out.println("po nakupu");
        nactiKartu(4);

    }

    @FXML
    void poleKarty5Klik(MouseEvent event) {
        System.out.println("pred nakupem");
        nakupKarty(karta5);
        System.out.println("po nakupu");
        nactiKartu(5);

    }

    @FXML
    void poleKarty7Klik(MouseEvent event) {
        System.out.println("pred nakupem");
        nakupKarty(karta7);
        System.out.println("po nakupu");
        nactiKartu(7);
    }

    @FXML
    void poleKarty8Klik(MouseEvent event) {
        System.out.println("pred nakupem");
        nakupKarty(karta8);
        System.out.println("po nakupu");
        nactiKartu(8);
    }

    @FXML
    void poleKarty9Klik(MouseEvent event) {
        System.out.println("pred nakupem");
        nakupKarty(karta7);
        System.out.println("po nakupu");
        nactiKartu(9);
    }

    @FXML
    void poleKarty6Klik(MouseEvent event) {
        System.out.println("pred nakupem");
        nakupKarty(karta6);
        System.out.println("po nakupu");
        nactiKartu(6);
        System.out.println("nacteno");

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        hrac1 = new Hrac(1, true);
        hrac2 = new Hrac(1, false);
        g.generuj();
        kresli();
    }

    public Karta nakupKarty(Karta karta) {
        File file;
        if (hrac1.jeNaTahu == true) {
            System.out.println("hrac 1 na tahu");
            if ((karta.cenaB == 0 || hrac1.pocetBilKamenu >= karta.cenaB)
                    && (karta.cenaC == 0 || hrac1.pocetCerKamenu >= karta.cenaC)
                    && (karta.cenaH == 0 || hrac1.pocetHneKamenu >= karta.cenaH)
                    && (karta.cenaM == 0 || hrac1.pocetModKamenu >= karta.cenaM)
                    && (karta.cenaZ == 0 || hrac1.pocetZelKamenu >= karta.cenaZ)) {
                hrac1.pocetBilKamenu = hrac1.pocetBilKamenu - karta.cenaB;
                hrac1.pocetCerKamenu = hrac1.pocetCerKamenu - karta.cenaC;
                hrac1.pocetHneKamenu = hrac1.pocetHneKamenu - karta.cenaH;
                hrac1.pocetModKamenu = hrac1.pocetModKamenu - karta.cenaM;
                hrac1.pocetZelKamenu = hrac1.pocetZelKamenu - karta.cenaZ;
                System.out.println("má dost kamenů");
                hrac1.jeNaTahu = false;
                hrac2.jeNaTahu = true;
                switch (karta.barva) {
                    case "bila":
                        System.out.println("kupujes bílou");
                        switch (hrac1.pocetBilKaret) {
                            case 0:
                                h1b10.setDisable(false);
                                h1b10.setVisible(true);
                                h1b10.setMouseTransparent(false);
                                h1b10.setImage(new Image(karta.obrazek));

                                hrac1.pocetBilKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;
                                break;
                            case 1:
                                h1b11.setDisable(false);
                                h1b11.setVisible(true);
                                h1b11.setMouseTransparent(false);
                                h1b11.setImage(new Image(karta.obrazek));

                                hrac1.pocetBilKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;
                                break;
                            case 2:
                                h1b12.setDisable(false);
                                h1b12.setVisible(true);
                                h1b12.setMouseTransparent(false);
                                h1b12.setImage(new Image(karta.obrazek));

                                hrac1.pocetBilKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;
                                break;
                            case 3:
                                h1b13.setDisable(false);
                                h1b13.setVisible(true);
                                h1b13.setMouseTransparent(false);
                                h1b13.setImage(new Image(karta.obrazek));

                                hrac1.pocetBilKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;
                                break;
                            case 4:
                                h1b14.setDisable(false);
                                h1b14.setVisible(true);
                                h1b14.setMouseTransparent(false);
                                h1b14.setImage(new Image(karta.obrazek));

                                hrac1.pocetBilKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;
                                break;
                            case 5:
                                h1b15.setDisable(false);
                                h1b15.setVisible(true);
                                h1b15.setMouseTransparent(false);
                                h1b15.setImage(new Image(karta.obrazek));

                                hrac1.pocetBilKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;
                                break;
                            case 6:
                                h1b16.setDisable(false);
                                h1b16.setVisible(true);
                                h1b16.setMouseTransparent(false);
                                h1b16.setImage(new Image(karta.obrazek));

                                hrac1.pocetBilKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;
                                break;
                            case 7:
                                h1b17.setDisable(false);
                                h1b17.setVisible(true);
                                h1b17.setMouseTransparent(false);
                                h1b17.setImage(new Image(karta.obrazek));

                                hrac1.pocetBilKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;
                                break;
                            case 8:
                                System.out.println("máš maximum karet");
                                break;
                        }

                        break;
                    case "cervena":
                        System.out.println("kupujes cervenou");
                        switch (hrac1.pocetCerKaret) {
                            case 0:
                                h1c10.setDisable(false);
                                h1c10.setVisible(true);
                                h1c10.setMouseTransparent(false);
                                h1c10.setImage(new Image(karta.obrazek));

                                hrac1.pocetCerKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;
                                break;
                            case 1:
                                h1c11.setDisable(false);
                                h1c11.setVisible(true);
                                h1c11.setMouseTransparent(false);
                                h1c11.setImage(new Image(karta.obrazek));

                                hrac1.pocetCerKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;
                                break;
                            case 2:
                                h1c12.setDisable(false);
                                h1c12.setVisible(true);
                                h1c12.setMouseTransparent(false);
                                h1c12.setImage(new Image(karta.obrazek));

                                hrac1.pocetCerKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;
                                break;
                            case 3:
                                h1c13.setDisable(false);
                                h1c13.setVisible(true);
                                h1c13.setMouseTransparent(false);
                                h1c13.setImage(new Image(karta.obrazek));

                                hrac1.pocetCerKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;
                                break;
                            case 4:
                                h1c14.setDisable(false);
                                h1c14.setVisible(true);
                                h1c14.setMouseTransparent(false);
                                h1c14.setImage(new Image(karta.obrazek));

                                hrac1.pocetCerKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;
                                break;
                            case 5:
                                h1c15.setDisable(false);
                                h1c15.setVisible(true);
                                h1c15.setMouseTransparent(false);
                                h1c15.setImage(new Image(karta.obrazek));

                                hrac1.pocetCerKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;
                                break;
                            case 6:
                                h1c16.setDisable(false);
                                h1c16.setVisible(true);
                                h1c16.setMouseTransparent(false);
                                h1c16.setImage(new Image(karta.obrazek));

                                hrac1.pocetCerKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;
                                break;
                            case 7:
                                h1c17.setDisable(false);
                                h1c17.setVisible(true);
                                h1c17.setMouseTransparent(false);
                                h1c17.setImage(new Image(karta.obrazek));

                                hrac1.pocetCerKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;
                                break;
                            case 8:
                                System.out.println("máš maximum karet");
                                break;

                        }
                        break;
                    case "hneda":
                        System.out.println("kupujes hnedou");
                        switch (hrac1.pocetHneKaret) {
                            case 0:
                                h1h10.setDisable(false);
                                h1h10.setVisible(true);
                                h1h10.setMouseTransparent(false);
                                h1h10.setImage(new Image(karta.obrazek));

                                hrac1.pocetHneKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;
                                break;
                            case 1:
                                h1h11.setDisable(false);
                                h1h11.setVisible(true);
                                h1h11.setMouseTransparent(false);
                                h1h11.setImage(new Image(karta.obrazek));

                                hrac1.pocetHneKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;
                                break;
                            case 2:
                                h1h12.setDisable(false);
                                h1h12.setVisible(true);
                                h1h12.setMouseTransparent(false);
                                h1h12.setImage(new Image(karta.obrazek));

                                hrac1.pocetHneKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;
                                break;
                            case 3:
                                h1h13.setDisable(false);
                                h1h13.setVisible(true);
                                h1h13.setMouseTransparent(false);
                                h1h13.setImage(new Image(karta.obrazek));

                                hrac1.pocetHneKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;
                                break;
                            case 4:
                                h1h14.setDisable(false);
                                h1h14.setVisible(true);
                                h1h14.setMouseTransparent(false);
                                h1h14.setImage(new Image(karta.obrazek));

                                hrac1.pocetHneKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;
                                break;
                            case 5:
                                h1h15.setDisable(false);
                                h1h15.setVisible(true);
                                h1h15.setMouseTransparent(false);
                                h1h15.setImage(new Image(karta.obrazek));

                                hrac1.pocetHneKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;
                                break;
                            case 6:
                                h1h16.setDisable(false);
                                h1h16.setVisible(true);
                                h1h16.setMouseTransparent(false);
                                h1h16.setImage(new Image(karta.obrazek));

                                hrac1.pocetHneKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;
                                break;
                            case 7:
                                h1h17.setDisable(false);
                                h1h17.setVisible(true);
                                h1h17.setMouseTransparent(false);
                                h1h17.setImage(new Image(karta.obrazek));

                                hrac1.pocetHneKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;
                                break;
                            case 8:
                                System.out.println("máš maximum karet");
                                break;

                        }
                        break;
                    case "modra":
                        System.out.println("kupujes modrou");
                        switch (hrac1.pocetModKaret) {
                            case 0:
                                h1m10.setDisable(false);
                                h1m10.setVisible(true);
                                h1m10.setMouseTransparent(false);
                                h1m10.setImage(new Image(karta.obrazek));

                                hrac1.pocetModKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;
                                break;
                            case 1:
                                h1m11.setDisable(false);
                                h1m11.setVisible(true);
                                h1m11.setMouseTransparent(false);
                                h1m11.setImage(new Image(karta.obrazek));

                                hrac1.pocetModKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;
                                break;
                            case 2:
                                h1m12.setDisable(false);
                                h1m12.setVisible(true);
                                h1m12.setMouseTransparent(false);
                                h1m12.setImage(new Image(karta.obrazek));

                                hrac1.pocetModKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;
                                break;
                            case 3:
                                h1m13.setDisable(false);
                                h1m13.setVisible(true);
                                h1m13.setMouseTransparent(false);
                                h1m13.setImage(new Image(karta.obrazek));

                                hrac1.pocetModKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;
                                break;
                            case 4:
                                h1m14.setDisable(false);
                                h1m14.setVisible(true);
                                h1m14.setMouseTransparent(false);
                                h1m14.setImage(new Image(karta.obrazek));

                                hrac1.pocetModKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;
                                break;
                            case 5:
                                h1m15.setDisable(false);
                                h1m15.setVisible(true);
                                h1m15.setMouseTransparent(false);
                                h1m15.setImage(new Image(karta.obrazek));

                                hrac1.pocetModKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;
                                break;
                            case 6:
                                h1m16.setDisable(false);
                                h1m16.setVisible(true);
                                h1m16.setMouseTransparent(false);
                                h1m16.setImage(new Image(karta.obrazek));

                                hrac1.pocetModKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;
                                break;
                            case 7:
                                h1m17.setDisable(false);
                                h1m17.setVisible(true);
                                h1m17.setMouseTransparent(false);
                                h1m17.setImage(new Image(karta.obrazek));

                                hrac1.pocetModKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;
                                break;
                            case 8:
                                System.out.println("máš maximum karet");
                                break;
                        }
                        break;
                    case "zelena":
                        System.out.println("kupujes zelenou");
                        switch (hrac1.pocetZelKaret) {
                            case 0:
                                h1z10.setDisable(false);
                                h1z10.setVisible(true);
                                h1z10.setMouseTransparent(false);
                                h1z10.setImage(new Image(karta.obrazek));

                                hrac1.pocetZelKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;

                                break;
                            case 1:
                                h1z11.setDisable(false);
                                h1z11.setVisible(true);
                                h1z11.setMouseTransparent(false);
                                h1z11.setImage(new Image(karta.obrazek));

                                hrac1.pocetZelKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;

                                break;
                            case 2:
                                h1z12.setDisable(false);
                                h1z12.setVisible(true);
                                h1z12.setMouseTransparent(false);
                                h1z12.setImage(new Image(karta.obrazek));

                                hrac1.pocetZelKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;

                                break;
                            case 3:
                                h1z13.setDisable(false);
                                h1z13.setVisible(true);
                                h1z13.setMouseTransparent(false);
                                h1z13.setImage(new Image(karta.obrazek));

                                hrac1.pocetZelKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;

                                break;
                            case 4:
                                h1z14.setDisable(false);
                                h1z14.setVisible(true);
                                h1z14.setMouseTransparent(false);
                                h1z14.setImage(new Image(karta.obrazek));

                                hrac1.pocetZelKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;

                                break;
                            case 5:
                                h1z15.setDisable(false);
                                h1z15.setVisible(true);
                                h1z15.setMouseTransparent(false);
                                h1z15.setImage(new Image(karta.obrazek));

                                hrac1.pocetZelKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;

                                break;
                            case 6:
                                h1z16.setDisable(false);
                                h1z16.setVisible(true);
                                h1z16.setMouseTransparent(false);
                                h1z16.setImage(new Image(karta.obrazek));

                                hrac1.pocetZelKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;

                                break;
                            case 7:
                                h1z17.setDisable(false);
                                h1z17.setVisible(true);
                                h1z17.setMouseTransparent(false);
                                h1z17.setImage(new Image(karta.obrazek));

                                hrac1.pocetZelKaret++;
                                hrac1.pocetBodu = hrac1.pocetBodu + karta.body;

                                break;
                            case 8:
                                System.out.println("máš maximum karet");
                                break;

                        }

                        break;
                }

            } else {
                System.out.println("nemá dost penez");
            }

        } else if (hrac2.jeNaTahu == true) {
            System.out.println("hrac 2 na tahu");

            if ((karta.cenaB == 0 || hrac2.pocetBilKamenu >= karta.cenaB)
                    && (karta.cenaC == 0 || hrac2.pocetCerKamenu >= karta.cenaC)
                    && (karta.cenaH == 0 || hrac2.pocetHneKamenu >= karta.cenaH)
                    && (karta.cenaM == 0 || hrac2.pocetModKamenu >= karta.cenaM)
                    && (karta.cenaZ == 0 || hrac2.pocetZelKamenu >= karta.cenaZ)) {
                hrac2.pocetBilKamenu = hrac2.pocetBilKamenu - karta.cenaB;
                hrac2.pocetCerKamenu = hrac2.pocetCerKamenu - karta.cenaC;
                hrac2.pocetHneKamenu = hrac2.pocetHneKamenu - karta.cenaH;
                hrac2.pocetModKamenu = hrac2.pocetModKamenu - karta.cenaM;
                hrac2.pocetZelKamenu = hrac2.pocetZelKamenu - karta.cenaZ;
                System.out.println("má dost kamenů");
                hrac1.jeNaTahu = true;
                hrac2.jeNaTahu = false;
                switch (karta.barva) {
                    case "bila":
                        System.out.println("kupujes bílou");
                        switch (hrac2.pocetBilKaret) {
                            case 0:
                                h2b10.setDisable(false);
                                h2b10.setVisible(true);
                                h2b10.setMouseTransparent(false);
                                h2b10.setImage(new Image(karta.obrazek));

                                hrac2.pocetBilKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;
                                break;
                            case 1:
                                h2b11.setDisable(false);
                                h2b11.setVisible(true);
                                h2b11.setMouseTransparent(false);
                                h2b11.setImage(new Image(karta.obrazek));

                                hrac2.pocetBilKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;
                                break;
                            case 2:
                                h2b12.setDisable(false);
                                h2b12.setVisible(true);
                                h2b12.setMouseTransparent(false);
                                h2b12.setImage(new Image(karta.obrazek));

                                hrac2.pocetBilKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;
                                break;
                            case 3:
                                h2b13.setDisable(false);
                                h2b13.setVisible(true);
                                h2b13.setMouseTransparent(false);
                                h2b13.setImage(new Image(karta.obrazek));

                                hrac2.pocetBilKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;
                                break;
                            case 4:
                                h2b14.setDisable(false);
                                h2b14.setVisible(true);
                                h2b14.setMouseTransparent(false);
                                h2b14.setImage(new Image(karta.obrazek));

                                hrac2.pocetBilKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;
                                break;
                            case 5:
                                h2b15.setDisable(false);
                                h2b15.setVisible(true);
                                h2b15.setMouseTransparent(false);
                                h2b15.setImage(new Image(karta.obrazek));

                                hrac2.pocetBilKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;
                                break;
                            case 6:
                                h2b16.setDisable(false);
                                h2b16.setVisible(true);
                                h2b16.setMouseTransparent(false);
                                h2b16.setImage(new Image(karta.obrazek));

                                hrac2.pocetBilKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;
                                break;
                            case 7:
                                h2b17.setDisable(false);
                                h2b17.setVisible(true);
                                h2b17.setMouseTransparent(false);
                                h2b17.setImage(new Image(karta.obrazek));

                                hrac2.pocetBilKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;
                                break;
                            case 8:
                                System.out.println("máš maximum karet");
                                break;
                        }

                        break;
                    case "cervena":
                        System.out.println("kupujes cervenou");
                        switch (hrac2.pocetCerKaret) {
                            case 0:
                                h2c10.setDisable(false);
                                h2c10.setVisible(true);
                                h2c10.setMouseTransparent(false);
                                h2c10.setImage(new Image(karta.obrazek));

                                hrac2.pocetCerKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;
                                break;
                            case 1:
                                h2c11.setDisable(false);
                                h2c11.setVisible(true);
                                h2c11.setMouseTransparent(false);
                                h2c11.setImage(new Image(karta.obrazek));

                                hrac2.pocetCerKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;
                                break;
                            case 2:
                                h2c12.setDisable(false);
                                h2c12.setVisible(true);
                                h2c12.setMouseTransparent(false);
                                h2c12.setImage(new Image(karta.obrazek));

                                hrac2.pocetCerKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;
                                break;
                            case 3:
                                h2c13.setDisable(false);
                                h2c13.setVisible(true);
                                h2c13.setMouseTransparent(false);
                                h2c13.setImage(new Image(karta.obrazek));

                                hrac2.pocetCerKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;
                                break;
                            case 4:
                                h2c14.setDisable(false);
                                h2c14.setVisible(true);
                                h2c14.setMouseTransparent(false);
                                h2c14.setImage(new Image(karta.obrazek));

                                hrac2.pocetCerKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;
                                break;
                            case 5:
                                h2c15.setDisable(false);
                                h2c15.setVisible(true);
                                h2c15.setMouseTransparent(false);
                                h2c15.setImage(new Image(karta.obrazek));

                                hrac2.pocetCerKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;
                                break;
                            case 6:
                                h2c16.setDisable(false);
                                h2c16.setVisible(true);
                                h2c16.setMouseTransparent(false);
                                h2c16.setImage(new Image(karta.obrazek));

                                hrac2.pocetCerKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;
                                break;
                            case 7:
                                h2c17.setDisable(false);
                                h2c17.setVisible(true);
                                h2c17.setMouseTransparent(false);
                                h2c17.setImage(new Image(karta.obrazek));

                                hrac2.pocetCerKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;
                                break;
                            case 8:
                                System.out.println("máš maximum karet");
                                break;

                        }
                        break;
                    case "hneda":
                        System.out.println("kupujes hnedou");
                        switch (hrac2.pocetHneKaret) {
                            case 0:
                                h2h10.setDisable(false);
                                h2h10.setVisible(true);
                                h2h10.setMouseTransparent(false);
                                h2h10.setImage(new Image(karta.obrazek));

                                hrac2.pocetHneKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;
                                break;
                            case 1:
                                h2h11.setDisable(false);
                                h2h11.setVisible(true);
                                h2h11.setMouseTransparent(false);
                                h2h11.setImage(new Image(karta.obrazek));

                                hrac2.pocetHneKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;
                                break;
                            case 2:
                                h2h12.setDisable(false);
                                h2h12.setVisible(true);
                                h2h12.setMouseTransparent(false);
                                h2h12.setImage(new Image(karta.obrazek));

                                hrac2.pocetHneKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;
                                break;
                            case 3:
                                h2h13.setDisable(false);
                                h2h13.setVisible(true);
                                h2h13.setMouseTransparent(false);
                                h2h13.setImage(new Image(karta.obrazek));

                                hrac2.pocetHneKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;
                                break;
                            case 4:
                                h2h14.setDisable(false);
                                h2h14.setVisible(true);
                                h2h14.setMouseTransparent(false);
                                h2h14.setImage(new Image(karta.obrazek));

                                hrac2.pocetHneKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;
                                break;
                            case 5:
                                h2h15.setDisable(false);
                                h2h15.setVisible(true);
                                h2h15.setMouseTransparent(false);
                                h2h15.setImage(new Image(karta.obrazek));

                                hrac2.pocetHneKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;
                                break;
                            case 6:
                                h2h16.setDisable(false);
                                h2h16.setVisible(true);
                                h2h16.setMouseTransparent(false);
                                h2h16.setImage(new Image(karta.obrazek));

                                hrac2.pocetHneKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;
                                break;
                            case 7:
                                h2h17.setDisable(false);
                                h2h17.setVisible(true);
                                h2h17.setMouseTransparent(false);
                                h2h17.setImage(new Image(karta.obrazek));

                                hrac2.pocetHneKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;
                                break;
                            case 8:
                                System.out.println("máš maximum karet");
                                break;

                        }
                        break;
                    case "modra":
                        System.out.println("kupujes modrou");
                        switch (hrac2.pocetModKaret) {
                            case 0:
                                h2m10.setDisable(false);
                                h2m10.setVisible(true);
                                h2m10.setMouseTransparent(false);
                                h2m10.setImage(new Image(karta.obrazek));

                                hrac2.pocetModKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;
                                break;
                            case 1:
                                h2m11.setDisable(false);
                                h2m11.setVisible(true);
                                h2m11.setMouseTransparent(false);
                                h2m11.setImage(new Image(karta.obrazek));

                                hrac2.pocetModKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;
                                break;
                            case 2:
                                h2m12.setDisable(false);
                                h2m12.setVisible(true);
                                h2m12.setMouseTransparent(false);
                                h2m12.setImage(new Image(karta.obrazek));

                                hrac2.pocetModKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;
                                break;
                            case 3:
                                h2m13.setDisable(false);
                                h2m13.setVisible(true);
                                h2m13.setMouseTransparent(false);
                                h2m13.setImage(new Image(karta.obrazek));

                                hrac2.pocetModKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;
                                break;
                            case 4:
                                h2m14.setDisable(false);
                                h2m14.setVisible(true);
                                h2m14.setMouseTransparent(false);
                                h2m14.setImage(new Image(karta.obrazek));

                                hrac2.pocetModKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;
                                break;
                            case 5:
                                h2m15.setDisable(false);
                                h2m15.setVisible(true);
                                h2m15.setMouseTransparent(false);
                                h2m15.setImage(new Image(karta.obrazek));

                                hrac2.pocetModKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;
                                break;
                            case 6:
                                h2m16.setDisable(false);
                                h2m16.setVisible(true);
                                h2m16.setMouseTransparent(false);
                                h2m16.setImage(new Image(karta.obrazek));

                                hrac2.pocetModKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;
                                break;
                            case 7:
                                h2m17.setDisable(false);
                                h2m17.setVisible(true);
                                h2m17.setMouseTransparent(false);
                                h2m17.setImage(new Image(karta.obrazek));

                                hrac2.pocetModKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;
                                break;
                            case 8:
                                System.out.println("máš maximum karet");
                                break;
                        }
                        break;
                    case "zelena":
                        System.out.println("kupujes zelenou");
                        switch (hrac2.pocetZelKaret) {
                            case 0:
                                h2z10.setDisable(false);
                                h2z10.setVisible(true);
                                h2z10.setMouseTransparent(false);
                                h2z10.setImage(new Image(karta.obrazek));

                                hrac2.pocetZelKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;

                                break;
                            case 1:
                                h2z11.setDisable(false);
                                h2z11.setVisible(true);
                                h2z11.setMouseTransparent(false);
                                h2z11.setImage(new Image(karta.obrazek));

                                hrac2.pocetZelKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;

                                break;
                            case 2:
                                h2z12.setDisable(false);
                                h2z12.setVisible(true);
                                h2z12.setMouseTransparent(false);
                                h2z12.setImage(new Image(karta.obrazek));

                                hrac2.pocetZelKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;

                                break;
                            case 3:
                                h2z13.setDisable(false);
                                h2z13.setVisible(true);
                                h2z13.setMouseTransparent(false);
                                h2z13.setImage(new Image(karta.obrazek));

                                hrac2.pocetZelKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;

                                break;
                            case 4:
                                h2z14.setDisable(false);
                                h2z14.setVisible(true);
                                h2z14.setMouseTransparent(false);
                                h2z14.setImage(new Image(karta.obrazek));

                                hrac2.pocetZelKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;

                                break;
                            case 5:
                                h2z15.setDisable(false);
                                h2z15.setVisible(true);
                                h2z15.setMouseTransparent(false);
                                h2z15.setImage(new Image(karta.obrazek));

                                hrac2.pocetZelKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;

                                break;
                            case 6:
                                h2z16.setDisable(false);
                                h2z16.setVisible(true);
                                h2z16.setMouseTransparent(false);
                                h2z16.setImage(new Image(karta.obrazek));

                                hrac2.pocetZelKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;

                                break;
                            case 7:
                                h2z17.setDisable(false);
                                h2z17.setVisible(true);
                                h2z17.setMouseTransparent(false);
                                h2z17.setImage(new Image(karta.obrazek));

                                hrac2.pocetZelKaret++;
                                hrac2.pocetBodu = hrac2.pocetBodu + karta.body;

                                break;
                            case 8:
                                System.out.println("máš maximum karet");
                                break;
                        }

                        break;
                }
            }
        }
        return null;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    ////// ANIMACE -->
    @FXML
    void poleKarty1Vstup(MouseEvent event) {
        animaceDotekuKarty(poleKarty1);

    }

    @FXML
    void poleKarty1Vystup(MouseEvent event) {
        animaceOupusteniKarty(poleKarty1);
    }

    @FXML
    void poleKarty2Vstup(MouseEvent event) {
        animaceDotekuKarty(poleKarty2);
    }

    @FXML
    void poleKarty2Vystup(MouseEvent event) {
        animaceOupusteniKarty(poleKarty2);
    }

    @FXML
    void poleKarty3Vstup(MouseEvent event) {
        animaceDotekuKarty(poleKarty3);
    }

    @FXML
    void poleKarty3Vystup(MouseEvent event) {
        animaceOupusteniKarty(poleKarty3);
    }

    @FXML
    void h1z10Vstup(MouseEvent event) {
        animaceDotekuKarty(h1z10);
    }

    @FXML
    void h1z10Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1z10);
    }

    @FXML
    void h1z11Vstup(MouseEvent event) {
        animaceDotekuKarty(h1z11);
    }

    @FXML
    void h1z11Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1z11);
    }

    @FXML
    void h1z12Vstup(MouseEvent event) {
        animaceDotekuKarty(h1z12);
    }

    @FXML
    void h1z12Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1z12);
    }

    @FXML
    void h1z13Vstup(MouseEvent event) {
        animaceDotekuKarty(h1z13);
    }

    @FXML
    void h1z13Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1z13);
    }

    @FXML
    void h1z14Vstup(MouseEvent event) {
        animaceDotekuKarty(h1z14);
    }

    @FXML
    void h1z14Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1z14);
    }

    @FXML
    void h1z15Vstup(MouseEvent event) {
        animaceDotekuKarty(h1z15);
    }

    @FXML
    void h1z15Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1z15);
    }

    @FXML
    void h1z16Vstup(MouseEvent event) {
        animaceDotekuKarty(h1z16);
    }

    @FXML
    void h1z16Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1z16);
    }

    @FXML
    void h1z17Vstup(MouseEvent event) {
        animaceDotekuKarty(h1z17);
    }

    @FXML
    void h1z17Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1z17);
    }

    @FXML
    void h1h10Vstup(MouseEvent event) {
        animaceDotekuKarty(h1h10);
    }

    @FXML
    void h1h10Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1h10);
    }

    @FXML
    void h1h11Vstup(MouseEvent event) {
        animaceDotekuKarty(h1h11);
    }

    @FXML
    void h1h11Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1h11);
    }

    @FXML
    void h1h12Vstup(MouseEvent event) {
        animaceDotekuKarty(h1h12);
    }

    @FXML
    void h1h12Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1h12);
    }

    @FXML
    void h1h13Vstup(MouseEvent event) {
        animaceDotekuKarty(h1h13);
    }

    @FXML
    void h1h13Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1h13);
    }

    @FXML
    void h1h14Vstup(MouseEvent event) {
        animaceDotekuKarty(h1h14);
    }

    @FXML
    void h1h14Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1h14);
    }

    @FXML
    void h1h15Vstup(MouseEvent event) {
        animaceDotekuKarty(h1h15);
    }

    @FXML
    void h1h15Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1h15);
    }

    @FXML
    void h1h16Vstup(MouseEvent event) {
        animaceDotekuKarty(h1h16);
    }

    @FXML
    void h1h16Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1h16);
    }

    @FXML
    void h1h17Vstup(MouseEvent event) {
        animaceDotekuKarty(h1h17);
    }

    @FXML
    void h1h17Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1h17);
    }

    @FXML
    void h1b10Vstup(MouseEvent event) {
        animaceDotekuKarty(h1b10);
    }

    @FXML
    void h1b10Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1b10);
    }

    @FXML
    void h1b11Vstup(MouseEvent event) {
        animaceDotekuKarty(h1b11);
    }

    @FXML
    void h1b11Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1b11);
    }

    @FXML
    void h1b12Vstup(MouseEvent event) {
        animaceDotekuKarty(h1b12);
    }

    @FXML
    void h1b12Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1b12);
    }

    @FXML
    void h1b13Vstup(MouseEvent event) {
        animaceDotekuKarty(h1b13);
    }

    @FXML
    void h1b13Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1b13);
    }

    @FXML
    void h1b14Vstup(MouseEvent event) {
        animaceDotekuKarty(h1b14);
    }

    @FXML
    void h1b14Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1b14);
    }

    @FXML
    void h1b15Vstup(MouseEvent event) {
        animaceDotekuKarty(h1b15);
    }

    @FXML
    void h1b15Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1b15);
    }

    @FXML
    void h1b16Vstup(MouseEvent event) {
        animaceDotekuKarty(h1b16);
    }

    @FXML
    void h1b16Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1b16);
    }

    @FXML
    void h1b17Vstup(MouseEvent event) {
        animaceDotekuKarty(h1b17);
    }

    @FXML
    void h1b17Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1b17);
    }

    @FXML
    void h1m10Vstup(MouseEvent event) {
        animaceDotekuKarty(h1m10);
    }

    @FXML
    void h1m10Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1m10);
    }

    @FXML
    void h1m11Vstup(MouseEvent event) {
        animaceDotekuKarty(h1m11);
    }

    @FXML
    void h1m11Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1m11);
    }

    @FXML
    void h1m12Vstup(MouseEvent event) {
        animaceDotekuKarty(h1m12);
    }

    @FXML
    void h1m12Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1m12);
    }

    @FXML
    void h1m13Vstup(MouseEvent event) {
        animaceDotekuKarty(h1m13);
    }

    @FXML
    void h1m13Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1m13);
    }

    @FXML
    void h1m14Vstup(MouseEvent event) {
        animaceDotekuKarty(h1m14);
    }

    @FXML
    void h1m14Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1m14);
    }

    @FXML
    void h1m15Vstup(MouseEvent event) {
        animaceDotekuKarty(h1m15);
    }

    @FXML
    void h1m15Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1m15);
    }

    @FXML
    void h1m16Vstup(MouseEvent event) {
        animaceDotekuKarty(h1m16);
    }

    @FXML
    void h1m16Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1m16);
    }

    @FXML
    void h1m17Vstup(MouseEvent event) {
        animaceDotekuKarty(h1m17);
    }

    @FXML
    void h1m17Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1m17);
    }

    @FXML
    void h1c10Vstup(MouseEvent event) {
        animaceDotekuKarty(h1c10);
    }

    @FXML
    void h1c10Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1c10);
    }

    @FXML
    void h1c11Vstup(MouseEvent event) {
        animaceDotekuKarty(h1c11);
    }

    @FXML
    void h1c11Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1c11);
    }

    @FXML
    void h1c12Vstup(MouseEvent event) {
        animaceDotekuKarty(h1c12);
    }

    @FXML
    void h1c12Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1c12);
    }

    @FXML
    void h1c13Vstup(MouseEvent event) {
        animaceDotekuKarty(h1c13);
    }

    @FXML
    void h1c13Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1c13);
    }

    @FXML
    void h1c14Vstup(MouseEvent event) {
        animaceDotekuKarty(h1c14);
    }

    @FXML
    void h1c14Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1c14);
    }

    @FXML
    void h1c15Vstup(MouseEvent event) {
        animaceDotekuKarty(h1c15);
    }

    @FXML
    void h1c15Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1c15);
    }

    @FXML
    void h1c16Vstup(MouseEvent event) {
        animaceDotekuKarty(h1c16);
    }

    @FXML
    void h1c16Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1c16);
    }

    @FXML
    void h1c17Vstup(MouseEvent event) {
        animaceDotekuKarty(h1c17);
    }

    @FXML
    void h1c17Vystup(MouseEvent event) {
        animaceOupusteniKarty(h1c17);
    }

    @FXML
    void h2b10Vstup(MouseEvent event) {
        animaceDotekuKarty(h2b10);
    }

    @FXML
    void h2b10Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2b10);
    }

    @FXML
    void h2b11Vstup(MouseEvent event) {
        animaceDotekuKarty(h2b11);
    }

    @FXML
    void h2b11Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2b11);
    }

    @FXML
    void h2b12Vstup(MouseEvent event) {
        animaceDotekuKarty(h2b12);
    }

    @FXML
    void h2b12Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2b12);
    }

    @FXML
    void h2b13Vstup(MouseEvent event) {
        animaceDotekuKarty(h2b13);
    }

    @FXML
    void h2b13Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2b13);
    }

    @FXML
    void h2b14Vstup(MouseEvent event) {
        animaceDotekuKarty(h2b14);
    }

    @FXML
    void h2b14Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2b14);
    }

    @FXML
    void h2b15Vstup(MouseEvent event) {
        animaceDotekuKarty(h2b15);
    }

    @FXML
    void h2b15Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2b15);
    }

    @FXML
    void h2b16Vstup(MouseEvent event) {
        animaceDotekuKarty(h2b16);
    }

    @FXML
    void h2b16Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2b16);
    }

    @FXML
    void h2b17Vstup(MouseEvent event) {
        animaceDotekuKarty(h2b17);
    }

    @FXML
    void h2b17Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2b17);
    }

    @FXML
    void h2c10Vstup(MouseEvent event) {
        animaceDotekuKarty(h2c10);
    }

    @FXML
    void h2c10Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2c10);
    }

    @FXML
    void h2c11Vstup(MouseEvent event) {
        animaceDotekuKarty(h2c11);
    }

    @FXML
    void h2c11Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2c11);
    }

    @FXML
    void h2c12Vstup(MouseEvent event) {
        animaceDotekuKarty(h2c12);
    }

    @FXML
    void h2c12Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2c12);
    }

    @FXML
    void h2c13Vstup(MouseEvent event) {
        animaceDotekuKarty(h2c13);
    }

    @FXML
    void h2c13Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2c13);
    }

    @FXML
    void h2c14Vstup(MouseEvent event) {
        animaceDotekuKarty(h2c14);
    }

    @FXML
    void h2c14Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2c14);
    }

    @FXML
    void h2c15Vstup(MouseEvent event) {
        animaceDotekuKarty(h2c15);
    }

    @FXML
    void h2c15Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2c15);
    }

    @FXML
    void h2c16Vstup(MouseEvent event) {
        animaceDotekuKarty(h2c16);
    }

    @FXML
    void h2c16Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2c16);
    }

    @FXML
    void h2c17Vstup(MouseEvent event) {
        animaceDotekuKarty(h2c17);
    }

    @FXML
    void h2c17Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2c17);
    }

    @FXML
    void h2h10Vstup(MouseEvent event) {
        animaceDotekuKarty(h2h10);
    }

    @FXML
    void h2h10Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2h10);
    }

    @FXML
    void h2h11Vstup(MouseEvent event) {
        animaceDotekuKarty(h2h11);
    }

    @FXML
    void h2h11Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2h11);
    }

    @FXML
    void h2h12Vstup(MouseEvent event) {
        animaceDotekuKarty(h2h12);
    }

    @FXML
    void h2h12Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2h12);
    }

    @FXML
    void h2h13Vstup(MouseEvent event) {
        animaceDotekuKarty(h2h13);
    }

    @FXML
    void h2h13Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2h13);
    }

    @FXML
    void h2h14Vstup(MouseEvent event) {
        animaceDotekuKarty(h2h14);
    }

    @FXML
    void h2h14Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2h14);
    }

    @FXML
    void h2h15Vstup(MouseEvent event) {
        animaceDotekuKarty(h2h15);
    }

    @FXML
    void h2h15Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2h15);
    }

    @FXML
    void h2h16Vstup(MouseEvent event) {
        animaceDotekuKarty(h2h16);
    }

    @FXML
    void h2h16Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2h16);
    }

    @FXML
    void h2h17Vstup(MouseEvent event) {
        animaceDotekuKarty(h2h17);
    }

    @FXML
    void h2h17Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2h17);
    }

    @FXML
    void h2m10Vstup(MouseEvent event) {
        animaceDotekuKarty(h2m10);
    }

    @FXML
    void h2m10Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2m10);
    }

    @FXML
    void h2m11Vstup(MouseEvent event) {
        animaceDotekuKarty(h2m11);
    }

    @FXML
    void h2m11Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2m11);
    }

    @FXML
    void h2m12Vstup(MouseEvent event) {
        animaceDotekuKarty(h2m12);
    }

    @FXML
    void h2m12Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2m12);
    }

    @FXML
    void h2m13Vstup(MouseEvent event) {
        animaceDotekuKarty(h2m13);
    }

    @FXML
    void h2m13Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2m13);
    }

    @FXML
    void h2m14Vstup(MouseEvent event) {
        animaceDotekuKarty(h2m14);
    }

    @FXML
    void h2m14Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2m14);
    }

    @FXML
    void h2m15Vstup(MouseEvent event) {
        animaceDotekuKarty(h2m15);
    }

    @FXML
    void h2m15Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2m15);
    }

    @FXML
    void h2m16Vstup(MouseEvent event) {
        animaceDotekuKarty(h2m16);
    }

    @FXML
    void h2m16Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2m16);
    }

    @FXML
    void h2m17Vstup(MouseEvent event) {
        animaceDotekuKarty(h2m17);
    }

    @FXML
    void h2m17Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2m17);
    }

    @FXML
    void h2z10Vstup(MouseEvent event) {
        animaceDotekuKarty(h2z10);
    }

    @FXML
    void h2z10Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2z10);
    }

    @FXML
    void h2z11Vstup(MouseEvent event) {
        animaceDotekuKarty(h2z11);
    }

    @FXML
    void h2z11Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2z11);
    }

    @FXML
    void h2z12Vstup(MouseEvent event) {
        animaceDotekuKarty(h2z12);
    }

    @FXML
    void h2z12Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2z12);
    }

    @FXML
    void h2z13Vstup(MouseEvent event) {
        animaceDotekuKarty(h2z13);
    }

    @FXML
    void h2z13Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2z13);
    }

    @FXML
    void h2z14Vstup(MouseEvent event) {
        animaceDotekuKarty(h2z14);
    }

    @FXML
    void h2z14Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2z14);
    }

    @FXML
    void h2z15Vstup(MouseEvent event) {
        animaceDotekuKarty(h2z15);
    }

    @FXML
    void h2z15Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2z15);
    }

    @FXML
    void h2z16Vstup(MouseEvent event) {
        animaceDotekuKarty(h2z16);
    }

    @FXML
    void h2z16Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2z16);
    }

    @FXML
    void h2z17Vstup(MouseEvent event) {
        animaceDotekuKarty(h2z17);
    }

    @FXML
    void h2z17Vystup(MouseEvent event) {
        animaceOupusteniKarty(h2z17);
    }

    @FXML
    void poleKarty4Vstup(MouseEvent event) {
        animaceDotekuKarty(poleKarty4);
    }

    @FXML
    void poleKarty4Vystup(MouseEvent event) {
        animaceOupusteniKarty(poleKarty4);
    }

    @FXML
    void poleKarty5Vstup(MouseEvent event) {
        animaceDotekuKarty(poleKarty5);
    }

    @FXML
    void poleKarty5Vystup(MouseEvent event) {
        animaceOupusteniKarty(poleKarty5);
    }

    @FXML
    void poleKarty6Vstup(MouseEvent event) {
        animaceDotekuKarty(poleKarty6);
    }

    @FXML
    void poleKarty6Vystup(MouseEvent event) {
        animaceOupusteniKarty(poleKarty6);
    }

    @FXML
    void poleKarty7Vstup(MouseEvent event) {

    }

    @FXML
    void poleKarty7Vystup(MouseEvent event) {

    }

    @FXML
    void poleKarty8Vstup(MouseEvent event) {

    }

    @FXML
    void poleKarty8Vystup(MouseEvent event) {

    }

    @FXML
    void poleKarty9Vstup(MouseEvent event) {

    }

    @FXML
    void poleKarty9Vystup(MouseEvent event) {

    }
}
