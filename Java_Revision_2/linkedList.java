import java.util.*;

class MyLinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList<>();

        ll.add(10);
        ll.add(50);
        ll.add(25);
        ll.add(40);
        Iterator itr = ll.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());

        }

        Collections.sort(ll);
        System.out.println(ll);

        Stack st = new Stack();
        st.push(10);
        Stack s2 = (Stack) st.clone();

        System.out.println(s2);


        LinkedHashSet<Integer> l = new LinkedHashSet<Integer>();

        l.add(10);
        l.add(1200);
        l.add(30);
        l.add(40);

        Integer[] arr = l.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));
    }
}