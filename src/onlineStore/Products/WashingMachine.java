package onlineStore.Products;


public class WashingMachine extends Appliance {

    int numberOfFunctions;

    public WashingMachine(String model,
                          int price,
                          String description,
                          ApplianceBrand brand,
                          EnergyClass eClass,
                          int numberOfFunctions) {

        super(model, price, description, brand, eClass);

        this.numberOfFunctions = numberOfFunctions;
    }

    public String toString() {
        return String.format("%s\n Number of functions: %s", super.toString(), numberOfFunctions);
    }

    @Override
    public void showDescription() {

        System.out.println(this);
    }
}
