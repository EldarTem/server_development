
package Lab2.aircrafts;

public abstract class Aircraft {
    private String model;
    private int range; // дальность полета в км
    private int fuelConsumption; // расход топлива в литрах на 100 км

    public Aircraft(String model, int range, int fuelConsumption) {
        this.model = model;
        this.range = range;
        this.fuelConsumption = fuelConsumption;
    }

    public String getModel() {
        return model;
    }

    public int getRange() {
        return range;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public abstract int getCapacity(); // вместимость

    public abstract int getLoadCapacity(); // грузоподъемность
}
