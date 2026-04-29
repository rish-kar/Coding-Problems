package medium.hash_map._347_top_k_frequent_elements;

import java.util.HashMap;
import java.util.Map;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {

        // Case 1: Usual case mentioned in the question
        // Create new array and new hashmap
        // Store the frequency of the values in the hashmap
        // Find out top elements in the hashmap and store it in array to return

        int[] result = new int[k];
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int i : nums) {
            numMap.put(i, numMap.getOrDefault(i, 0) + 1);
        }


        for (int i = 0; i < k; i++) {

            int maxKey = 0;
            int maxValue = 0;

            for (Map.Entry<Integer, Integer> entry : numMap.entrySet()) {

                if (entry.getValue() > maxValue) {
                    maxKey = entry.getKey();
                    maxValue = entry.getValue();
                }
            }
            result[i] = maxKey;
            numMap.remove(maxKey);

        }

        return result;
    }
}
