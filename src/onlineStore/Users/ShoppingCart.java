package onlineStore.Users;

import onlineStore.CreditcardNotValidException;
import onlineStore.Products.Electronic;
import onlineStore.Products.Product;
import onlineStore.Products.Smartphone;
import onlineStore.Products.Tablet;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addToCart(Product product) {
        products.add(product);
    }

    public void addAndPayCreditcard(Electronic product, Customer customer){
        if (Character.isLetter(customer.getCreditCard().charAt(0))){
            throw new CreditcardNotValidException("This customer does not have credit card registered!");
        }
        product.payWithCreditcard();
        products.add(product);
    }

    public void addAndChangeColor(Smartphone product, String color) {
        product.changeColor(color);
        products.add(product);
    }

    public void addAndChangeColor(Tablet product, String color) {
        product.changeColor(color);
        products.add(product);
    }

    public void removeFromCart(Product product) {
        products.remove(product);
    }

    public void sumPrices() {
        int result = 0;
        for (Product k : products) {
            result += k.getPrice();
        }
        System.out.printf("The amount of your purchase is %s euro.", result);
    }

    public void listProducts() {
        for (Product product : products) {
            product.showDescription();
            System.out.println();
        }
        System.out.println();

    }

}
