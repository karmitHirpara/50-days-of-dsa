package DSA;

import java.util.HashSet;

// LeetCode 203. Remove Linked List Elements
// ``````````````````````````````````````````

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}   

public class Jan_02 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode res = modifiedList(a, head);
        while(res!=null){
            System.out.print(res.val + " ");
            res = res.next;
        }        
    }
    
    public static ListNode modifiedList(int[] a, ListNode head) {
        HashSet<Integer> set = new HashSet<>(a.length);
        for(int x : a) set.add(x);
        ListNode fix = null, ans = null;
        while(head!=null){
            if(!set.contains(head.val)){
                if(fix == null) {
                    fix = new ListNode(head.val);
                    ans = fix;
                }else{
                    ans.next = new ListNode(head.val);
                    ans = ans.next;
                }
            }
            head = head.next;
        }
        return fix;

    }
}
