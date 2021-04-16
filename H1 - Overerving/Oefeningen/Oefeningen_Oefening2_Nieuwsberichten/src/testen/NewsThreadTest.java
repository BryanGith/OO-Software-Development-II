package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import domein.Message;
import domein.NewsThread;

public class NewsThreadTest {
	private String myNewsThread = "Dit is een nieuwsbericht.";
	private String myRemark = "Dit is een opmerking.";
	private String myRemarkOnARemark = "Dit is een opmerking op een opmerking.";

	@ParameterizedTest
	@ValueSource(strings = {" ", "\t"})
	public void maakNewsThread(String msg) {
		Assertions.assertThrows(IllegalArgumentException.class, () -> new NewsThread(msg));
	}

	@Test
	public void maakNewsThread() {
		
		Message t = new NewsThread(myNewsThread);
		
		Assertions.assertEquals(myNewsThread, t.toString());
	}
	
	@Test
	public void add_GeldigeOpmerking() {
		Message t = new NewsThread(myNewsThread);
		t.add(myRemark);
				
		Assertions.assertEquals(String.format("%s%n\tLevel 0: %s", myNewsThread, myRemark), 
				t.toString());
		
		t.getComments().get(0).add(myRemarkOnARemark);
				
		Assertions.assertEquals(String.format("%s%n\tLevel 0: %s%n"
				+ "\t\tLevel 1: %s", myNewsThread, myRemark, myRemarkOnARemark), 
				t.toString());
	}
}
