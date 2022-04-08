package kodutoo;

import java.util.Scanner;

// Autorid: Kristjan Tamm, Ragnar Valdre

public class Main {

    public static void main(String[] args) {

        boolean condition = true;

        Pood pood = new Pood();
        pood.kysiKoikiTooteid();
        String klient;
        Scanner vastus = new Scanner(System.in);
        System.out.println("Kas olete kuld klient? (j/e)");
        klient = vastus.nextLine();

        AbstraktneKlient klient123 = new TavalineKlient();
        if (klient.contains("j")) {
            klient123 =  new KuldKlient();
        }

        while(condition){

            int muutuja;
            Scanner toode = new Scanner(System.in);
            System.out.println("Vali toode: ");
            muutuja = toode.nextInt();
            Product hetkeToode = pood.kysiToode(muutuja);
            klient123.arvutaHind(hetkeToode);

            String tingimus;
            vastus = new Scanner(System.in);
            System.out.println("Kas soovid veel tooteid (j/e)");
            tingimus = vastus.nextLine();
            if(tingimus.contains("e")){
                System.out.println("Sinu ostukorvi hind: " + klient123.kysiHind() + "€");
                condition = false;
            }
        }

    }
}
