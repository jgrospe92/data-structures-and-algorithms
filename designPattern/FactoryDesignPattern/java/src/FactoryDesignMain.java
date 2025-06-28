import common.Vehicle;
import common.VehicleFactory;

public class FactoryDesignMain {

    public static void main(String[] args) {
        System.out.println("Design Patter: Factory Design Pattern Demo");

        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle car = vehicleFactory.getVehicle("car");
        car.start();
        Vehicle airplane = vehicleFactory.getVehicle("airplane");
        airplane.start();
        Vehicle boat = vehicleFactory.getVehicle("boat");
        boat.start();
    }
}
