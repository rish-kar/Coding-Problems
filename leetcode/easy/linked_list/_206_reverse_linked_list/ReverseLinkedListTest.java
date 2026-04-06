package easy.linked_list._206_reverse_linked_list;

public class ReverseLinkedListTest {

    public static void main(String[] args) {
        ReverseLinkedList solution = new ReverseLinkedList();

        // Example 1: [1,2,3,4,5] -> [5,4,3,2,1]
        leetcode.common.ListNode head1 = listOf(1, 2, 3, 4, 5);
        leetcode.common.ListNode reversed1 = solution.reverseList(head1);
        System.out.println("head = [1,2,3,4,5]");
        System.out.println("  Actual:   " + listToString(reversed1));
        System.out.println("  Expected: [5,4,3,2,1]");
        System.out.println();

        // Example 2: [1,2] -> [2,1]
        leetcode.common.ListNode head2 = listOf(1, 2);
        leetcode.common.ListNode reversed2 = solution.reverseList(head2);
        System.out.println("head = [1,2]");
        System.out.println("  Actual:   " + listToString(reversed2));
        System.out.println("  Expected: [2,1]");
        System.out.println();

        // Example 3: [] -> []
        leetcode.common.ListNode reversed3 = solution.reverseList(null);
        System.out.println("head = []");
        System.out.println("  Actual:   " + listToString(reversed3));
        System.out.println("  Expected: []");
    }

    private static leetcode.common.ListNode listOf(int... values) {
        leetcode.common.ListNode dummy = new leetcode.common.ListNode(0);
        leetcode.common.ListNode current = dummy;
        for (int v : values) {
            current.next = new leetcode.common.ListNode(v);
            current = current.next;
        }
        return dummy.next;
    }

    private static String listToString(leetcode.common.ListNode head) {
        if (head == null) return "[]";
        StringBuilder sb = new StringBuilder("[");
        leetcode.common.ListNode cur = head;
        while (cur != null) {
            sb.append(cur.val);
            cur = cur.next;
            if (cur != null) sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }
}
