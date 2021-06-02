package gui;

import domein.Namen;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class OpzoekScherm extends VBox {
    private final Namen n;
    private TextField txfNaam, txfAanwezig, txfPlaats;

    public OpzoekScherm(Namen n) {
        this.n = n;
        buildGui();
    }

    private void buildGui() {
        setPadding(new Insets(15));
        setSpacing(20);
        HBox hBox1 = new HBox();
        hBox1.setSpacing(10);
        txfNaam = new TextField();
        Label lblNaam = new Label("Geef een naam:");
        lblNaam.setFont(Font.font("System", 20));
        hBox1.getChildren().addAll(lblNaam, txfNaam);

        HBox hBox2 = new HBox();
        hBox2.setSpacing(10);
        txfAanwezig = new TextField();
        txfAanwezig.setPrefColumnCount(17);
        txfPlaats = new TextField();
        txfPlaats.setPrefColumnCount(2);
        Label lblPlaats = new Label(" alfabetisch op plaats ");
        lblPlaats.setFont(Font.font("System", 15));
        hBox2.getChildren().addAll(txfAanwezig, lblPlaats, txfPlaats);

        getChildren().addAll(hBox1, hBox2);

        txfNaam.setOnAction(this::txfNaamAction);
    }

    private void txfNaamAction(ActionEvent event) {
    }
}

