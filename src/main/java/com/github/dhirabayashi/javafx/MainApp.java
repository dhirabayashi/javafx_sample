package com.github.dhirabayashi.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        var cl = getClass().getClassLoader();
        Parent root = FXMLLoader.load(Objects.requireNonNull(cl.getResource("scene.fxml")));

        Scene scene = new Scene(root);
        scene.getStylesheets().add(Objects.requireNonNull(cl.getResource("styles.css")).toExternalForm());

        stage.setTitle("JavaFXサンプル");
        stage.setScene(scene);
        stage.show();
    }
}
