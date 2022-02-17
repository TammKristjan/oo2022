import java.util.Scanner;
import java.security.SecureRandom;

public class PasswordGenerator {
    public static void main (String[] args) {

        System.out.println("Sisesta parooli pikkus");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        //int length = 10;
        System.out.println(genRandomPassword(length));
    }

    // Method to generate a random alphanumeric password of a specific length
    //Suvalise parooli genereerimine antud stringi kaudu
    public static String genRandomPassword(int length) {
        // ASCII range – alphanumeric (0-9, a-z, A-Z)
        final String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();

        //iga loopi läbimine võtab suvalise tähe või numbri ASCII stringist ja lisab selle 'StringBuilder'-isse
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            sb.append(characters.charAt(randomIndex));
        }

        return sb.toString();
    }
}
