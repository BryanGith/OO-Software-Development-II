package gui;

import domein.VoorwerpSoort;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class KnoppenPaneel extends HBox {
	private final VoorwerpScherm parent;

	public KnoppenPaneel(VoorwerpScherm parent) {
		this.parent = parent;
		buildGui();
		parent.getChildren().add(this);
	}

	private void buildGui() {
		Button btnWapen = new Button("Wapen toevoegen");
		Button btnSleutel = new Button("Sleutel toevoegen");
		this.getChildren().add(btnWapen);
		this.getChildren().add(btnSleutel);

		btnSleutel.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				parent.voegToe(VoorwerpSoort.SLEUTEL);
			}
		});

		btnWapen.setOnAction(e -> parent.voegToe(VoorwerpSoort.WAPEN));

	}

}
