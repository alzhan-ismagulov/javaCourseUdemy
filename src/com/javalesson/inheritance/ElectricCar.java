package com.javalesson.inheritance;

public class ElectricCar extends Auto{

    private int batteryVolume;
    private int passengerNumber;

    public ElectricCar(String producer, String model, EngineType engine, int batteryVolume, int passengerNumber) {
        super(producer, model, new Engine());
        this.batteryVolume = batteryVolume;
        this.passengerNumber = passengerNumber;
    }

    public void charge(){
        System.out.println("Battery is charged");
    }

    public int getBatteryVolume() {
        return batteryVolume;
    }

    public void setBatteryVolume(int batteryVolume) {
        this.batteryVolume = batteryVolume;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public void start(){
        isRunning = true;
        setCurrentSpeed(10);
        System.out.println("Car is starting");
    }

    public void stop(){
        isRunning = false;
        setCurrentSpeed(10);
        System.out.println("Car is stopping");
    }
}
