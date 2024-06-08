package Zad2_18_06_21;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {



        System.out.println("--------------------");
        Car auto1 = new Car("model-1");
        Car auto2 = new Car("model-2");
        Boat boat1 = new Boat("Luna");
        Boat boat2 = new Boat("Marina");

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(auto1);
        vehicles.add(auto2);
        vehicles.add(boat1);
        vehicles.add(boat2);

        listAllVehicles(vehicles);
        callAllMethods(vehicles);

    }

    public static void listAllVehicles(ArrayList<Vehicle> list){
        for (Vehicle vehicle:list) {
            System.out.println(vehicle);
        }
    }

    public static void callAllMethods(ArrayList<Vehicle> list){
        RandomDirection randomDirection = new RandomDirection();
        for (Vehicle vehicle: list) {
            System.out.println("--------------------");
            vehicle.runEngine();
            vehicle.getEnergy();
            vehicle.description();
            vehicle.move(randomDirection.getDirection(), randomDirection.getSpeed());
            vehicle.stopEngine();
            System.out.println();
        }
    }
}
