package gui;

import domein.DomeinController;
import javafx.scene.layout.VBox;

public class PassagierSelectieScherm extends VBox {
    private final int gekozenFilter;
    private final FilterKeuzeScherm vorigScherm;
    private final DomeinController dc;

    public PassagierSelectieScherm(int gekozenFilter, FilterKeuzeScherm vorigScherm, DomeinController dc) {
        this.gekozenFilter = gekozenFilter;
        this.vorigScherm = vorigScherm;
        this.dc = dc;
        buildGui();
    }

    private void buildGui() {
        PassagierOverzichtPanel passagierOverzichtPanel = new PassagierOverzichtPanel(dc);
        SelectiePanel selectiePanel = new SelectiePanel(passagierOverzichtPanel, gekozenFilter, vorigScherm);
        this.getChildren().addAll(selectiePanel, passagierOverzichtPanel);

    }
}
