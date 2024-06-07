import java.util.*;

class Player implements Comparable<Player>{

	int age = 0;
	String name = null;

	Player(String name,int age){

		this.name = name;
		this.age = age;
	}

	public int compareTo(Player obj){

		System.out.println(this.name.compareTo(obj.name));
return this.name.compareTo(obj.name);
		//return (int)(this.age-obj.age);
	}

	public String toString(){

		return name;
	}
}
class Demo{
	public static void main(String[] args){

		TreeSet ts = new TreeSet();

		ts.add(new Player("d",20));
		ts.add(new Player("c",18));
		ts.add(new Player("b",20));
		ts.add(new Player("a",20));

		System.out.println(ts);

		
	}
}
