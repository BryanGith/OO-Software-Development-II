package gui;

import domein.DomeinController;
import domein.VoorwerpSoort;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VoorwerpScherm extends VBox {
	private TextArea txaCollectie;
	private DomeinController dc;

	public VoorwerpScherm(DomeinController dc) {
		this.dc = dc;
		buildGui();
	}

	private void buildGui() {
		txaCollectie = new TextArea();
		txaCollectie.setText(dc.toonOverzicht());
		this.getChildren().add(txaCollectie);
		new KnoppenPaneel(this);

	}

	public void voegToe(VoorwerpSoort voorwerpSoort) {
		Stage stage = (Stage) this.getScene().getWindow();
		VoorwerpToevoegenScherm voorwerpToevoegenScherm = new VoorwerpToevoegenScherm(dc, voorwerpSoort, this);
		((BorderPane) stage.getScene().getRoot()).setCenter(voorwerpToevoegenScherm);
		stage.setTitle(voorwerpSoort + " toevoegen");
		stage.show();
		
	}

	public void zetTerugActief(Stage stage) {

	}

}
