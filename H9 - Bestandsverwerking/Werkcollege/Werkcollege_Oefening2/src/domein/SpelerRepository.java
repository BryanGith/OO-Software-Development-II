package domein;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import persistentie.SpelerMapper;

public class SpelerRepository {
	private List<Speler> spelerslijst;
	private SpelerMapper spelerMapper;

	public SpelerRepository() {
		spelerMapper = new SpelerMapper();
		spelerslijst = new ArrayList<>();
	}

	private void vulSpelerslijst(String[][] gegevens) {
		spelerslijst.clear(); // spelerslijst leeg maken
		for (String[] spelergegevens : gegevens) {
			int kracht = Integer.parseInt(spelergegevens[0]);
			String type = spelergegevens[1];
			Wapen[] array = new Wapen[spelergegevens.length - 2];
			for (int teller = 2; teller < spelergegevens.length; teller++) {
				array[teller - 2] = new Wapen(spelergegevens[teller]);
			}
			spelerslijst.add(new Speler(kracht, type, array));
		}
	}

	public void schrijfNaarTekstBestand(String[][] gegevens) {
		this.vulSpelerslijst(gegevens);
		this.spelerMapper.schrijfNaarTekstBestand(spelerslijst, "oef3.txt");
	}

	public List<Speler> leesTekstBestand(String bestandsnaam) {
		return this.spelerMapper.leesTekstBestand(bestandsnaam);
	}

	public void serialiseerObjectPerObject(String[][] gegevens) {
		vulSpelerslijst(gegevens);
		spelerMapper.serialiseerObjectPerObject(spelerslijst, "oef2a.ser");
	}

	public void serialiseerVolledigeLijst(String[][] gegevens) {
		vulSpelerslijst(gegevens);
		spelerMapper.serialiseerVolledigeLijst(spelerslijst, "oef2b.ser");
	}

	public List<Speler> deSerialiseerObjectPerObject(String naamBestand) {
		return this.spelerMapper.deSerialiseerObjectPerObject(naamBestand);
	}

	public List<Speler> deSerialiseerVolledigeLijst(String naamBestand) {
		return this.spelerMapper.deSerialiseerVolledigeLijst(naamBestand);
	}
}
