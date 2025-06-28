package common;

import vehicles.Airplane;
import vehicles.Boat;
import vehicles.Car;

public class VehicleFactory {

    public Vehicle getVehicle(String vehicleType) {
        if (vehicleType == null) {
            return null;
        }

        if (vehicleType.equalsIgnoreCase("car")) {
            return new Car("Nissan", 180);
        } else if (vehicleType.equalsIgnoreCase("airplane")) {
            return new Airplane("Boeing", 687);
        } else if (vehicleType.equalsIgnoreCase("boat")) {
            return new Boat("Caravan", 300);
        }

        return null;

    }
}
