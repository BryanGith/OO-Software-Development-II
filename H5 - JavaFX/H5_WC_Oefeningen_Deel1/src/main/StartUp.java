package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import domein.DomeinController;
import gui.BeheersKostenScherm;

public class StartUp extends Application {
	@Override
	public void start(Stage stage) {
		DomeinController controller = new DomeinController();
		// Maak een object van je eerste scherm
		BeheersKostenScherm bs = new BeheersKostenScherm(controller);
		// Zet het scherm op de scene
		Scene scene = new Scene(bs, 500, 300);
		// Zet de scene op de stage en toon deze
		stage.setScene(scene);
		stage.show();
		// extra: titel en/of resizable instellne
		stage.setTitle("Beheerskosten");
		stage.setResizable(false);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
