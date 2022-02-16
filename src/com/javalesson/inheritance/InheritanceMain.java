package com.javalesson.inheritance;

public class InheritanceMain {

    public static void main(String[] args) {

        Truck truck = new Truck("Man", "100", EngineType.DIESEL, 1000, 3000, 20000);
        truck.start();
        truck.accelerate(40);
        truck.stop();
        truck.fuelUp(50);
        truck.load();
        truck.unload();

        System.out.println("\n");

        ElectricCar electricCar = new ElectricCar("Tesla", "S", 450, 5);
        electricCar.start();
        electricCar.stop();
        electricCar.charge();

        System.out.println("\n");

        Bus bus = new Bus("Mersedes", "A180", EngineType.DIESEL, 1000, 3000, 100);
        bus.fuelUp();
        bus.pickUpPassengers(50);
        bus.start();
        bus.stop();
        bus.releasePassengers();
    }
}
