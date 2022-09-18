package com.javalesson.inheritance;

import java.util.List;

public class InheritanceMain {

    public static void main(String[] args) {

        Engine truckEngine = new Engine(6.0, EngineType.DIESEL, 900);
        Engine busEngine = new Engine(6.0, EngineType.PETROL, 1100);

        Auto truck = new Truck("Volvo", "N300", truckEngine, 300, 1500, 20000);
        Auto car = new ElectricCar("Tesla", "S", EngineType.ELECTRIC, 3000, 4);
        Auto bus = new Bus("Mersedes", "Sprinter", busEngine, 200, 1500, 100);
//        Auto auto = new Auto("Volskwagen", "Polo", busEngine);

        bus.start();
        bus.stop();
        truck.start();
        truck.stop();

        runCar(bus);
        runCar(truck);
        runCar(car);
//        runCar(auto);
    }

    private static void runCar(Auto auto){
        auto.start();
        auto.stop();
        auto.energize();
    }
}
