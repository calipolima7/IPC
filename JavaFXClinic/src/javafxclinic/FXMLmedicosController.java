
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
/**
 * FXML Controller class
 *
 * @author calip
 */
public class FXMLmedicosController implements Initializable {

    private Stage primaryStage;
    private Scene primaryScene;
    
    @FXML
    private Button eliminarMed;
    @FXML
    private Button detallesMed;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void initVentana(Stage stage){
        primaryStage = stage;
        primaryScene = primaryStage.getScene();
    }

    @FXML
    private void anadirMed(ActionEvent event) {
        
    }

    @FXML
    private void eliminarMed(ActionEvent event) {
    }

    @FXML
    private void detallesMed(ActionEvent event) {
    }
}
