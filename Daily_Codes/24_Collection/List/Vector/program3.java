/* Methods in Vector class
 */
 
import java.util.*;

class VectorDemo3 {

        public static void main (String args[] ){

                Vector v1 = new Vector();  
              
		v1.add(10);         
                v1.addElement(20);  
                v1.addElement(30);

		System.out.println("Capacity v1 = " + v1.capacity());

		// trimToSize
		v1.trimToSize();  // It make Capacity = vector Size

		System.out.println("New Capacity v1 = " + v1.capacity());
	
	}
}
