package hu.petrik.bankiszolgaltatasok;

public class BankiSzolgáltatás {
    private Tulajdonos t;

    public BankiSzolgáltatás (Tulajdonos t) {
        this.t = t;
    }

    public Tulajdonos getT() {
        return t;
    }
}
