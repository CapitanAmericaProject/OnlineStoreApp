package onlineStore.Users;

import onlineStore.Products.Product;

public class Customer extends User implements CanChangePassword{

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
    public void login(User u, Store store) {

        if (u instanceof Customer) {
            if (store.validateCustomer(u.getUsername(), u.getPassword())) {
                System.out.printf("You are logged in as %s. Your ID %d\n", u.getUsername(), ((Customer) u).getId());
            } else
                System.out.println("Incorrect username or password!");
        }
    }

    @Override
    public boolean validatePassword(Customer c, String password) {

        return (c.getPassword().equals(password));
    }

    @Override
    public void changePassword(Customer c, String oldPassword, String newPassword) {

        if (validatePassword(c, oldPassword)) {

            System.out.println(c.getUsername() + " Your password has been changed.");
            c.setPassword(newPassword);
        }else
            System.out.println("Password not changed!");
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
