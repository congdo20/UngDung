package com.example.pushtotalkapp;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.io.IOException;


public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("Push To Talk Desktop");
        BorderPane borderPane = new BorderPane();
        Button btnPTT = new Button();
        btnPTT.setText("Push To Talk");

        Label label = new Label();
        label.setText("Hehe");

        borderPane.setCenter(btnPTT);
        borderPane.setBottom(label);
        //borderPane.setCenter(label);
        //label.setAlignment(Pos.CENTER);


        btnPTT.setOnAction(e -> {
            label.setText("Talk To Me");
            System.out.println("Talk To Me");
        });


        Scene scene = new Scene(borderPane, 200,200);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}