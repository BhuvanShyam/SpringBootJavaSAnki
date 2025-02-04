package BuilderDesignPattern.BetterCode.v4;

//1.made the product constructor private
//2.made the getBuilder method inside the product class that return the instance of builder (creates the new Builder)
//3.setther return type cahnged to Builder and return "this"
//4.made the builder calss inside the product calss
//
public class Main {
    public static void main(String[] args) {
        Product p = Product.getBuilder()
                .setName("Iphone")
                .setPrice(100000)
                .setDesc("This is one of the Amazing phone in the world")
                .setBrand("Apple")
                .setCategory("Smartphone")
                .build();


    }


}
