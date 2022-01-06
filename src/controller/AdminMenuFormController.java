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

public class AdminMenuFormController {
    public AnchorPane pic1;

    public ComboBox<String> cmbRoom;
    public TextField txt11;
    public ComboBox<String> cmbRoomNum;
    public TextField txt21;
    public ComboBox<String> cmbMealplan;
    public TextField txt41;
    public ComboBox<String> cmbAddNewMealplan;
    public TextField txt51;
    public ComboBox<String> cmbAddNewRoom;
    public TextField txt31;


    public void initialize() {
        cmbRoom.getItems().addAll(
                "Single",
                "Double",
                "Triple",
                "Quad"
        );
        cmbRoomNum.getItems().addAll(
                "Room 1",
                "Room 2",
                "Room 3",
                "Room 4",
                "Room 5"

        );
        cmbAddNewRoom.getItems().addAll(
                "Single",
                "Double",
                "Triple",
                "Quad"
        );
        cmbMealplan.getItems().addAll(
                "Local",
                "Chinese",
                "French"
        );
        cmbAddNewMealplan.getItems().addAll(
                "Local",
                "Chinese",
                "French"
        );
        cmbRoom.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {

        });
        cmbRoom.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(oldValue);
            System.out.println(newValue);
            txt11.setText(newValue);
        });

        cmbRoomNum.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {

        });
        cmbRoomNum.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(oldValue);
            System.out.println(newValue);
            txt21.setText(newValue);
        });
        cmbAddNewRoom.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {

        });
        cmbAddNewRoom.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(oldValue);
            System.out.println(newValue);
            txt31.setText(newValue);
        });
        cmbMealplan.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {

        });
        cmbMealplan.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(oldValue);
            System.out.println(newValue);
            txt41.setText(newValue);
        });
        cmbAddNewMealplan.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {

        });
        cmbAddNewMealplan.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(oldValue);
            System.out.println(newValue);
            txt51.setText(newValue);
        });



    }
    public void modify(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ModifyForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) pic1.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void viewmonthly(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ViewMonthlyForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) pic1.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void viewannualy(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ViewAnnuallyForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) pic1.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void delete(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/SuccessForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) pic1.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
