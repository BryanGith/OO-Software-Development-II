package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import domein.MijnString;
import gui.CrypteerScherm;

public class StartUp extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {   
       
        Scene sc = new Scene( ,500,250);
        primaryStage.setScene(sc);
        primaryStage.setTitle("Encrypteer / Decrypteer");
        primaryStage.show();
        primaryStage.setResizable(false);
    }
    
    public static void main(String[] args) {
        launch(args);
    } 
}
