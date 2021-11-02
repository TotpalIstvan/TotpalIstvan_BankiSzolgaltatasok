package hu.petrik.bankiszolgaltatasok;

public class Kartya extends BankiSzolgaltatas {

    private Szamla s;
    private String kartyaSzam;

    public Kartya(Tulajdonos t, Szamla S, String kartyaSzam) {
        super(t);
        this.s = s;
        this.kartyaSzam = kartyaSzam;
    }

    public String getKartyaSzam() {
        return kartyaSzam;
    }

    public boolean Vásárlás(double osszeg) {
        Szamla s = new Szamla(super.getT());
        if (s.Kivesz(osszeg)) {
            return true;
        }
        else {
            return false;
        }
    }
}
