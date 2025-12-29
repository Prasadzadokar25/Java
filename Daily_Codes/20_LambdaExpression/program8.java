/* compartor with lambda function
 */

import java.util.*;
class Employee8 {

	String name = null;
	int id = 0;

	Employee8 (int id ,String name) {

		this.id = id;
		this.name = name;
	}

	public String toString(){

		return id+ " : " + name;
	}
}
class Demo8 {

	public static void main(String args[]){

		ArrayList al = new ArrayList();

		al.add(new Employee8(25 ,"Prasad"));
		al.add(new Employee8(15 ,"Om"));
		al.add(new Employee8(10 ,"Hariom"));
		al.add(new Employee8(35 ,"Abhi"));
		al.add(new Employee8(45 ,"Amit"));

		System.out.println(al);

		Collections.sort(al, (obj1,obj2)->{

				return ((Employee8)obj1).name.compareTo(((Employee8)obj2).name);
			}
		);

		
		System.out.println(al);
		
	}
}




	

