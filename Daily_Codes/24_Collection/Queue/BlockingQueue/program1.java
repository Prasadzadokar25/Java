// concept = Sorting in priorityBlockingQueue

import java.util.concurrent.*;
import java.util.*;

class Demo1 {

        String name  = null ;

        Demo1(String name) {

                this.name = name ;
        }
        public String toString() {

                return name;
        }

}

class SortByName implements Comparator {

	public int compare(Object obj1, Object obj2) {

		return ((Demo1)obj1).name.compareTo(((Demo1)obj2).name);

	}
}

class BlockingQueueDemo1 {

        public static void main (String args [] ){

                BlockingQueue bq = new PriorityBlockingQueue (4,new SortByName() );

		Comparator com = bq.comparator();
		System.out.println(com);

                   bq.offer(new Demo1("P"));
                bq.offer(new Demo1("A"));
                bq.offer(new Demo1("S"));
                bq.offer(new Demo1("A"));
                bq.offer(new Demo1("X"));
                bq.offer(new Demo1("Q"));
                bq.offer(new Demo1("Z"));


                System.out.println(bq);
        }
}
