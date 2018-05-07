package onlineStore.Products;

import onlineStore.Interfaces.CreditCardPayable;

public abstract class Electronic extends Product implements CreditCardPayable {
    private String brand;
    private String model;
    private String color;

    public Electronic(String description, double price, String image, String brand, String model, String color) {
        super(description, price, image);
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void showImage();

}
