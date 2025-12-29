/* synchronized methods of Stack
 */

import java.util.*;

class StackDemo2 implements Runnable {

	Vector v1 = new Vector ();

	public void run () {

		v1.addElement(10);
		v1.addElement(20);
		System.out.println(v1);
	}
	public static void main(String args[]) {

		Thread th = new Thread();
		th.start();

		
	}
}

		




