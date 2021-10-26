package hu.petrik.bankiszolgaltatasok;

public class HitelSzámla extends Számla {
    private double hitelkeret;

    public  HitelSzámla(Tulajdonos t, double hitelkeret) {
        super(t);
        this.hitelkeret = hitelkeret;
    }

    public double getHitelkeret() {
        return hitelkeret;
    }
}
