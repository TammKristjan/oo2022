package kujundid;


public abstract class Nelinurk implements Kujund{
    double kylg1;
    double kylg2;

    public Nelinurk(double kylg1, double kylg2) {
        this.kylg1 = kylg1;
        this.kylg2 = kylg2;

    }
    @Override
    public double arvutaYmbermoot() {
        return 2*(kylg1 + kylg2);
    }

    @Override
    public double arvutaPindala() {
        return kylg1 * kylg2;
    }
}
