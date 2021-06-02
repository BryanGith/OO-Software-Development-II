package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import domein.Namen;
import gui.OpzoekScherm;

public class StartUp extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {   
        Namen n = new Namen("default");
        OpzoekScherm os = new OpzoekScherm(n);
        Scene sc = new Scene(os, 500,120);
        primaryStage.setScene(sc);
        primaryStage.setTitle("Zoek naam op");
        primaryStage.show();
        primaryStage.setResizable(false);
    }
    
    public static void main(String[] args) {
        launch(args);
    }     
}
