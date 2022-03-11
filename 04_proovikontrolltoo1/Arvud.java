import java.util.ArrayList;
import java.util.List;

public class Arvud {
    List<Integer> arvudListis = new ArrayList<>();
    //[] - ilma ArrayList osata oleks väärtus - null

    public Arvud(int arv1, int arv2, int arv3){
        arvudListis.add(arv1);
        arvudListis.add(arv2);
        arvudListis.add(arv3);
    }

    public void lisaArv(int arv){
        arvudListis.add(arv);
    }
    /*
    public List<Double> lististLibisevaKesk() {

        List<Double> loppList = new ArrayList<>(this.numbrid.size() - 2);
        for (int i = arvudKeskmisega.size(); i < this.numbrid.size() - 2; i++) {
            loppList.add((this.numbrid.get(i + 1) + this.numbrid.get(i + 2)) / 2);
        }
        keskendatudNumbrid.addAll(loppList);
        return keskendatudNumbrid;
    }
    */
}
