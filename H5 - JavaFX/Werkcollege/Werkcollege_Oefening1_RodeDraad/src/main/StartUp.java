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
		BeheersKostenScherm bs = new BeheersKostenScherm(controller);
		Scene scene = new Scene(bs, 500, 300);
		stage.setScene(scene);
		stage.show();
		stage.setTitle("Beheerskosten");
		stage.setResizable(false);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
