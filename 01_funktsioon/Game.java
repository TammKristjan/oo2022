public class Game {
    //main -- pakub
    public static void main(String[] args) {
        //sout -- pakub
        System.out.println("Hello world");
        //String -- sõnaline muutuja
        //char -- üks täht
        //double -- 15 kohaline komakohaga number
        //float -- 17 kohaline komakohaga number'
        //int -- täiskohaline number 2.1mlj
        //byte -- 32 kohta
        //short -- 256 kohta
        //long --  ülipikk number, tavaliselt andmebaasis kasutusel
        //boolean -- kahendväärtus true/false
        int worldHeight = 5;
        int worldWidth = 10;

        char symbol; // deklareerib 1x muutuja, mitte iga kord deklareerib selle
        //fori -- pakub
        for (int y = 0; y < worldHeight; y++) {
            for (int x = 0; x < worldWidth; x++) {
                if (y == 0 || y == worldHeight-1) { // primitiiv // andmebaasipäring
                    symbol = '-';
                } else if (x == 0 || x == worldWidth-1) {
                    symbol = '|';
                } else {
                    symbol = ' ';
                }
                System.out.print(symbol);
            }
            //sout
            System.out.println();
        }
    }
}
