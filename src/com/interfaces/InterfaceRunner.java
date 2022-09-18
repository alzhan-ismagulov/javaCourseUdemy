package com.interfaces;

public class InterfaceRunner {
    public static void main(String[] args) {
        Priceable pizza = new Pizza("Neapolitano", 1, 3000, Size.XL);
        Priceable phone = new CellPhone("Apple", "S", 1, 250);
        Priceable fridge = new Fridge("LG", "90", 1, 200);

        printDeliveryPrice(pizza);
        printDeliveryPrice(phone);
        printDeliveryPrice(fridge);
    }

    private static void printDeliveryPrice(Priceable del){
        System.out.println("Delivery price " + del.calcDeliveryPrice());
        System.out.println("Order price " + del.calcOrderPrice());
    }
}
