package DSA;

// LeetCode 707. Design Linked List
// ```````````````````````````````````````````````````````````````````````

 class node {
    int data;
    node next;

    public node(int data) {
        this.data = data;
        next = null;
    }
}


class MyLinkedList {

    node head, tail;
    int n = -1;

    public MyLinkedList() {
        head = tail = null;
    }

    public int get(int i) {
        if (i > n)
            return -1;

        node temp = head;
        while (i > 0 && temp != null) {
            temp = temp.next;
            i--;
        }
        return temp.data;
    }

    public void addAtHead(int val) {
        node nn = new node(val);
        if (head == null) {
            head = tail = nn;
        } else {
            nn.next = head;
            head = nn;
        }
        n++;
    }

    public void addAtTail(int val) {
        node nn = new node(val);
        if (head == null) {
            head = tail = nn;
        } else {
            tail.next = nn;
            tail = nn;
        }
        n++;
    }

    public void addAtIndex(int i, int x) {
        if (i == 0) {
            addAtHead(x);
        } else if (i == n + 1) {
            addAtTail(x);
        } else if (i <= n) {
            node prv = head;
            node cur = head.next;
            while (i != 1 && cur != null) {
                i--;
                prv = cur;
                cur = cur.next;
            }
            if (cur == null) {
                addAtTail(x);
            } else {
                n++;
                node nn = new node(x);
                prv.next = nn;
                nn.next = cur;
            }
        }
    }

    public void deleteAtIndex(int index) {
        if (head == null)
            return;
        else if (head == tail && index == 0) {
            n--;
            head = null;
        } else if (index == 0) {
            head = head.next;
            n--;
        } else {
            node prv = head, cur = head.next;
            while (cur != null && index > 1) {
                prv = cur;
                cur = cur.next;
                index--;
            }
            if (cur == tail) {
                tail = prv;
                tail.next = null;
                n--;
            } else if (prv.next != null) {
                prv.next = cur.next;
                n--;
            }
        }
    }
}

   


public class Nov_29 {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(1);
        list.addAtTail(3);
        list.addAtIndex(1, 2);   // linked list becomes 1->2->3
        System.out.println(list.get(1)); // return 2
        list.deleteAtIndex(1);   // now the linked list is 1->3
        System.out.println(list.get(1)); // return 3

    }
}
