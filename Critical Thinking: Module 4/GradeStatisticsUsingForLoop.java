// Kyle Fahey
// CSC320-1
// Module 4: Critical Thinking

// Option 2: Grade Statistics Using For Loop

import java.util.Scanner;

public class GradeStatisticsUsingForLoop {
    public static void main(String[] args){
        // User Input
        Scanner userInput = new Scanner(System.in);

        // Declaring Variables
        int numGrades = 10;
        double total = 0;
        double maximum = Double.NEGATIVE_INFINITY;
        double minimum = Double.POSITIVE_INFINITY;

        // For Loop for Grades
        for (int i = 1; i <= numGrades; i++) {
            double grade;

            // While Loop to Get Grades
            while (true) {
                System.out.print("Enter grade #" + i + ": ");
                if (userInput.hasNextDouble()) {
                    grade = userInput.nextDouble();
                    // Valid Input Breaks the Loop
                    break;
                } else {
                    System.out.println("Invalid Input. Please Enter a Number Grade.");
                    userInput.next();

                }
            }

            // Add Grade to Total
            total += grade;

            // Update Max and Min Grades
            if (grade > maximum) {
                maximum = grade;
            }

            if (grade < minimum) {
                minimum = grade;
            }
        }

        // Calculate Average Grade
        double average = total / numGrades;

        // Print Results
        System.out.println("\nResults");
        System.out.println("\nAverage grade: " + average);
        System.out.println("Maximum grade: " + maximum);
        System.out.println("Minimum grade: " + minimum);

        // Close Scanner
        userInput.close();
    }
}











