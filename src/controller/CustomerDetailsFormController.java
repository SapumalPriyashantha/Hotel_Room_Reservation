package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class CustomerDetailsFormController {
    public AnchorPane pic1;

    public void openMealPlan(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/MealPlanForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) pic1.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void print(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/PrintCustomerDetailsForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) pic1.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void sendEmail(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/SendCustomerDetailsEmailForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) pic1.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
