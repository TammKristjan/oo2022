package kontrolltoo2.src.com.company;

import java.io.*;
import java.util.*;

public class LopuTahed {

    public static void main(String[] args) {
        var hash = new HashMap<Character, Integer>();
        var hashWords = new HashMap<Character, List<String>>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("tekst.txt"));
            System.out.println("Kõik lõputähed: ");
            while (true) {
                String line = br.readLine();

                if (line == null) {break;}
                if(line.length() == 0){
                    continue;
                }
                line = line.replace(".", "");
                line = line.replace(",", "");
                line = line.replace("?", "");
                line = line.replace("!", "");
                line = line.replace(";", "");
                line = line.replace(")", "");
                line = line.replace("(", "");
                line = line.replace("/", "");
                line = line.replace("”", "");
                line = line.replace("\n", "");
                line = line.replace("\"", "");
                String[] s = line.split(" ");
                for (String s1 : s) {
                    var letter = s1.toLowerCase().charAt(s1.length()-1);
                    System.out.print(letter + " ");
                    if (hash.containsKey(letter)){
                        hash.put(letter, hash.get(letter) + 1);
                        var list = hashWords.get(letter);
                        list.add(s1);
                        hashWords.put(letter, list);
                    } else {
                        hash.put(letter, 1);
                        hashWords.put(letter, new ArrayList<>(List.of(s1)));
                    }
                }

            }
            //List<String> tykeldus = List.of(rida.split("es"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();

        LinkedHashMap<Character, Integer> reversedHash = new LinkedHashMap<>();

        //Comparator.reverseOrder() et muuta järjekorda
        hash.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> reversedHash.put(x.getKey(), x.getValue()));

        System.out.println("Erinevad sõnalõputähed nende esinemissageduse järjekorras:");
        System.out.println(reversedHash);

        try {

            for (Character character : hashWords.keySet()) {
                PrintWriter pw = new PrintWriter(new FileWriter("%s.txt".formatted(character)));

                for (String word : hashWords.get(character)) {
                    pw.write(word + "\n");
                }
                pw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("viited.txt"));
            for (Character character : hashWords.keySet()) {
                pw.write(character + ".txt" + " Sõnu: " + hash.get(character) + "\n");
            }
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
