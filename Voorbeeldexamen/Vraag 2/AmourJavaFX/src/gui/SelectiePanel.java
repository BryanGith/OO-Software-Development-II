package gui;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SelectiePanel extends GridPane {
    private final PassagierOverzichtPanel pOverz;
    private final int gekozenFilter;
    private final FilterKeuzeScherm vorigScherm;
    private TextField txfSelectie;

    public SelectiePanel(PassagierOverzichtPanel pOverz, int gekozenFilter, FilterKeuzeScherm vorigScherm) {
        this.pOverz = pOverz;
        this.gekozenFilter = gekozenFilter;
        this.vorigScherm = vorigScherm;

        buildGui();
    }

    private void buildGui() {
        Label lblKeuze, lblSelectie;
        Button btnBevestig, btnAnnuleer, btnTerug;

        String keuzeTekst, selectieTekst = "";

        this.setHgap(10);
        this.setVgap(25);
        this.setAlignment(Pos.CENTER);

        lblKeuze = new Label();
        keuzeTekst = "Waarop wil je filteren: ";

        lblSelectie = new Label();

        switch (gekozenFilter) {
            case 0 -> {
                keuzeTekst += "op naam";
                selectieTekst = "Naam (eerste letter):";
            }
            case 1 -> {
                keuzeTekst += "op aantal kg bagage";
                selectieTekst = "Grens:";
            }
            case 2 -> {
                keuzeTekst += "op klasse";
                selectieTekst = "Businessklasse of andere:";
            }
            default -> throw new IllegalStateException("Unexpected value: " + gekozenFilter);
        }

        lblKeuze.setText(keuzeTekst);
        this.add(lblKeuze, 0, 0, 2, 1);
        txfSelectie = new TextField();
        this.add(txfSelectie, 3, 0, 2, 1);

        lblSelectie.setText(selectieTekst);
        this.add(lblSelectie, 1, 1);

        btnBevestig = new Button("Pas filter toe");
        btnBevestig.setMaxWidth(Double.MAX_VALUE);
        this.add(btnBevestig, 2, 1, 2, 1);
        btnAnnuleer = new Button("Wis filter");
        btnAnnuleer.setMaxWidth(Double.MAX_VALUE);
        this.add(btnAnnuleer, 2, 2, 2, 1);
        btnTerug = new Button("Kies een andere filter");
        btnTerug.setMaxWidth(Double.MAX_VALUE);
        this.add(btnTerug, 2, 3, 2, 1);

        //TO DO
        //als we op de btnBevestig klikken, wordt de methode 'voerFilterUit()' aangeroepen
        btnBevestig.setOnAction(this::voerFilterUit);

        //TO DO
        //als we op de btnAnnuleer klikken, wordt de methode 'wisFilter()' aangeroepen
        btnAnnuleer.setOnAction(this::wisFilter);

        //TO DO
        //als we op de btnTerug klikken, wordt de methode 'kiesAndereFilter()' aangeroepen
        btnTerug.setOnAction(this::kiesAndereFilter);

    }

    private void voerFilterUit(ActionEvent actionEvent) {
        //TO DO
        //roep de methode 'updateLijst' in PassagierOverzichtPanel aan met de nodige info
         pOverz.updateLijst(gekozenFilter, txfSelectie.getText());
    }

    private void wisFilter(ActionEvent actionEvent) {
        //TO DO
        //maak het invoerveld leeg
        txfSelectie.clear();
        //roep de methode 'toonVolledigeLijst' in PassagierOverzichtPanel aan
        pOverz.toonVolledigeLijst();
    }

    private void kiesAndereFilter(ActionEvent actionEvent) {
        //TO DO
        //toon terug het scherm om een nieuwe filter te kiezen
        Scene scene = vorigScherm.getScene();
        Stage stage = (Stage) this.getScene().getWindow();
        stage.setScene(scene);

        //grootte:480 pixels breed, 200 pixels hoog
        //titel: "Filter kiezen"
    }
}
