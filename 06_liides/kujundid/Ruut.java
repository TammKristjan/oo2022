package kujundid;

public class Ruut extends Nelinurk {
    public Ruut(double kylg1, double kylg2) {
        super(kylg1, kylg2);
        if(kylg1 != kylg2){
            throw new IllegalArgumentException("Ruudu küljed ei saa olla erinevad");
        }
    }
}
