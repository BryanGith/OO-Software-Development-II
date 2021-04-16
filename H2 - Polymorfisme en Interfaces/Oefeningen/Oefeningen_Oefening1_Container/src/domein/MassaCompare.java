package domein;

import java.util.Comparator;

public class MassaCompare implements Comparator<Container> {

	@Override
	public int compare(Container c1, Container c2) {
		return Double.compare(c1.getMassa(), c2.getMassa());
	}

}
