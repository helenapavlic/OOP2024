package Vjezba4_primjer4;

import java.util.ArrayList;

public class FleetVehicles {
    private static int cntId = 300;
    private final ArrayList<Vehicle> vehicles; // inicijalizacija u konstruktoru, u njoj možemo mijenjat aute ali ne možemo referencirat drugu listu
    private final String company;
    private final int companyId;

    public FleetVehicles(String company) {
        this.company = company;
        this.companyId = cntId++;
        this.vehicles = new ArrayList<>();
    }

    public void addNewVehicle(Vehicle vehicle) {
        if (!vehicles.contains(vehicle)) {
            vehicles.add(vehicle);
            System.out.println("added new vehicle");
        } else {
            System.out.println("vehicle: " + vehicle + " is already added.");
        }
    }

    public void removeVehicle(Vehicle vehicle) {
        if (vehicles.contains(vehicle)) {
            vehicles.remove(vehicle);
            System.out.println("removed vehicle: " + vehicle);
        } else {
            System.out.println("vehicle is not in the fleet");
        }
    }

    //    izbjegavat vraćanje null vrijednosti;
    public Vehicle getVehicleFromFleet(int indexPosition) throws NullPointerException {
        Vehicle vehicle = null;
        if (indexPosition > vehicles.size() || indexPosition < 0) {
            System.out.println("wrong index");
        } else {
            vehicle = vehicles.get(indexPosition);
        }
        return vehicle;
    }

    public Vehicle getVehicleFromFleet(Vehicle vehicle) throws NullPointerException {
        Vehicle vehicle1 = null;
        if (!vehicles.contains(vehicle)) {
            System.out.println("Vehicle is not in fleet");
        } else {
            int position = vehicles.indexOf(vehicle);
            vehicle1 = vehicles.get(position);
            System.out.println("returned vehicle");
        }
        return vehicle1;
    }

    public void listAllVehicles() {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

}
