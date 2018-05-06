package onlineStore.Products;

public class Refrigerator extends Appliance {

    private int volume;

    public Refrigerator(String model,
                        int price,
                        String description,
                        ApplianceBrand brand,
                        EnergyClass eClass,
                        int volume) {

        super(model, price, description, brand, eClass);

        this.volume = volume;
    }

    public String toString() {

        return String.format("%s\n Volume: %s sm^3", super.toString(), volume);
    }

    @Override
    public void showDescription() {

        System.out.println(this);
    }
}
