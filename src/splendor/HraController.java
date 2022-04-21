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
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
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

    Slechtic slechtic1;
    Slechtic slechtic2;
    Slechtic slechtic3;

    Hrac hrac1;
    Hrac hrac2;

    BankKamenu bankCentralni;

    boolean muzeSlechtice = false;

    @FXML
    private ImageView h2Slechtic;

    @FXML
    private ImageView h1Slechtic;

    @FXML
    private ImageView poleSlechtic1;

    @FXML
    private ImageView poleSlechtic2;

    @FXML
    private ImageView poleSlechtic3;

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

    @FXML
    private ImageView poleKamenZolik;

    @FXML
    private ImageView poleKamenZolik1;

    @FXML
    private ImageView poleKamenZolik2;

    @FXML
    private ImageView poleKamenBil;

    @FXML
    private ImageView poleKamenBil1;

    @FXML
    private ImageView poleKamenBil2;

    @FXML
    private ImageView poleKamenMod;

    @FXML
    private ImageView poleKamenMod1;

    @FXML
    private ImageView poleKamenMod2;

    @FXML
    private ImageView poleKamenCer;

    @FXML
    private ImageView poleKamenCer1;

    @FXML
    private ImageView poleKamenCer2;

    @FXML
    private ImageView poleKamenZel;

    @FXML
    private ImageView poleKamenZel1;

    @FXML
    private ImageView poleKamenZel2;

    @FXML
    private ImageView poleKamenHne;

    @FXML
    private ImageView poleKamenHne1;

    @FXML
    private ImageView poleKamenHne2;

    @FXML
    private Text textPoleHrac2;
    @FXML
    private Text textPoleHrac1;

    @FXML
    private Text textBodyH2;

    @FXML
    private Text textBodyH1;

    @FXML
    private Text textPocetHne;

    @FXML
    private Text textPocetHne1;

    @FXML
    private Text textPocetHne2;

    @FXML
    private Text textPocetCer;

    @FXML
    private Text textPocetCer1;

    @FXML
    private Text textPocetCer2;

    @FXML
    private Text textPocetZel;

    @FXML
    private Text textPocetZel1;

    @FXML
    private Text textPocetZel2;

    @FXML
    private Text textPocetMod;

    @FXML
    private Text textPocetMod1;

    @FXML
    private Text textPocetMod2;

    @FXML
    private Text textPocetBil;

    @FXML
    private Text textPocetBil1;

    @FXML
    private Text textPocetBil2;

    @FXML
    private Text textPocetZol;

    @FXML
    private Text textPocetZol1;

    @FXML
    private Text textPocetZol2;

    GeneratorKaret g = new GeneratorKaret();
    GeneratorSlechticu f = new GeneratorSlechticu();

    void kresli() {
        nactiPuvodniKarty();
        nactiPuvodniSlechtice();
        vykresliKartu();
        vykresliSlechtice();
        vykresliKameny();

    }

    void vykresliKameny() {
        poleKamenBil.setImage(new Image("Pics/Kameny/bil.png"));
        poleKamenMod.setImage(new Image("Pics/Kameny/mod.png"));
        poleKamenCer.setImage(new Image("Pics/Kameny/cer.png"));
        poleKamenZolik.setImage(new Image("Pics/Kameny/zla.png"));
        poleKamenZel.setImage(new Image("Pics/Kameny/zeleny.png"));
        poleKamenHne.setImage(new Image("Pics/Kameny/hne.png"));

        poleKamenBil1.setImage(new Image("Pics/Kameny/bil.png"));
        poleKamenMod1.setImage(new Image("Pics/Kameny/mod.png"));
        poleKamenCer1.setImage(new Image("Pics/Kameny/cer.png"));
        poleKamenZolik1.setImage(new Image("Pics/Kameny/zla.png"));
        poleKamenZel1.setImage(new Image("Pics/Kameny/zeleny.png"));
        poleKamenHne1.setImage(new Image("Pics/Kameny/hne.png"));

        poleKamenBil2.setImage(new Image("Pics/Kameny/bil.png"));
        poleKamenMod2.setImage(new Image("Pics/Kameny/mod.png"));
        poleKamenCer2.setImage(new Image("Pics/Kameny/cer.png"));
        poleKamenZolik2.setImage(new Image("Pics/Kameny/zla.png"));
        poleKamenZel2.setImage(new Image("Pics/Kameny/zeleny.png"));
        poleKamenHne2.setImage(new Image("Pics/Kameny/hne.png"));

        textPocetBil.setText("4");
        textPocetMod.setText("4");
        textPocetCer.setText("4");
        textPocetZol.setText("4");
        textPocetZel.setText("4");
        textPocetHne.setText("4");
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

    public void nactiPuvodniSlechtice() {
        slechtic1 = f.najdiSlechtice();
        slechtic2 = f.najdiSlechtice();
        slechtic3 = f.najdiSlechtice();
    }

    public void vykresliSlechtice() {
        poleSlechtic1.setImage(new Image(slechtic1.obrazek));
        poleSlechtic2.setImage(new Image(slechtic2.obrazek));
        poleSlechtic3.setImage(new Image(slechtic3.obrazek));
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

    void aktualizaceBodu() {
        String x = Integer.toString(hrac1.pocetBodu);
        String y = Integer.toString(hrac2.pocetBodu);

        textBodyH1.setText(x + " b.");
        textBodyH2.setText(y + " b.");
        if (hrac1.pocetBodu >= 12) {
            System.out.println("vyhral jsi 1");
            //nacist konec hry
        } else if (hrac2.pocetBodu >= 12) {
            System.out.println("vyhral jsi 2");
            //nacist konec hry
        }

    }

    void aktualizaceKamenu() {
        textPocetBil1.setText(Integer.toString(hrac1.pocetBilKamenu));
        textPocetCer1.setText(Integer.toString(hrac1.pocetCerKamenu));
        textPocetZel1.setText(Integer.toString(hrac1.pocetZelKamenu));
        textPocetMod1.setText(Integer.toString(hrac1.pocetModKamenu));
        textPocetHne1.setText(Integer.toString(hrac1.pocetHneKamenu));
        textPocetZol1.setText(Integer.toString(hrac1.pocetZoliku));

        textPocetBil2.setText(Integer.toString(hrac2.pocetBilKamenu));
        textPocetCer2.setText(Integer.toString(hrac2.pocetCerKamenu));
        textPocetZel2.setText(Integer.toString(hrac2.pocetZelKamenu));
        textPocetMod2.setText(Integer.toString(hrac2.pocetModKamenu));
        textPocetHne2.setText(Integer.toString(hrac2.pocetHneKamenu));
        textPocetZol2.setText(Integer.toString(hrac2.pocetZoliku));

        textPocetBil.setText(Integer.toString(bankCentralni.pocetBilKamenu));
        textPocetCer.setText(Integer.toString(bankCentralni.pocetCerKamenu));
        textPocetZel.setText(Integer.toString(bankCentralni.pocetZelKamenu));
        textPocetMod.setText(Integer.toString(bankCentralni.pocetModKamenu));
        textPocetHne.setText(Integer.toString(bankCentralni.pocetHneKamenu));
        textPocetZol.setText(Integer.toString(bankCentralni.pocetZoliku));

    }

    @FXML
    void poleKarty1Klik() {
        kliknutiNakup(karta1, 1);

    }

    @FXML
    void poleKarty2Klik() {
        kliknutiNakup(karta2, 2);

    }

    @FXML
    void poleKarty3Klik() {
        kliknutiNakup(karta3, 3);
    }

    @FXML
    void poleKarty4Klik(MouseEvent event) {
        kliknutiNakup(karta4, 4);
    }

    @FXML
    void poleKarty5Klik(MouseEvent event) {
        kliknutiNakup(karta5, 5);
    }

    @FXML
    void poleKarty6Klik(MouseEvent event) {
        kliknutiNakup(karta6, 6);
    }

    @FXML
    void poleKarty7Klik(MouseEvent event) {
        kliknutiNakup(karta7, 7);
    }

    @FXML
    void poleKarty8Klik(MouseEvent event) {
        kliknutiNakup(karta8, 8);
    }

    @FXML
    void poleKarty9Klik(MouseEvent event) {
        kliknutiNakup(karta9, 9);
    }

    @FXML
    void poleSlechtic1Klik(MouseEvent event) {
        System.out.println("nákup slechtice 1");
        nakupSlechtice(slechtic1, poleSlechtic1);
    }

    @FXML
    void poleSlechtic2Klik(MouseEvent event) {
        System.out.println("nákup slechtice 2");
        nakupSlechtice(slechtic2, poleSlechtic2);
    }

    @FXML
    void poleSlechtic3Klik(MouseEvent event) {
        System.out.println("nákup slechtice 3");
        nakupSlechtice(slechtic3, poleSlechtic3);
    }

    @FXML
    void poleKamenBilKlik(MouseEvent event) {
        System.out.println("klik");
        if (hrac1.jeNaTahu == true) {
            System.out.println("h1 pred nakupem");
            nakupKamenu(hrac1, "bila");
            System.out.println("h1 po nakupu");
        } else if (hrac2.jeNaTahu == true) {
            System.out.println("h2 pred nakupem");
            nakupKamenu(hrac2, "bila");
            System.out.println("h2 po nakupu");

        }
    }

    @FXML
    void poleKamenModKlik(MouseEvent event) {
        System.out.println("klik");
        if (hrac1.jeNaTahu == true) {
            System.out.println("h1 pred nakupem");
            nakupKamenu(hrac1, "modra");
            System.out.println("h1 po nakupu");
        } else if (hrac2.jeNaTahu == true) {
            System.out.println("h2 pred nakupem");
            nakupKamenu(hrac2, "modra");
            System.out.println("h2 po nakupu");
        }
    }

    @FXML
    void poleKamenCerKlik(MouseEvent event) {
        System.out.println("klik");
        if (hrac1.jeNaTahu == true) {
            System.out.println("h1 pred nakupem");
            nakupKamenu(hrac1, "cervena");
            System.out.println("h1 po nakupu");
        } else if (hrac2.jeNaTahu == true) {
            System.out.println("h2 pred nakupem");
            nakupKamenu(hrac2, "cervena");
            System.out.println("h2 po nakupu");
        }
    }

    @FXML
    void poleKamenZelKlik(MouseEvent event) {
        System.out.println("klik");
        if (hrac1.jeNaTahu == true) {
            System.out.println("h1 pred nakupem");
            nakupKamenu(hrac1, "zelena");
            System.out.println("h1 po nakupu");
        } else if (hrac2.jeNaTahu == true) {
            System.out.println("h2 pred nakupem");
            nakupKamenu(hrac2, "zelena");
            System.out.println("h2 po nakupu");
        }
    }

    @FXML
    void poleKamenHneKlik(MouseEvent event) {
        System.out.println("klik");
        if (hrac1.jeNaTahu == true) {
            System.out.println("h1 pred nakupem");
            nakupKamenu(hrac1, "hneda");
            System.out.println("h1 po nakupu");
        } else if (hrac2.jeNaTahu == true) {
            System.out.println("h2 pred nakupem");
            nakupKamenu(hrac2, "hneda");
            System.out.println("h2 po nakupu");
        }
    }

    @FXML
    void ukoncitTah() {
        if (hrac1.jeNaTahu == true) {
            hrac2JeNaTahu();
        } else if (hrac2.jeNaTahu == true) {
            hrac1JeNaTahu();
        }
    }

    void nakupKamenu(Hrac hrac, String barva) {
        if (hrac.jeNaTahu == true) {
            if (hrac.tretiVzatyKamen == null) {
                if ((hrac.prvniVzatyKamen != hrac.druhyVzatyKamen) || (hrac.prvniVzatyKamen == null && hrac.druhyVzatyKamen == null)) {//nelze použit equals kvůli null
                    switch (barva) {
                        case ("cervena"):
                            if (hrac.prvniVzatyKamen == null) {
                                hrac.pocetCerKamenu = hrac.pocetCerKamenu + 1;
                                bankCentralni.pocetCerKamenu = bankCentralni.pocetCerKamenu - 1;
                                //System.out.println("vzal sis cervena");
                                hrac.prvniVzatyKamen = "cervena";
                                System.out.println("pozice 1");

                            } else if (hrac.druhyVzatyKamen == null) {
                                hrac.pocetCerKamenu = hrac.pocetCerKamenu + 1;
                                bankCentralni.pocetCerKamenu = bankCentralni.pocetCerKamenu - 1;
                                //System.out.println("vzal sis cervena");
                                hrac.druhyVzatyKamen = "cervena";
                                System.out.println("pozice 2");

                            } else if ((hrac.tretiVzatyKamen == null) && (!"cervena".equals(hrac.prvniVzatyKamen) || !"cervena".equals(hrac.druhyVzatyKamen))) {
                                hrac.pocetCerKamenu = hrac.pocetCerKamenu + 1;
                                bankCentralni.pocetCerKamenu = bankCentralni.pocetCerKamenu - 1;
                                //System.out.println("vzal sis cervena");
                                hrac.tretiVzatyKamen = "cervena";
                                System.out.println("pozice 3");
                            }

                            break;
                        case ("zelena"):
                            if (hrac.prvniVzatyKamen == null) {
                                hrac.pocetZelKamenu = hrac.pocetZelKamenu + 1;
                                bankCentralni.pocetZelKamenu = bankCentralni.pocetZelKamenu - 1;
                                // System.out.println("vzal sis zelena");
                                hrac.prvniVzatyKamen = "zelena";
                                System.out.println("pozice 1");

                            } else if (hrac.druhyVzatyKamen == null) {
                                hrac.pocetZelKamenu = hrac.pocetZelKamenu + 1;
                                bankCentralni.pocetZelKamenu = bankCentralni.pocetZelKamenu - 1;
                                //System.out.println("vzal sis zelena");
                                hrac.druhyVzatyKamen = "zelena";
                                System.out.println("pozice 2");

                            } else if ((hrac.tretiVzatyKamen == null) && (!"zelena".equals(hrac.prvniVzatyKamen) || !"zelena".equals(hrac.druhyVzatyKamen))) {
                                hrac.pocetZelKamenu = hrac.pocetZelKamenu + 1;
                                bankCentralni.pocetZelKamenu = bankCentralni.pocetZelKamenu - 1;
                                //System.out.println("vzal sis zelena");
                                hrac.tretiVzatyKamen = "zelena";
                                System.out.println("pozice 3");
                            }
                            break;
                        case ("bila"):
                            if (hrac.prvniVzatyKamen == null) {
                                hrac.pocetBilKamenu = hrac.pocetBilKamenu + 1;
                                bankCentralni.pocetBilKamenu = bankCentralni.pocetBilKamenu - 1;
                                // System.out.println("vzal sis bila");
                                hrac.prvniVzatyKamen = "bila";
                                System.out.println("pozice 1");

                            } else if (hrac.druhyVzatyKamen == null) {
                                hrac.pocetBilKamenu = hrac.pocetBilKamenu + 1;
                                bankCentralni.pocetBilKamenu = bankCentralni.pocetBilKamenu - 1;
                                //System.out.println("vzal sis bila");
                                hrac.druhyVzatyKamen = "bila";
                                System.out.println("pozice 1");

                            } else if ((hrac.tretiVzatyKamen == null) && (!"bila".equals(hrac.prvniVzatyKamen) || !"bila".equals(hrac.druhyVzatyKamen))) {
                                hrac.pocetBilKamenu = hrac.pocetBilKamenu + 1;
                                bankCentralni.pocetBilKamenu = bankCentralni.pocetBilKamenu - 1;
                                //System.out.println("vzal sis bila");
                                hrac.tretiVzatyKamen = "bila";
                                System.out.println("pozice 1");
                            }

                            break;

                        case ("hneda"):
                            if (hrac.prvniVzatyKamen == null) {
                                hrac.pocetHneKamenu = hrac.pocetHneKamenu + 1;
                                bankCentralni.pocetHneKamenu = bankCentralni.pocetHneKamenu - 1;
                                //System.out.println("vzal sis hneda");
                                hrac.prvniVzatyKamen = "hneda";
                                System.out.println("pozice 1");

                            } else if (hrac.druhyVzatyKamen == null) {
                                hrac.pocetHneKamenu = hrac.pocetHneKamenu + 1;
                                bankCentralni.pocetHneKamenu = bankCentralni.pocetHneKamenu - 1;
                                //System.out.println("vzal sis hneda");
                                hrac.druhyVzatyKamen = "hneda";
                                System.out.println("pozice 2");

                            } else if ((hrac.tretiVzatyKamen == null) && (!"hneda".equals(hrac.prvniVzatyKamen) || !"hneda".equals(hrac.druhyVzatyKamen))) {
                                hrac.pocetHneKamenu = hrac.pocetHneKamenu + 1;
                                bankCentralni.pocetHneKamenu = bankCentralni.pocetHneKamenu - 1;
                                //System.out.println("vzal sis hneda");
                                hrac.tretiVzatyKamen = "hneda";
                                System.out.println("pozice ");
                            }
                            break;
                        case ("modra"):
                            if (hrac.prvniVzatyKamen == null) {
                                hrac.pocetModKamenu = hrac.pocetModKamenu + 1;
                                bankCentralni.pocetModKamenu = bankCentralni.pocetModKamenu - 1;
                                //System.out.println("vzal sis hneda");
                                hrac.prvniVzatyKamen = "modra";
                                System.out.println("pozice 1");

                            } else if (hrac.druhyVzatyKamen == null) {
                                hrac.pocetModKamenu = hrac.pocetModKamenu + 1;
                                bankCentralni.pocetModKamenu = bankCentralni.pocetModKamenu - 1;
                                //System.out.println("vzal sis hneda");
                                hrac.prvniVzatyKamen = "modra";
                                System.out.println("pozice 2");

                            } else if ((hrac.tretiVzatyKamen == null) && (!"modra".equals(hrac.prvniVzatyKamen) || !"modra".equals(hrac.druhyVzatyKamen))) {
                                hrac.pocetModKamenu = hrac.pocetModKamenu + 1;
                                bankCentralni.pocetModKamenu = bankCentralni.pocetModKamenu - 1;
                                //System.out.println("vzal sis hneda");
                                hrac.prvniVzatyKamen = "modra";
                                System.out.println("pozice 3");
                            }
                            break;

                    }
                } else {
                    System.out.println("můžeš vzít jen 2 kameny stejné barvy");
                }
            } else {
                System.out.println("už máš 3 kameny");
            }
        } else {
            for (int i = 0; i < 20; i++) {
                System.out.println("jak?------------------------------------------");
            }

        }
        aktualizaceKamenu();
        /*
        System.out.println(hrac.pocetBilKamenu + "bil");
        System.out.println(hrac.pocetHneKamenu + "hne");
        System.out.println(hrac.pocetCerKamenu + "cer");
        System.out.println(hrac.pocetZelKamenu + "Zel");
        System.out.println(hrac.pocetModKamenu + "mod");
         */
        
        System.out.println(hrac.prvniVzatyKamen);
        System.out.println(hrac.druhyVzatyKamen);
        System.out.println(hrac.tretiVzatyKamen);
    }

    void hrac1JeNaTahu() {
        aktualizaceBodu();
        hrac1.jeNaTahu = true;
        hrac2.jeNaTahu = false;
        textPoleHrac1.setFill(Color.GREEN);
        textPoleHrac2.setFill(Color.RED);
        System.out.println("hrac 1 je na tahu");
        hrac1.prvniVzatyKamen = null;
        hrac1.druhyVzatyKamen = null;
        hrac1.tretiVzatyKamen = null;
        hrac2.prvniVzatyKamen = null;
        hrac2.druhyVzatyKamen = null;
        hrac2.tretiVzatyKamen = null;
    }

    void hrac2JeNaTahu() {
        aktualizaceBodu();
        hrac1.jeNaTahu = false;
        hrac2.jeNaTahu = true;
        textPoleHrac1.setFill(Color.RED);
        textPoleHrac2.setFill(Color.GREEN);
        System.out.println("hrac 2 je na tahu");
        hrac1.prvniVzatyKamen = null;
        hrac1.druhyVzatyKamen = null;
        hrac1.tretiVzatyKamen = null;
        hrac2.prvniVzatyKamen = null;
        hrac2.druhyVzatyKamen = null;
        hrac2.tretiVzatyKamen = null;
    }

    void nakupSlechtice(Slechtic slechtic, ImageView puvodniLokaceSlechtice) { // node je to pole (poleSlechtic3)
        System.out.println("v metodě nakupSlechtice");
        if (hrac1.jeNaTahu == true && hrac1.maSlechtice == false) {

            System.out.println("hrac 1");
            if (hrac1.pocetBilKaret >= slechtic.cenaB
                    && hrac1.pocetCerKaret >= slechtic.cenaC
                    && hrac1.pocetHneKaret >= slechtic.cenaH
                    && hrac1.pocetModKaret >= slechtic.cenaM
                    && hrac1.pocetZelKaret >= slechtic.cenaZ) {
                //ZVÝRAZNIT ŠLECHTICE

                hrac1.pocetBodu = hrac1.pocetBodu + slechtic.pocetBodu;

                h1Slechtic.setImage(new Image(slechtic.obrazek));

                hrac1.maSlechtice = true;
                hrac1.muzeSlechtice = false;
                puvodniLokaceSlechtice.setImage(null);
                puvodniLokaceSlechtice.setMouseTransparent(true);

                slechtic.zabranej = true;

                System.out.println("hráč1 koupil šlechtice");
                hrac2JeNaTahu();

            } else {
                System.out.println("nemás dost karet nebo už máš šlechtice");
            }

        } else if (hrac2.jeNaTahu == true && hrac2.maSlechtice == false) {
            System.out.println("hrac 2");
            if (hrac2.pocetBilKaret >= slechtic.cenaB
                    && hrac2.pocetCerKaret >= slechtic.cenaC
                    && hrac2.pocetHneKaret >= slechtic.cenaH
                    && hrac2.pocetModKaret >= slechtic.cenaM
                    && hrac2.pocetZelKaret >= slechtic.cenaZ) {
                //zvýraznit šlechtice

                hrac2.pocetBodu = hrac2.pocetBodu + slechtic.pocetBodu;
                h2Slechtic.setImage(new Image(slechtic.obrazek));
                hrac2.maSlechtice = true;
                hrac2.muzeSlechtice = false;

                puvodniLokaceSlechtice.setImage(null);
                puvodniLokaceSlechtice.setMouseTransparent(true);

                slechtic.zabranej = true;

                System.out.println("hráč2 koupil šlechtice");
                hrac1JeNaTahu();

            } else {
                System.out.println("nemás dost karet nebo už máš šlechtice");
            }
        } else {
            System.out.println("neprošlo podmínkama");
        }
        System.out.println("konec ifu");
    }

    void kliknutiNakup(Karta karta, int cisloKarty) {
        if (hrac1.muzeSlechtice == false && hrac2.muzeSlechtice == false) {
            System.out.println("pred nakupem");

            nakupKarty(karta);

            System.out.println("po nakupu");

            nactiKartu(cisloKarty);
        } else {
            if (hrac1.jeNaTahu == true && hrac1.maSlechtice == false) {
                System.out.println("muzes vzit slechtice");
            } else if (hrac2.jeNaTahu == true && hrac2.maSlechtice == false) {
                System.out.println("muzes vzit slechtice");
            }

        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        hrac1 = new Hrac(1, true);
        hrac2 = new Hrac(1, false);

        bankCentralni = new BankKamenu(4, 4, 4, 4, 4, 4);

        textPoleHrac1.setFill(Color.GREEN);
        textPoleHrac2.setFill(Color.RED);
        g.generuj();
        f.generujSlechtice();
        kresli();

    }

    public void nakupKarty(Karta karta) {
        File file;
        if (hrac1.jeNaTahu == true) {
            System.out.println("hrac 1 na tahu");
            if ((karta.cenaB == 0 || hrac1.pocetBilKamenu + hrac1.pocetBilKaret >= karta.cenaB)
                    && (karta.cenaC == 0 || hrac1.pocetCerKamenu + hrac1.pocetCerKaret >= karta.cenaC)
                    && (karta.cenaH == 0 || hrac1.pocetHneKamenu + hrac1.pocetHneKaret >= karta.cenaH)
                    && (karta.cenaM == 0 || hrac1.pocetModKamenu + hrac1.pocetModKaret >= karta.cenaM)
                    && (karta.cenaZ == 0 || hrac1.pocetZelKamenu + hrac1.pocetZelKaret >= karta.cenaZ)) {
                int a = 0;
                int b = 0;
                int c = 0;
                int d = 0;
                int e = 0;

                a = karta.cenaB - hrac1.pocetBilKaret;
                b = karta.cenaC - hrac1.pocetCerKaret;
                c = karta.cenaH - hrac1.pocetHneKaret;
                d = karta.cenaM - hrac1.pocetModKaret;
                e = karta.cenaZ - hrac1.pocetZelKaret;

                if (a >= 0) {
                    hrac1.pocetBilKamenu = hrac1.pocetBilKamenu - a;
                    bankCentralni.pocetBilKamenu = bankCentralni.pocetBilKamenu + a;
                }

                if (b >= 0) {
                    hrac1.pocetCerKamenu = hrac1.pocetCerKamenu - b;
                    bankCentralni.pocetCerKamenu = bankCentralni.pocetCerKamenu + b;
                }

                if (c >= 0) {
                    hrac1.pocetHneKamenu = hrac1.pocetHneKamenu - c;
                    bankCentralni.pocetHneKamenu = bankCentralni.pocetHneKamenu + c;
                }

                if (d >= 0) {
                    hrac1.pocetModKamenu = hrac1.pocetModKamenu - d;
                    bankCentralni.pocetModKamenu = bankCentralni.pocetModKamenu + d;
                }

                if (e >= 0) {
                    hrac1.pocetZelKamenu = hrac1.pocetZelKamenu - e;
                    bankCentralni.pocetZelKamenu = bankCentralni.pocetZelKamenu + e;
                }

                aktualizaceKamenu();
                aktualizaceBodu();

                System.out.println("má dost kamenů");

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
                }//---------------------------------------------------------------------------konec cashe
                if (((hrac1.pocetBilKaret >= slechtic1.cenaB
                        && hrac1.pocetCerKaret >= slechtic1.cenaC
                        && hrac1.pocetHneKaret >= slechtic1.cenaH
                        && hrac1.pocetModKaret >= slechtic1.cenaM
                        && hrac1.pocetZelKaret >= slechtic1.cenaZ)
                        || (hrac1.pocetBilKaret >= slechtic3.cenaB
                        && hrac1.pocetCerKaret >= slechtic3.cenaC
                        && hrac1.pocetHneKaret >= slechtic3.cenaH
                        && hrac1.pocetModKaret >= slechtic3.cenaM
                        && hrac1.pocetZelKaret >= slechtic3.cenaZ)
                        || (hrac1.pocetBilKaret >= slechtic2.cenaB
                        && hrac1.pocetCerKaret >= slechtic2.cenaC
                        && hrac1.pocetHneKaret >= slechtic2.cenaH
                        && hrac1.pocetModKaret >= slechtic2.cenaM
                        && hrac1.pocetZelKaret >= slechtic2.cenaZ))
                        && ((slechtic1.zabranej == false) || (slechtic2.zabranej == false) || (slechtic3.zabranej == false))
                        && (hrac1.maSlechtice == false)) {

                    System.out.println("máš na nějakého šlechtice");

                    if (hrac1.pocetBilKaret >= slechtic1.cenaB
                            && hrac1.pocetCerKaret >= slechtic1.cenaC
                            && hrac1.pocetHneKaret >= slechtic1.cenaH
                            && hrac1.pocetModKaret >= slechtic1.cenaM
                            && hrac1.pocetZelKaret >= slechtic1.cenaZ
                            && slechtic1.zabranej == false) {
                        System.out.println("můžeš vzít šlechtice 1");
                        animaceDotekuKarty(poleSlechtic1);
                        hrac1.muzeSlechtice = true;
                    }
                    if (hrac1.pocetBilKaret >= slechtic3.cenaB
                            && hrac1.pocetCerKaret >= slechtic3.cenaC
                            && hrac1.pocetHneKaret >= slechtic3.cenaH
                            && hrac1.pocetModKaret >= slechtic3.cenaM
                            && hrac1.pocetZelKaret >= slechtic3.cenaZ
                            && slechtic3.zabranej == false) {
                        System.out.println("můžeš vzít šlechtice 3");
                        animaceDotekuKarty(poleSlechtic3);
                        hrac1.muzeSlechtice = true;

                    }

                    if (hrac1.pocetBilKaret >= slechtic2.cenaB
                            && hrac1.pocetCerKaret >= slechtic2.cenaC
                            && hrac1.pocetHneKaret >= slechtic2.cenaH
                            && hrac1.pocetModKaret >= slechtic2.cenaM
                            && hrac1.pocetZelKaret >= slechtic2.cenaZ
                            && slechtic2.zabranej == false) {
                        System.out.println("můžeš vzít šlechtice 2");
                        animaceDotekuKarty(poleSlechtic2);
                        hrac1.muzeSlechtice = true;
                    }

                } else {// nemá na šlechtice
                    //System.out.println("hráč2 je na tahu");
                    hrac2JeNaTahu();
                }

            } else {
                System.out.println("nemá dost penez");
            }

        } else if (hrac2.jeNaTahu == true) {
            System.out.println("hrac 2 na tahu");

            if ((karta.cenaB == 0 || hrac2.pocetBilKamenu + hrac2.pocetBilKaret >= karta.cenaB)
                    && (karta.cenaC == 0 || hrac2.pocetCerKamenu + hrac2.pocetCerKaret >= karta.cenaC)
                    && (karta.cenaH == 0 || hrac2.pocetHneKamenu + hrac2.pocetHneKaret >= karta.cenaH)
                    && (karta.cenaM == 0 || hrac2.pocetModKamenu + hrac2.pocetModKaret >= karta.cenaM)
                    && (karta.cenaZ == 0 || hrac2.pocetZelKamenu + hrac2.pocetZelKaret >= karta.cenaZ)) {

                int a = 0;
                int b = 0;
                int c = 0;
                int d = 0;
                int e = 0;

                a = karta.cenaB - hrac2.pocetBilKaret;
                b = karta.cenaC - hrac2.pocetCerKaret;
                c = karta.cenaH - hrac2.pocetHneKaret;
                d = karta.cenaM - hrac2.pocetModKaret;
                e = karta.cenaZ - hrac2.pocetZelKaret;

                if (a >= 0) {
                    hrac2.pocetBilKamenu = hrac2.pocetBilKamenu - a;
                    bankCentralni.pocetBilKamenu = bankCentralni.pocetBilKamenu + a;
                }

                if (b >= 0) {
                    hrac2.pocetCerKamenu = hrac2.pocetCerKamenu - b;
                    bankCentralni.pocetCerKamenu = bankCentralni.pocetCerKamenu + b;
                }

                if (c >= 0) {
                    hrac2.pocetHneKamenu = hrac2.pocetHneKamenu - c;
                    bankCentralni.pocetHneKamenu = bankCentralni.pocetHneKamenu + c;
                }

                if (d >= 0) {
                    hrac2.pocetModKamenu = hrac2.pocetModKamenu - d;
                    bankCentralni.pocetModKamenu = bankCentralni.pocetModKamenu + d;
                }

                if (e >= 0) {
                    hrac2.pocetZelKamenu = hrac2.pocetZelKamenu - e;
                    bankCentralni.pocetZelKamenu = bankCentralni.pocetZelKamenu + e;
                }

                aktualizaceKamenu();
                aktualizaceBodu();
                System.out.println("má dost kamenů");

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

                if (((hrac2.pocetBilKaret >= slechtic1.cenaB
                        && hrac2.pocetCerKaret >= slechtic1.cenaC
                        && hrac2.pocetHneKaret >= slechtic1.cenaH
                        && hrac2.pocetModKaret >= slechtic1.cenaM
                        && hrac2.pocetZelKaret >= slechtic1.cenaZ)
                        || (hrac2.pocetBilKaret >= slechtic3.cenaB
                        && hrac2.pocetCerKaret >= slechtic3.cenaC
                        && hrac2.pocetHneKaret >= slechtic3.cenaH
                        && hrac2.pocetModKaret >= slechtic3.cenaM
                        && hrac2.pocetZelKaret >= slechtic3.cenaZ)
                        || (hrac2.pocetBilKaret >= slechtic2.cenaB
                        && hrac2.pocetCerKaret >= slechtic2.cenaC
                        && hrac2.pocetHneKaret >= slechtic2.cenaH
                        && hrac2.pocetModKaret >= slechtic2.cenaM
                        && hrac2.pocetZelKaret >= slechtic2.cenaZ))
                        && ((slechtic1.zabranej == false) || (slechtic2.zabranej == false) || (slechtic3.zabranej == false))
                        && (hrac2.maSlechtice == false)) {

                    System.out.println("máš na nějakého šlechtice");

                    if ((hrac2.pocetBilKaret >= slechtic1.cenaB
                            && hrac2.pocetCerKaret >= slechtic1.cenaC
                            && hrac2.pocetHneKaret >= slechtic1.cenaH
                            && hrac2.pocetModKaret >= slechtic1.cenaM
                            && hrac2.pocetZelKaret >= slechtic1.cenaZ)
                            && (slechtic1.zabranej == false)) {
                        System.out.println("můžeš vzít šlechtice 1");
                        animaceDotekuKarty(poleSlechtic1);
                        hrac2.muzeSlechtice = true;;
                    }
                    if ((hrac2.pocetBilKaret >= slechtic3.cenaB
                            && hrac2.pocetCerKaret >= slechtic3.cenaC
                            && hrac2.pocetHneKaret >= slechtic3.cenaH
                            && hrac2.pocetModKaret >= slechtic3.cenaM
                            && hrac2.pocetZelKaret >= slechtic3.cenaZ)
                            && (slechtic3.zabranej == false)) {
                        System.out.println("můžeš vzít šlechtice 3");
                        animaceDotekuKarty(poleSlechtic3);
                        hrac2.muzeSlechtice = true;
                    }

                    if ((hrac2.pocetBilKaret >= slechtic2.cenaB
                            && hrac2.pocetCerKaret >= slechtic2.cenaC
                            && hrac2.pocetHneKaret >= slechtic2.cenaH
                            && hrac2.pocetModKaret >= slechtic2.cenaM
                            && hrac2.pocetZelKaret >= slechtic2.cenaZ)
                            && (slechtic2.zabranej == false)) {
                        System.out.println("můžeš vzít šlechtice 2");
                        animaceDotekuKarty(poleSlechtic2);
                        hrac2.muzeSlechtice = true;
                    }

                } else {
                    //System.out.println("hráč1 je na tahu");
                    hrac1JeNaTahu();
                }

            } else {
                System.out.println("nemá dost penez");
            }

        }

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
        animaceDotekuKarty(poleKarty7);
    }

    @FXML
    void poleKarty7Vystup(MouseEvent event) {
        animaceOupusteniKarty(poleKarty7);

    }

    @FXML
    void poleKarty8Vstup(MouseEvent event) {
        animaceDotekuKarty(poleKarty8);
    }

    @FXML
    void poleKarty8Vystup(MouseEvent event) {
        animaceOupusteniKarty(poleKarty8);

    }

    @FXML
    void poleKarty9Vstup(MouseEvent event) {
        animaceDotekuKarty(poleKarty9);
    }

    @FXML
    void poleKarty9Vystup(MouseEvent event) {
        animaceOupusteniKarty(poleKarty9);

    }

    @FXML
    void slechtic1Vstup(MouseEvent event) {
        animaceDotekuKarty(poleSlechtic1);
    }

    @FXML
    void slechtic1Vystup(MouseEvent event) {
        animaceOupusteniKarty(poleSlechtic1);

    }

    @FXML
    void slechtic2Vstup(MouseEvent event) {
        animaceDotekuKarty(poleSlechtic2);
    }

    @FXML
    void slechtic2Vystup(MouseEvent event) {
        animaceOupusteniKarty(poleSlechtic2);

    }

    @FXML
    void slechtic3Vstup(MouseEvent event) {
        animaceDotekuKarty(poleSlechtic3);
    }

    @FXML
    void slechtic3Vystup(MouseEvent event) {
        animaceOupusteniKarty(poleSlechtic3);

    }

    @FXML
    void h1SlechticVstup(MouseEvent event) {
        animaceDotekuKarty(h1Slechtic);

    }

    @FXML
    void h1SlechticVystup(MouseEvent event) {
        animaceOupusteniKarty(h1Slechtic);

    }

    @FXML
    void h2SlechticVstup(MouseEvent event) {
        animaceDotekuKarty(h2Slechtic);

    }

    @FXML
    void h2SlechticVystup(MouseEvent event) {
        animaceOupusteniKarty(h2Slechtic);

    }

}