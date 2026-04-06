package medium.linked_list._2_add_two_numbers;

public class AddTwoNumbersTest {

    private static AddTwoNumbers.ListNode buildList(int... values) {
        AddTwoNumbers.ListNode dummy = new AddTwoNumbers.ListNode(0);
        AddTwoNumbers.ListNode current = dummy;
        for (int v : values) {
            current.next = new AddTwoNumbers.ListNode(v);
            current = current.next;
        }
        return dummy.next;
    }

    private static String listToString(AddTwoNumbers.ListNode head) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        AddTwoNumbers.ListNode cur = head;
        while (cur != null) {
            sb.append(cur.val);
            cur = cur.next;
            if (cur != null) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        AddTwoNumbers solution = new AddTwoNumbers();

        AddTwoNumbers.ListNode l1 = buildList(2, 4, 3);
        AddTwoNumbers.ListNode l2 = buildList(5, 6, 4);
        AddTwoNumbers.ListNode r1 = solution.addTwoNumbers(l1, l2);
        System.out.println("Test 1 -> " + listToString(r1) + " | Expected: [7, 0, 8]");

        AddTwoNumbers.ListNode l3 = buildList(0);
        AddTwoNumbers.ListNode l4 = buildList(0);
        AddTwoNumbers.ListNode r2 = solution.addTwoNumbers(l3, l4);
        System.out.println("Test 2 -> " + listToString(r2) + " | Expected: [0]");

        AddTwoNumbers.ListNode l5 = buildList(9, 9, 9, 9, 9, 9, 9);
        AddTwoNumbers.ListNode l6 = buildList(9, 9, 9, 9);
        AddTwoNumbers.ListNode r3 = solution.addTwoNumbers(l5, l6);
        System.out.println("Test 3 -> " + listToString(r3) + " | Expected: [8, 9, 9, 9, 0, 0, 0, 1]");
    }
}
