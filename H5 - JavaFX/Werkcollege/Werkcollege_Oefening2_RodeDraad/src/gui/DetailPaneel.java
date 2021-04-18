package gui;

import javafx.scene.control.TextField;
import domein.DomeinController;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class DetailPaneel extends GridPane {
	private final DomeinController controller;

	private TextField txfRekeningNr;
	private TextField txfSaldo;
	private TextField txfHouder;
	private TextField txfBedrag;

	private int indexVanDeRekening = -1;


	public DetailPaneel(DomeinController controller) {
		this.controller = controller;
		buildGui();
	}

	private void buildGui() {
		Label lblRekeningNr, lblSaldo, lblHouder, lblBedrag;
		lblRekeningNr = new Label("Rekeningnr:");
		lblSaldo = new Label("Saldo:");
		lblHouder = new Label("Houder:");
		lblBedrag = new Label("Bedrag:");

		txfRekeningNr = new TextField();
		txfRekeningNr.setDisable(true);
		txfSaldo = new TextField();
		txfSaldo.setDisable(true);
		txfHouder = new TextField();
		txfHouder.setDisable(true);
		txfBedrag = new TextField();

		this.add(lblRekeningNr, 0, 1);
		this.add(txfRekeningNr, 1, 1);
		this.add(lblSaldo, 0, 2);
		this.add(txfSaldo, 1, 2);
		this.add(lblHouder, 0, 3);
		this.add(txfHouder, 1, 3);
		this.add(lblBedrag, 0, 4);
		this.add(txfBedrag, 1, 4);

		Font lettertype = new Font("Arial", 20);
		Label lblDetails = new Label("Details:");
		lblDetails.setFont(lettertype);
		this.add(lblDetails, 0, 0, 2, 1);

		this.setPadding(new Insets(10));
		this.setVgap(20);
		this.setHgap(10);

		txfRekeningNr.setEditable(false);
		txfHouder.setEditable(false);
		txfSaldo.setEditable(false);

		txfBedrag.setOnAction(this::stortBedrag);

	}

	public final void setIndexVanDeRekening(int indexVanDeRekening) {
		this.indexVanDeRekening = indexVanDeRekening;
	}

	public void update() {
		String[] info = controller.geefRekeningInfo(indexVanDeRekening);
		txfRekeningNr.setText(info[0]);
		txfHouder.setText(info[2]);
		txfSaldo.setText(info[1]);
		txfBedrag.clear(); 
	}

	private void stortBedrag(ActionEvent evt) {
		try {
			if (indexVanDeRekening == -1) {
				throw new IllegalArgumentException("Je moet eerst een rekening selecteren");
			}
			int bedrag = Integer.parseInt(txfBedrag.getText());
			double beginSaldo = Double.parseDouble(txfSaldo.getText().replace(',', '.'));
			controller.stortOp(indexVanDeRekening, bedrag);
			update();
			double eindSaldo = Double.parseDouble(txfSaldo.getText().replace(',', '.'));
			if (beginSaldo == eindSaldo) {
				throw new IllegalArgumentException("Er is geen storting gebeurd vanwege een negatief bedrag");
			}
		} catch (NumberFormatException nfe) {
			toonFout("Het bedrag moet een geheel getal zijn");
		} catch (IllegalArgumentException iae) {
			toonFout(iae.getMessage());
		}
	}

	private void toonFout(String boodschap) {
		Alert alert = new Alert(AlertType.WARNING);
		alert.setTitle("Fout");
		alert.setHeaderText("Probleem met de storting.");
		alert.setContentText(boodschap);
		alert.show();
		txfBedrag.clear();
	}

}
