/* Adding user define data in ArrayList 
 */
import java.util.*;

class CricPlayer {

        int jerNo = 0;
        String name = "null";

        CricPlayer(int jerNo,String name) {

                this.jerNo = jerNo;
                this.name = name;

        }
	public String toString(){

		return jerNo+ " : "+name;


	}
        
}

class LinkedListDemo3 {

        public static void main(String [] args) {

                LinkedList ll = new LinkedList();

                ll.add(new CricPlayer(45,"Rohit"));
                ll.add(new CricPlayer(18,"Virat"));
                ll.add(new CricPlayer(7,"MSD"));

                 System.out.println();

                System.out.println(ll);  // Here it print the address of the object
        }
}
