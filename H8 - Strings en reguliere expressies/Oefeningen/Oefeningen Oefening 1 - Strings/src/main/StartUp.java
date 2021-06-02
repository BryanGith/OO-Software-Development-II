package main;

import domein.EigenString;
import gui.VergrootVerkleinScherm;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartUp extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {   
        EigenString es = new EigenString("iets");
        VergrootVerkleinScherm vvs = new VergrootVerkleinScherm(es);
        Scene scene = new Scene(vvs,400,150);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Verklein / vergroot tekst");
        primaryStage.show();
        primaryStage.setResizable(false);
    }    
    
    public static void main(String[] args) {
        launch(args);
    } 
}
