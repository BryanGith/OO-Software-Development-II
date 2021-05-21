package ui;

import java.util.ArrayList;
import java.util.List;

import domein.Container;

public class ContainerApplicatie {

	public static void main(String[] args) {
		List<Container> containers = new ArrayList<>();

		containers.add(new Container("Antwerpen", 60, 150, 1234));
		containers.add(new Container("Rotterdam", 70, 110, 2568));
		containers.add(new Container("Calais", 80, 90, 8569));
		containers.add(new Container("Brugge", 70, 100, 8564));

		Container nieuweContainer = new Container("Antwerpen", 70, 75, 8564);

		// Kijk na of de nieuwe container reeds in de lijst aanwezig is en
		// druk het resultaat af op het scherm.
		System.out.println(containers.contains(nieuweContainer) ? "Fout: De container was reeds aanwezig in de lijst."
				: "De container is toegevoegd in de lijst.");
	}
}