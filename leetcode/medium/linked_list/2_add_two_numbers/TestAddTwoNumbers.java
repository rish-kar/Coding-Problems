import java.math.BigInteger;
import java.util.*;

public class TestAddTwoNumbers {
  // Build a linked list from an int array representing digits in reverse order.
  static AddTwoNumbers.ListNode build(int[] a) {
	if (a == null || a.length == 0) return null;
	AddTwoNumbers.ListNode head = new AddTwoNumbers.ListNode(a[0]);
	AddTwoNumbers.ListNode cur = head;
	for (int i = 1; i < a.length; i++) {
	  cur.next = new AddTwoNumbers.ListNode(a[i]);
	  cur = cur.next;
	}
	return head;
  }

  // Convert a linked list to an int array (digits in reverse order)
  static int[] toArray(AddTwoNumbers.ListNode node) {
	if (node == null) return new int[0];
	List<Integer> vals = new ArrayList<>();
	while (node != null) {
	  vals.add(node.val);
	  node = node.next;
	}
	int[] out = new int[vals.size()];
	for (int i = 0; i < vals.size(); i++) out[i] = vals.get(i);
	return out;
  }

  // Compute expected sum of two arrays representing reversed digits using BigInteger
  static int[] expectedSum(int[] a, int[] b) {
	BigInteger A = arrayToBigInteger(a);
	BigInteger B = arrayToBigInteger(b);
	BigInteger sum = A.add(B);
	if (sum.equals(BigInteger.ZERO)) return new int[] {0};
	List<Integer> digits = new ArrayList<>();
	while (sum.compareTo(BigInteger.ZERO) > 0) {
	  BigInteger[] dr = sum.divideAndRemainder(BigInteger.TEN);
	  digits.add(dr[1].intValue());
	  sum = dr[0];
	}
	int[] out = new int[digits.size()];
	for (int i = 0; i < digits.size(); i++) out[i] = digits.get(i);
	return out;
  }

  static BigInteger arrayToBigInteger(int[] a) {
	if (a == null || a.length == 0) return BigInteger.ZERO;
	StringBuilder sb = new StringBuilder();
	for (int i = a.length - 1; i >= 0; i--) sb.append(a[i]);
	return new BigInteger(sb.toString());
  }

  static boolean eq(int[] a, int[] b) {
	if (a == null && b == null) return true;
	if (a == null || b == null) return false;
	if (a.length != b.length) return false;
	for (int i = 0; i < a.length; i++) if (a[i] != b[i]) return false;
	return true;
  }

  static void printArr(int[] a) {
	if (a == null) {
	  System.out.print("null");
	  return;
	}
	System.out.print("[");
	for (int i = 0; i < a.length; i++) {
	  if (i > 0) System.out.print(",");
	  System.out.print(a[i]);
	}
	System.out.print("]");
  }

  public static void main(String[] args) {
	AddTwoNumbers solver = new AddTwoNumbers();

	int[][] testsA = new int[][]{
	  {2,4,3}, // 342
	  {0},
	  null,
	  {9},
	  // long 31-digit like earlier failure: 1 followed by 29 zeros then 1
	  // represented reversed: least significant first so we put 1,0,0,...,1
	  // We'll construct programmatically below.
	};

	int[][] testsB = new int[][]{
	  {5,6,4}, // 465
	  {0},
	  null,
	  {1,9,9,9,9,9,9,9,9,9},
	  // placeholder for the long case
	};

	// Prepare long case arrays
	int[] longA = new int[31];
	Arrays.fill(longA, 0);
	longA[0] = 1;
	longA[30] = 1; // most significant digit becomes last element in reversed array
	int[] longB = new int[] {5,6,4};

	// combine arrays for iteration
	List<int[]> listA = new ArrayList<>();
	List<int[]> listB = new ArrayList<>();
	for (int i = 0; i < testsA.length - 1; i++) { listA.add(testsA[i]); listB.add(testsB[i]); }
	listA.add(longA); listB.add(longB);

	int pass = 0, fail = 0;
	for (int i = 0; i < listA.size(); i++) {
	  int[] a = listA.get(i);
	  int[] b = listB.get(i);
	  AddTwoNumbers.ListNode l1 = build(a);
	  AddTwoNumbers.ListNode l2 = build(b);
	  AddTwoNumbers.ListNode res = solver.addTwoNumbers(l1, l2);
	  int[] got = toArray(res);
	  int[] exp = expectedSum(a,b);
	  boolean ok = eq(got, exp);
	  System.out.print("Test " + (i+1) + ": ");
	  printArr(a); System.out.print(" + "); printArr(b); System.out.print(" => got "); printArr(got); System.out.print(" expected "); printArr(exp);
	  if (ok) { System.out.println("  PASS"); pass++; } else { System.out.println("  FAIL"); fail++; }
	}

	System.out.println();
	System.out.println("Summary: pass=" + pass + " fail=" + fail);
	if (fail > 0) System.exit(2);
  }
}



