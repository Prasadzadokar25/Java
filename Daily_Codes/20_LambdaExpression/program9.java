
/*
 * Lambda function in forEach loop
 */

import java.util.*;

class Demo9 {

        public static void main(String args[]){

                ArrayList al = new ArrayList();

                al.add(new Employee8(25 ,"Prasad"));
                al.add(new Employee8(15 ,"Om"));
                al.add(new Employee8(10 ,"Hariom"));
                al.add(new Employee8(35 ,"Abhi"));
                al.add(new Employee8(45 ,"Amit"));

                System.out.println(al);

		al.forEach((data)-> System.out.println(data));
	}
}
