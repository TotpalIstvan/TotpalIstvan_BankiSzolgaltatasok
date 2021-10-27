package hu.petrik.bankiszolgaltatasok;

public class HitelSzámla extends Számla {
    private double hitelKeret;

    public  HitelSzámla(Tulajdonos t, double hitelKeret) {
        super(t);
        this.hitelKeret = hitelKeret;
    }

    public double getHitelkeret() {
        return hitelKeret;
    }
}
