
public class Main {
    public static void main(String[] args) {
        Human one = new Human("Mihkel", 99, 2.22, true);
        Human two = new Human("Jaan", 20, 1.72, true);

        System.out.println(one);
        System.out.println(two);

        one.sayHello();
        two.sayHello();
        //main meetod 1 class
        //uus klass, kus on vähemalt 2 muutujat
        //vähemalt 1 funktsioon
        //toString() funktsioon
        //main meetodis on seda vähemalt 2 korda välja kutsutud
        //funktsioon välja kutsutud
    }
}
