package ui;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import domein.DomeinController_Oef2;

public class VoorbeeldApplicatie 
{
	private final DomeinController_Oef2 dc;
	
	public VoorbeeldApplicatie(DomeinController_Oef2 dc) {
		this.dc = dc;
	}

	public void start() 
	{
		afdrukkenLijst("\nDe Daltons als lijst:", dc.geefOverzicht());

		afdrukkenLijst("\nDe Daltons als gesorteerdeLijst op naam:", dc.geefOverzichtGesorteerdOpNaam());
		afdrukkenLijst("\nDe Daltons als gesorteerdeLijst op aflopende grootte:", dc.geefOverzichtGesorteerdOpAflopendeGrootte());
		
		afdrukkenLijst("\nDe Daltons zonder dubbels:",dc.haalDubbelsEruit());
		
		dc.voegExtraStripfigurenToe();
		
		afdrukkenLijst("\nDe Daltons als gesorteerdeLijst op naam:", dc.geefOverzichtGesorteerdOpNaam());
		
		afdrukkenLijst("\nDrie willekeurige Dalton-figuren:",dc.pick3());

	}
	
	private void afdrukkenLijst(String message, List<String> lijst)
	{
		System.out.println(message);
		for(String figuur: lijst)
			System.out.println(figuur);
	}
}
