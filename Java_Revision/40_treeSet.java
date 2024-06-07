import java.util.*;

class Demo{
	public static void main(String[] args){

		TreeSet ts = new TreeSet();

		ts.add(10);
		ts.add(40);
		ts.add(20);
		ts.add(30);

		System.out.println(ts);

		TreeSet ts1 = new TreeSet();

                ts1.add("b");
                ts1.add("a");
                ts1.add("c");
                ts1.add("d");

                System.out.println(ts1);

		ts1.forEach((data)->System.out.println(data));
	}
}
