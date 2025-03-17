package searching;

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        boolean[] visited = new boolean[strs.length];  // Keep track of used strings
        List<List<String>> result = new ArrayList<>(); // Final list of anagram groups

        if (strs.length == 0) {
            return result;
        }

        for (int i = 0; i < strs.length; i++) {
            if (visited[i]) continue; // Skip already grouped strings

            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            visited[i] = true;

            // Sort the current string to compare with others
            char[] ch1 = strs[i].toCharArray();
            Arrays.sort(ch1);
            String sorted1 = new String(ch1);

            // Compare with other strings in the array
            for (int j = i + 1; j < strs.length; j++) {
                if (!visited[j]) {
                    char[] ch2 = strs[j].toCharArray();
                    Arrays.sort(ch2);
                    String sorted2 = new String(ch2);

                    // If sorted forms are equal, they are anagrams
                    if (sorted1.equals(sorted2)) {
                        group.add(strs[j]);
                        visited[j] = true;
                    }
                }
            }

            result.add(group); // Add the found group to the result list
        }

        return result;
    }
}
