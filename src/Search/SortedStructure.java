package Search;

import Structures.ListNode;

import java.util.LinkedList;

public class SortedStructure {

    public SortedStructure() {}

    // receive a sorted array of integers and a number n,
    // return true if it's possible to sum two integers equal to n
    // return false in the other case
    // can be repeated values
    // sum of numbers that the are in different positions
    // O(n)
    // reduce the array always in a smaller interval, beginning with the extremes of the array
    public boolean sumOfPairs(int[] args, int sum) {

        int a = 0;
        int b = args.length - 1;
        int c;

        while (b > a) {
            c = args[a] + args[b];
            if (c == sum)
                return true;
            if (c > sum) b --;
            else a++;
        }
        //No sum of pairs where N1 + N2 = N3
        return false;
    }

    // O(n) Inefficient memory usage
    public LinkedList<Integer> mergeSortedList(LinkedList<Integer> l1, LinkedList<Integer> l2) {

        int i = 0;

        while (!l2.isEmpty()) {

            if (i == l1.size()) {
                break;
            }

            if (l1.get(i) > l2.peekFirst()) {
                l1.add(i,l2.poll());
            }

            i++;
        }

        if (l1.isEmpty()) return l2;
        if (!l2.isEmpty()) l1.addAll(l2);

        return l1;
    }

    // O(n) or better, more efficient than "mergeSortedList"
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode last = new ListNode();
        ListNode result = new ListNode(-1,last);

        while (l1 != null && l2 != null) {

            if (l1.val < l2.val) {
                last.next = l1;
                last = l1;
                l1 = l1.next;
            }
            else {
                last.next = l2;
                last = l2;
                l2 = l2.next;
            }
        }

        if (l1 != null) last.next = l1;
        if (l2 != null) last.next = l2;

        return  result.next.next;
    }
}

