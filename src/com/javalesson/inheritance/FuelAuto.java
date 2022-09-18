package com.javalesson.inheritance;

public abstract class FuelAuto extends Auto {
    private int avialablePetrol;
    private int tankVolume;

    public FuelAuto(String producer, String model, Engine engine, int avialablePetrol, int tankVolume) {
        super(producer, model, engine);
        this.avialablePetrol = avialablePetrol;
        this.tankVolume = tankVolume;
    }

    public void fuelUp(int petrolVolume){
        avialablePetrol+=petrolVolume;
        System.out.println("Adding fuel");
    }

    public int getAvialablePetrol() {
        return avialablePetrol;
    }

    public void setAvialablePetrol(int avialablePetrol) {
        this.avialablePetrol = avialablePetrol;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }
}
