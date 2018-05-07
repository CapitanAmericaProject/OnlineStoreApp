package onlineStore.Products;


public class WashingMachine extends Appliance {

    int numberOfFunctions;

    public WashingMachine(String image,
                          double price,
                          String description,
                          ApplianceBrand brand,
                          EnergyClass eClass,
                          int numberOfFunctions) {

        super(image, price, description, brand, eClass);

        this.numberOfFunctions = numberOfFunctions;
    }

    public String toString() {
        return String.format("%s\nNumber of functions: %s", super.toString(), numberOfFunctions);
    }

    @Override
    public void showDescription() {

        System.out.println(this);
    }
}
