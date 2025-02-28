import java.util.Scanner;

public class WordCounter {

    // Method to get a sentence input from the user
    public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        return scanner.nextLine(); // Read the entire line as the sentence
    }

    // Method to count the number of words in the sentence
    public static int countWords(String sentence) {
        // Split the sentence by one or more spaces and count the resulting words
        String[] words = sentence.trim().split("\\s+");
        
        // If the sentence is empty, the resulting array will be empty, so return 0
        if (sentence.trim().isEmpty()) {
            return 0;
        }
        
        return words.length;
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Get the sentence from the user
        String sentence = getSentenceInput();
        
        // Count the number of words in the sentence
        int wordCount = countWords(sentence);
        
        // Display the result to the user
        System.out.println("The sentence has " + wordCount + " words.");
    }
}
