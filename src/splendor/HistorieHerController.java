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
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author Adam
 */
public class HistorieHerController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private Label label3;

    @FXML
    private Label label4;

    @FXML
    private Label label5;

    @FXML
    private Label label6;

    @FXML
    private Label label7;

    @FXML
    private Label label8;

    @FXML
    private Label label9;

    @FXML
    private Label label10;

    UkladacVysledku u;

    VysledkyHry[] poleVysledku = new VysledkyHry[10];

    public void nacistUlozeneHry() throws IOException, FileNotFoundException, ClassNotFoundException {
        poleVysledku = u.nactiVysledky();
    }

    public void vykresliHodnoty() {
        if (poleVysledku[1].toString() != null) {
            label1.setText(poleVysledku[1].toString());
        } else {
            label1.setText("Prázdný slot");
        }

        if (poleVysledku[2].toString() != null) {
            label2.setText(poleVysledku[2].toString());
        } else {
            label2.setText("Prázdný slot");
        }

        if (poleVysledku[3].toString() != null) {
            label3.setText(poleVysledku[3].toString());
        } else {
            label3.setText("Prázdný slot");
        }

        if (poleVysledku[4].toString() != null) {
            label4.setText(poleVysledku[4].toString());
        } else {
            label4.setText("Prázdný slot");
        }

        if (poleVysledku[5].toString() != null) {
            label5.setText(poleVysledku[5].toString());
        } else {
            label5.setText("Prázdný slot");
        }

        if (poleVysledku[6].toString() != null) {
            label6.setText(poleVysledku[6].toString());
        } else {
            label6.setText("Prázdný slot");
        }

        if (poleVysledku[7].toString() != null) {
            label7.setText(poleVysledku[7].toString());
        } else {
            label7.setText("Prázdný slot");
        }

        if (poleVysledku[8].toString() != null) {
            label8.setText(poleVysledku[8].toString());
        } else {
            label8.setText("Prázdný slot");
        }

        if (poleVysledku[9].toString() != null) {
            label9.setText(poleVysledku[9].toString());
        } else {
            label9.setText("Prázdný slot");
        }

        if (poleVysledku[10].toString() != null) {
            label10.setText(poleVysledku[10].toString());
        } else {
            label10.setText("Prázdný slot");
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        u = new UkladacVysledku();
        try {
            nacistUlozeneHry();
        } catch (IOException ex) {
            Logger.getLogger(HistorieHerController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HistorieHerController.class.getName()).log(Level.SEVERE, null, ex);
        }
        vykresliHodnoty();

    }

}
