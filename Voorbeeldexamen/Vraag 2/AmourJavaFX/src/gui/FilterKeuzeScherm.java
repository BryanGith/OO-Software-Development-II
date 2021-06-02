package gui;

import domein.DomeinController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class FilterKeuzeScherm extends HBox {
    private final DomeinController dc;

    public FilterKeuzeScherm(DomeinController dc) {
        this.dc = dc;
        buildGui();
    }

    private void buildGui() {
        setPadding(new Insets(10));
        setAlignment(Pos.CENTER);
        this.setSpacing(10);

        String kiesFilter = "Kies een filter: ";
        Label lblKeuze = new Label(kiesFilter);
        lblKeuze.setFont(Font.font("Arial", 25));

        String[] criteria = {"op naam (eerste letter)", "op aantalKgBagage (maxGrens)", "op klasse (true = business)"};
        ComboBox<String> cboCriteria = new ComboBox<>();
        ObservableList<String> lijstCriteria = FXCollections.observableArrayList(criteria);
        cboCriteria.setItems(lijstCriteria);
        cboCriteria.setPromptText(kiesFilter);

        this.getChildren().addAll(lblKeuze, cboCriteria);

        //TO DO
        //Als je een keuze gemaakt hebt in de combobox wordt deze keuze doorgegeven aan het volgende scherm.
        //Dit scherm is het PassagierSelectieScherm.
        cboCriteria.setOnAction(event -> {
            int selectedIndex = cboCriteria.getSelectionModel().getSelectedIndex();
            PassagierSelectieScherm passagierSelectieScherm = new PassagierSelectieScherm(selectedIndex, FilterKeuzeScherm.this, dc);
            Stage stage = (Stage) FilterKeuzeScherm.this.getScene().getWindow();
            stage.setScene(new Scene(passagierSelectieScherm, 480, 600));
        });
        //grootte:600 pixels breed, 480 pixels hoog
        //titel: "Filter passagiers"
        //zorg ervoor dat je kan terugkeren naar het FilterkeuzeScherm
    }
}
