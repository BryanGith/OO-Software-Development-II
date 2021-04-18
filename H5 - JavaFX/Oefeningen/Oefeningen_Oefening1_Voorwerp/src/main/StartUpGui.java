package main;

import domein.DomeinController;
import gui.VoorwerpScherm;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartUpGui extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        DomeinController dc = new DomeinController();

        Scene scene = new Scene(new VoorwerpScherm(dc));
        primaryStage.setScene(scene);
        primaryStage.setTitle("Wapens en sleutels");

        primaryStage.show();
    }

    public static void main(String... args)
    {
        Application.launch(StartUpGui.class, args);
    }

}
