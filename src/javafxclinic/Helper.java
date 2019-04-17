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
 *
 * @author calip
 */
public class Helper {
    
    
    public static void abrirVentana(Parent root, String titulo, int width, int height){
            Scene scene = new Scene(root, width, height);
            Stage stage = new Stage(); stage.setScene(scene);
            stage.setTitle(titulo); 
            stage.initModality(Modality.APPLICATION_MODAL); 
            stage.showAndWait();
    }
}
