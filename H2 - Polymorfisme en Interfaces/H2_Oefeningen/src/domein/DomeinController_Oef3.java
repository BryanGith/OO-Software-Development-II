package domein;

public class DomeinController_Oef3
{
    private final KostenRepository kr;
	
    public DomeinController_Oef3()
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
