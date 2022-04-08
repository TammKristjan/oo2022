package kodutoo;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstraktneKlient {

    protected double hind = 0;
    protected List<Product> ostukorv = new ArrayList<>();

    public void arvutaHind(Product toode) {
        ostukorv.add(toode);
        hind += toode.price;
    }

    public double kysiHind() {
        return hind;
    }

    public String ostukorv() {

        String result = "";

        for (Product product : ostukorv) {
            result += product.name + "\n";
        }

        return result;
    }
}
