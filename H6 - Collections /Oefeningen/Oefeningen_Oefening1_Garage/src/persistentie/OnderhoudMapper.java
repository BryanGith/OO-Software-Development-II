package persistentie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import domein.Auto;
import domein.Onderhoud;

public class OnderhoudMapper {

	public Collection<Onderhoud> geefOnderhoudVanAutos() {

		List<Auto> lijstAutos = new ArrayList<>();
		lijstAutos.add(new Auto("123xyz", "Toyota", "Yaris"));
		lijstAutos.add(new Auto("456abc", "Opel", "Astra"));
		lijstAutos.add(new Auto("azerty", "BMW", "Berline"));
		lijstAutos.add(new Auto("qwerty", "Toyota", "Avensis"));
		lijstAutos.add(new Auto("789cde", "Mercedes", "C-klasse Berline"));
		lijstAutos.add(new Auto("567xyz", "Renault", "Fluence"));
		lijstAutos.add(new Auto("ab12ab", "Opel", "Zafira"));
		lijstAutos.add(new Auto("xy12xy", "Peugeot", "308"));

		List<Onderhoud> onderhoudLijst = new ArrayList<>();

		LocalDate begindatum = LocalDate.of(2019, 12, 12);
		LocalDate einddatum = LocalDate.of(2019, 12, 14);
		Onderhoud onderhoud = new Onderhoud(begindatum, einddatum, lijstAutos.get(0));
		onderhoudLijst.add(onderhoud);

		begindatum = LocalDate.of(2020, 1, 11);
		einddatum = LocalDate.of(2020, 1, 12);
		onderhoud = new Onderhoud(begindatum, einddatum, lijstAutos.get(4));
		onderhoudLijst.add(onderhoud);

		begindatum = LocalDate.of(2019, 11, 16);
		einddatum = LocalDate.of(2019, 11, 16);
		onderhoud = new Onderhoud(begindatum, einddatum, lijstAutos.get(5));
		onderhoudLijst.add(onderhoud);

		begindatum = LocalDate.of(2019, 12, 17);
		einddatum = LocalDate.of(2019, 12, 18);
		onderhoud = new Onderhoud(begindatum, einddatum, lijstAutos.get(0));
		onderhoudLijst.add(onderhoud);

		begindatum = LocalDate.of(2020, 1, 11);
		einddatum = LocalDate.of(2020, 1, 11);
		onderhoud = new Onderhoud(begindatum, einddatum, lijstAutos.get(1));
		onderhoudLijst.add(onderhoud);

		begindatum = LocalDate.of(2020, 12, 15);
		einddatum = LocalDate.of(2020, 12, 15);
		onderhoud = new Onderhoud(begindatum, einddatum, lijstAutos.get(2));
		onderhoudLijst.add(onderhoud);

		begindatum = LocalDate.of(2019, 12, 15);
		einddatum = LocalDate.of(2019, 12, 16);
		onderhoud = new Onderhoud(begindatum, einddatum, lijstAutos.get(0));
		onderhoudLijst.add(onderhoud);

		begindatum = LocalDate.of(2020, 12, 8);
		einddatum = LocalDate.of(2020, 12, 10);
		onderhoud = new Onderhoud(begindatum, einddatum, lijstAutos.get(2));
		onderhoudLijst.add(onderhoud);

		begindatum = LocalDate.of(2019, 12, 20);
		einddatum = LocalDate.of(2019, 12, 20);
		onderhoud = new Onderhoud(begindatum, einddatum, lijstAutos.get(7));
		onderhoudLijst.add(onderhoud);

		begindatum = LocalDate.of(2020, 1, 11);
		einddatum = LocalDate.of(2020, 1, 12);
		onderhoud = new Onderhoud(begindatum, einddatum, lijstAutos.get(3));
		onderhoudLijst.add(onderhoud);

		begindatum = LocalDate.of(2020, 12, 11);
		einddatum = LocalDate.of(2020, 12, 12);
		onderhoud = new Onderhoud(begindatum, einddatum, lijstAutos.get(2));
		onderhoudLijst.add(onderhoud);

		begindatum = LocalDate.of(2019, 11, 17);
		einddatum = LocalDate.of(2019, 11, 17);
		onderhoud = new Onderhoud(begindatum, einddatum, lijstAutos.get(5));
		onderhoudLijst.add(onderhoud);

		begindatum = LocalDate.of(2019, 12, 17);
		einddatum = LocalDate.of(2019, 12, 19);
		onderhoud = new Onderhoud(begindatum, einddatum, lijstAutos.get(7));
		onderhoudLijst.add(onderhoud);

		begindatum = LocalDate.of(2019, 12, 19);
		einddatum = LocalDate.of(2019, 12, 21);
		onderhoud = new Onderhoud(begindatum, einddatum, lijstAutos.get(0));
		onderhoudLijst.add(onderhoud);

		begindatum = LocalDate.of(2019, 11, 18);
		einddatum = LocalDate.of(2019, 11, 18);
		onderhoud = new Onderhoud(begindatum, einddatum, lijstAutos.get(5));
		onderhoudLijst.add(onderhoud);

		begindatum = LocalDate.of(2020, 1, 15);
		einddatum = LocalDate.of(2020, 1, 15);
		onderhoud = new Onderhoud(begindatum, einddatum, lijstAutos.get(6));
		onderhoudLijst.add(onderhoud);

		begindatum = LocalDate.of(2019, 12, 21);
		einddatum = LocalDate.of(2019, 12, 23);
		onderhoud = new Onderhoud(begindatum, einddatum, lijstAutos.get(7));
		onderhoudLijst.add(onderhoud);

		return onderhoudLijst;

	}
}
