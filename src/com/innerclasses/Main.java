package com.innerclasses;

public class Main {
    public static void main(String[] args) {
        CellPhone phone = new CellPhone("Apple", "S");
        phone.turnOn();
        Display display = phone.getDisplay();
    }
}
