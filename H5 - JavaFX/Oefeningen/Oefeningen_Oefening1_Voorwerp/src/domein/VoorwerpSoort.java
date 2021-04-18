package domein;

public enum VoorwerpSoort
{

    SLEUTEL(new String[]
    {
        "naam", "gewicht", "niveau", "deur"
    }),
    WAPEN(new String[]
    {
        "naam", "gewicht", "niveau", "kracht", "gebruikt"
    });

    private final String[] attribuutNamen;

    VoorwerpSoort(String[] attributen)
    {
        attribuutNamen = attributen;
    }

    public String[] getAttribuutNamen()
    {
        return attribuutNamen;
    }
}
