package prob2;

import prob2.Apartment;

import java.util.ArrayList;
import java.util.List;

class Building {
    private List<Apartment> apartments = new ArrayList<>();
    private int maintenanceCost;

    public Building(int maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
    }

    public void addApartment(int rent) {
        apartments.add(new Apartment(rent));
    }

    public int calculateProfit() {
        int totalRent = apartments.stream().mapToInt(Apartment::getRent).sum();
        return totalRent - maintenanceCost;
    }
}