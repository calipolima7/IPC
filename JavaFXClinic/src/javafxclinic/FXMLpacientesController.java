
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import model.Patient;

/**
 * FXML Controller class
 *
 * @author calip
 */
public class FXMLpacientesController implements Initializable {

    private ObservableList<Patient> pacientes;
    private Stage primaryStage;
    private Scene primaryScene;
    
    private Button añadirPac;
    @FXML
    private Button botonEliminar;
    @FXML
    private Button botonMofdificar;
    @FXML
    private Button botonDetalles;
    @FXML
    private TableColumn<?, ?> columnaNombre;
    @FXML
    private TableColumn<?, ?> columnaApellido;
    @FXML
    private TableView<?> tablaPacientes;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        columnaNombre.setCellValueFactory(new PropertyValueFactory("name"));
        columnaApellido.setCellValueFactory(new PropertyValueFactory("surname"));
        
    }    

    @FXML
    private void botonAnadir(ActionEvent event) throws IOException {
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("FXMLDatosPac.fxml"));
            Parent root = (Parent) myLoader.load();
            FXMLDatosPacController detailsController;          
        detailsController = myLoader.<FXMLDatosPacController>getController();
        Helper.abrirVentana(root, "Datos del Paciente", 500, 600); 
        
    }
    public void initData(ObservableList pacientes){
        this.pacientes = pacientes;
        tablaPacientes.setItems(pacientes);
    }
    
}
