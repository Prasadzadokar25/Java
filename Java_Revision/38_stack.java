import java.util.*;

class Demo{
	public static void main(String[] args){

		Stack v = new Stack();
		System.out.println(v.capacity());

		for(int i = 1;i<=15; i++){

			v.push(6);
		}

		 System.out.println(v.capacity());
		System.out.println(v);
	}
}
