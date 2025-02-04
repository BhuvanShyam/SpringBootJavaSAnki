package BuilderDesignPattern.BetterCode.v3;

import java.util.List;

public class Product {

    private String name;
    private String desc;
    private String brand;
    private int price;
    private String category;
    private int discount;
    private String createdAt;
    private String updatedAt;
    private List<String> images;


    Product(Builder b) {
        this.name = b.getName();
        this.price = b.getPrice();
        this.brand  = b.getBrand();
    }
}

