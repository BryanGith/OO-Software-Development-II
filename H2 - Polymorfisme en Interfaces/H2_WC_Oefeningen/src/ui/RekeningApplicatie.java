package ui;

import domein.DomeinController;

public class RekeningApplicatie 
{
	private final DomeinController dc;
	
	public RekeningApplicatie(DomeinController dc) 
	{
		this.dc = dc;
	}

	public void werkMetRekeningen()
	{
		// hier gebruik je de domeincontroller om met de domeinlaag te communiceren
		System.out.print(dc.geefRekeningen());
		System.out.print(dc.geefCodes());
	}
}
