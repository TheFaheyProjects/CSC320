// Kyle Fahey
// CSC320-1
// Module 3: Critical Thinking

// Option 1: Calculate Average Withholding

import java.util.Scanner;

public class CalculateAverageWithholding {
    public static void main(String[] args) {
        // User Input
        Scanner userInput = new Scanner(System.in);

        // Asking for User Input
        System.out.print("Enter your weekly income: $");
        double weeklyIncome = userInput.nextDouble();

        // Declaring Tax Rate Variable
        double taxRate;

        // If/Else Statements to Determine Tax Rate
        if (weeklyIncome < 500) {
            taxRate = 0.10;
        } else if (weeklyIncome >= 500 && weeklyIncome < 1500) {
            taxRate = 0.15;
        } else if (weeklyIncome >= 1500 && weeklyIncome < 2500) {
            taxRate = 0.20;
        } else {
            taxRate = 0.30;
        }

        // Calculate Tax Withholding
        double taxWithholding = weeklyIncome * taxRate;

        // Display Results to the User
        System.out.println("Weekly income: $" + weeklyIncome);
        System.out.println("Tax rate: " + (taxRate * 100) + "%");
        System.out.println("Weekly Tax Withholding: $" + taxWithholding);

        // Close Scanner
        userInput.close();
    }
}









