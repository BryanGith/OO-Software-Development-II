package domein;

public class DomeinController_Oef2
{
    private final KostenRepository kr;
	
    public DomeinController_Oef2()
    {
            kr = new KostenRepository();
    }
        
    public String geefOverzichtAantalDocumenten()
    {
        return kr.geefOverzichtAantalDocumenten();
    }
    
     public String geefKostenLijst()
     {
         return kr.geefKostenLijst();
     }
     
}
