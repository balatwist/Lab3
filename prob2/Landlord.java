package prob2;

import prob2.Building;

import java.util.ArrayList;
import java.util.List;

class Landlord {
    private List<Building> buildings = new ArrayList<>();

    public void addBuilding(int maintenanceCost, int... rents) {
        Building building = new Building(maintenanceCost);
        for (int rent : rents) {
            building.addApartment(rent);
        }
        buildings.add(building);
    }

    public int calculateTotalMonthlyProfit() {
        return buildings.stream().mapToInt(Building::calculateProfit).sum();
    }
}