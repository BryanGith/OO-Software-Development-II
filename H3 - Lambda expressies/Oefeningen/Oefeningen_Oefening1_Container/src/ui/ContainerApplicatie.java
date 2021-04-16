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
		System.out.println();

		// Stap 1 - pas de code aan zodat de klasse die sorteren op massa mogelijk maakt
		// wordt vervangen door een anonymous inner class
		System.out.println("Containers bij sorteren op massa: ");
		Comparator<Container> comparator = new Comparator<>() {

			@Override
			public int compare(Container c1, Container c2) {
				return Double.compare(c1.getMassa(), c2.getMassa());

			}
		};
		Collections.sort(containers, comparator);
		for (Container container : containers) {
			System.out.printf("%dkg - %s - %dm²%n", container.getMassa(), container.getEigenaar(),
					container.getVolume());

		}
		System.out.println();

		// Stap 2 - pas de code aan zodat de klasse die sortern op eigenaar mogelijk
		// maakt wordt vervangen door een lambda expressie in de applicatie
		System.out.println("Containers bij sorteren op eigenaar: ");
		Collections.sort(containers, (c1, c2) -> c1.getEigenaar().compareTo(c2.getEigenaar()));

		for (Container container : containers) {
			System.out.printf("%s - %dm² - %dkg%n", container.getEigenaar(), container.getVolume(),
					container.getMassa());
		}
		System.out.println();

		// Stap 3 - breid de code uit zodat de applicatie ook sorteert op serienummer,
		// implementeer dit met een 'method reference' en laat het systeem de Comparator
		// zelf opstellen
		System.out.println("Containers bj sorteren op serienummer: ");
		Comparator<Container> comparator2 = Comparator.comparing(Container::getSerialNumber);
		Collections.sort(containers, comparator2);

		for (Container container : containers) {
			System.out.printf("%d - %s - %dm² - %dkg%n", container.getSerialNumber(), container.getEigenaar(),
					container.getVolume(), container.getMassa());
		}

	}
}