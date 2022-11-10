package ba.unsa.etf.rpr;

import java.util.Objects;

public class FiksniBroj extends TelefonskiBroj implements Comparable{
    private Grad grad;
    private String broj;

    public FiksniBroj(Grad gr, String br) throws Izuzezak {
        if(br.length() >10 ) throw new Izuzezak("!!POGRESAN FORMAT!!");
        grad = gr;
        broj = br;
    }

    @Override
    public String Ispisi() {

        return grad.toString() + "/" + broj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FiksniBroj that = (FiksniBroj) o;
        return grad == that.grad && broj.equals(that.broj);
    }

    @Override
    public int hashCode() {

        return Objects.hash(grad, broj);
    }

    @Override
    public int compareTo(Object o) {

        FiksniBroj a = (FiksniBroj) o;
        return this.Ispisi().compareTo(a.Ispisi());
    }

    public Grad dajGrad(){ return grad; }
}

