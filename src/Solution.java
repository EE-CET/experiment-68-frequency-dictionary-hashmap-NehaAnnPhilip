import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read a single line of text
        String line = scanner.nextLine();
        
        // Split the text into individual words
        String[] words = line.split(" ");
        
        // Create a HashMap to store frequencies
        HashMap<String, Integer> freqMap = new HashMap<>();
        
        // Count frequencies
        for (String word : words) {
            if (freqMap.containsKey(word)) {
                freqMap.put(word, freqMap.get(word) + 1);
            } else {
                freqMap.put(word, 1);
            }
        }
        
        // Print results
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        scanner.close();
    }
}
