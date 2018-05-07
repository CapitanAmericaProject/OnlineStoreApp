package onlineStore.Products;

public abstract class Appliance extends Product{

    private ApplianceBrand brand;
    private EnergyClass eClass;

    public Appliance(String image,
                     double price,
                     String description,
                     ApplianceBrand brand,
                     EnergyClass eClass) {

        super(image, price, description);

        this.brand = brand;
        this.eClass = eClass;

    }

    public String toString() {
        return String.format("%s\n%s\nEnergy class %s", brand, super.toString(), eClass);
    }

}
