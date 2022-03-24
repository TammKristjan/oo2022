package kodutoo;

public abstract class Generator {
    int bottom;
    int upper;

    public Generator(int number1, int number2){
        this.bottom = generateNumbers(number1);
        this.upper = generateNumbers(number2);
    }

    public int generateNumbers(int number){
        return (int) (Math.random()+number);
    }
}
