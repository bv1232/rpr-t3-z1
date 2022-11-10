package ba.unsa.etf.rpr;


import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class ProgramTest
{

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    void dodaj() throws Izuzezak {
        Imenik imenik = new Imenik();
        imenik.dodaj("Bakir Vreto", new FiksniBroj(Grad.SARAJEVO,"111-111"));
        imenik.dodaj("XY", new MobilniBroj(62 ,"222-222"));
        imenik.dodaj("Ime Prezime", new MedunarodniBroj("387","333-333" ));
        Assertions.assertEquals("033/111-111", imenik.dajBroj("Bakir Vreto"));
    }

    @Test
    void Izuzetak(){
        Assertions.assertThrows(Izuzezak.class, () -> {
    FiksniBroj broj = new FiksniBroj(Grad.SARAJEVO,"111-111");
        },"GRESKA");
    }

    @Test
    void izGrada() throws Izuzezak {
        Imenik imenik = new Imenik();
        imenik.dodaj("Bakir Vreto", new FiksniBroj(Grad.SARAJEVO,"111-111"));
        imenik.dodaj("XY", new MobilniBroj(62 ,"222-222"));
        imenik.dodaj("Ime Prezime", new MedunarodniBroj("387","333-333" ));
        Set<String> set = imenik.izGrada(Grad.SARAJEVO);
        String imena = "";
        for (String ime : set)
            imena += ime + ", ";

        Assertions.assertEquals("Bakir Vreto, XY, Ime Prezime, ", imena);
    }
}
