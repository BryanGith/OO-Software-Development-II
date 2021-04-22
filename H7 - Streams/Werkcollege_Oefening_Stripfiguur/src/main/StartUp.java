package main;

import domein.DomeinController;
import ui.VoorbeeldApplicatie;

public class StartUp 
{
	public static void main(String[] args) 
	{
		new VoorbeeldApplicatie(new DomeinController()).start();
	}

	
}
