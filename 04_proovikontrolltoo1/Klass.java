import java.util.ArrayList;
import java.util.List;

public class Klass {
    List<Integer> xCoords = new ArrayList<>();
    List<Integer> yCoords = new ArrayList<>();

    public void setxCoords(int x1, int x2, int x3) {
        xCoords.add(x1);
        xCoords.add(x2);
        xCoords.add(x3);
    }

    public void setyCoords(int y1, int y2, int y3) {
        xCoords.add(y1);
        xCoords.add(y2);
        xCoords.add(y3);
    }

    @Override
    public String toString() {
        return "Klass{" +
                "xCoords=" + xCoords +
                ", yCoords=" + yCoords +
                '}';
    }
}
