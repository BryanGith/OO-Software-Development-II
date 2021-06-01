package domein;

public class DomeinController {
    private Cryptografie crypto;
    private String gecodeerdBericht;

    public DomeinController() {
        crypto = new Cryptografie();
    }

    public void codeerBericht(String bericht) {
        gecodeerdBericht = crypto.codeerBericht(bericht);
    }

    public String geefGecodeerdBericht() {
        return gecodeerdBericht;
    }

}
