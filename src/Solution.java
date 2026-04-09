import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // TODO: Read a single line of text
        if (!scanner.hasNextLine()) return;
        String input = scanner.nextLine();
        
        // TODO: Split the text into individual words
        // \\s+ handles multiple spaces between words
        String[] words = input.trim().split("\\s+");
        
        // TODO: Create a HashMap to store the frequency of each word
        HashMap<String, Integer> frequencyMap = new HashMap<>();
        
        // TODO: Iterate through the words and update their frequencies in the map
        for (String word : words) {
            if (!word.isEmpty()) {
                // getOrDefault returns the current count or 0 if the word is new
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }
        }
        
        // TODO: Iterate through the map and print the unique words and their counts
        // Format: "word: count"
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        scanner.close();
    }
}
