package hu.petrik.bankiszolgaltatasok;

public class Számla extends BankiSzolgáltatás{
    private double egyenleg;

    public Számla(Tulajdonos t) {
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
        HitelSzámla h = new HitelSzámla(this.getT(), getEgyenleg());
        if (egyenleg - osszeg > -1*h.getHitelkeret()) {
            egyenleg -= osszeg;
            return true;
        }else {
            return false;
        }
    }

    public Kártya ÚjKártya(String leendoSzam) {
        Számla s = new Számla(super.getT());
        Kártya k = new Kártya(this.getT(), s, leendoSzam);
        return k;
    }
}
