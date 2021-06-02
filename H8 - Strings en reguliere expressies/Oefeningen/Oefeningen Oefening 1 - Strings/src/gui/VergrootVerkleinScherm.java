package gui;

import domein.EigenString;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class VergrootVerkleinScherm extends GridPane {
    private TextField txfTekst;
    private Button btnVergroot, btnVerklein;
    private Label lblTekst, lblAantalSpaties;
    private final EigenString es;

    public VergrootVerkleinScherm(EigenString es) {
        this.es = es;
        buildGui();
    }

    private void buildGui() {
        setPadding(new Insets(10));
        setHgap(10);
        setVgap(10);
        setAlignment(Pos.CENTER);

        lblTekst = new Label("Geef een stukje tekst: ");
        lblTekst.setFont(Font.font("System", FontWeight.BOLD, 12));
        add(lblTekst, 0, 0);
        txfTekst = new TextField();
        txfTekst.setMinWidth(200);
        add(txfTekst, 1, 0);

        HBox hBox = new HBox(10);
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        btnVergroot = new Button("Vergroot");
        btnVerklein = new Button("Verklein");
        hBox.getChildren().addAll(btnVergroot, btnVerklein);
        add(hBox, 0, 1, 2, 1);

        lblAantalSpaties = new Label();
        lblAantalSpaties.setFont(Font.font("System", FontWeight.BOLD, 12));
        lblAantalSpaties.setVisible(false);
        add(lblAantalSpaties, 0, 2, 2, 1);

        btnVergroot.setOnAction(this::btnVergrootAction);
        btnVerklein.setOnAction(this::btnVerkleinAction);
    }

    private void btnVergrootAction(ActionEvent event) {

    }

    private void btnVerkleinAction(ActionEvent event) {

    }
}