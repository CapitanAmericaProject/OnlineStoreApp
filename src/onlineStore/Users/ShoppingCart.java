package onlineStore.Users;

import onlineStore.Products.Product;

import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Product> products;

    public double getTotalSum() {

        return products.stream()
                .mapToDouble(o -> o.getPrice())
                .sum();
    }

    public void addProduct(Product p) {

        products.add(p);
    }

    public void listProducts(){

        products.forEach(x -> System.out.println(x + "\n"));
    }

    public void removeProduct(Product p) {

        if (products.contains(p)) {
            products.remove(p);

        } else
            System.out.println("This product is not in Your cart!");

    }

}
