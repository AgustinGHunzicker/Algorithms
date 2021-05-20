package Search;


import Structures.ListNode;

import java.util.LinkedList;

public class SortedStructureTest {

    public static void main(String[] args) {
        //sumOfPairs();
        //mergeSortedList();
        mergeTwoLists();
    }

    private static void sumOfPairs() {
        int[] args = {1, 2, 3, 4, 4};
        int n = 8;
        SortedStructure s = new SortedStructure();
        if (s.sumOfPairs(args, n)) System.out.println("Exist sum of pairs");
        else System.out.println("Not exist sum of pairs");
    }

    private static void mergeSortedList() {

        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        for (int i = 0; i < 10000; i++) {
            l1.add(i*2);
            l2.add(i*3);
        }
        System.out.print("Sorted List 1: ");
        //for (int i = 0; i < 100000; i++) {
        //    System.out.print(l1.get(i) + " ");
        //}

        System.out.println();
        System.out.print("Sorted List 2: ");
        //for (int i = 0; i < 100000; i++) {
        //    System.out.print(l2.get(i) + " ");
        //}
        System.out.println();
        System.out.print("Result Sorted List: ");
        long init = System.currentTimeMillis();
        SortedStructure s = new SortedStructure();
        l1 = s.mergeSortedList(l1,l2);
        //while (!l1.isEmpty()) {
        //    System.out.print(l1.poll() + " ");
        //}
        System.out.println("time: "+(System.currentTimeMillis() - init));
    }

    private static void mergeTwoLists() {
        ListNode next1 = new ListNode();
        ListNode next2 = new ListNode();
        ListNode l1 = next1;
        ListNode l2 = next2;
        for (int i = 1; i < 100000; i++) {
            next1.next = new ListNode(i*2);
            next2.next = new ListNode(i*3);
            next1 = next1.next;
            next2 = next2.next;
        }

        long init = System.currentTimeMillis();
        SortedStructure s = new SortedStructure();
        ListNode r = s.mergeTwoLists(l1,l2);
        System.out.println("time: "+(System.currentTimeMillis() - init));
    }
}