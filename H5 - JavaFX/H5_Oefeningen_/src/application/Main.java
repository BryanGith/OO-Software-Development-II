package application;

import domein.DomeinController;
import domein.VoorwerpSoort;
import gui.VoorwerpScherm;
import gui.VoorwerpToevoegenScherm;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage window) throws Exception {
		window.setTitle("Wapens en sleutels");
		Scene scene = new Scene(initVS(), 300, 300);
		window.setScene(scene);
		window.show();
	}

	private Parent initVS() {
		DomeinController dc = new DomeinController();
		BorderPane borderPane = new BorderPane();
		VoorwerpScherm voorwerpScherm = new VoorwerpScherm(dc);
		borderPane.setCenter(voorwerpScherm);
		return borderPane;
	}

	public static void main(String[] args) {
		launch(Main.class, args);
	}
}
