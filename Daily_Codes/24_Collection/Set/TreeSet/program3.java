/* problem statement : Take 3 movie name and there box office collection as 
 * 			user define data and sort them in assendind order 
 * 			according to movie name 
 */

import java.util.*;

class Movie implements Comparable {

	String name = null;
	float boc = 0;

	Movie(String name , float boc) {

		this.name = name ;
		this.boc = boc ;
	}
	public int compareTo (Object obj ) {

		return name.compareTo(((Movie)obj).name);
	}

	public String toString() {

		return "{"+name+" : "+boc+"}";
	}

}

class TreeSetDemo3 {

	public static void main(String args[] ) {

		TreeSet ts = new TreeSet();

		ts.add(new Movie("Gadar2", 250));
		ts.add(new Movie("OMG2", 200));
		ts.add(new Movie("openhaimer", 225));

		System.out.println(ts);
	}
}
