import java.util.*;

class Demo{
	public static void main(String[] args){

		Vector v = new Vector();
		System.out.println(v.capacity());

		for(int i = 0;i<=10; i++){

			v.addElement(5);
			System.out.println(v.get(i).getClass());
		}

		 System.out.println(v.capacity());
		System.out.println(v);
	}
}
