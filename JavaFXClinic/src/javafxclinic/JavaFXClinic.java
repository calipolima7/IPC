/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxclinic;

import DBAccess.ClinicDBAccess;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author calip
 */
public class JavaFXClinic extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        ClinicDBAccess cdba = ClinicDBAccess.getSingletonClinicDBAccess();
        cdba.setClinicName("IPC Medical Services Clinic");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLelegir.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        FXMLelegirController control = (FXMLelegirController) loader.getController();
        control.initData(cdba);
        stage.setScene(scene);
        stage.show();
        stage.setOnCloseRequest((WindowEvent event) ->{
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle(cdba.getClinicName());
            alert.setHeaderText("Saving data in DB");
            alert.setContentText("The application is saving the changes in the data into the database. This actioncan expend some minutes.");
            alert.show();
            cdba.saveDB();
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
