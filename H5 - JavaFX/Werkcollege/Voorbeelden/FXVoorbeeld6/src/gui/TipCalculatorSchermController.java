package gui;

import java.io.IOException;

import domein.TipCalculator;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;

import javafx.scene.control.Slider;

public class TipCalculatorSchermController extends GridPane {
	@FXML
	private Label lblTipPercentage;
	@FXML
	private TextField txfAmount;
	@FXML
	private TextField txfTip;
	@FXML
	private TextField txfTotal;
	@FXML
	private Slider sldTipPercentage;
	@FXML
	private Button btnCalculate;
	
	private TipCalculator dc;

	public TipCalculatorSchermController(TipCalculator dc) {
		this.dc = dc;
		buildGui();
	}

	private void buildGui() {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("TipCalculatorScherm.fxml"));
		loader.setRoot(this);
		loader.setController(this);
		try {
			loader.load();
		} catch (IOException ioe) {
			System.err.println("Het scherm kan niet worden geladen!");
			Platform.exit();
		}
	}

}
