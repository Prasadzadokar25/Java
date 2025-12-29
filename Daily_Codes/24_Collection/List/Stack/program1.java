/* Stack and Stack methods
 */

import java.util.*;

class StackDemo1 {
	
	public static void main(String [] args) {

		Stack s = new Stack ();
		
		//push   
		s.push(10);  // special method to add element in stack
		s.push(20);
		s.push(30);
		s.push(40);
		s.add(50);   // common method of stack class to add element in stack

		System.out.println(s);

		//pop
		System.out.println(s.pop());
		System.out.println(s);

		//peek
		System.out.println(s.peek());
		System.out.println(s);
		
		//search
		System.out.println(s.search(30));

		//empty
		System.out.println(s.empty());
	}
}
