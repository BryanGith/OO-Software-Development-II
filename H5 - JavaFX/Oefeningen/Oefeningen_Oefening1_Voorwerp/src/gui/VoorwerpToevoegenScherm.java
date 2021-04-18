package gui;

import domein.DomeinController;
import domein.VoorwerpSoort;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class VoorwerpToevoegenScherm extends GridPane 
{
    private Button btnOk;
    private Button btnCancel;

    private String[] titelAttributen;

    private TextField[] txtAttributen;

    private DomeinController domeinController;
    private VoorwerpSoort voorwerpSoort;
    private VoorwerpScherm parent;

    public VoorwerpToevoegenScherm(DomeinController domeinController,
            VoorwerpSoort voorwerpSoort, VoorwerpScherm parent)
    {
        this.domeinController = domeinController;
        this.voorwerpSoort = voorwerpSoort;
        this.parent = parent;

        this.titelAttributen = voorwerpSoort.getAttribuutNamen();

        buildGui();
    }

    private void buildGui()
    {
        this.setPadding(new Insets(20));
        this.setVgap(20);
        this.setHgap(20);
        this.setAlignment(Pos.CENTER);
         
        // rijen maken per attribuut
        txtAttributen = new TextField[titelAttributen.length];

        // per rij
        for (int rij = 0; rij < titelAttributen.length; rij++) 
        {
            // label voorzien
            Label lblAttribuut = new Label(titelAttributen[rij]);

            // tekstveld voorzien
            txtAttributen[rij] = new TextField();

            this.add(lblAttribuut, 0, rij); // label toevoegen
            this.add(txtAttributen[rij], 1, rij); // tekstveld toevoegen
        }

        // ok knop en bijhorende actie voorzien
        btnOk = new Button();
        btnOk.setText("OK");
        btnOk.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                drukOk(event);
            }
        });

        // cancel knop en bijhorende actie voorzien
        btnCancel = new Button();
        btnCancel.setText("Cancel");
        btnCancel.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event) 
            {
                drukCancel(event);
            }
        });
        this.add(btnOk, 0, titelAttributen.length); // ok knop toevoegen
        this.add(btnCancel, 1, titelAttributen.length); // cancel knop toevoegen
    }

    private void drukOk(ActionEvent event)
    {
        try {
            switch (voorwerpSoort) 
            {
                case WAPEN:
                    domeinController.voegWapenToe(
                            txtAttributen[0].getText(),
                            Double.parseDouble(txtAttributen[1].getText()),
                            Integer.parseInt(txtAttributen[2].getText()),
                            Integer.parseInt(txtAttributen[3].getText()),
                            Boolean.parseBoolean(txtAttributen[4].getText()));
                    break;
                case SLEUTEL:
                    domeinController.voegSleutelToe(
                            txtAttributen[0].getText(),
                            Double.parseDouble(txtAttributen[1].getText()),
                            Integer.parseInt(txtAttributen[2].getText()),
                            Integer.parseInt(txtAttributen[3].getText()));
                    break;
            }

            // Na het toevoegen terugkeren naar vorig scherm = zelfde effect als op Cancel drukken
            drukCancel(event);
        } catch (NumberFormatException e) 
        {
            toonFoutmelding("Niet alle invoervelden zijn juist ingevuld");
        } catch (IllegalArgumentException e) 
        {
            toonFoutmelding(e.getMessage());
        }
    }

    private void drukCancel(ActionEvent event)
    {
        Stage stage = (Stage) this.getScene().getWindow(); // huidige stage opvragen
        parent.zetTerugActief(stage);
    }

    private void toonFoutmelding(String melding)
    {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Foutmelding");
        alert.setContentText(melding);
        alert.showAndWait();
    }
}
