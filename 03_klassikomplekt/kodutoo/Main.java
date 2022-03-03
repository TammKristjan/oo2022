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

    }
}
