/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import domein.DomeinController;
import domein.VoorwerpSoort;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VoorwerpScherm extends VBox
{
    private final DomeinController dc;
    private TextArea txaCollectie;

    public VoorwerpScherm(DomeinController dc) 
    {
        this.dc = dc;
        buildGui();
    }

    private void buildGui() 
    {
        this.setPadding(new Insets(20));
        this.setSpacing(20);
        txaCollectie = new TextArea(dc.geefOverzicht());
        KnoppenPaneel knoppenPaneel = new KnoppenPaneel(this);

        this.getChildren().addAll(txaCollectie, knoppenPaneel);

    }

    public void voegToe(VoorwerpSoort voorwerpSoort)
    {
        Stage stage = (Stage) this.getScene().getWindow(); // huidige stage opvragen
        double breedte = this.getScene().getWidth();
        double hoogte = this.getScene().getHeight();
        // nieuwe titel instellen
        stage.setTitle(voorwerpSoort.equals(VoorwerpSoort.WAPEN)
                ? "Wapen toevoegen" : "Sleutel toevoegen");

        Scene scene = new Scene(new VoorwerpToevoegenScherm(dc, voorwerpSoort, this), breedte, hoogte);
        stage.setScene(scene);
    }

    public void zetTerugActief(Stage stage) 
    {
        // oorspronkelijke titel weer instellen
        stage.setTitle("Wapens en sleutels");

        // scene opvragen en weer op de stage zetten
        Scene scene = this.getScene();
        stage.setScene(scene);

        // collectie aanpassen 
        txaCollectie.setText(dc.geefOverzicht());
    }
}
