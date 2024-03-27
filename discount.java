import java.util.Scanner;

public class CalculateExpenses {
    public static double calculateExpenses(int quantity, double pricePerItem) {
        double discount;
        if (quantity > 50) {
            discount = 0.1;
        } else if (quantity >= 25 && quantity <= 50) {
            discount = 0.05;
        } else {
            discount = 0;
        }

        double totalCost = quantity * pricePerItem;
        double totalCostAfterDiscount = totalCost - (totalCost * discount);
        return totalCostAfterDiscount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the quantity purchased: ");
            int quantity = scanner.nextInt();
            
            System.out.print("Enter the price per item: ");
            double pricePerItem = scanner.nextDouble();

            if (quantity <= 0 || pricePerItem <= 0) {
                System.out.println("Please enter valid positive values for quantity and price per item.");
                return;
            }

            double totalExpenses = calculateExpenses(quantity, pricePerItem);
            System.out.println("Total expenses: $" + totalExpenses);
        } catch (Exception e) {
            System.out.println("Please enter valid numeric values for quantity and price per item.");
        } finally {
            scanner.close();
        }
    }
}
