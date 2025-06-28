package vehicles;

import common.Vehicle;

public class Boat implements Vehicle {

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public Integer getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(Integer topSpeed) {
        this.topSpeed = topSpeed;
    }

    private String name;
    private Integer topSpeed;

    public Boat(String name, Integer topSpeed) {
        this.name = name;
        this.topSpeed = topSpeed;
    }

    @Override
    public void start() {
        System.out.println(getName() + " starting engine");

    }

    @Override
    public void stop() {

    }
}
