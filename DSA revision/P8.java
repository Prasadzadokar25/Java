
class Node {
    Node next = null;
    int data;

    Node(int data) {
        this.data = data;
    }
}

class MyLinkedList {

    Node head = null;

    void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void addLats(int data) {

        Node temp = head;
        Node newNode = new Node(data);
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

    }

    void printLl() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void addAtPosition(int pos, int data) {
        Node temp = head;

        Node newNode = new Node(data);
        if (pos == 1) {
            addFirst(data);
            return;
        }
        if (pos == nodeCount() + 1) {
            addLats(data);
            return;
        }

        while (pos - 2 > 0) {
            temp = temp.next;
            pos--;
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }

    int nodeCount() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    void deletePos(int pos) {
        Node temp = head;

        while (pos - 2 > 0) {
            temp = temp.next;
            pos--;
        }

        temp.next = temp.next.next;
    }

    void reverse() {
        if (head == null || head.next == null) {
            return;
        }
        Node left = head;

        for (int i = 1; i <= nodeCount() / 2; i++) {

            Node right = head;

            for (int j = i + 1; j <= nodeCount(); j++) {
                right = right.next;

            }

            int temp = right.data;
            right.data = left.data;
            left.data = temp;

            left = left.next;
        }

    }

    void reverseOnPlace() {
        Node pri = null;
        Node cur = head;
        Node forw = null;

        while (cur != null) {

            forw = cur.next;
            cur.next = pri;
            pri = cur;
            cur = forw;
        }
        head = pri;
    }

    void findMidel() {
        Node temp = head;

        int count = 1;

        while (count <= nodeCount() / 2) {
            temp = temp.next;
            count++;
        }

        System.out.println(temp.data);
    }

    void findMidelByTwoPointer() {
        Node slow = head;
        Node fast = head.next;

        while (fast != null) {

            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
        }

        System.out.println(slow.data);

    }

    void removeDuplicateFromSortedLl() {

        Node temp = head;

        while (temp.next != null) {
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

    }

}

public class P8 {

    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();

        ll.addFirst(10);
        ll.addFirst(10);
        ll.addFirst(10);
        ll.addLats(20);
        ll.addLats(20);
        ll.addLats(20);
        ll.addLats(20);
        ll.addLats(20);
        ll.addLats(20);
        ll.addLats(30);
        ll.addLats(40);
        ll.addLats(50);
        ll.addLats(50);
        ll.addLats(50);
        // ll.addAtPosition(6, 250);
        System.err.println(ll.nodeCount());
        System.err.println(ll.nodeCount());
        ll.printLl();
        // ll.reverseOnPlace();
        ll.printLl();
        ll.reverse();
        ll.printLl();
        ll.findMidelByTwoPointer();
        ll.removeDuplicateFromSortedLl();
        ll.printLl();
    }
}
