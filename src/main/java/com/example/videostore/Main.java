package com.example.videostore;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {
    @Override
    public void start(Stage logIn) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("login.fxml")));
        setUserAgentStylesheet(STYLESHEET_CASPIAN); // this is radius border more circle theme
        Scene scene = new Scene(root);
        logIn.setScene(scene);
        logIn.show();
    }

    public static void main(String[] args) {
        launch();
    }
}