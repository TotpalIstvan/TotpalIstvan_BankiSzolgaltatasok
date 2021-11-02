package hu.petrik.bankiszolgaltatasok;

public class Bank {
    private int maxHossz;

    public Bank(int maxHossz) {
        this.maxHossz = maxHossz;
    }

    public void Számlanyitás(Tulajdonos t, double hitelKeret) {
        HitelSzamla h = new HitelSzamla(t, hitelKeret);
        MegtakaritasiSzamla m = new MegtakaritasiSzamla(t,1);
    }


}
