package onlineStore.Products;

public class Stove extends Appliance {

    int capacity;

    public Stove(String model,
                 int price,
                 String description,
                 ApplianceBrand brand,
                 EnergyClass eClass,
                 int capacity) {

        super(model, price, description, brand, eClass);

        this.capacity = capacity;
    }

    public String toString() {
        return String.format("%s\n Volume: %s watts", super.toString(), capacity);
    }

    @Override
    public void showDescription() {

        System.out.println(this);
    }
}
