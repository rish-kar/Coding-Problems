package easy.binary_tree._100_same_tree;

public class SameTreeTest {

    public static void main(String[] args) {
        SameTree solution = new SameTree();

        // Test 1: p = [1,2,3], q = [1,2,3] -> true
        SameTree.TreeNode p1 = solution.new TreeNode(1,
                solution.new TreeNode(2),
                solution.new TreeNode(3));
        SameTree.TreeNode q1 = solution.new TreeNode(1,
                solution.new TreeNode(2),
                solution.new TreeNode(3));
        System.out.println("Test 1 -> " + solution.isSameTree(p1, q1) + " | Expected: true");

        // Test 2: p = [1,2], q = [1,null,2] -> false
        SameTree.TreeNode p2 = solution.new TreeNode(1,
                solution.new TreeNode(2),
                null);
        SameTree.TreeNode q2 = solution.new TreeNode(1,
                null,
                solution.new TreeNode(2));
        System.out.println("Test 2 -> " + solution.isSameTree(p2, q2) + " | Expected: false");

        // Test 3: p = [1,2,1], q = [1,1,2] -> false
        SameTree.TreeNode p3 = solution.new TreeNode(1,
                solution.new TreeNode(2),
                solution.new TreeNode(1));
        SameTree.TreeNode q3 = solution.new TreeNode(1,
                solution.new TreeNode(1),
                solution.new TreeNode(2));
        System.out.println("Test 3 -> " + solution.isSameTree(p3, q3) + " | Expected: false");
    }
}
