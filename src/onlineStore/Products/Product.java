package onlineStore.Products;

public class Product {
    private String description;
    private double price;
    private String image;

    public Product(String description, double price, String image) {
        this.description = description;
        this.price = price;
        this.image = image;
    }
    @Override
    public String toString() {
        return String.format("Image: %s\nPrice: %f.2$\nDescription: %s", image, price, description);
    }
    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }


}
