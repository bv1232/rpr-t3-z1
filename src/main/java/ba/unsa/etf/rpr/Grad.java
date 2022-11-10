package ba.unsa.etf.rpr;

public enum Grad {
    SARAJEVO("033"), ZENICA("035"), BANJALUKA("032"), MOSTAR("031");
    private String pozivni;
    Grad(String pozivni) {
        this.pozivni = pozivni;
    }

    @Override
    public String toString() {
        return pozivni;
    }
}
