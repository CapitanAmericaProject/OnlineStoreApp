package onlineStore.Products;

public class Stove extends Appliance {

    int power;

    public Stove(String image,
                 double price,
                 String description,
                 ApplianceBrand brand,
                 EnergyClass eClass,
                 int capacity) {

        super(image, price, description, brand, eClass);

        this.power = capacity;
    }

    public String toString() {
        return String.format("%s\nPower: %s watts", super.toString(), power);
    }

    @Override
    public void showDescription() {

        System.out.println(this);
    }
}
