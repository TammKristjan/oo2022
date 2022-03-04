package kodutoo;

import java.util.ArrayList;
import java.util.Random;

import static kodutoo.Main.cars;

public class Car {
    autoInfo info;

    public Car(autoInfo info){
        this.info = info;
    }

    public void carInfo(){
        System.out.println("Auto: " + info.model + " " + info.year + " tippkiirusega " + info.topSpeed + "km/h");
    }


    static ArrayList<String> race = new ArrayList<>();
    static ArrayList<Integer> indexes = new ArrayList<>();
    static int index;

    public static void chooseCar(){
        for (int i = 0; i <= 2;) {
            Random rand = new Random();
            index = rand.nextInt(cars.size());
            String randomCar = String.valueOf(cars.get(index).info.model);

            if (i >= 1) {
                if (race.get(0).contains(randomCar)){
                    i = 1;
                    continue;
                } else {
                    race.add(randomCar);
                    indexes.add(index);
                    break;
                }
            } else {
                race.add(randomCar);
                indexes.add(index);
                i++;
            }
        }
        System.out.println("1. kiirenduses osalevad:");
        System.out.println(race.get(0));
        System.out.println(race.get(1));
    }

    public static void chooseWinner(){
        System.out.println("Kiirused:");
        System.out.println((cars.get(indexes.get(0))).info.model + " kiirus: " + (cars.get(indexes.get(0))).info.topSpeed + "km/h");
        System.out.println((cars.get(indexes.get(1))).info.model + " kiirus: " + (cars.get(indexes.get(1))).info.topSpeed + "km/h");
        if((cars.get(indexes.get(0))).info.topSpeed > (cars.get(indexes.get(1))).info.topSpeed){
            System.out.println("Kiirenduse võitja: " + (cars.get(indexes.get(0))).info.model);
        } else {
            System.out.println("Kiirenduse võitja: " + (cars.get(indexes.get(1))).info.model);
        }
    }
    /*
    static ArrayList<String> race = new ArrayList<>();
    public static void chooseCar(){
        for (int i = 0; i <= 2;) {
            Random rand = new Random();
            String randomCar = String.valueOf(cars.get(rand.nextInt(cars.size())));
            if (i >= 1) {
                if (race.get(0).contains(randomCar)){
                    i = 1;
                    continue;
                } else {
                    race.add(randomCar);
                    break;
                }
            } else {
                race.add(randomCar);
                i++;
            }
        }
        System.out.println("1. kiirenduses osalevad:");
        System.out.println(race.get(0));
        System.out.println(race.get(1));
    }

     */
    /*
    public static void chooseWinner(){
        if(race.get(0).contains("japan=false")){
            if(race.get(1).contains("japan=false")){
                System.out.println("Mõlemad autod osutusid kaotajaks, sest võistlusele on lubatud ainult Jaapani autod");
            } else {
                System.out.println("1111111");
                System.out.println("Võitjaks osutus: " + race.get(1) + ", sest võistlusele on lubatud ainult Jaapani autod");
            }
        }
        if(race.get(0).contains("japan=true")) {
            if (race.get(1).contains("japan=false")) {
                System.out.println("Võitjaks osutus: " + race.get(0) + ", sest võistlusele on lubatud ainult Jaapani autod");
            } else {
                System.out.println("Mõlemad autod on võistlusele lubatud");
            }
        }
    }

     */

    //public static ArrayList<String> race = new ArrayList<String>();

    /*public void chooseCar(){
        ArrayList<String> Race = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Random rand = new Random();
            String randomCar = String.valueOf(cars.get(rand.nextInt(cars.size())));
            //System.out.println(randomCar);
            race.add(randomCar);
        }
        System.out.println("1. kiirenduses osalevad:");
        System.out.println(race.get(0));
        System.out.println(race.get(1));
    }*/

    //to -- võtan toString() -- enter
    @Override
    public String toString() {
        return "Car{" +
                "model='" + info.model + '\'' +
                ", year=" + info.year +
                ", topSpeed=" + info.topSpeed + "km/h" +
                ", japan=" + info.japan +
                //", symbol=" + symbol +
                '}';
    }
}

