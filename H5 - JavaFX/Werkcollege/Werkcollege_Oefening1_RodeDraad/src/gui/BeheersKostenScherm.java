package gui;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import domein.DomeinController;
import java.util.Arrays;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

public class BeheersKostenScherm extends VBox
{
    private final DomeinController dc;

    private ComboBox<String> cboTitels;
    private Label lblUitleg, lblKost;
    private TextArea txaUitleg;
    private TextField txfKost;
    
    public BeheersKostenScherm(DomeinController dc)
    {
        this.dc = dc;
        buildGui();
    }
    
    private void buildGui()
    {
        this.setPadding(new Insets(20));
        
        // titels ophalen via domeincontroller
        String[] titels = dc.geefTitelsBeheersKosten();
        
        // titels in ComboBox plaatsen, prompt instellen en event afhandelen
        cboTitels = new ComboBox<>();
        cboTitels.setItems(FXCollections.observableList(Arrays.asList(titels)));
        cboTitels.setPromptText("Over welk item wil je meer weten?");
        
        // Labels aanmaken
        lblUitleg = new Label("Uitleg:");
        lblKost = new Label();
        lblKost.setText("Beheerskosten:");
        
        // TextArea aanmaken
        txaUitleg = new TextArea();
        txaUitleg.setEditable(false);
        
        // TextField aanmaken
        txfKost = new TextField();
        txfKost.setEditable(false);
        
        // actie verbinden aan ComboBox - gebruik aparte klasse om op deze actie te reageren
        cboTitels.setOnAction(new KlasseDieOpComboBoxReageert(cboTitels, this));
        
        // in de juiste volgorde op VBox zetten
        this.getChildren().addAll(cboTitels, lblUitleg, txaUitleg, lblKost, txfKost);
    } 
    
    // Deze methode wordt aangeroepen wanneer er een andere item uit de ComboBox geslecteerd werd     
    public void update(int gekozenRekeningIndex) 
    {
        String details = dc.geefDetailsBeheerskost(gekozenRekeningIndex);
        double kost = dc.geefBeheerskostWaarde(gekozenRekeningIndex);
        txaUitleg.setText(String.format("Details: %s", details));
        txfKost.setText(String.format("De kost bedraagt E%.2f", kost));
    }
}

