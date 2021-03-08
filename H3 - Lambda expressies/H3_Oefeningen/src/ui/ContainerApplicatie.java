package ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import domein.Container;

public class ContainerApplicatie {

	public static void main(String[] args) {
		List<Container> containers = new ArrayList<>();

		containers.add(new Container("Antwerpen", 60, 150, 1234));
		containers.add(new Container("Rotterdam", 70, 110, 2568));
		containers.add(new Container("Calais", 80, 90, 8569));
		containers.add(new Container("Brugge", 70, 100, 8564));

		Collections.sort(containers);
		System.out.println("Containers bij natuurlijk sorteren: ");
		for (Container container : containers) {
			System.out.printf("%dm² - %s - %dkg%n", container.getVolume(), container.getEigenaar(),
					container.getMassa());
		}

		// 1
		// Pas de code aan zodat de klasse die sorteren op massa mogelijk maakt wordt
		// vervangen dooreen 'anonymous inner class' in de applicatie.
		Comparator<Container> comparator = new Comparator<>() {
			@Override
			public int compare(Container c1, Container c2) {
				return Double.compare(c1.getMassa(), c2.getMassa());
			}
		};

		Collections.sort(containers, comparator);
		System.out.println("\nContainers bij sorteren op massa: ");
		for (Container container : containers) {
			System.out.printf("%dkg - %s - %dm²%n", container.getMassa(), container.getEigenaar(),
					container.getVolume());

		}

		// 2
		// Pas de code aan zodat de klasse die sorteren op eigenaar mogelijk maakt wordt
		// vervangendoor een lambda expressie in de applicatie.1
		Comparator<Container> comparator2 = (c1, c2) -> c1.getEigenaar().compareTo(c2.getEigenaar());

		Collections.sort(containers, comparator2);
		System.out.println("\nContainers sorteren op eigenaar:");
		for (Container container : containers) {
			System.out.printf("%s - %dm² - %dkg%n", container.getEigenaar(), container.getVolume(),
					container.getMassa());
		}

		// 3
		// Breid de code uit zodat de applicatie ook sorteert op serienummer.
		// Implementeer dit meteen 'method reference' en laat het systeem de Comparator
		// zelf opstellen.
		Comparator<Container> comparator3 = Comparator.comparing(Container::getSerialNumber);
		Collections.sort(containers, comparator3);
		System.out.println("\nContainers sorteren op serienummer: ");
		for (Container container : containers) {
			System.out.printf("%d - %s - %dm² - %dkg%n", container.getSerialNumber(), container.getEigenaar(),
					container.getVolume(), container.getMassa());
		}

		// 4
		// Pas nu de code aan zodat de sortering in omgekeerde volgorde gebeurt.
		// bij de .sort *-1 toevoegen
	}
}