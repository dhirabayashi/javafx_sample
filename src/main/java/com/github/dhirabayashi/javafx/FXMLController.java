package com.github.dhirabayashi.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class FXMLController implements Initializable {

    @FXML
    private TextField textField1;

    @FXML
    private Button button1;

    @FXML
    void onButton1Action(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Title!");
        alert.setHeaderText("Header!");
        alert.setContentText("You entered: " + textField1.getText());
        Optional<ButtonType> result = alert.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            System.out.println("You clicked OK");
        }
    }

    @FXML
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        assert textField1 != null : "fx:id=\"textField1\" was not injected: check your FXML file 'scene.fxml'.";
        assert button1 != null : "fx:id=\"button1\" was not injected: check your FXML file 'scene.fxml'.";
    }
}
