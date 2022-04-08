package kodutoo;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class AutomaatTest {

    @Test
    public void poodTootab() {
        Pood pood = new Pood();

        pood.kysiKoikiTooteid();
    }

    @Test
    public void klientTootab() {
        AbstraktneKlient kuldKlient = new KuldKlient();
        AbstraktneKlient tavaKlient = new TavalineKlient();
        Pood pood = new Pood();

        pood.valiToode(1, kuldKlient);
        //System.out.println(kuldKlient.kysiHind());
        assertThat(kuldKlient.kysiHind(), is(0.9));

        pood.valiToode(1, tavaKlient);
        //System.out.println(tavaKlient.kysiHind());
        assertThat(tavaKlient.kysiHind(), is(1.0));
    }

    @Test
    public void ostukorv() {
        AbstraktneKlient kuldKlient = new KuldKlient();
        Pood pood = new Pood();

        pood.valiToode(1, kuldKlient);
        pood.valiToode(2, kuldKlient);
        pood.valiToode(3, kuldKlient);
        pood.valiToode(4, kuldKlient);
        pood.valiToode(5, kuldKlient);

        String oigeKorv = "Snickers\n" +
                "Coca-Cola\n" +
                "Lays\n" +
                "Hot Dog\n" +
                "Burger\n";

        assertThat(kuldKlient.ostukorv(), is(oigeKorv));
        //System.out.println(kuldKlient.ostukorv());
    }
}
