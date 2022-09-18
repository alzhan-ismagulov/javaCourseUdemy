package com.innerclasses;

//Создание класса
public class CellPhone {
    //Свойства класса
    private String make;
    private String model;
    private Display display;

    //Создание конструктора класса
    public CellPhone(String make, String model) {
        this.make = make;
        this.model = model;
        System.out.println("Object phone creating");
    }

    //Создание метода
    public void turnOn(){
        initDisplay();
        System.out.println("Display turn on");
    }

    //Создание метода
    public void initDisplay(){
        display = new Display();
        System.out.println("Display creating");
    }

    //Создание метода получения производителя
    public String getMake() {
        return make;
    }

    //Создание метода получения модели телефона
    public String getModel() {
        return model;
    }

    //Создание метода получения дисплея
    public Display getDisplay() {
        return display;
    }
}
