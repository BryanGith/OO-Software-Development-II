package domein;

import java.util.ArrayList;
import java.util.List;


public class DraagbaarRepository {

    private final List<Draagbaar> collectie;

    public DraagbaarRepository() {
        collectie = new ArrayList<>();
    }

    public void voegDraagbaarItemToe(Draagbaar item) {
        collectie.add(item);
    }

    public String geefOverzicht() {
        if (collectie.isEmpty()) {
            return String.format("collectie is leeg");
        }

        String resul = "";
        for (Draagbaar item : collectie) {
            resul += String.format("%s%n",item);
        }
        return resul;
    }

}
