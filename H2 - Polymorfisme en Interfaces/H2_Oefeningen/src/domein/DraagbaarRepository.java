package domein;

import java.util.ArrayList;
import java.util.List;

public class DraagbaarRepository {

	private List<Draagbaar> collectie;

	public DraagbaarRepository() {
		collectie = new ArrayList<>();
	}

	public void voegDraagbaarItemToe(Draagbaar item) {
		collectie.add(item);
	}

	public String toonOverzicht() {
		if (collectie.isEmpty()) {
			return String.format("collectie is leeg");
		}

		String resul = "";
		for (Draagbaar eenVoorwerp : collectie) {
			resul += String.format("%s%n", eenVoorwerp);
		}
		return resul;
	}
}
