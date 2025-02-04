package BuilderDesignPattern.ProblematicCode;

//Builder Design pattern

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

    public Product(String desc, String name, String brand, int price, String category, int discount, String createdAt, String updatedAt, List<String> images) {
        this.desc = desc;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.category = category;
        this.discount = discount;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.images = images;
    }
}

