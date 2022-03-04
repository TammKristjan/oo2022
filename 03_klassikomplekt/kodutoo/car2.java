package kodutoo;

import static kodutoo.Main.cars;

public class car2 {
    public static void chooseWinner(){
        System.out.println("Kiirused:");
        System.out.println((cars.get(Car.indexes.get(0))).info.model + " kiirus: " + (cars.get(Car.indexes.get(0))).info.topSpeed + "km/h");
        System.out.println((cars.get(Car.indexes.get(1))).info.model + " kiirus: " + (cars.get(Car.indexes.get(1))).info.topSpeed + "km/h");
        if((cars.get(Car.indexes.get(0))).info.topSpeed > (cars.get(Car.indexes.get(1))).info.topSpeed){
            System.out.println("Kiirenduse võitja: " + (cars.get(Car.indexes.get(0))).info.model);
        } else {
            System.out.println("Kiirenduse võitja: " + (cars.get(Car.indexes.get(1))).info.model);
        }
    }
}
