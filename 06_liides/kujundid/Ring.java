package kujundid;

public class Ring implements Kujund{
    double raadius;

    public Ring(double raadius){
        this.raadius = raadius;
    }

    @Override
    public double arvutaYmbermoot() {
        return 2*raadius*3.14;
    }

    @Override
    public double arvutaPindala() {
        return Math.pow(raadius, 2)*3.14;
    }
}
