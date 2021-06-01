package domein;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Onderhoud {
    private LocalDate begindatum;
    private LocalDate einddatum;
    private Auto auto;

    public Onderhoud(LocalDate begindatum, LocalDate einddatum, Auto auto) {
        if (begindatum.isAfter(einddatum))
            throw new IllegalArgumentException("Einddatum onderhoud mag niet voor begindatum liggen");
        this.begindatum = begindatum;
        this.einddatum = einddatum;
        setAuto(auto);
    }

    public LocalDate getBegindatum() {
        return begindatum;
    }

    public final void setBegindatum(LocalDate begindatum) {
        this.begindatum = begindatum;
    }

    public LocalDate getEinddatum() {
        return einddatum;
    }

    public final void setEinddatum(LocalDate einddatum) {
        this.einddatum = einddatum;
    }

    public Auto getAuto() {
        return auto;
    }

    private void setAuto(Auto auto) {
        if (auto == null)
            throw new IllegalArgumentException("Je moet een auto opgeven voor het onderhoud");
        this.auto = auto;
    }

    // implementeer
    // dit onderhoud is aangrenzend met anderOnderhoud als
    // - ze voor dezelfde auto zijn EN
    // - de beginDatum van anderOnderhoud exact 1 dag verder ligt dan de einddatum
    // van dit onderhoud
    public boolean isAangrenzendMet(Onderhoud anderOnderhoud) {
        if (auto.equals(anderOnderhoud.getAuto()) && getEinddatum().isEqual(anderOnderhoud.getBegindatum().minusDays(1))) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-uuuu");
        return String.format("Van %s t.e.m. %s voor %s", begindatum.format(format), einddatum.format(format), auto);
    }

}
