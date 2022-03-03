package kodutoo;

import java.util.ArrayList;
import java.util.Random;

import static kodutoo.Main.cars;

public class Car {
    String model;
    int year;
    int topSpeed;
    boolean japan;
    //char symbol;

    public Car(String model, int year, int topSpeed, boolean japan){
        this.model = model;
        this.year = year;
        this.topSpeed = topSpeed;
        this.japan = japan;
        //this.symbol = 'M';
    }

    public void carInfo(){
        System.out.println("Auto: " + model + " " + year + " tippkiirusega " + topSpeed + "km/h");
    }


    static ArrayList<String> race = new ArrayList<>();
    static ArrayList<Integer> indexes = new ArrayList<>();
    static int index;

    public static void chooseCar(){
        for (int i = 0; i <= 2;) {
            Random rand = new Random();
            index = rand.nextInt(cars.size());
            String randomCar = String.valueOf(cars.get(index).model);

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
        System.out.println((cars.get(indexes.get(0))).model + " kiirus: " + (cars.get(indexes.get(0))).topSpeed + "km/h");
        System.out.println((cars.get(indexes.get(1))).model + " kiirus: " + (cars.get(indexes.get(1))).topSpeed + "km/h");
        if((cars.get(indexes.get(0))).topSpeed > (cars.get(indexes.get(1))).topSpeed){
            System.out.println("Kiirenduse võitja: " + (cars.get(indexes.get(0))).model);
        } else {
            System.out.println("Kiirenduse võitja: " + (cars.get(indexes.get(1))).model);
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
                "model='" + model + '\'' +
                ", year=" + year +
                ", topSpeed=" + topSpeed + "km/h" +
                ", japan=" + japan +
                //", symbol=" + symbol +
                '}';
    }
}

