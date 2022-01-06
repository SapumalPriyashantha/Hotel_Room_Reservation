package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class MenuFormController {
    public AnchorPane pic6;

    public ComboBox<String> cmbRoom;
    public TextField txt1;
    public ComboBox<String> cmbMaintenance;
    public TextField txt2;


    public void initialize() {
        cmbRoom.getItems().addAll(
                "Single",
                "Double",
                "Triple",
                "Quad"
        );
        cmbMaintenance.getItems().addAll(
                "Single",
                 "Double",
                 "Triple",
                 "Quad"


        );
        cmbRoom.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {

        });
        cmbRoom.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(oldValue);
            System.out.println(newValue);
            txt1.setText(newValue);
        });

        cmbMaintenance.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {

        });
        cmbMaintenance.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(oldValue);
            System.out.println(newValue);
            txt2.setText(newValue);
        });


    }
    public void openRoom(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/RoomsForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) pic6.getScene().getWindow();
        window.setScene(new Scene(load));
    }

}
