package medium.hash_map._49_group_anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GroupAnagramsTest {

    public static void main(String[] args) {

        GroupAnagrams solver = new GroupAnagrams();

        runTest(solver,
                new String[]{"eat", "tea", "tan", "ate", "nat", "bat"},
                Arrays.asList(
                        Collections.singletonList("bat"),
                        Arrays.asList("nat", "tan"),
                        Arrays.asList("ate", "eat", "tea")
                ),
                "Example 1");

        runTest(solver,
                new String[]{""},
                Collections.singletonList(Collections.singletonList("")),
                "Example 2");

        runTest(solver,
                new String[]{"a"},
                Collections.singletonList(Collections.singletonList("a")),
                "Example 3");
    }

    private static void runTest(GroupAnagrams solver, String[] input, List<List<String>> expected, String name) {
        List<List<String>> actual = solver.groupAnagrams(input);

        List<List<String>> normalizedActual = normalize(actual);
        List<List<String>> normalizedExpected = normalize(expected);

        if (!normalizedActual.equals(normalizedExpected)) {
            throw new AssertionError(name + " failed. Expected: " + normalizedExpected + ", Actual: " + normalizedActual);
        }
    }

    private static List<List<String>> normalize(List<List<String>> groups) {
        List<List<String>> normalized = new ArrayList<>();

        for (List<String> group : groups) {
            List<String> copy = new ArrayList<>(group);
            Collections.sort(copy);
            normalized.add(copy);
        }

        normalized.sort(new Comparator<List<String>>() {
            @Override
            public int compare(List<String> left, List<String> right) {
                int sizeCompare = Integer.compare(left.size(), right.size());
                if (sizeCompare != 0) {
                    return sizeCompare;
                }
                return String.join("|", left).compareTo(String.join("|", right));
            }
        });
        return normalized;
    }
}
