package gui;

import domein.DomeinController;
import javafx.scene.layout.BorderPane;

public class HoofdPaneel extends BorderPane
{
    private final DomeinController controller;

    public HoofdPaneel(DomeinController controller)
    {
        this.controller = controller;
        buildGui();
    }
    
    private void buildGui()
    {

        DetailPaneel dp = new DetailPaneel(controller);
        this.setCenter(dp);
    }
}
