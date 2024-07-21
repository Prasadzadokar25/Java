
class Node {
    Node next = null;
    int data;

    Node(int data) {
        this.data = data;
    }
}

class LinkedList {

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

        int cureent = 1;

        while (cureent <= nodeCount() / 2) {
            Node rigth = head;

            for (int i = 1; i <= nodeCount() - cureent; i++) {
                rigth = rigth.next;
            }

            int temp = rigth.data;
            rigth.data = left.data;
            left.data = temp;
            left = left.next;
            cureent++;
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

}

public class P8 {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(10);
        ll.addFirst(20);
        ll.addLats(20);
        ll.addLats(30);
        ll.addLats(50);
        ll.addAtPosition(6, 250);
        System.err.println(ll.nodeCount());
        ll.deletePos(2);
        System.err.println(ll.nodeCount());
        ll.printLl();
        ll.reverseOnPlace();
        ll.printLl();
        //ll.reverse();
        ll.printLl();
    }
}
