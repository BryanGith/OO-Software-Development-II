package domein;

import java.util.Comparator;

public class EigenaarCompare implements Comparator<Container> {
	@Override
	public int compare(Container c1, Container c2) {
		return c1.getEigenaar().compareTo(c2.getEigenaar());
	}
}
