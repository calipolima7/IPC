/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxclinic;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Parent;

/**
 * FXML Controller class
 *
 * @author calip
 */
public class FXMLelegirController implements Initializable {

    private String titulo;
    private int width;
    private int height;
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     * 
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void elegirPac(ActionEvent event) throws IOException {
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("FXMLpacientes.fxml"));
            Parent root = (Parent) myLoader.load();
            FXMLpacientesController detailsController;          
        detailsController = myLoader.<FXMLpacientesController>getController();
        Helper.abrirVentana(root, "FXMLpacientes", 500, 600);
            
            
    }

    @FXML
    private void elegirMed(ActionEvent event) {
    }

    @FXML
    private void elegirCit(ActionEvent event) {
    }
    
}
