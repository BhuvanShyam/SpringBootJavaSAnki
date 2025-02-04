package BuilderDesignPattern.BetterCode.v4;

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


    private Product(Builder b) {
        this.name = b.getName();
        this.price = b.getPrice();
        this.brand = b.getBrand();
        this.discount = b.getDiscount();
        this.createdAt = b.getCreatedAt();
        this.desc = b.getDesc();
        this.updatedAt = b.getUpdatedAt();
        this.images = b.getImages();
        this.category = b.getCategory();
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {

        private String name;
        private String desc;
        private String brand;
        private int price;
        private String category;
        private int discount;
        private String createdAt;
        private String updatedAt;
        private List<String> images;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getDesc() {
            return desc;
        }

        public Builder setDesc(String desc) {
            this.desc = desc;
            return this;
        }

        public String getBrand() {
            return brand;
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public int getPrice() {
            return price;
        }

        public Builder setPrice(int price) {
            this.price = price;
            return this;
        }

        public String getCategory() {
            return category;
        }

        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }

        public int getDiscount() {
            return discount;
        }

        public void setDiscount(int discount) {
            this.discount = discount;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }

        public Product build() {
            return new Product(this);
        }

    }
}


