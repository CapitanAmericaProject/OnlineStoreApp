package onlineStore.Users;

import onlineStore.Products.Product;

public class Admin extends User {

    public Admin(String username, String password) {

        super(username, password);

    }

    @Override
    public void login(User u) {

        if (u instanceof Admin) {
            if (store.validateAdmin(u.getUsername(), u.getPassword())) {
                System.out.printf("You are logged in as %s", u.getUsername());
            }
        }
    }

    @Override
    public boolean validatePassword(User u, String password) {

        return (u instanceof Admin && u.getPassword().equals(password));

    }

    @Override
    public void changePassword(User u, String password) {

        if (validatePassword(u, password)) {

            u.setPassword(password);
        }
    }

    public void setProductPrice(Product p, int price) {

        p.setPrice(price);
    }

    public void addNewProduct(String model, int price, String description) {

        Product p = new Product(model, price, description);
        store.addProduct(p);
    }

    public void removeProduct(Product p) {

        store.removeProduct(p);
    }

}
