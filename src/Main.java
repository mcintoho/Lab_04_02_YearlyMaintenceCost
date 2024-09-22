public class Main {
    public static void main(String[] args) {
        // Declare seasonal maintenance costs
        double springCost = 495.12;
        double summerCost = 869.20;
        double fallCost = 584.39;
        double winterCost = 509.78;

        //Calculate total yearly maintenance costs
        double totalYearlyCost = springCost + summerCost + fallCost + winterCost;

        // Display the seasonal costs and the total cost
        System.out.println("Home Maintenance Costs for Each Season:");
        System.out.println("Spring: $" + springCost);
        System.out.println("Summer: $" + summerCost);
        System.out.println("Fall: $" + fallCost);
        System.out.println("Winter: $" + winterCost);
        System.out.println("Total Yearly Maintenance Cost: $" + totalYearlyCost);
    }
}