package com.interfaces;

public class InterfaceRunner {
    public static void main(String[] args) {
        Deliverable pizza = new Pizza("Neapolitano", 1, 3000, Size.XL);
        Deliverable phone = new CellPhone("Apple", "S", 1, 250);
        Deliverable fridge = new Fridge("LG", "90", 1, 200);

        printDeliveryPrice(pizza);
        printDeliveryPrice(phone);
        printDeliveryPrice(fridge);
    }

    private static void printDeliveryPrice(Deliverable del){
        System.out.println("Delivery price " + del.calcDeliveryPrice());
    }
}
