module FXRodeDraadDeel2Startversie {
	exports persistentie;
	exports gui;
	exports main;
	exports domein;

	requires javafx.base;
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	
	opens gui to javafx.graphics, javafx.fxml;
}