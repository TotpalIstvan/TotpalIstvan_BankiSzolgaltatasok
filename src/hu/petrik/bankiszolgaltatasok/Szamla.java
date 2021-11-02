package hu.petrik.bankiszolgaltatasok;

public class Szamla extends BankiSzolgaltatas {
    private double egyenleg;

    public Szamla(Tulajdonos t) {
        super(t);
    }

    public double getEgyenleg() {
        return egyenleg;
    }

    public double Befizet(double osszeg) {
        egyenleg += osszeg;
        return egyenleg;
    }

    public  boolean Kivesz(double osszeg) {
        HitelSzamla h = new HitelSzamla(this.getT(), getEgyenleg());
        if (egyenleg - osszeg > -1*h.getHitelkeret()) {
            egyenleg -= osszeg;
            return true;
        }else {
            return false;
        }
    }

    public Kartya ÚjKártya(String leendoSzam) {
        Szamla s = new Szamla(super.getT());
        Kartya k = new Kartya(this.getT(), s, leendoSzam);
        return k;
    }
}
