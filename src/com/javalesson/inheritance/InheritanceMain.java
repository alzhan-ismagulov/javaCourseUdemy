package com.javalesson.inheritance;

import java.util.List;

public class InheritanceMain {

    public static void main(String[] args) {

//        Engine truckEngine = new Engine(6.0,EngineType.DIESEL, 300);
//
//        Truck truck = new Truck("Man", "100", truckEngine, 1000, 3000, 20000);
//        truck.start();
//        truck.accelerate(40);
//        truck.stop();
//        truck.fuelUp(50);
//        truck.load();
//        truck.unload();

//        System.out.println("\n");
//
//        ElectricCar electricCar = new ElectricCar("Tesla", "S", 450, 5);
//        electricCar.start();
//        electricCar.stop();
//        electricCar.charge();
//
//        System.out.println("\n");

        Engine busEngine = new Engine(3.0,EngineType.DIESEL, 500);

        Bus bus = new Bus("Mersedes", "A180", busEngine, 1000, 3000, 100);
        bus.fuelUp();
        bus.pickUpPassengers(50);
        bus.start();
        bus.stop();
        bus.releasePassengers();

        Engine engine = bus.getEngine();
        System.out.println(engine.getEngineType());
        List<Piston> pistons = engine.getPistons();
        System.out.println(pistons);
    }
}
