package com.javalesson.inheritance;

public class Bus extends FuelAuto{
    private int passengerNumber;

    public Bus(String producer, String model, Engine engine, int avialablePetrol, int tankVolume, int passengerNumber) {
        super(producer, model, engine, avialablePetrol, tankVolume);
        this.passengerNumber = passengerNumber;
        System.out.println("Bus was initialized");
    }

    @Override
    public void start() {
        isRunning = true;
        setCurrentSpeed(10);
        System.out.println("Bus is starting");
    }

    @Override
    public void stop() {
        isRunning = false;
        setCurrentSpeed(0);
        System.out.println("Bus is stoping");
    }

    public void fuelUp(){
        int volume = getTankVolume() + getAvialablePetrol();
        fuelUp(volume);
    }

    @Override
    public void fuelUp(int petrolVolume) {
        int volume = getAvialablePetrol() + petrolVolume;
        if(volume>getTankVolume()){
            setAvialablePetrol(getTankVolume());
        }
        System.out.println("Adding diesel");
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public void pickUpPassenger(int passengerNum){
        this.passengerNumber += passengerNum;
        System.out.println("Pick up " + passengerNum + " passenger");
    }

    public void releasePassenger(){
        if (!isRunning){
            stop();
        }
        passengerNumber = 0;
        System.out.println("Passenger released");
    }
}

