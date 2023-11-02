package prob2;

import prob2.Landlord;

public class Main {
    public static void main(String[] args) {
        Landlord landlord = new Landlord();


        landlord.addBuilding(1000, 800, 900, 1000);
        landlord.addBuilding(1500, 1200, 1100, 1300);
        landlord.addBuilding(800, 750, 850, 900);

        int totalMonthlyProfit = landlord.calculateTotalMonthlyProfit();
        System.out.println("Total Monthly Profit: $" + totalMonthlyProfit);
    }
}
