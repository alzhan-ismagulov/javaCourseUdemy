package com.javalesson.inheritance;

public abstract class PetrolAuto extends Auto{
    private int avialablePetrol;
    private int tankVolume;

    public PetrolAuto(String producer, String model, Engine engine, int avialablePetrol, int tankVolume) {
        super(producer, model, engine);
        this.avialablePetrol = avialablePetrol;
        this.tankVolume = tankVolume;
    }
}
