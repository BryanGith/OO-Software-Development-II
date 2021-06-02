package gui;

import domein.DomeinController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;

public class PassagierOverzichtPanel extends VBox {
    private final DomeinController domeinController;
    private ListView<String> lvPassagiers;
    private Label lblFout;

    public PassagierOverzichtPanel(DomeinController domeinController) {
        this.domeinController = domeinController;
        buildGui();
    }

    private void buildGui() {
        this.setPadding(new Insets(20));

        Label lblPassagierLijst = new Label("Dit zijn de gefilterde passagiers");
        lvPassagiers = new ListView<>();
        lvPassagiers.getSelectionModel().selectedItemProperty().addListener(
                arg0 -> {
                    int index = lvPassagiers.getSelectionModel().getSelectedIndex();
                    String info = domeinController.geefGefilterdeLijstPassagiers()[index];
                    PassagierOverzichtPanel.this.toonInfo(info);
                }
        );

        lblFout = new Label();
        toonVolledigeLijst();

        this.getChildren().addAll(lblPassagierLijst, lvPassagiers, lblFout);
    }

    private void toonInfo(String info) {
        // TO DO
        // Uit het overzicht kan een passagier gekozen worden door erop te klikken.
        // De geselecteerde passagier wordt in onze applicatie getoond in een
        Alert alert = new Alert(AlertType.CONFIRMATION);
        // pop-up venster.
        alert.setTitle("Bevestig je keuze!");
        alert.setContentText(info + "\n Akkoord?");
        alert.show();


    }

    public void toonVolledigeLijst() {
        lblFout.setText("");
        lvPassagiers.setItems(null);
        String[] passagiersArray = domeinController.geefPassagierLijst();
        ObservableList<String> lijst = FXCollections.observableArrayList(passagiersArray);
        lvPassagiers.setItems(lijst);
    }

    public void updateLijst(int gekozenFilter, String invoer) {
        lblFout.setText("");
        try {
            lvPassagiers.setItems(null);
            domeinController.filterOp(gekozenFilter, invoer);
            String[] passagiersArray = domeinController.geefGefilterdeLijstPassagiers();
            ObservableList<String> lijst = FXCollections.observableArrayList(passagiersArray);
            lvPassagiers.setItems(lijst);
        } catch (NumberFormatException e) {
            lblFout.setText("Fout in invoer van filter!");
        }
    }

}
