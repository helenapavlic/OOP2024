package Vjezba4_primjer4;

public class Test {
    public static void main(String[] args) {
        FleetVehicles fleetVehicles = new FleetVehicles("Big Company");
        Vehicle veh1 = new Vehicle("model1");
        Vehicle veh2 = new Vehicle("model2");
        Vehicle veh3 = new Vehicle("model3");

        fleetVehicles.addNewVehicle(veh1);
        fleetVehicles.addNewVehicle(veh1);
        fleetVehicles.addNewVehicle(veh2);

        fleetVehicles.removeVehicle(veh1);
        fleetVehicles.removeVehicle(veh3);

        fleetVehicles.getVehicleFromFleet(veh1);
        fleetVehicles.getVehicleFromFleet(veh2);
    }
}
