package kodutoo;

import java.util.ArrayList;
import java.util.List;

public class Pood {

    private static List<Product> tooted = new ArrayList<>();

    public Pood() {
        lisaTooted();
    }

    private static void lisaTooted() {
        tooted.add(new Product(1,"Snickers", 1));
        tooted.add(new Product(2,"Coca-Cola", 2));
        tooted.add(new Product(3,"Lays", 2));
        tooted.add(new Product(4, "Hot Dog", 4));
        tooted.add(new Product(5,"Burger", 5));
    }

    public void kysiKoikiTooteid() {
        for (Product toode: tooted) {
            toode.productInfo();
        }
    }

    public void valiToode(int id, AbstraktneKlient klient){

        Product toode = tooted.get(id - 1);
        klient.arvutaHind(toode);
        //System.out.println(toode);
    }

    public Product kysiToode(int id){
        return tooted.get(id-1);
    }

    public double kysiHind(AbstraktneKlient klient) {
        //System.out.println(klient.kysiHind());
        return klient.kysiHind();
    }


}
