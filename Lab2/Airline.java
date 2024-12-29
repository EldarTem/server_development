package Lab2;

import Lab2.Aircraft;
import Lab2.PassengerAircraft;
import Lab2.CargoAircraft;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Airline {
    private List<Aircraft> aircrafts;

    public Airline() {
        aircrafts = new ArrayList<>();
    }

    public void addAircraft(Aircraft aircraft) {
        aircrafts.add(aircraft);
    }

    public int getTotalPassengerCapacity() {
        return aircrafts.stream().mapToInt(Aircraft::getCapacity).sum();
    }

    public int getTotalLoadCapacity() {
        return aircrafts.stream().mapToInt(Aircraft::getLoadCapacity).sum();
    }

    public void sortAircraftByRange() {
        aircrafts.sort(Comparator.comparingInt(Aircraft::getRange));
    }

    public Aircraft findAircraftByFuelConsumption(int minConsumption, int maxConsumption) {
        return aircrafts.stream()
                .filter(aircraft -> aircraft.getFuelConsumption() >= minConsumption && aircraft.getFuelConsumption() <= maxConsumption)
                .findFirst()
                .orElse(null);
    }

    public void printAircrafts() {
        for (Aircraft aircraft : aircrafts) {
            System.out.println(aircraft);
        }
    }

    public static void main(String[] args) {
        Airline airline = new Airline();

        airline.addAircraft(new PassengerAircraft("Boeing 737", 5000, 250, 180));
        airline.addAircraft(new PassengerAircraft("Airbus A320", 6000, 220, 200));
        airline.addAircraft(new CargoAircraft("Antonov An-124", 4000, 450, 120000));

        System.out.println("Total passenger capacity: " + airline.getTotalPassengerCapacity());
        System.out.println("Total load capacity: " + airline.getTotalLoadCapacity());

        airline.sortAircraftByRange();
        System.out.println("\nSorted aircraft by range:");
        airline.printAircrafts();

        Aircraft aircraft = airline.findAircraftByFuelConsumption(200, 300);
        if (aircraft != null) {
            System.out.println("\nAircraft found by fuel consumption range: " + aircraft);
        } else {
            System.out.println("\nNo aircraft found in the specified fuel consumption range.");
        }
    }
}
