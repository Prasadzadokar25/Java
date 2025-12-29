/* printing user difine data of ArrayList
 */

import java.util.*;

class CricPlayer {

	int jerNo = 0;
	String name = "null";

	CricPlayer(int jerNo, String name) {

		this.jerNo = jerNo;
		this.name = name;

	}

	public String toString() { // This method use to print the content

		return jerNo + ": " + name;

	}
}

class ArrayListDemo4 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(new CricPlayer(45, "Rohit"));
		al.add(new CricPlayer(18, "Virat"));
		al.add(new CricPlayer(7, "MSD"));

		System.out.println();

		System.out.println(al); // Here it print the content
		// internaly there is call to toString method like as al.toString
	}
}
