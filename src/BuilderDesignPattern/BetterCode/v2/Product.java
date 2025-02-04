package BuilderDesignPattern.BetterCode.v2;

//Builder Design pattern

import java.util.HashMap;
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

    Product(HashMap<String,Object> map){
        //validation
        if(map.get("price").equals(0)){
            this.price = price;
        }
    }
}

