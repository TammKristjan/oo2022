package kodutoo;

import java.util.ArrayList;
import java.util.Random;
//import static kodutoo.Car.race;

public class Main {
    public static ArrayList<Car> cars = new ArrayList<>();
    public static void main(String[] args) {

        cars.add(new Car("Mitsubishi Lancer Evolution", 2007, 230, true));
        cars.add(new Car("Subaru Impreza WRX STI", 2002, 205, true));
        cars.add(new Car("Honda Civic Type R", 2003, 190, true));
        cars.add(new Car("Volkswagen Golf", 2006, 185, false));
        cars.add(new Car("Mercedes-Benz CLS", 2003, 200, false));
        cars.add(new Car("Nissan Skyline GT-R", 1999, 225, true));

        System.out.println("Võistlusel osalevad autod:");
        for (Car car: cars) {
            car.carInfo();
        }

        Car.chooseCar();

        Car.chooseWinner();

        /*
        ArrayList<String> Race = new ArrayList<>();
        int i = 0;
        while (i < 2) {
            System.out.println(i);
            Random rand = new Random();
            String randomCar = String.valueOf(cars.get(rand.nextInt(cars.size())));
            System.out.println(randomCar);
            if (race.size() == 1) {
                System.out.println(race.get(0) + "+++++");
                if (race.get(0) != randomCar){
                    System.out.println("IIIII");
                    race.add(randomCar);
                    i++;
                } else {
                    System.out.println("-------");
                    i = 1;
                }
            } else {
                race.add(randomCar);
                i++;
            }
            //System.out.println(race.get(0));
        }

         */
        /*
        System.out.println("1. kiirenduses osalevad:");
        System.out.println(race.get(0));
        System.out.println(race.get(1));
        System.out.println(race);
         */


        //ArrayList<String> race()

        /*
        int counter;
        String participant;
        for (counter = 0; counter < race.size(); counter++) {

            // accessing each element of array
            participant = race.get(0);
            //participant = race.get(counter);
            System.out.println(race.get(0) + "+++++");
            System.out.println(race.get(1) + "+++++");
        }
        */
        /*System.out.println("Kiirenduses osalevad autod:");
        one.carInfo();
        two.carInfo();
        three.carInfo();
        four.carInfo();
        five.carInfo();
        six.carInfo();
        */
        //main meetod 1 class
        //uus klass, kus on vähemalt 2 muutujat
        //vähemalt 1 funktsioon
        //toString() funktsioon
        //main meetodis on seda vähemalt 2 korda välja kutsutud
        //funktsioon välja kutsutud
    }
}
