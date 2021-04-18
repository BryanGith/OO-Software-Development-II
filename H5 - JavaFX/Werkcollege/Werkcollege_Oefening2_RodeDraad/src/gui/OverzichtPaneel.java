package gui;

import java.io.IOException;

import domein.DomeinController;
import javafx.application.Platform;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;

public class OverzichtPaneel extends VBox {
	@FXML
	private ListView<String> lvList;

	private final DomeinController dc;
	private final DetailPaneel dp;

	public OverzichtPaneel(DomeinController controller, DetailPaneel dp) {
		this.dc = controller;
		this.dp = dp;
		buildGui();
	}

	private void buildGui() {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("OverzichtPaneel.fxml"));
		loader.setRoot(this);
		loader.setController(this);
		try {
			loader.load();
			String[] rekeningen = dc.geefAlleRekeningen();
			ObservableList<String> lijst = FXCollections.observableArrayList(rekeningen);
			lvList.setItems(lijst);

			lvList.getSelectionModel().selectedIndexProperty().addListener(new InvalidationListener() {

				@Override
				public void invalidated(Observable arg0) {
					int geselecteerdeIndex = lvList.getSelectionModel().getSelectedIndex();
					dp.setIndexVanDeRekening(geselecteerdeIndex);
					dp.update();

				}
			});
		} catch (IOException ioe) {
			System.out.println("Het scherm kan niet geladen worden");
			Platform.exit();
		}
	}

}
