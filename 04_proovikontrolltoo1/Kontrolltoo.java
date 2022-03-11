import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kontrolltoo {
    public static void main(String[] args) {
        //libisev keskmine
        double k = keskmiseLeidmine(1, 2, 3);
        System.out.println(k);
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 5, 3, 4));
        Integer[] integers = {1, 2, 4, 7, 6};
        List<Double> double1 = libisevKeskmine(integerList);
        List<Double> double2 = libisevKeskmine(List.of(integers));
        System.out.println(double1);
        System.out.println(double2);

        Arvud arvud1 = new Arvud(3,5,6);
        arvud1.lisaArv(7);
        arvud1.lisaArv(8);
        //System.out.println(arvud1.libisevKeskmine());
    }

    public static double keskmiseLeidmine(int arv1, int arv2, int arv3){
        return (arv1+arv2+arv3)/3.0;
    }

    public static List<Double> libisevKeskmine(List<Integer> integers){
        List<Double> doubles = new ArrayList<>();
        for (int i = 0; i < integers.size()-2; i++){
            double uusNumber = (integers.get(i)+integers.get(i+1)+integers.get(i+2))/3.0;
            doubles.add(uusNumber);
        }
        return doubles;
    }
}
