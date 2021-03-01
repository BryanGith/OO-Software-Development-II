package ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import domein.Container;
import domein.MassaCompare;

public class ContainerApplicatie {

	public static void main(String[] args) {
		List<Container> containers = new ArrayList<>();

		containers.add(new Container("Antwerpen", 60, 150, 1234));
		containers.add(new Container("Rotterdam", 70, 110, 2568));
		containers.add(new Container("Calais", 80, 90, 8569));
		containers.add(new Container("Brugge", 70, 100, 8564));

		// Stap 1
		Collections.sort(containers);
		System.out.println("Containers bij natuurlijk sorteren: ");
		for (Container container : containers) {
			System.out.printf("%dm² - %s - %dkg%n", container.getVolume(), container.getEigenaar(),
					container.getMassa());
		}

		// Stap 2
		Collections.sort(containers, new MassaCompare());
		System.out.println("Containers bij sorteren op massa: ");
		for (Container container : containers) {
			System.out.printf("%dkg - %s - %dm²%n", container.getMassa(), container.getEigenaar(),
					container.getVolume());
		}

		// Stap 3

	}
}