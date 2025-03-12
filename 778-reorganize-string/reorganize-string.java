import java.util.*;

class Solution {
    public String reorganizeString(String s) {
        // Step 1: Count character frequencies
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {  // ✅ Fixed loop condition
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

            //{a = 2, b = 1}
        // Step 2: Max Heap to always place the most frequent character first
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>(
            (a, b) -> b.getValue() - a.getValue() // ✅ Sort by highest frequency first
        );
        maxHeap.addAll(map.entrySet()); // ✅ Add elements to the heap

        // Step 3: Process the characters
        StringBuilder result = new StringBuilder(); // ✅ Corrected initialization
        Map.Entry<Character, Integer> prev = null;

        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> current = maxHeap.poll(); // ✅ Get highest frequency character
            result.append(current.getKey());

            current.setValue(current.getValue() - 1); // ✅ Reduce count

            // If the previous character still has occurrences, put it back in the heap
            if (prev != null && prev.getValue() > 0) {
                maxHeap.add(prev);
            }

            prev = current; // ✅ Store current as previous for next iteration
        }

        // Step 4: Ensure the result is valid (same length as input)
         if(result.length() == s.length()){
            return result.toString();
        }
        return "";
    }
}
