package kujundid;

public class KujundMain {
    public static void main(String[] args) {
        Kolmnurk kolmnurk = new Kolmnurk(10, 10, 10);
        Ristkulik ristkulik = new Ristkulik(10, 5);
        Ruut ruut = new Ruut(10, 10);
        Ring ring = new Ring(3);

        System.out.println("Kolmnurga ümbermõõt: " + kolmnurk.arvutaYmbermoot());
        System.out.println("Ristküliku ümbermõõt: " + ristkulik.arvutaYmbermoot());
        System.out.println("Ruudu ümbermõõt: " + ruut.arvutaYmbermoot());
        System.out.println("Ringi ümbermõõt: " + ring.arvutaYmbermoot());

        System.out.println("Kolmnurga pindala: " + kolmnurk.arvutaPindala());
        System.out.println("Ristkulik pindala: " + ristkulik.arvutaPindala());
        System.out.println("Ruudu pindala: " + ruut.arvutaPindala());
        System.out.println("Ringi pindala: " + ring.arvutaPindala());
    }
}
