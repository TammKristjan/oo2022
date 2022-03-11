
// AUTOR: KRISTJAN TAMM
// ÜL: algarvud

import java.util.Scanner;  // Impordib Scanner klassi

public class Kontrolltoo {
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);  // Loob Scanner objekti
        System.out.println("Sisesta arv");
        int arv = Obj.nextInt();  // Loeb kasutaja sisestust
        // System.out.println("Sisestatud arv on: " + arv);  // Väljastab kasutaja sisestuse

        // leiab töö käsu järgi, et kas kasutaja sisestatud arv jagub antud arvudega
        jagamine(arv);

        // kontrollib, kas kasutaja sisestatud arv on algarv
        if(algarvuKonrollimine(arv) == true) {
            System.out.println("Tegemist on algarvuga");
        } else {
            System.out.println("Tegemist EI ole algarvuga");
        }

        Scanner massive = new Scanner(System.in);  // loob Scanner objekti
        System.out.print("Sisesta massiivi suurus (1000): ");
        // töö käsu järgi peaks olema massiivi suurus ehk kasutaja sisestus selles kohas "1000"
        int arraySize = massive.nextInt();  // loeb kasutaja sisestust

        // kontrollib, et kasutaja sisestus ei oleks negatiivne
        if(arraySize > 0){
            massiiv(arraySize);
        } else {
            System.out.println("Massiivi suurus ei saa olla negatiivne!");
        }

    }

    public static void jagamine(int arv) {
        if(arv % 2 == 0){
            System.out.println("Arv: " + arv + " jagub 2-ga");
        } else {
            System.out.println("Arv: " + arv + " EI jagu 2-ga");
        }
        if(arv % 3 == 0) {
            System.out.println("Arv: " + arv + " jagub 3-ga");
        } else {
            System.out.println("Arv: " + arv + " EI jagu 3-ga");
        }
        if(arv % 5 == 0) {
            System.out.println("Arv: " + arv + " jagub 5-ga");
        } else {
            System.out.println("Arv: " + arv + " EI jagu 5-ga");
        }
        if(arv % 7 == 0) {
            System.out.println("Arv: " + arv + " jagub 7-ga");
        } else {
            System.out.println("Arv: " + arv + " EI jagu 7-ga");
        }
    }

    public static boolean algarvuKonrollimine(int arv) {
        // kontrollib antud arvu ja väljastab true/false olenevalt, kas arv on algarv
        if (arv <= 1)
            return false;

        for (int i = 2; i < arv; i++)
            if (arv % i == 0)
                return false;

        return true;
    }

    public static void massiiv(int arraySize) {
        // loob masiivi ja lisab sinna vajaliku arvu algarve
        int[] myIntArray = new int[arraySize];
        int n = 1;
        for (int i = 0; i < arraySize; ) {
            if (algarvuKonrollimine(n) == true) {
                myIntArray[i] = n;
                n++;
                i++;
            } else {
                n++;
            }
        }

        // kirjutab välja massiivis olevad algarvud
        System.out.println("Masiivis olevad algarvud:");

        int i, x, y;
        // iga massiivi arvu välja kirjutamine
        for (i = 0; i < myIntArray.length; i++) {
            x = myIntArray[i];
            System.out.print(x + " ");
        }
        // väljatrüki rea lõpetuseks
        System.out.println();

        // tuhandes algarv
        y = myIntArray[myIntArray.length-1];

        // tuhandenda algarvu ruut
        y = y*y;

        n = y;
        System.out.println("Tuhandenda algarvu ruut: " + y);
        System.out.println("Viimased 10 suurimat algarvu, mis on väiksemad kui tuhanenda algarvu ruut: ");

        // otsib 10 suurimat algarvu, mis on väiksemad kui massiivi tuhanenda algarvu ruut
        for (i = 0; i < 10;) {
            if (algarvuKonrollimine(n) == true) {
                System.out.print(n + " ");
                n--;
                i++;
            } else {
                n--;
            }
        }

    }
}
