package gui;

import domein.MijnString;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class CrypteerScherm extends VBox
{
    private MijnString ms;
    private Button btnEncrypt, btnDecrypt;
    private TextField txfTekst, txfEncrypt, txfDecrypt;
    
    public CrypteerScherm(MijnString ms)
    {
        this.ms = ms;
        buildGui();
    }
    
    private void buildGui()
    {
        setPadding(new Insets(10));
        setSpacing(10);
        setAlignment(Pos.CENTER);
        
        Label lblTekst = new Label("Geef een zin in:");
        lblTekst.setFont(Font.font("Courier New",18));
        txfTekst = new TextField();
        txfEncrypt = new TextField();
        txfDecrypt = new TextField();
        btnEncrypt = new Button("   Encrypteer   ");
        btnDecrypt = new Button("   Decrypteer   ");
        
        getChildren().addAll(lblTekst,txfTekst,btnEncrypt,txfEncrypt,btnDecrypt,txfDecrypt);
        
        btnEncrypt.setOnAction(this::btnEncryptAction);
        btnDecrypt.setOnAction(this::btnDecryptAction);
    }
    
    private void btnEncryptAction(ActionEvent event)
    {
    	try
    	{
    		txfDecrypt.setText("");
    		txfEncrypt.setText(ms.crypteerZin(txfTekst.getText(), true));
    	}
        catch (IllegalArgumentException e)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Fout");
            alert.setHeaderText("Staat er iets in het bovenste tekstvak?");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }
    }

    private void btnDecryptAction(ActionEvent event)
    {
    	try
    	{
    		txfDecrypt.setText(ms.crypteerZin(txfEncrypt.getText(), false));
    	}
        catch (IllegalArgumentException e)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Fout");
            alert.setHeaderText("Staat er iets in het middelste tekstvak?");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }
    }
}