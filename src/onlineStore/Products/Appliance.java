package onlineStore.Products;

public abstract class Appliance extends Product{

    private ApplianceBrand brand;
    private EnergyClass eClass;

    public Appliance(String description,
                     double price,
                     String image,
                     ApplianceBrand brand,
                     EnergyClass eClass) {

        super(description, price, image);

        this.brand = brand;
        this.eClass = eClass;

    }

    public String toString() {
        return String.format("%s\n %s\n Energy class %s", brand, super.toString(), eClass);
    }

    public abstract void showDescription();
}
