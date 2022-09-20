package com.innerclasses;

public class Main {
    public static void main(String[] args) {
        //Создание объекта phone
        CellPhone phone = new CellPhone("Apple", "S");
        phone.turnOn();

        phone.call("1234567890");
    }
}
