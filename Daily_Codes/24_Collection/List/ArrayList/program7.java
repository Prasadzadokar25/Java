/* Sortting the user define data of list
 */

import java.util.*;

class Employee {

	String name = null;
	float sal = 0;

	Employee(String name , float sal) {

		this.name = name;
		this.sal = sal;

	}
	public String toString() {

		return "{" + name + " : " + sal+ "}"i;

	}

}

class SortByNameAsen implements Comparator {

	public int compare(Object obj1 ,Object obj2) {

		return ((Employee)obj1).name.compareTo(((Employee)obj2).name);

	}

}

class SortByNameDsen implements Comparator {

        public int compare(Object obj1 ,Object obj2) {

                return -((Employee)obj1).name.compareTo(((Employee)obj2).name);

        }

}

class ArrayListDemo7 {

	public static void main (String args[]) {

		ArrayList al = new ArrayList();

		al.add(new Employee("prasad",1500000));
		al.add(new Employee("srushti",1600000));
		al.add(new Employee("abhi",1100000));
		al.add(new Employee("ankush",900000));
		al.add(new Employee("soham",700000));

		System.out.println(al);

		Collections.sort(al,new SortByNameAsen());
		System.out.println(al);

		Collections.sort(al,new SortByNameDsen());
		System.out.println(al);
	}
}


