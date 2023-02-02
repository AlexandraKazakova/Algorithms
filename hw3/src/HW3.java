import java.util.Iterator;

public class HW3 {
    public static void main(String[] args) {
        ListNode test1 = new ListNode(3, new ListNode(4, new ListNode(1, new ListNode(2, new ListNode(5)))));
        ListNode test2 = new ListNode(3, new ListNode(4, new ListNode(1, new ListNode(2, new ListNode(5)))));
        ListNode test3 = new ListNode(3, new ListNode(4, new ListNode(1, new ListNode(2, new ListNode(5)))));

        ListNode result1 = ListNodeUtils.addFirst(4, test1);
        ListNode result2 = ListNodeUtils.removeFirst(test2);
        ListNode result3 = reverse(test3);

        for (Integer integer : result1) {
            System.out.print(integer + " ");
        }
        System.out.println();
        for (Integer integer : result2) {
            System.out.print(integer + " ");
        }

        System.out.println();
        for (Integer integer : result3) {
            System.out.print(integer + " ");
        }

    }

    public static class ListNode implements Iterable<Integer> {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public Iterator<Integer> iterator() {
            return new ListNodeIterator(this);
        }
    }

    public static class ListNodeIterator implements Iterator<Integer> {
        private ListNode node;

        public ListNodeIterator(ListNode node) {
            this.node = node;
        }

        @Override
        public boolean hasNext() {
            return node != null;
        }

        @Override
        public Integer next() {
            int toReturn = node.val;
            node = node.next;
            return toReturn;
        }
    }

    // 1. Реализовать методы addFirst, removeFirst.


    public class ListNodeUtils {

        public static ListNode addFirst(int value, ListNode list) {
            ListNode head = new ListNode(value);
            head.next = list;
            return head;
        }

        public static ListNode removeFirst(ListNode node) {
            ListNode head = node.next;
            node = null;
            return head;
        }
    }

    // 2. Реализовать методы разворота связного списка.

    public static ListNode reverse(ListNode node) {
        ListNode head = node;
        if (node.next != null) {
            ListNode current = head.next;
            head.next = null;
            while (current != null) {
                ListNode next = current.next;
                current.next = head;
                head = current;
                current = next;
            }
        }
        return head;
    }
}










