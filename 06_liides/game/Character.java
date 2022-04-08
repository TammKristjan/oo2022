package game;

// abstract -- ei saa teha new Character() - uut instans
public abstract class Character {
    int coordinateY;
    int coordinateX;
    boolean isVisible;

    public Character(int worldHeight, int worldWidth) {
        this.coordinateY = generateRandomCoordinate(worldHeight);
        this.coordinateX = generateRandomCoordinate(worldWidth);
    }

    public int generateRandomCoordinate(int worldSize) {
        return (int) ((Math.random()*(worldSize-2))+1); // cast
    }
}
