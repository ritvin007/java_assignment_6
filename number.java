import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        double sum = 0;
        double smallest = Double.MAX_VALUE;
        double largest = Double.MIN_VALUE;

        while (true) {
            System.out.print("Enter a number (or type 'done' to finish): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                double number = Double.parseDouble(input);
                sum += number;
                count++;
                if (number < smallest) {
                    smallest = number;
                }
                if (number > largest) {
                    largest = number;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'done' to finish.");
            }
        }

        if (count > 0) {
            double average = sum / count;
            System.out.println("Largest number: " + largest);
            System.out.println("Smallest number: " + smallest);
            System.out.println("Average: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }

        scanner.close();
    }
}
