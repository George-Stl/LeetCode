package leetcode.easy;

public class MiddleOfTheLinkedList_876 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode iterationHead = head;
        for (int i = 2; i <= 30; i++) {
            head.next = new ListNode(i);
            head = head.next;
        }
        MiddleOfTheLinkedList_876 mLL = new MiddleOfTheLinkedList_876();

        System.out.println(mLL.middleNode(iterationHead).val);
    }

    public ListNode middleNode(ListNode head) {
        ListNode slowIterator = head;
        ListNode fastIterator = head;
        while (fastIterator != null && fastIterator.next != null) {
            slowIterator = slowIterator.next;
            fastIterator = fastIterator.next.next;
        }

        return slowIterator;
    }
}
