package DSA;

// LeetCode 445. Add Two Numbers II
// `````````````````````````````````

public class Jan_07 {

    static ListNode fix = null;

    public static void main(String[] args) {
        ListNode l1 = new ListNode(7);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        l1 = rev(l1);
        l2 = rev(l2);

        code(l1, l2, null, 0);
    }

    private static ListNode rev(ListNode l1) {
        ListNode prv = null, cur = l1, next;
        while (cur != null) {
            next = cur.next;
            cur.next = prv;
            prv = cur;
            cur = next;
        }
        return prv;
    }

    private static void code(ListNode l1, ListNode l2, ListNode ans, int carry) {
        if (l1 == null && l2 == null && carry == 0) return;
        int add = carry;

        if (l1 != null) {
            add += l1.val;
            l1 = l1.next;
        }

        if (l2 != null) {
            add += l2.val;
            l2 = l2.next;
        }

        carry = add / 10;
        add = add % 10;

        if (fix == null) {
            fix = new ListNode(add);
            ans = fix;
        } else {
            ans.next = new ListNode(add);
            ans = ans.next;
        }
        code(l1, l2, ans, carry);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
