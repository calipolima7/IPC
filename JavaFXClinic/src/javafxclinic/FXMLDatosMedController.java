
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
public class FXMLDatosMedController implements Initializable {

    @FXML
    private TextField dniMed;
    @FXML
    private TextField nombreMed;
    @FXML
    private TextField apellidoMed;
    @FXML
    private TextField telefonoMed;
    @FXML
    private ImageView imagenMed;
    @FXML
    private TextField diaConsulta;
    @FXML
    private TextField inicConsulta;
    @FXML
    private TextField finConsulta;
    @FXML
    private TextField salaConsulta;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
