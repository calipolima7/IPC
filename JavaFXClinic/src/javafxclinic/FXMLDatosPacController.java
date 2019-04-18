
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
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import model.Patient;
/**
/**
 * FXML Controller class
 *
 * @author calip
 */
public class FXMLDatosPacController implements Initializable {

    private ObservableList<Patient> pacientes;
    private Stage primaryStage;
    private Scene primaryScene;
    
    @FXML
    private TextField dniPaciente;
    @FXML
    private TextField nombrePaciente;
    @FXML
    private TextField apellidoPaciente;
    @FXML
    private TextField telefonoPaciente;
    @FXML
    private ImageView imagenPaciente;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void botonCancelar(ActionEvent event) throws IOException {
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("FXMLpacientes.fxml"));
            Parent root = (Parent) myLoader.load();
            FXMLpacientesController detailsController;          
        detailsController = myLoader.<FXMLpacientesController>getController();
        Helper.abrirVentana(root, "Pacientes", 500, 600);
    }

    @FXML
    private void botonAceptar(ActionEvent event) {
        String dni = dniPaciente.getText();
        String nombre = nombrePaciente.getText();
        String apellidos = apellidoPaciente.getText();
        String telefono = telefonoPaciente.getText();
        Patient paciente = new Patient(dni, nombre, apellidos, telefono, null); 
        pacientes.add(paciente);
    }
    
    public void initData(ObservableList pacientes){
        this.pacientes = pacientes;
    }
}
