package onlineStore.Users;

import onlineStore.Messages.Message;
import onlineStore.Products.Product;

import java.util.List;

public class Admin extends User {


    public Admin(String username, String password) {

        super(username, password);

    }

    public void listMessages(List<Message> messages){
        for (Message mess: messages) {
            System.out.println(mess);
        }
    }

    @Override
    public void login(User u, Store store) {

        if (u instanceof Admin) {
            if (store.validateAdmin(u.getUsername(), u.getPassword())) {
                System.out.println("You are logged in as " + u.getUsername());
            } else
                System.out.println("Incorrect username or password!");
        }
    }

    public void setProductPrice(Product p, int price) {

        p.setPrice(price);
    }

    public void addNewProduct(Product p, Store store) {

        store.addProduct(p);
    }

    public void removeProduct(Product p, Store store) {

        store.removeProduct(p);
    }

}
