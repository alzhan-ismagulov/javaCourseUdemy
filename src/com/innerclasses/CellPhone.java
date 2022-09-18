package com.innerclasses;

public class CellPhone {
    private String make;
    private String model;
    private Display display;

    public CellPhone(String make, String model) {
        this.make = make;
        this.model = model;
        System.out.println("Object phone creating");
    }

    public void turnOn(){
        initDisplay();
        System.out.println("Display turn on");
    }

    public void initDisplay(){
        display = new Display();
        System.out.println("Display creating");
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Display getDisplay() {
        return display;
    }
}
