package kodutoo;

public class KuldKlient extends AbstraktneKlient {

    public KuldKlient() {
        super();
    }

    @Override
    public void arvutaHind(Product toode) {
        ostukorv.add(toode);
        hind += toode.price * 0.9;
    }
}
