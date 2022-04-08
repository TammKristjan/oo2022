package kodutoo;

public class Klient implements Hind{
    double hind;
    double soodus;

    public Klient(double hind, double soodus){
        this.hind = hind;
        this.soodus = soodus;
    }


    @Override
    public double kuldklient(){
        return hind*soodus;
    }
    @Override
    public double tavaklient(){
        return hind;
    }
}
