// PassengerAircraft.java
package Lab2.aircrafts;

public class PassengerAircraft extends Aircraft {
    private int passengerCapacity;

    public PassengerAircraft(String model, int range, int fuelConsumption, int passengerCapacity) {
        super(model, range, fuelConsumption);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public int getCapacity() {
        return passengerCapacity;
    }

    @Override
    public int getLoadCapacity() {
        return 0; // пассажирские самолеты не перевозят груз
    }

    @Override
    public String toString() {
        return "Passenger Aircraft: " + getModel() + ", Range: " + getRange() +
                " km, Capacity: " + getCapacity() + " passengers, Fuel Consumption: " + getFuelConsumption() + " L/100km";
    }
}
