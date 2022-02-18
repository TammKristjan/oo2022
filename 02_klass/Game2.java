import java.util.Scanner;

public class Game2 {
    //main -- pakub
    public static void main(String[] args) {
        //sout -- pakub
        //String -- sõnaline muutuja
        //char -- üks täht
        //double -- 15 kohaline komakohaga number
        //float -- 17 kohaline komakohaga number'
        //int -- täiskohaline number 2.1mlj
        //byte -- 32 kohta
        //short -- 256 kohta
        //long --  ülipikk number, tavaliselt andmebaasis kasutusel
        //boolean -- kahendväärtus true/false
        //Math.random() -- 0 .. 0.9999 - 0 ... 4.9999 -- 0..2 .. 1..3

        World world = new World(5,10);

        //uue instantsi loomine ehk uue mälukohaga objekti tekitamine
        //kellel on kõik omadused mis on defineeritud tema klassis
        Player mangija1 = new Player(world.worldHeight, world.worldWidth); //uue klassi loomine
        Player mangija2 = new Player(world.worldHeight, world.worldWidth);

        Enemy vaenlane1 = new Enemy(world.worldHeight, world.worldWidth);

        world.printMap(mangija1.coordinateY,
                mangija1.coordinateX, vaenlane1.coordinateY, vaenlane1.coordinateX);

        //klasside tegemine tund nr2
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            mangija1.movePlayer(input, world.worldHeight, world.worldWidth);

            world.printMap(mangija1.coordinateY, mangija1.coordinateX,vaenlane1.coordinateY, vaenlane1.coordinateX);
            input = scanner.nextLine();
        }
    }


}
