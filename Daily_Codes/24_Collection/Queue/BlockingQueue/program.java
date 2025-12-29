// concept = Sorting in priorityBlockingQueue

import java.util.concurrent.*;
import java.util.*;

class Demo implements Comparable {

	String name  = null ;

	Demo(String name) {

		this.name = name ;
	}
	public String toString() {

		return name;
	}
	public int compareTo (Object obj) {

		return name.compareTo(((Demo)obj).name);
	}

}
class BlockingQueueDemo {

	public static void main (String args [] ){

		BlockingQueue bq = new PriorityBlockingQueue ();

		bq.offer(new Demo("P"));
		bq.offer(new Demo("A"));
		bq.offer(new Demo("S"));
		bq.offer(new Demo("A"));
		bq.offer(new Demo("X"));
		bq.offer(new Demo("Q"));
		bq.offer(new Demo("Z"));

		System.out.println(bq);
	}
}
