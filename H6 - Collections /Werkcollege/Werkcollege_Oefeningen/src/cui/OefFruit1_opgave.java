package cui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OefFruit1_opgave {
	public static void main(String args[]) {
		String arX[] = { "appel", "peer", "citroen", "kiwi" },
				arY[] = { "banaan", "mango", "citroen", "kiwi", "zespri" };

		/*
		 * Behandel arX en arY als collections en maak gebruik van de bulkoperaties om
		 * volgende output te leveren: In y zit extra [banaan, mango, zespri] In x zit
		 * extra [appel, peer] x en y hebben gemeenschappelijk [citroen, kiwi]
		 */

		List<String> x, y;
		x = Arrays.asList(arX);
		y = Arrays.asList(arY);

		List<String> extraX, extraY, gemeenschappelijk;

		extraX = new ArrayList<>(x);
		extraX.removeAll(y);
		System.out.printf("In x zit extra %s%n", extraX);

		extraY = new ArrayList<>(y);
		extraY.removeAll(x);
		System.out.printf("In y zit extra %s%n", extraY);

		gemeenschappelijk = new ArrayList<>(x);
		gemeenschappelijk.retainAll(y);
		System.out.printf("x en y hebben gemeenschappelijk %s%n", gemeenschappelijk);

	}
}
