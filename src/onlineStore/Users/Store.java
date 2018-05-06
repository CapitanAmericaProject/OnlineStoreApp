package onlineStore.Users;

import onlineStore.Products.Product;

import java.util.ArrayList;

public class Store {

    private ArrayList<Customer> customers;
    private ArrayList<Admin> admins;
    private ArrayList<Product> productsList;

    public Store() {

        customers = new ArrayList<Customer>();
        admins = new ArrayList<Admin>();
        productsList = new ArrayList<Product>();

    }

    public void registerCustomer(String username,
                                 String password,
                                 String name,
                                 String address) {

        customers.add(new Customer(username, password, name, address));
    }

    public void registerAdmin(String username, String password) {

        admins.add(new Admin(username, password));
    }

    public void addProduct(Product product) {
        productsList.add(product);
    }

    public void removeProduct(Product product) {

        if (productsList.contains(product)) {

            productsList.remove(product);

        } else
            System.out.println("The item does not exist!");
    }

    public boolean validateAdmin(String username, String password){

        for (Admin a: admins) {
            if (!username.equals(a.getUsername()) || !password.equals(a.getPassword())){
                System.out.println("Incorrect username or password!");
                return false;
            }

        }
        return true;
    }
    public boolean validateCustomer(String username, String password){

        for (Customer c: customers) {
            if (!username.equals(c.getUsername()) || !password.equals(c.getPassword())){
                System.out.println("Incorrect username or password!");
                return false;
            }
        }
        return true;
    }
}
