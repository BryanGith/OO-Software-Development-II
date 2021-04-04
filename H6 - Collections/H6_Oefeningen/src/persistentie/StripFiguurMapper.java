package persistentie;

import domein.StripFiguur;

public class StripFiguurMapper {

	public StripFiguur[] geefStripfiguren() {
		StripFiguur joe = new StripFiguur("Joe", 1.50);
		StripFiguur jack = new StripFiguur("Jack", 1.60);
		StripFiguur william = new StripFiguur("William", 1.65);
		StripFiguur averall = new StripFiguur("Averall", 1.90);
		StripFiguur theDaltons[] = { joe, william, jack, averall, joe };

		return theDaltons;
	}

	public StripFiguur[] geefExtraStripfiguren() {

		StripFiguur ma = new StripFiguur("Ma Dalton", 1.50);
		StripFiguur pa = new StripFiguur("Pa Dalton", 1.80);
		StripFiguur oomMarcel = new StripFiguur("oom Marcel", 1.70);
		StripFiguur oomHenry = new StripFiguur("oom Henry", 1.70);
		StripFiguur familieLeden[] = { ma, pa, oomMarcel, oomHenry };
		return familieLeden;
	}

}
