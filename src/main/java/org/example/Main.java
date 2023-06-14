package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] menuItems = {
                "1. Chiken Tikka - 1099",
                "2. Panner masala - 299",
                "3. Rajma Chawla - 899",
                "4. Rasgulla - 699",
                "5. Rasmalai - 799",
                "6. Exit"
        };

        // Display the menu
        System.out.println("Welcome to the Restaurant!");
        System.out.println("Menu:");

        for (String item : menuItems) {
            System.out.println(item);
        }

        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to make a selection
        System.out.print("Enter the number corresponding to your choice: ");
        int choice = scanner.nextInt();

        // Process the user's choice
        switch (choice) {
            case 1:
                System.out.println("You selected Chicken Tikka. Price: 1099. Enjoy your meal!");
                break;
            case 2:
                System.out.println("You selected Panner Masala. Price: 299. Enjoy your meal!");
                break;
            case 3:
                System.out.println("You selected Rajma Chawla. Price: 899. Enjoy your meal!");
                break;
            case 4:
                System.out.println("You selected Rasgulla. Price: 699. Enjoy your meal!");
                break;
            case 5:
                System.out.println("You selected Rasmali. Price: 799. Enjoy your meal!");
                break;
            case 6:
                System.out.println("Thank you for visiting the restaurant. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
                break;
        }

        // Close the scanner
        scanner.close();
    }
}