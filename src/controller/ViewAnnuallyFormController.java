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

public class ViewAnnuallyFormController {
    public AnchorPane pic1;

    public ComboBox<String> cmbMonth;
    public TextField txt2;

    public void initialize() {
        cmbMonth.getItems().addAll(
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "october",
                "November",
                "December"
        );
        cmbMonth.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {

        });
        cmbMonth.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
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
