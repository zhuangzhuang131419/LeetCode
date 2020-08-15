package Q148;

import static org.junit.jupiter.api.Assertions.*;

class SortListTest {

    @org.junit.jupiter.api.Test
    void sortList() {

        SortList s = new SortList();
        SortList.ListNode head = new SortList.ListNode(3);
        SortList.ListNode l1 = new SortList.ListNode(4);
        SortList.ListNode l2 = new SortList.ListNode(1);

        head.next = l1;
        l1.next = l2;
        
        s.sortList(head);
    }
}