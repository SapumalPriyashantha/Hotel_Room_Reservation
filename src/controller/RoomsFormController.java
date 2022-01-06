package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class RoomsFormController {
    public AnchorPane pic1;
    public void openAboutroom(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AboutRoomForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) pic1.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void openMenu(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/MenuForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) pic1.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
