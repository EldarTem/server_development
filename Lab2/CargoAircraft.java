// CargoAircraft.java
package Lab2.aircrafts;

public class CargoAircraft extends Aircraft {
    private int loadCapacity; // грузоподъемность в кг

    public CargoAircraft(String model, int range, int fuelConsumption, int loadCapacity) {
        super(model, range, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public int getCapacity() {
        return 0; // грузовые самолеты не перевозят пассажиров
    }

    @Override
    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public String toString() {
        return "Cargo Aircraft: " + getModel() + ", Range: " + getRange() +
                " km, Load Capacity: " + getLoadCapacity() + " kg, Fuel Consumption: " + getFuelConsumption() + " L/100km";
    }
}
