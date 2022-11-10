package ba.unsa.etf.rpr;

import java.util.Objects;

public class MobilniBroj extends TelefonskiBroj {

    private int mobilnaMreza;
    private String broj;

    public MobilniBroj(int mobilnaMreza, String broj) {
        this.mobilnaMreza = mobilnaMreza;
        this.broj = broj;
    }

    @Override
    public String toString() {
        return "0" + mobilnaMreza + "/" + broj;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mobilnaMreza, broj);
    }

    @Override
    public int compareTo(Object o) {
        MobilniBroj a = (MobilniBroj) o;
        return this.Ispisi().compareTo(a.Ispisi());
    }

    @Override
    public String Ispisi() {
        return this.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MobilniBroj that = (MobilniBroj) o;
        return mobilnaMreza == that.mobilnaMreza && broj.equals(that.broj);
    }
}
