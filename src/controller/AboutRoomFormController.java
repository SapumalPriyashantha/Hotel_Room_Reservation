package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AboutRoomFormController {
    public AnchorPane pic1;

    public void openRooms(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/RoomsForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) pic1.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void openMealplan(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/MealPlanForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) pic1.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void roomunavailable(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/RoomUnavailableForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) pic1.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void roomavailable(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/RoomAvailableForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) pic1.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
