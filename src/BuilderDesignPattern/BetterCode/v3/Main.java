package BuilderDesignPattern.BetterCode.v3;

public class Main {
    public static void main(String[] args) {
        Builder b = new Builder();
        b.setName("Iphone");
        b.setPrice(10000);
        b.setBrand("Apple");
        Product p = new Product(b);
    }


}
