package hu.petrik.bankiszolgaltatasok;

public class HitelSzamla extends Szamla {
    private double hitelKeret;

    public HitelSzamla(Tulajdonos t, double hitelKeret) {
        super(t);
        this.hitelKeret = hitelKeret;
    }

    public double getHitelkeret() {
        return hitelKeret;
    }
}
