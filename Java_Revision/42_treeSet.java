import java.util.*;

class Demo{
	public static void main(String[] args){

		SortedSet s = new TreeSet();
		s.add(2);
		s.add(1);
		s.add(3);
		s.add(5);
		s.add(4);

		System.out.println(s);

		System.out.println(s.subSet(3,5));
		System.out.println(s.headSet(3));
		System.out.println(s.tailSet(3));
	}
}

