import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Animation {

    /**
     * Simulates the movement of particles in a linear chamber over time.
     *
     * @param speed The number of positions each particle moves in one unit of time.
     * @param init  A string representing the initial state of the chamber,
     *              where 'L' is a left-moving particle, 'R' is a right-moving particle, and '.' is empty space.
     */

    public static void animate(int speed, String init) {

        // Get the length of the chamber based on the initial input
        int chamberLength = init.length();

        // List to store the state of the chamber at each time step
        List<String> result = new ArrayList<>();

        // Create arrays to track the positions of left-moving and right-moving particles
        int[] left = new int[chamberLength];
        int[] right = new int[chamberLength];

        // Initialize the particle positions based on the input string
        for (int i = 0; i < chamberLength; i++) {
            if (init.charAt(i) == 'L') {
                left[i] = 1;  // Mark the position as occupied by a left-moving particle
            } else if (init.charAt(i) == 'R') {
                right[i] = 1; // Mark the position as occupied by a right-moving particle
            }
        }

        // Continue simulation until all particles exit the chamber
        while (true) {
            // Create a new array to represent the current state of the chamber
            char[] chamber = new char[chamberLength];
            boolean hasParticles = false; // Flag to check if there are any particles left

            // Populate the current state of the chamber
            for (int i = 0; i < chamberLength; i++) {
                chamber[i] = '.';  // Start by marking all positions as empty

                // If there's a particle in the current position, mark it as occupied
                if (left[i] == 1 || right[i] == 1) {
                    chamber[i] = 'X';  // Mark the position as occupied by a particle
                    hasParticles = true; // Update the flag indicating there are still particles
                }
            }

            // Add the current state of the chamber to the result list
            result.add(new String(chamber));

            // If no particles are left, stop the simulation
            if (!hasParticles) {
                break;
            }

            // Arrays to track the new positions of particles for the next time step
            int[] newLeft = new int[chamberLength];
            int[] newRight = new int[chamberLength];

            // Update the positions of particles based on their movement speed
            for (int i = 0; i < chamberLength; i++) {
                // Check and update positions for leftward-moving particles
                if (i - speed >= 0 && left[i] == 1) {
                    newLeft[i - speed] = 1;
                }
                // Check and update positions for rightward-moving particles
                if (i + speed < chamberLength && right[i] == 1) {
                    newRight[i + speed] = 1;
                }
            }

            // Update the arrays for the next iteration
            left = newLeft;
            right = newRight;
        }

        // Print the result directly in the animate method
        System.out.println("Animation result:");
        for (String state : result) {
            System.out.println(state); // Output each state of the chamber
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Initialize scanner for user input

        // Loop to continuously prompt the user for speed and initial state
        while (true) {
            System.out.println("Enter speed (or type 'exit' to quit): ");
            String speedInput = scanner.nextLine();
            if (speedInput.equalsIgnoreCase("exit")) {
                break; // Exit the loop if user types 'exit'
            }

            System.out.println("Enter the initial particle state: ");
            String init = scanner.nextLine(); // Read the initial state of the particles

            try {
                // Parse the speed input into an integer
                int speed = Integer.parseInt(speedInput);
                animate(speed, init); // Call the animate method which handles the simulation and printing
            } catch (NumberFormatException e) {
                // Handle case where speed is not a valid number
                System.out.println("Please enter a valid number for speed.");
            }
        }

        scanner.close(); // Close the scanner to free resources
        System.out.println("Exiting...");
    }
}
