
package javafxclinic;

import DBAccess.ClinicDBAccess;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
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
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import model.Patient;

/**
 * FXML Controller class
 *
 * @author calip
 */
public class FXMLelegirController implements Initializable {

    private ObservableList<Patient> pacientes;
    private Stage primaryStage;
    private Scene primaryScene;
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
        detailsController.initData(pacientes);
        Helper.abrirVentana(root, "Pacientes", 500, 600);       
    }

    @FXML
    private void elegirMed(ActionEvent event) throws IOException {
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("FXMLmedicos.fxml"));
            Parent root = (Parent) myLoader.load();
            FXMLmedicosController detailsController;          
        detailsController = myLoader.<FXMLmedicosController>getController();
        Helper.abrirVentana(root, "Medicos", 500, 600);
    }

    @FXML
    private void elegirCit(ActionEvent event) throws IOException {
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("FXMLcitas.fxml"));
            Parent root = (Parent) myLoader.load();
            FXMLcitasController detailsController;          
        detailsController = myLoader.<FXMLcitasController>getController();
        Helper.abrirVentana(root, "Citas", 500, 600);
    }
    
    public void initData(ClinicDBAccess acceso){
        pacientes = FXCollections.observableList(acceso.getPatients());
        
    }
}