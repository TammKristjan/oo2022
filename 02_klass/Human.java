public class Human {
    String nimi;
    int vanus;
    double pikkus;
    boolean mees;
    char symbol;

    public Human(String nimi, int vanus, double pikkus, boolean mees){
        this.nimi = nimi;
        this.vanus = vanus;
        this.pikkus = pikkus;
        this.mees = mees;
        this.symbol = 'R';
    }

    public void sayHello(){
        System.out.println(nimi + " Ütleb hello!");
    }

    //to -- võtan toString() -- enter
    @Override
    public String toString() {
        return "Human{" +
                "nimi='" + nimi + '\'' +
                ", vanus=" + vanus +
                ", pikkus=" + pikkus +
                ", mees=" + mees +
                ", symbol=" + symbol +
                '}';
    }
}
