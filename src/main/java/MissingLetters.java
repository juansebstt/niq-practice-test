import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class MissingLetters {

    /**
     * This method takes a sentence as input and returns a string containing
     * the missing letters that prevent the sentence from being a pangram.
     * The missing letters are returned in lowercase and sorted in alphabetical order.
     *
     * @param sentence The input string containing the sentence to be analyzed.
     * @return A string of missing letters, or an empty string if no letters are missing.
     */


    public static String getMissingLetters(String sentence) {

        // Create a set that contains all letters of the alphabet (a-z)
        Set<Character> alphabetSet = new HashSet<>(Arrays.asList(
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        ));

        // Convert the input sentence to lowercase and iterate over each character
        // Remove each character from the alphabet set if it is present
        for (char c : sentence.toLowerCase().toCharArray()) {
            alphabetSet.remove(c);
        }

        // Sort the remaining characters in the set, convert to string, and return the result
        return alphabetSet.stream()
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {

        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        String sentence;

        // Infinite loop that continuously asks for input until the user types "exit"
        while (true) {
            System.out.println("Please enter a sentence (or type 'exit' to quit): ");

            // Read the entire line from user input
            sentence = scanner.nextLine();

            // If the user types "exit", terminate the program
            if (sentence.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program...");
                break; // Exit the loop and terminate the program
            }

            // Call the getMissingLetters method to find the missing letters in the input sentence
            String missingLetters = getMissingLetters(sentence);

            // Check if there are no missing letters, i.e., the sentence is a pangram
            if (missingLetters.isEmpty()) {
                System.out.println("No missing letters! Sentence is a pangram!");
                System.out.println(" ");
            } else {
            System.out.println("Missing letters: " + missingLetters);
            }
        }
    }
}



