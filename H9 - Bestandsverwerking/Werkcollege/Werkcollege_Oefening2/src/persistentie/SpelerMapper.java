package persistentie;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

import domein.Speler;
import domein.Wapen;

public class SpelerMapper {

	public List<Speler> leesTekstBestand(String bestandsnaam) {
		String pad = "src" + File.separator + "bestanden" + File.separator + bestandsnaam;
		List<Speler> lijst = new ArrayList<>();

		try (Scanner scanner = new Scanner(Files.newInputStream(Paths.get(pad)))) {
			while (scanner.hasNext()) {
				int kracht = scanner.nextInt();
				String type = scanner.next();
				String wapens = scanner.nextLine().trim();
				String[] array = wapens.split("\\s+");
				Wapen[] wapenArray = new Wapen[array.length];
				int index = 0;
				for (String w : array)
					wapenArray[index++] = new Wapen(w);
				lijst.add(new Speler(kracht, type, wapenArray));

			}
		} catch (IOException ioe) {
			System.err.println("Kan niet lezen naar tekstbestand");
		}
		return lijst;

	}

	public void schrijfNaarTekstBestand(List<Speler> spelerslijst, String bestandsnaam) {
		String pad = "src" + File.separator + "bestanden" + File.separator + bestandsnaam;
		try (Formatter f = new Formatter(Files.newOutputStream(Paths.get(pad)))) {

			for (Speler speler : spelerslijst) {
				String wapenString = "";
				Wapen[] array = speler.getWapens();
				for (Wapen wapen : array) {
					wapenString += wapen.getSoort() + " ";
				}
				f.format("%d %s %s%n", speler.getKracht(), speler.getType(), wapenString);
			}
		} catch (IOException ioe) {
			System.err.println("Kan niet schrijven naar tekstbestand");
		}
	}

	public void serialiseerObjectPerObject(List<Speler> spelerslijst, String bestandsnaam) {
		// TODO
	}

	public void serialiseerVolledigeLijst(List<Speler> spelerslijst, String bestandsnaam) {
		// TODO
	}

	public List<Speler> deSerialiseerObjectPerObject(String bestandsnaam) {
		// TODO
		return null;
	}

	public List<Speler> deSerialiseerVolledigeLijst(String bestandsnaam) {
		// TODO
		return null;
	}

	private String vervangSpaties(String tekst) {
		return tekst.replaceAll("\\s", "_");
	}

	private String vervangUnderscores(String tekst) {
		// TODO
		return null;
	}
}
