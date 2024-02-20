/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 * @date 2024-02-20
 * @author cunni
 */
public class TestUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Display the list of possible genres
        System.out.println("Choose your favorite genre:");
        System.out.println("1: Comedy");
        System.out.println("2: Drama");
        System.out.println("3: Action");
        System.out.println("4: Mystery");

        // Prompt the user to choose a genre
        System.out.print("Enter the number corresponding to your favorite genre: ");
        int choice = scanner.nextInt();
        String genre = getGenre(choice);

        // Create the user profile
        System.out.println("\nCreating your user profile");
        System.out.println("Name: " + name);
        System.out.println("Favorite Genre: " + genre);
        System.out.println("User Profile created successfully!");
    }

    // Method to get the genre based on user's choice
    private static String getGenre(int choice) {
        switch (choice) {
            case 1:
                return "Comedy";
            case 2:
                return "Drama";
            case 3:
                return "Action";
            case 4:
                return "Mystery";
            default:
                return "The number chosen needs to be between 1-4 as there are no other choices.";
        }
    }
}
