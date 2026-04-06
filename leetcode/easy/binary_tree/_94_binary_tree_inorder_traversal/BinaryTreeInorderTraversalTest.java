package easy.binary_tree._94_binary_tree_inorder_traversal;

public class BinaryTreeInorderTraversalTest {

    public static void main(String[] args) {
        BinaryTreeInorderTraversal solution = new BinaryTreeInorderTraversal();

        // Example 1: root = [1,null,2,3] -> [1,3,2]
        BinaryTreeInorderTraversal.TreeNode root1 = solution.new TreeNode(1);
        root1.right = solution.new TreeNode(2);
        root1.right.left = solution.new TreeNode(3);
        System.out.println("root = [1,null,2,3]");
        System.out.println("  Actual:   " + solution.inorderTraversal(root1));
        System.out.println("  Expected: [1, 3, 2]");
        System.out.println();

        // Example 2: root = [] -> []
        System.out.println("root = []");
        System.out.println("  Actual:   " + solution.inorderTraversal(null));
        System.out.println("  Expected: []");
        System.out.println();

        // Example 3: root = [1] -> [1]
        BinaryTreeInorderTraversal.TreeNode root3 = solution.new TreeNode(1);
        System.out.println("root = [1]");
        System.out.println("  Actual:   " + solution.inorderTraversal(root3));
        System.out.println("  Expected: [1]");
    }
}
