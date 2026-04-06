package easy.linked_list._141_linked_list_cycle;

public class LinkedListCycleTest {

    public static void main(String[] args) {
        LinkedListCycle solution = new LinkedListCycle();

        // Example 1: head = [3,2,0,-4], pos = 1 -> true
        LinkedListCycle.ListNode n1 = solution.new ListNode(3);
        LinkedListCycle.ListNode n2 = solution.new ListNode(2);
        LinkedListCycle.ListNode n3 = solution.new ListNode(0);
        LinkedListCycle.ListNode n4 = solution.new ListNode(-4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;
        System.out.println("head = [3,2,0,-4], pos = 1");
        System.out.println("  Actual:   " + solution.hasCycle(n1));
        System.out.println("  Expected: true");
        System.out.println();

        // Example 2: head = [1,2], pos = 0 -> true
        LinkedListCycle.ListNode m1 = solution.new ListNode(1);
        LinkedListCycle.ListNode m2 = solution.new ListNode(2);
        m1.next = m2;
        m2.next = m1;
        System.out.println("head = [1,2], pos = 0");
        System.out.println("  Actual:   " + solution.hasCycle(m1));
        System.out.println("  Expected: true");
        System.out.println();

        // Example 3: head = [1], pos = -1 -> false
        LinkedListCycle.ListNode s1 = solution.new ListNode(1);
        System.out.println("head = [1], pos = -1");
        System.out.println("  Actual:   " + solution.hasCycle(s1));
        System.out.println("  Expected: false");
    }
}
