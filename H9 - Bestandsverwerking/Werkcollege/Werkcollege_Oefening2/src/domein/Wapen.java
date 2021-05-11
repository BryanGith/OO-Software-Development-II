package domein;

public class Wapen
{
    private String soort;

    public Wapen(String soort)
    {
        this.setSoort(soort);
    }

    public String getSoort()
    {
        return soort;
    }

    private void setSoort(String soort)
    {
        this.soort = soort;
    }

    @Override
    public String toString()
    {
        return String.format("soort=%s", soort) ;
    }

}
