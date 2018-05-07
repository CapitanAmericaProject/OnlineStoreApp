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

        store.registerCustomer("Gosho", "123", "Georgi", "str. A1");
        store.registerCustomer("Tosho", "123", "Todor", "str. A2");
        store.registerCustomer("Pesho", "123","Petar", "str. A3");

        Customer niki = new Customer("Niki", "654", "Nikola", "str. K9");
        Customer tosho = new Customer("Tosho", "123", "Todor", "str. A2");


        niki.login(niki, store);
        tosho.login(tosho, store);
        tosho.changePassword(tosho, "132", "789");
        System.out.println();

        Product fridge = new Refrigerator("Fridge picture", 650, "Very nice", ApplianceBrand.GORENJE, EnergyClass.C, 105);
        Product TV = new TV("SAMSUNG", "cb1", "TV picture", 820, "Useless",  "Yellow", 30, DisplayTechnologyType.LCD, 2017);
        Product laptop = new Laptop("ASUS", "a57b", "Laptop picture", 950, "Very useful", "Colorful", 15, 8, "Intel");
        Product smartPhone = new Smartphone("NOKIA", "kj54", "Phone picture", 1010, "Annoying", "Blue", 18, 2);

        store.addProduct(fridge);
        store.addProduct(TV);
        store.addProduct(laptop);

        ((Admin) rosi).addNewProduct(smartPhone, store);
        ((Admin) rosi).removeProduct(TV, store);


        Product peralnia = new WashingMachine("peralnq", 500, "pere", ApplianceBrand.ARISTON, EnergyClass.A, 10);
        Product pechka = new Stove("pechka", 600, "Gotvi", ApplianceBrand.GORENJE, EnergyClass.B, 5);

        peralnia.showDescription();
        System.out.println();
        pechka.showDescription();
        System.out.println();
        TV.showDescription();

    }
}
