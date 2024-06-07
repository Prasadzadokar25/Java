// Method : endsWith

// code using predifine method in java

/*
 class MethodDemo10{
        public static void main(String [] args){

                String str1 = "Srushti";
                System.out.println(str1.endsWith("ti");
        }
}

*/


// code using user difine marthod in java

import java.util.Scanner;
class MethodDemo11{

        static boolean strStartsWith(String str1 ,String str2){

                char arr1[] = str1.toCharArray();
                char arr2[] = str2.toCharArray();

                int count = 0;
                int i = arr1.length-arr2.length;
		int j = 0;

		while(j<arr2.length){

                       		if (arr1[i]==arr2[j]){
                                	count++;
                        	}else{
                                	break;
                        	
				}
				i++;
				j++;
                	}
		

                if(count==arr2.length){
                        System.out.println("true");
                }else{
                        System.out.println("false");
                }
                return true;
	}


        public static void main(String [] args){

                Scanner sc = new Scanner(System.in);

                System.out.print("Eneter the string : ");
                String s1 = sc.next();

                System.out.print("Enter the ending string which need to check : ");
                String s2 = sc.next();

                strStartsWith(s1,s2);
        }
}
