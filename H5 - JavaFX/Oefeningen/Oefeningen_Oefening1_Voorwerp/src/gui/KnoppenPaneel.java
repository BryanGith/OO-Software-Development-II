package gui;

import domein.VoorwerpSoort;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class KnoppenPaneel extends HBox 
{
 //   private Button btnWapenToevoegen, btnSleutelToevoegen;

    private final VoorwerpScherm parent;

    public KnoppenPaneel(VoorwerpScherm parent)
    {
        this.parent = parent;
        buildGui();
    }

    private void buildGui() 
    {
        this.setPadding(new Insets(20));
        this.setSpacing(20);
        this.setAlignment(Pos.CENTER);
        Button btnWapenToevoegen = new Button("Wapen toevoegen");
        btnWapenToevoegen.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent evt) {
                parent.voegToe(VoorwerpSoort.WAPEN);
            }
        });
        Button btnSleutelToevoegen = new Button("Sleutel toevoegen");
        btnSleutelToevoegen.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent evt) {
                parent.voegToe(VoorwerpSoort.SLEUTEL);
            }
        });

        this.getChildren().addAll(btnWapenToevoegen, btnSleutelToevoegen);
    }
}
