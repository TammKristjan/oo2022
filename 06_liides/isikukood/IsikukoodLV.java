package isikukood;

public class IsikukoodLV implements IsikukoodObject {
    String isikukood;
    String[] kuud = {"Jaanuar", "Veebruar", "Märts", "Aprill", "Mai", "Juuni", "Juuli", "August", "September",
            "Oktoober", "November", "Detsember"};
    // DDMMYY-XNNZ


    public IsikukoodLV(String isikukood) {
        this.isikukood = isikukood;
    }

    @Override
    public boolean isMale() {
        return isikukood.substring(7,8).startsWith("1") ||
                isikukood.substring(7,8).startsWith("3") ||
                isikukood.substring(7,8).startsWith("5");
    }

    @Override
    public int getBirthYear() {
        return 1900 + Integer.parseInt(isikukood.substring(4,6));
    }

    @Override
    public String getBirthMonth() {
        return kuud[Integer.parseInt(this.isikukood.substring(2,4))-1];
    }
}
