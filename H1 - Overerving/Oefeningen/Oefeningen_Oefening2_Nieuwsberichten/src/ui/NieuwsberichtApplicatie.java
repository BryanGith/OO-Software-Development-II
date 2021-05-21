package ui;

import domein.Message;
import domein.NewsThread;

public class NieuwsberichtApplicatie {
	public static void main(String[] args) {
		Message t = new NewsThread("Dit is een nieuwsbericht.");
		
		t.add("Dit is een opmerking.");
		
		t.getComments().get(0).add("Dit is een opmerking op een opmerking.");
		
		System.out.println(t);
	}
}
