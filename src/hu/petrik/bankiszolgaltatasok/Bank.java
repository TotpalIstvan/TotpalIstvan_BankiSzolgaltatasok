package hu.petrik.bankiszolgaltatasok;

public class Bank {
    private int maxHossz;

    public Bank(int maxHossz) {
        this.maxHossz = maxHossz;
    }

    public void Számlanyitás(Tulajdonos t, double hitelKeret) {
        HitelSzámla h = new HitelSzámla(t, hitelKeret);
        MegtakarításiSzámla m = new MegtakarításiSzámla(t,1);
    }
}
