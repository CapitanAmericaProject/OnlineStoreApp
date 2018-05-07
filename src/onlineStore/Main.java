package onlineStore;

import onlineStore.Products.*;
import onlineStore.Users.*;

public class Main {

    public static void main(String[] args) {

        Store store = new Store();

        store.registerAdmin("Boby", "123");
        store.registerAdmin("Dido", "321");
        store.registerAdmin("Rosi", "132");

        User ani = new Admin("Ani", "456");
        User rosi = new Admin("Rosi", "132");

        ani.login(ani, store);
        rosi.login(rosi, store);

        System.out.println();

        store.registerCustomer("Gosho", "123", "3456", "George", "str.A1");
        store.registerCustomer("Tosho", "123", "5563", "Teodor", "str.A2");
        store.registerCustomer("Pesho", "123","1234", "Peter", "str.A3");

        Customer niki = new Customer("Niki", "654", "9999", "Nikolay", "str.K1");
        Customer tosho = new Customer("Tosho", "123", "8888", "Todor", "str.K2");


        niki.login(niki, store);
        tosho.login(tosho, store);
        tosho.changePassword(tosho, "132", "789");
        System.out.println();

        Product fridge = new Refrigerator("Fridge picture", 650, "Very nice", ApplianceBrand.GORENJE, EnergyClass.C, 105);
        TV tv = new TV("SAMSUNG", "cb1", "TV picture", 820, "Useless",  "Yellow", 30, DisplayTechnologyType.LCD, 2017);
        Laptop laptop = new Laptop("ASUS", "a57b", "Laptop picture", 950, "Very useful", "Colorful", 15, 8, "Intel");
        Smartphone smartPhone = new Smartphone("NOKIA", "kj54", "Phone picture", 1010, "Annoying", "Blue", 18, 2);
        Tablet tablet = new Tablet("tablet", 200, "image", "Lenovo", "P202", "white", 12,
                OperationSystemType.FIREOS, WirelessTechnologyType.THREE_G);
        store.addProduct(fridge);
        store.addProduct(tv);
        store.addProduct(laptop);

        ((Admin) rosi).addNewProduct(smartPhone, store);
        ((Admin) rosi).removeProduct(tv, store);


        Product peralnia = new WashingMachine("peralnq", 500, "pere", ApplianceBrand.ARISTON, EnergyClass.A, 10);
        Product pechka = new Stove("pechka", 600, "Gotvi", ApplianceBrand.GORENJE, EnergyClass.B, 5);

        niki.getCart().addToCart(laptop);
        niki.getCart().addAndPayCreditcard(laptop, niki);
        niki.getCart().addAndChangeColor(tablet, "yellow");

    }
}
