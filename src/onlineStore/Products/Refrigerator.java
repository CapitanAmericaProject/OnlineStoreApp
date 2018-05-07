package onlineStore.Products;

public class Refrigerator extends Appliance {

    private int volume;

    public Refrigerator(String image,
                        double price,
                        String description,
                        ApplianceBrand brand,
                        EnergyClass eClass,
                        int volume) {

        super(image, price, description, brand, eClass);

        this.volume = volume;
    }

    public String toString() {

        return String.format("%s\nVolume: %s sm^3", super.toString(), volume);
    }

    @Override
    public void showDescription() {

        System.out.println(this);
    }
}
