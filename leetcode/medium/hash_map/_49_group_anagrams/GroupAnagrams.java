package medium.hash_map._49_group_anagrams;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        // Case 1: If strs length = 1 -> Return the same in a new format
        if (strs.length == 1) return Collections.singletonList(new ArrayList<>(new ArrayList<>(Collections.singleton(strs[0]))));


        // Case 2: Usual case mentioned in the question

        // Create Map<String, List<String>>
        // Take 1 word -> Convert to char arr -> Sort -> Convert back to string -> This is the key
        // Do this for words and keep adding them in the List<String>
        Map<String, List<String>> wordMap = new HashMap<>();

        for (String str : strs) {

            char[] wordArr = str.toCharArray();
            Arrays.sort(wordArr);

            if (wordMap.containsKey(String.valueOf(wordArr))) {
                wordMap.get(String.valueOf(wordArr)).add(str);
            } else {
                List<String> newList = new ArrayList<>();
                newList.add(str);
                wordMap.put(String.valueOf(wordArr), newList);
            }
        }

        List<List<String>> resultList = new ArrayList<>();

        for (String str : wordMap.keySet()) {
            resultList.add(wordMap.get(str));
        }

        return resultList;
    }
}
