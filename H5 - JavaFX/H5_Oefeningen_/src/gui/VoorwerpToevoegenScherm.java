package gui;

import domein.DomeinController;
import domein.VoorwerpSoort;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class VoorwerpToevoegenScherm extends GridPane {
	private Button btnOk, btnCancel;

	private String[] titelAttributen;
	private TextField[] txlAttributen;

	private DomeinController domeinController;
	private VoorwerpSoort voorwerpSoort;

	public VoorwerpToevoegenScherm(DomeinController domeinController, VoorwerpSoort voorwerpSoort,
			VoorwerpScherm parent) {
		this.domeinController = domeinController;
		this.voorwerpSoort = voorwerpSoort;
		buildGui();
		parent.getChildren().add(this);
	}

	private void buildGui() {
		setHgap(10);
		setVgap(10);

		int index = 0;

		for (String label : voorwerpSoort.getAttribuutNamen()) {

			Label lbl = new Label(label);

			TextField tf = new TextField();

			this.add(lbl, 0, index, 1, 1);

			this.add(tf, 1, index, 1, 1);

			index++;

		}

		/*
		 * Label lblNaam = new Label("naam"); this.add(lblNaam, 0, 0, 1, 1); TextField
		 * txfNaam = new TextField(); this.add(txfNaam, 1, 0, 1, 1); Label lblGewicht =
		 * new Label("gewicht"); this.add(lblGewicht, 0, 1, 1, 1); TextField txfGewicht
		 * = new TextField(); this.add(txfGewicht, 1, 1, 1, 1); Label lblNiveau = new
		 * Label("niveau"); this.add(lblNiveau, 0, 2, 1, 1); TextField txfNiveau = new
		 * TextField(); this.add(txfNiveau, 1, 2, 1, 1);
		 * 
		 * switch (voorwerpSoort) { case SLEUTEL: Label lblDeur = new Label("deur");
		 * this.add(lblDeur, 0, 3, 1, 1); TextField txfDeur = new TextField();
		 * this.add(txfDeur, 1, 3, 1, 1); break; case WAPEN: Label lblKracht = new
		 * Label("kracht"); this.add(lblKracht, 0, 3, 1, 1); TextField txfKracht = new
		 * TextField(); this.add(txfKracht, 1, 3, 1, 1); Label lblGebruikt = new
		 * Label("gebruikt"); this.add(lblGebruikt, 0, 4, 1, 1); TextField txfGebruikt =
		 * new TextField(); this.add(txfGebruikt, 1, 4, 1, 1); break; }
		 */

		btnOk = new Button("OK");
		this.add(btnOk, 0, 5, 1, 1);
		btnCancel = new Button("Cancel");
		this.add(btnCancel, 1, 5, 1, 1);

		btnOk.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				drukOk(arg0);
			}
		});
		btnCancel.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				drukCancel(arg0);
			}

		});
	}

	private void drukOk(ActionEvent event) {
		if (voorwerpSoort == VoorwerpSoort.SLEUTEL) {
			//domeinController.voegSleutelToe();
		} else {
			// domeinController.voegWapenToe(getAccessibleHelp(),
			// BASELINE_OFFSET_SAME_AS_HEIGHT, REMAINING, REMAINING, isCache());
		}
	}

	private void drukCancel(ActionEvent event) {
		VoorwerpScherm voorwerpScherm = new VoorwerpScherm(domeinController);
		Stage stage = (Stage) this.getScene().getWindow();
		stage.setTitle("Wapens en sleutels");
		stage.setScene(voorwerpScherm.getScene());
		stage.show();
	}

	private void toonFoutmelding(String melding) {

	}

}
