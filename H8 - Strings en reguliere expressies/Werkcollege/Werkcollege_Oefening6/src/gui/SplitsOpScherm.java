package gui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import domein.MijnString;
import java.util.Arrays;

public class SplitsOpScherm extends GridPane {
	private MijnString mijnString;
	private Label lblMessage, lblZin, lblWoord;
	private TextField txfZin, txfWoord, txfSplitsOp;
	private Button btnSplitsOp;

	public SplitsOpScherm() {
		this.setAlignment(Pos.CENTER);
		this.setHgap(10);
		this.setVgap(10);
		this.setPadding(new Insets(10, 10, 10, 10));

		lblZin = new Label("GEEF EEN ZIN: ");
		txfZin = new TextField();
		lblWoord = new Label("GEEF EEN WOORD: ");
		txfWoord = new TextField();

		btnSplitsOp = new Button("OPSPLITSEN");
		txfSplitsOp = new TextField();
		txfSplitsOp.setEditable(false);

		this.add(lblZin, 0, 0, 2, 1);
		this.add(txfZin, 0, 1, 2, 1);
		this.add(lblWoord, 0, 2);
		this.add(txfWoord, 1, 2);

		this.add(btnSplitsOp, 0, 4);
		this.add(txfSplitsOp, 0, 5, 2, 1);

		lblMessage = new Label("Velden moeten ingevuld zijn.");
		lblMessage.setVisible(false);
		this.add(lblMessage, 0, 6, 2, 1);

		btnSplitsOp.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent evt) {
				try {
					lblMessage.setVisible(false);
					String zin = txfZin.getText();
					mijnString = new MijnString(zin);
					txfSplitsOp.setText(maakString(mijnString));
				} catch (IllegalArgumentException e) {
					lblMessage.setVisible(true);
					reset();
				}
			}
		});

	}

	private String maakString(MijnString ms) {
		String woord = txfWoord.getText();
		if (woord.isBlank()) {
			throw new IllegalArgumentException();
		}
		String[] gesplitst = ms.splitsOp(woord);
		return Arrays.toString(gesplitst);
	}

	private void reset() {
		txfZin.clear();
		txfWoord.clear();
		txfSplitsOp.clear();
	}
}
