package kodutoo;

public class Product {
    String name;
    int price;
    int id;


    public Product(int id, String name, int price){
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public void productInfo(){
        System.out.println(String.format("%6d %12s %6s", id, name, Integer.toString(price) + "€"));
    }
}
