package gui;

import domein.DomeinController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class BeheersKostenScherm extends VBox {

	private final DomeinController dController;
	private ComboBox cboKosten;
	private TextArea txaUitleg;
	private TextField txfKost;

	public BeheersKostenScherm(DomeinController dController) {
		this.dController = dController;
		buildGui();
	}

	@SuppressWarnings("unchecked")
	private void buildGui() {
		this.setMinSize(700, 400);
		Label lblUitleg, lblKost;

		// alle componenten aanmaken
		cboKosten = new ComboBox<>();
		txaUitleg = new TextArea();
		txfKost = new TextField(); 
		lblUitleg = new Label("Uitleg:");
		lblKost = new Label("Kost");

		// alle componenten op het scherm zetten
		this.getChildren().addAll(cboKosten, lblUitleg, txaUitleg, lblKost, txfKost);

		// layout aanpassen
		this.setPadding(new Insets(10));
		this.setSpacing(10);
		cboKosten.setMaxWidth(Double.MAX_VALUE);

		// zorg ervoor dat het textfield en de textarea niet door de gebruiker gewijzigd
		// kunnen worden
		txaUitleg.setEditable(false);
		txfKost.setDisable(true); // is ook niet aanklikbaar

		// combobox opvullen
		String[] titels = dController.geefTitelsBeheersKosten();
		ObservableList items = FXCollections.observableArrayList(titels);
		cboKosten.setItems(items);
		cboKosten.setPromptText("Klik hier om een Beheerskost te kiezen");

		// event handling koppelen
		cboKosten.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				int index = cboKosten.getSelectionModel().getSelectedIndex();
				String details = dController.geefDetailsBeheerskost(index);
				double kost = dController.geefBeheerskostWaarde(index);
				txaUitleg.setText("Details:\n");
				txaUitleg.appendText(details);
				txfKost.setText(String.format("De kost bedraagt %.2f euro", kost));

			}

		});

	}

}
