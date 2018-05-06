package onlineStore.Users;

import onlineStore.Products.Product;

public class Customer extends User {

    private static int ID = 100;
    private String creditCard;
    private String name;
    private String address;
    private ShoppingCart cart;

    public Customer(String username,
                    String password,
                    String name,
                    String address) {

        super(username, password);

        this.name = name;
        this.address = address;
        cart = new ShoppingCart();
        ID++;
    }

    private int getId() {
        return ID;
    }

    @Override
    public void login(User u) {

        if (u instanceof Customer) {
            if (store.validateCustomer(u.getUsername(), u.getPassword())) {
                System.out.printf("You are logged in as %s. Your ID %d", u.getUsername(), ((Customer) u).getId());
            }
        }
    }

    @Override
    public boolean validatePassword(User u, String password) {

        return (u instanceof Customer && u.getPassword().equals(password));

    }

    @Override
    public void changePassword(User u, String password) {

        if (validatePassword(u, password)) {

            u.setPassword(password);
        }

    }

    public void addToCart(Product p) {

        cart.addProduct(p);
    }

    public void removeFromCart(Product p) {

        cart.removeProduct(p);
    }

    public void checkOut() {

        cart.listProducts();

        System.out.println("Total sum: " + cart.getTotalSum());
    }
}
