import java.util.*;

class Demo{
	public static void main(String[]  args){

		LinkedList<Integer> ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);

		for(int x:ll){
			System.out.println(x);
		}

		Iterator itr = ll.iterator();
		System.out.println(itr.getClass().getName());

		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println(ll.size());

		System.out.println("****************");

		ListIterator litr = ll.listIterator();

		while(litr.hasNext()){
			System.out.println(litr.next());
		}
		while(litr.hasPrevious()){
                        System.out.println(litr.previous());

                }

	}
}
