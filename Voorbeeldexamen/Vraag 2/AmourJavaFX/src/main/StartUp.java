package main;

import domein.DomeinController;
import gui.FilterKeuzeScherm;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartUp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        DomeinController dc = new DomeinController();
        FilterKeuzeScherm kcs = new FilterKeuzeScherm(dc);
        Scene scene = new Scene(kcs);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Filter passagiers");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
