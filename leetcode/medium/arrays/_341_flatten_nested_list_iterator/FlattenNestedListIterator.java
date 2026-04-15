package medium.arrays._341_flatten_nested_list_iterator;

import java.util.Iterator;
import java.util.List;

/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class FlattenNestedListIterator implements Iterator<Integer> {

    public FlattenNestedListIterator(List<NestedInteger> nestedList) {
        // TODO: Implement constructor.
    }

    @Override
    public Integer next() {
        // TODO: Implement solution.
        return 0;
    }

    @Override
    public boolean hasNext() {
        // TODO: Implement solution.
        return false;
    }

    /**
     * LeetCode provides this interface at runtime; this local stub is here so the project compiles.
     */
    public interface NestedInteger {
        boolean isInteger();

        Integer getInteger();

        List<NestedInteger> getList();
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
