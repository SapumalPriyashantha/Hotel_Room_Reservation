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

public class ViewMonthlyFormController {
    public AnchorPane pic1;

    public ComboBox<String> cmbWeek;
    public TextField txt2;

    public void initialize() {
        cmbWeek.getItems().addAll(
                "1st Week",
                "2nd Week",
                "3rd Week",
                "4th Week"
        );
        cmbWeek.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {

        });
        cmbWeek.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(oldValue);
            System.out.println(newValue);
            txt2.setText(newValue);
        });
    }

    public void backAdminMenu(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminMenuForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) pic1.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
