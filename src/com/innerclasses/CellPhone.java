package com.innerclasses;

//Создание класса
public class CellPhone {
    //Свойства класса
    private String make;
    private String model;
    private Display display;
    private RadioModule gsm;
    private AbstractPhoneButton button;

    public interface AbstractPhoneButton{
        void click();
    }

    //Создание конструктора класса
    public CellPhone(String make, String model) {
        this.make = make;
        this.model = model;
        System.out.println("Object phone creating");
    }

    //Создание метода
    public void turnOn(){
        initDisplay();
        gsm = new RadioModule();
        initButton();
    }

    public void initButton(){
        button = new AbstractPhoneButton() {
            @Override
            public void click() {
                System.out.println("Button clicked");
            }
        };
    }

    public void call(String number  ){
        button.click();
        gsm.call(number);
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
