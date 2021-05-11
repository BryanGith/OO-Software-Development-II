package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import domein.MijnString;

class MijnStringTest 
{

	@Test 
    public void maakMijnString_inhoudNull_werptException()
	{
        Assertions.assertThrows(IllegalArgumentException.class , () -> {new MijnString(null);});
    }
    
    @Test
    public void maakMijnString_inhoudIngevuld_maaktObject()
    {
        MijnString ms = new MijnString("test");
        Assertions.assertEquals("test", ms.getInhoud());
    }
    
    @Test
    public void maakMijnString_inhoudLegeString_werptException()
    {
        Assertions.assertThrows(IllegalArgumentException.class , () -> {new MijnString("");});
    }
  
    @Test
    public void bepaalMiddelsteKar_retourneertCorrectKarakter()
    {
        MijnString ms = new MijnString("lepel");
        Assertions.assertEquals('p',ms.bepaalMiddelsteKar());
    }
  
    @Test
    public void isPalindroom_retourneertTrue()
    {
        MijnString ms = new MijnString("lepel");
        Assertions.assertTrue(ms.isPalindroom());
    }
  
    @Test
    public void isPalindroom_retourneertFalse()
    {
        MijnString ms = new MijnString("hallo");
        Assertions.assertFalse(ms.isPalindroom());
    }    

}
