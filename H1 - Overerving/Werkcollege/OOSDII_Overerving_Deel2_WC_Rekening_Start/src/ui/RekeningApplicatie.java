package ui;

import domein.DomeinController;

public class RekeningApplicatie {
	private final DomeinController dc;

	public RekeningApplicatie(DomeinController dc) {
		this.dc = dc;
	}

	public void werkMetRekeningen() {
		System.out.print(dc.geefRekeningen());
		System.out.print(dc.geefCodes());
	}
}
